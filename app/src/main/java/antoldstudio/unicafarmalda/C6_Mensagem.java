package antoldstudio.unicafarmalda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.InputFilter.LengthFilter;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class C6_Mensagem extends Activity {
 
	Button button_enviar, button_voltar, button_consultar_saldo_dados;
	EditText editText_seunome, editText_seunumero, editText_suamensagem;
	
	String seunome, seuemail, suamensagem;
	final String myTag = "DocsUpload";
	
	 
	/// INICIANDO O PROGRAMA
	//////////////////////////////////////////////////////
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c6_mensagem);
	
	
	///INICIANDO OS DADOS
	//////////////////////////////////////////////////////
		editText_seunome = (EditText) findViewById(R.id.editText_seunome);
		editText_seunumero = (EditText) findViewById(R.id.editText_seunumero);
		editText_suamensagem = (EditText) findViewById(R.id.editText_suamensagem);
		button_enviar = (Button) findViewById(R.id.button_enviar);
		button_consultar_saldo_dados = (Button) findViewById(R.id.button_consultar_saldo_dados);
		button_voltar = (Button) findViewById(R.id.button_voltar);
	
	/// REGISTRANDO AS AÇÕES
	//////////////////////////////////////////////////////	
		
		UsandoBotoes();
				
			}
		
	
	/// USANDO O BOTÃO
	//////////////////////////////////////////////////////

	
	public void UsandoBotoes(){	
		
		button_voltar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
		button_consultar_saldo_dados.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ConsultarDados();
			}
		});
		
		
		button_enviar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
	AlertDialog.Builder alertaPrincipal = new AlertDialog.Builder(C6_Mensagem.this);
	alertaPrincipal.setTitle("Enviando a Mensagem!");
	alertaPrincipal
		.setMessage("Tenha a certeza que tem Saldo de Dados (Internet) neste número, ou está conectado a uma rede Wifi.");
	alertaPrincipal.setNeutralButton("Voltar", null);
	alertaPrincipal.setPositiveButton("ENVIAR",
		new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				
				try { 
					
				 seunome 	 = (editText_seunome.getText().toString());
				 seuemail 	 = (editText_seunumero.getText().toString());
			     suamensagem = (editText_suamensagem.getText().toString());
			    		 
				if (seunome.isEmpty() || seuemail.isEmpty() || suamensagem.isEmpty()){
					Toast.makeText(getApplicationContext(), "Preenche por favor todos os campos", Toast.LENGTH_SHORT).show();	
				} else {
					if (isNetworkAvailable()) {					
						enviarColectarInfo();
						Toast.makeText(getApplicationContext(), "A Enviar . . .", Toast.LENGTH_SHORT).show();
						finish();
					} else {
						Toast.makeText(getApplicationContext(),"Verifique a Conexão da Internet",Toast.LENGTH_LONG).show();
						}
					}
				}
				catch (Exception e) {
				Toast.makeText(getApplicationContext(), "ERRO... Verique se a Internet está liga e se tem saldo de dados!", Toast.LENGTH_LONG).show();
				return;
				}
				finally{
				Toast.makeText(getApplicationContext(), "Concluido!", Toast.LENGTH_SHORT).show();
				} 				
			}
		
	}); 

	alertaPrincipal.show();			
	}

	});


}
	
//////////////////////////////////////////////////////////////
	
	private void ConsultarDados() {
		AlertDialog.Builder saldoAlert = new AlertDialog.Builder(C6_Mensagem.this);
		saldoAlert.setTitle("Consutar Saldo");
		saldoAlert.setMessage("Escolha qual saldo de dados deseja consultar.");
		saldoAlert.setNegativeButton("Unitel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent consultarUnitel = new Intent (Intent.ACTION_CALL);
				consultarUnitel.setData(Uri.parse("tel: *102*1" + Uri.encode("#"))	);
				startActivity(consultarUnitel);
			}
		});
		saldoAlert.setPositiveButton("Movicel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent consultarMovicel = new Intent (Intent.ACTION_CALL);
				consultarMovicel.setData(Uri.parse("tel: *196" + Uri.encode("#"))	);
				startActivity(consultarMovicel);
			}
		});
		saldoAlert.show();
	}
	
	private boolean isNetworkAvailable() {
		ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo activeNetworkInfo = connectivityManager
				.getActiveNetworkInfo();
		return activeNetworkInfo != null
				&& activeNetworkInfo.isConnectedOrConnecting();
	}
	
	
	public void enviarColectarInfo(){
		Log.i(myTag, "OnCreate()");
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {			
		ColectarInfo();
		
			}
		});
		t.start(); 
	}
	
	
	public void ColectarInfo() {

	String seunomeX = seunome;
	String seuemailX = seuemail;
	String suamensagemX = suamensagem;
	
	String fullUrl = "https://docs.google.com/forms/d/e/1FAIpQLSd1GnnqnaeFcaDpb-mOKPrz38_NC8_WsMHu7U2GSKd7OYi_1g/formResponse";
	HttpRequest mReq = new HttpRequest();

	String data = "entry.1507043614=" + URLEncoder.encode(seunomeX) + "&" + 
			"entry.253731413=" + URLEncoder.encode(seuemailX) + "&" + 
			"entry.808338311=" + URLEncoder.encode(suamensagemX);

	String response = mReq.sendPost(fullUrl, data);
	Log.i(myTag, response);
	
	}
		
	////////////////////////////////////////////
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
