package antoldstudio.unicafarmalda;

import java.util.Calendar;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class C9_Mais_Unica extends Activity {

	Button button_facebook, button_instagram, button_whatsapp;
	Button button_desafios, button_dicas;
	String password;
	String dialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c9_mais_unica);
		
		button_facebook 	= (Button) findViewById(R.id.button_facebook);	
		button_instagram 	= (Button) findViewById(R.id.button_instagram);
		button_whatsapp 	= (Button) findViewById(R.id.button_whatsapp);
		button_dicas 		= (Button) findViewById(R.id.button_dicas);			
		button_desafios 	= (Button) findViewById(R.id.button_desafios);	


	
	
	button_facebook.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Facebook();	
		}
	});	
		
	button_instagram.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View v) {			
		Instagram();	
		}
	});		
			
	button_whatsapp.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Whatsapp();	
		}
	});
	
	button_desafios.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Desafios();	
		}
	});
	

	button_dicas.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			Dicas();	
		}
	});

}
	

/////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
	
	
	private void Facebook() {
		// Intent receberRelatorio = new Intent (this,B_EnviarRelatorio.class);
		Intent Facebook = new Intent(Intent.ACTION_VIEW);
		Facebook.setData(Uri.parse("https://m.facebook.com/unicafarmalda1"));
		startActivity(Facebook);
	}	

	private void Instagram(){
		Intent Instagram = new Intent(Intent.ACTION_VIEW);
		Instagram.setData(Uri.parse("https://instagram.com/unicafarmalda"));
		startActivity(Instagram);
	}
	
	private void Whatsapp(){
		Intent Whatsapp = new Intent(Intent.ACTION_VIEW);
		Whatsapp.setData(Uri.parse("https://api.whatsapp.com/send?phone=244945777711&text=Bom%20Dia%20ou%20Boa%20Tarde!"));
		startActivity(Whatsapp);
	}
	
	private void Dicas(){
		AlertDialog.Builder saldoAlerte = new AlertDialog.Builder(C9_Mais_Unica.this);
		saldoAlerte.setTitle("DICAS DO MÊS");
		saldoAlerte.setMessage("Aqui poderás encontrar dicas de Saúde que vão ser actualizadas a cada novo mês. Essas dicas servem apenas para ter uma vida mais saudável." );
		saldoAlerte.setPositiveButton("VER DICA", new DialogInterface.OnClickListener() {			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(getApplicationContext(), "Aguarde Por favor", 1).show();
				Intent Eventos = new Intent(Intent.ACTION_VIEW);
				Eventos.setData(Uri.parse("https://docs.google.com/spreadsheets/d/e/2PACX-1vTe_VOK9nvsR9oyh2K7q6CkL5lUp9NSB3tlBYGpaGRn19-a3blMnqOOmbDQUjsUgZDZSTfmzf3MnAax/pubhtml"));
				startActivity(Eventos);
			}
		});
		saldoAlerte.setNegativeButton("Voltar", null);
		saldoAlerte.show();
	}
	
	private void Desafios(){
		AlertDialog.Builder desafiosAlerte = new AlertDialog.Builder(C9_Mais_Unica.this);
		desafiosAlerte.setTitle("DESAFIOS DE JOGOS");
		desafiosAlerte.setMessage("Preparamos uma lista de desafios que funcionarão como um jogo de perguntas, isso porque nos preocupamos não só com a saúde física, mas também a saúde mental."
				+ "\n\nDICA: \n\nSe estiver com dificuldades em descobrir as respostas, poderás sempre pedir ajuda enquanto esperas pelo pedido da sua compra quando nos fazer uma visita!");
		desafiosAlerte.setPositiveButton("Palavras", new DialogInterface.OnClickListener() {			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Intent Desafios_Letras = new Intent (C9_Mais_Unica.this,C8_Desafios_Letras.class);
				startActivity(Desafios_Letras);
			}
		});
		desafiosAlerte.setNegativeButton("Números", new DialogInterface.OnClickListener() {			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Intent Desafios_Numeros = new Intent (C9_Mais_Unica.this,C8_Desafios_Numeros.class);
				startActivity(Desafios_Numeros);
			}
		});
		desafiosAlerte.show();
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
			AlertDialog.Builder alertaPrincipal = new AlertDialog.Builder(C9_Mais_Unica.this);
			alertaPrincipal.setTitle("ÚNICA FARMA LDA v1.3\n\n"
					+ "TERMOS DE USO:\n\nOs termos e condições a seguir descrevem as regras aplicáveis à utilização do aplicativo ÚNICA FARMA LDA.\n\n"
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
	} 
	*/
}
