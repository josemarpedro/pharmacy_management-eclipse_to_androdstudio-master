package antoldstudio.unicafarmalda;

import java.util.Calendar;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class A_UnicaFarma extends Activity {

	EditText editText_dialog;
	Button button_entrar, button_actualizar;
	String password;
	String dialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a_activity_main);
		
		mostrarCalendario();
		
		new Handler().postDelayed(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent Menu_Inicial = new Intent (A_UnicaFarma.this,B_Menu_Inicial.class);
				startActivity(Menu_Inicial);
			//	finish();
			} 
		}, 2500);
		
	button_entrar = (Button) findViewById(R.id.button_entrar);
	button_actualizar = (Button) findViewById(R.id.button_actualizar);
	
	
	button_entrar.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			Menu_Inicial();					
		}
	});	
	
	
	button_actualizar.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			Actualizar();	
		}
	});	
	
		
	
}	
/////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	
	private void mostrarCalendario(){
		final Calendar c = Calendar.getInstance();
	    int year = c.get(Calendar.YEAR);
	    int month = c.get(Calendar.MONTH) + 1;
	    int day = c.get(Calendar.DAY_OF_MONTH);
	    
		if (year > 2021){
			Toast.makeText(getApplicationContext(), "Versão desatualizada.\nBaixe uma nova versão na PlayStore.", Toast.LENGTH_LONG).show();
			finish();
		}
	
	}	
	
	private void Menu_Inicial(){
		Intent Menu_Inicial = new Intent (this,B_Menu_Inicial.class);
		startActivity(Menu_Inicial);
	}	
	
		
	private void Actualizar() {
		// Intent receberRelatorio = new Intent (this,B_EnviarRelatorio.class);
		Intent Actualizar = new Intent(Intent.ACTION_VIEW);
		Actualizar.setData(Uri.parse("https://m.facebook.com/unicafarmalda1"));
		startActivity(Actualizar);
	}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			AlertDialog.Builder alertaPrincipal = new AlertDialog.Builder(A_UnicaFarma.this);
			alertaPrincipal.setTitle("Sobre o Aplicativo");
			alertaPrincipal.setMessage("O QUE HÁ DE NOVO:\n\n"
						+ "*1) Tamanho do aplicativo reduzido, agora mais leve.\n\n"
						+ "*2) Aplicativo com funções Online e funções Offline.\n\n"
						+ "*3) Ver actividades, informações e contactos sem internet.\n\n"
						+ "*4) Acompanhe noticias, promoções e outros eventos da Empresa.\n\n"
						+ "*5) Botão WHATSAPP para nos enviar mensagem diretamente.\n"
						+ "*6) Botão +ÚNICA para o entreter depois de usar nossos serviços.\n\n"
						+ "*7) Clientes obterão o código de acesso para a lista de produtos.\n\n"
						+ "*8) Envie-nos mensagens de avaliação ou de feedback.\n\n"
						+ "*9) Dicas de Saúde para melhorar o seu estilo de vida.\n\n\n"
						+ "TERMOS DE USO:\n\n"
						+ "Os termos e condições a seguir descrevem as regras aplicáveis à utilização do aplicativo ÚNICA FARMA LDA.\n\n"
						+ "O Utilizador tem a liberdade elementar, não exclusivo e temporalmente irrestrito de usar o aplicativo para os seus fins da seguinte forma: \npode instalar e usar uma cópia do aplicativo em aparelhos Android.\n\n"
						+ "Ao ultilizar este aplicativo, concorda que possui este aplicativo apenas para o seu uso, e não possui qualquer direito legal de dominio intelectual e/ou qualquer outro direito!\n\n"
						+ "Embora poderá escolher incluir seus dados pessoais na Base de Dados do aplicativo, não significa que possui qualquer direito adicional de dominio, tal como usar a imagem do aplicativo como parte de si ou de uma Empresa.\n\n"
						+ "Este aplicativo foi desenvolvido por Josemar Benvindo Pedro: \njosemarbemvindo@gmail.com \n\n"
						+ "ÚNICA FARMA LDA \n(All Copyright Reserved 2021)");
			alertaPrincipal.setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					return;
				}
			});
			alertaPrincipal.show();
			//return true;
		}
		return super.onOptionsItemSelected(item);
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
	} */
}
