package antoldstudio.unicafarmalda;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class C2_Actividades extends Activity {

	Button button_vendas_a_retalho, button_vendas_a_grosso, button_encomendas, button_credito, button_transporte;
	Button button_galeria_de_produtos, button_ofertas, button_voltar_3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c2_actividades);
		
		button_vendas_a_retalho 	= (Button) findViewById(R.id.button_vendas_a_retalho);		
		button_vendas_a_grosso 		= (Button) findViewById(R.id.button_vendas_a_grosso);
		button_encomendas 			= (Button) findViewById(R.id.button_encomendas);		
		button_credito 				= (Button) findViewById(R.id.button_credito);	
		button_transporte 			= (Button) findViewById(R.id.button_transporte);
		button_galeria_de_produtos 	= (Button) findViewById(R.id.button_galeria_de_produtos);	
		button_ofertas 				= (Button) findViewById(R.id.button_ofertas);	
		button_voltar_3 			= (Button) findViewById(R.id.button_voltar_3);

		
	
	button_vendas_a_retalho.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Venda_a_Retalho();					
		}
	});	
	
	
	button_vendas_a_grosso.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Venda_a_Grosso();	
		}
	});	


	button_encomendas.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Encomendas();					
		}
	});		
	
	
	button_credito.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Credito();					
		}
	});	
			
	
	button_transporte.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Transporte();					
		}
	});
	
	
	button_galeria_de_produtos.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Galeria_de_Produtos();					
		}
	});


	button_ofertas.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Ofertas();					
		}
	});

	button_voltar_3.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			finish();					
		}
	});		
	
}

/////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	

	
	private void Venda_a_Retalho(){
		Intent Venda_a_Retalho = new Intent (this,D3_Venda_a_Retalho.class);
		startActivity(Venda_a_Retalho);
	}	
	 
	private void Venda_a_Grosso(){
		Intent Venda_a_Grosso = new Intent (this,D3_Venda_a_Grosso.class);
		startActivity(Venda_a_Grosso);
	}
	
	private void Encomendas(){
		Intent Encomendas = new Intent (this,D3_Encomendas.class);
		startActivity(Encomendas);
	}
	
	private void Credito(){
		Intent Credito = new Intent (this,D3_Credito.class);
		startActivity(Credito);
	}
	
	private void Transporte(){
		Intent Transporte = new Intent (this,D3_Transporte.class);
		startActivity(Transporte);
	}
	
	private void Galeria_de_Produtos(){
		Intent Galeria_de_Produtos = new Intent (this,D3_Galeria_de_Produtos.class);
		startActivity(Galeria_de_Produtos);
	}
	
	private void Ofertas(){
		Intent Ofertas = new Intent (this,D3_Ofertas.class);
		startActivity(Ofertas);
	}
	
	
/*		
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
			AlertDialog.Builder alertaPrincipal = new AlertDialog.Builder(B_Menu_Inicial.this);
			alertaPrincipal.setTitle("Sobre o Aplicativo");
			alertaPrincipal.setMessage("MixStep RANGEL v1.2\n\nEste aplicativo foi desenvolvido pela Equipe ANTOLD:\nfacebook.com/Antold.DG\n\n"
					+ "TERMOS DE USO:\n\nOs termos e condições a seguir descrevem as regras aplicáveis à utilização do aplicativo MixStep RANGEL.\n\n"
					+ "O Utilizador tem a liberdade elementar, não exclusivo e temporalmente irrestrito de usar o aplicativo para os seus fins da seguinte forma: \npode instalar e usar uma cópia do aplicativo em aparelhos Android.\n\n"
					+ "Ao ultilizar este aplicativo, concorda que possui este aplicativo apenas para o seu uso, e não possui qualquer direito legal de dominio intelectual e/ou qualquer outro direito!\n\n"
					+ "Embora poderás escolher incluir seus dados pessoais na Base de Dados do aplicativo, não significa que você possui qualquer direito adicional de dominio, tal como usar a imagem do aplicativo como parte de si ou de uma outra Empresa.\n\n"
					+ "MixStep Rangel \n(All Reserved 2018)");
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
*/	
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
