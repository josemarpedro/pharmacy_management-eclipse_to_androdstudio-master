package antoldstudio.unicafarmalda;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class C31_Contactos extends Activity {

	Button button_call_center, button_call_assistencia, button_call_palanca, button_call_mulemba;
	Button button_call_huambo, button_call_lobito, button_voltar_c31;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c31_contactos);
	
		
		Toast.makeText(getApplicationContext(), "Toque no Contacto para ligar", Toast.LENGTH_SHORT).show();
		
		
		button_call_center 		= (Button) findViewById(R.id.button_call_center);		
		button_call_assistencia = (Button) findViewById(R.id.button_call_assistencia);
		button_call_palanca 	= (Button) findViewById(R.id.button_call_palanca);
		button_call_mulemba 	= (Button) findViewById(R.id.button_call_mulemba);		
		button_call_huambo 		= (Button) findViewById(R.id.button_call_huambo);	
		button_call_lobito 		= (Button) findViewById(R.id.button_call_lobito);
		button_voltar_c31 		= (Button) findViewById(R.id.button_voltar_c31);

		
	
	button_call_center.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			APOIO_AO_CLIENTE();					
		}
	});	

	
	button_call_assistencia.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			ASSISTENCIA();					
		}
	});

	
	button_call_palanca.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			CALL_PALANCA();					
		}
	});	
	
	
	button_call_mulemba.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			CALL_MULEMBA();	
		}
	});	
			
	
	button_call_huambo.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			CALL_HUAMBO();	
		}
	});	
	
	
	button_call_lobito.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			CALL_LOBITO();	
		}
	});	

	
	button_voltar_c31.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			finish();					
		}
	});		

}
	

/////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	
	
	private void APOIO_AO_CLIENTE(){
				AlertDialog.Builder callAlert = new AlertDialog.Builder (C31_Contactos.this);
				callAlert.setTitle("APOIO AO CLIÊNTE");
				callAlert.setMessage("Temos dois números de Apoio ao Cliênte disponivel para si. Caso um der ocupado, ainda podes ligar para o outro, pois queremos apoiar-te na mesma hora.");
				callAlert.setNegativeButton("945777711", new DialogInterface.OnClickListener() {					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Intent movicel = new Intent (Intent.ACTION_CALL);
						movicel.setData(Uri.parse("tel: +244 945 777 711"));
						startActivity(movicel);
					};
				});
				callAlert.setPositiveButton("934334445", new DialogInterface.OnClickListener() {					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Intent movicel = new Intent (Intent.ACTION_CALL);
						movicel.setData(Uri.parse("tel: +244 934 334 445"));
						startActivity(movicel);
					};
				});
				callAlert.show();
				
	}	
	
	
	private void ASSISTENCIA(){
		Intent movicel = new Intent (Intent.ACTION_CALL);
		movicel.setData(Uri.parse("tel: +244 942 304 949"));
		startActivity(movicel);
	}
	
	
	private void CALL_PALANCA(){
				Intent movicel = new Intent (Intent.ACTION_CALL);
				movicel.setData(Uri.parse("tel: +244 931 220 251"));
				startActivity(movicel);
	}	
	
	
	private void CALL_MULEMBA(){
				Intent movicel = new Intent (Intent.ACTION_CALL);
				movicel.setData(Uri.parse("tel: +244 935 063 628"));
				startActivity(movicel);
	}	
	
	
	private void CALL_HUAMBO(){
				Intent movicel = new Intent (Intent.ACTION_CALL);
				movicel.setData(Uri.parse("tel: +244 937 536 456"));
				startActivity(movicel);
	}
	
	
	private void CALL_LOBITO(){
				Intent movicel = new Intent (Intent.ACTION_CALL);
				movicel.setData(Uri.parse("tel: +244 929 430 278"));
				startActivity(movicel);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
/*
	private void pedirSenha(){
		
		
		AlertDialog.Builder alterarValoreGLOBAL = new AlertDialog.Builder(A_MainActivity.this);
		alterarValoreGLOBAL.setTitle("Novo Valor da Encomenda");
		alterarValoreGLOBAL.setMessage("Digite o seu novo Valor para a Encomenda GLOBAL.");
		final EditText editText_dialog = new EditText(this);
		dialog = editText_dialog.getText().toString();
		alterarValoreGLOBAL.setView(editText_dialog);
		alterarValoreGLOBAL.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						return;
					}
				});
		alterarValoreGLOBAL.setPositiveButton("Confirmar",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {

						if (dialog == "unitel123"){
							EnviarRelatorio();
						} else {
							Toast.makeText(getApplicationContext(), "Senha Incorrecta.",Toast.LENGTH_LONG).show();
							return;
						}
					}
				});

		AlertDialog ad2 = alterarValoreGLOBAL.create();
		ad2.show();
	} 
	*/
}
