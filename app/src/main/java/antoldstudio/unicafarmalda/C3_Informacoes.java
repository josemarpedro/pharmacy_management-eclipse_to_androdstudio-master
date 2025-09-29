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

public class C3_Informacoes extends Activity {

	Button button_sobre_nos, button_endereco, button_contactos, button_horarios, button_diferencial, button_assistencia, button_voltar_4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c3_informacoes);
		
		button_sobre_nos 			= (Button) findViewById(R.id.button_sobre_nos);		
		button_endereco 			= (Button) findViewById(R.id.button_endereco);
		button_contactos 			= (Button) findViewById(R.id.button_contactos);
		button_horarios 			= (Button) findViewById(R.id.button_horarios);		
		button_diferencial 			= (Button) findViewById(R.id.button_diferencial);	
		button_assistencia 			= (Button) findViewById(R.id.button_assistencia);
		button_voltar_4 			= (Button) findViewById(R.id.button_voltar_4);

		
	button_sobre_nos.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			SOBRE_NOS();		
		}
	});	
	
	
	button_endereco.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Enderecos();			
		}
	});	
	
	button_contactos.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Contactos();		
		}
	});	
	

	button_horarios.setOnClickListener(new View.OnClickListener() {		
		@Override
		public void onClick(View v) {			
			HORARIOS();	
		}
	});	
	
	
	button_diferencial.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			DIFERENCIAL();	
		}
	});	

	
	button_assistencia.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			ASSISTENCIA();	
		}
	});	

	
	button_voltar_4.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			finish();					
		}
	});		

}
	

/////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	
	
	
	private void SOBRE_NOS(){
		AlertDialog.Builder sobreNosAlerte = new AlertDialog.Builder(C3_Informacoes.this);
		sobreNosAlerte.setTitle("QUEM SOMOS");
		sobreNosAlerte.setMessage("Somos uma empresa muito bem preparada e motivada para servir nossos clientes. Sempre presente em turnos para que você possa sempre contar conosco aproveitando ao máximo dos produtos da ÚNICA FARMA LDA."
				+ "\n\nAqui temos produtos para todos os bolsos e gostos: Temos um mostruário que serve como esposição dos nossos produtos, um ambiente suave, confortável e com excelentes acabamentos."
				+ "\n\nSeja Farmacias, Centros Médicos, Clínicas, Hospitais ou Doutores, venha visitar a nossa empresa e experimentar a compra de nossos produtos de excelente qualidade!");
		sobreNosAlerte.setNeutralButton("OK", null);
		sobreNosAlerte.show();
	}	
	
	
	private void HORARIOS(){
		AlertDialog.Builder horariosAlerte = new AlertDialog.Builder(C3_Informacoes.this);
		horariosAlerte.setTitle("HORÁRIOS");
		horariosAlerte.setMessage("De Segunda a Sexta: \nDas 8h00 - 15h30 \n\nAos Sábados: \nDas 08h00 - 13h30 \n\nEncerrado aos Domingos e Feriados.");
		horariosAlerte.setNeutralButton("OK", null);
		horariosAlerte.show();
	}	
	
	
	private void DIFERENCIAL(){
		AlertDialog.Builder atractivosAlerte = new AlertDialog.Builder(C3_Informacoes.this);
		atractivosAlerte.setTitle("DIFERENCIAIS");
		atractivosAlerte.setMessage("ENCOMENDAS \nDeseja fazer um pedido e não tem como levar até ao seu establecimento? A Única Farma dispõe de transportes para que o possa auxiliar nesse caso. É possivel fazer a encomenda pelo nossos promotores de venda, por via online, ou pessoalmente. "
				+ "\n\nCRÉDITO \nColocamos a disposição até 30 dias para o pagamento dos produtos. \n\nGALERIA DE PRODUTOS \nVenha até a Única Farma para ver os produtos que temos a disposição nas nossas vetrines."
				+ "\n\nTRANSPORTE DE PRODUTOS \nEntendemos que compras com altas quantidades são dificeis de o cliente levar para o seu destino. Nos oferecemos em prestar este serviço por si."
				+ "\n\nOFERTAS \nAgradecemos imenso por confiar o seu capital em nossos produtos, e como graditão pelas compras de alto valor, ofertamos brindes como Calendários, Agendas, Bloco de Notas e Canetas. ");
		atractivosAlerte.setNeutralButton("OK", null);
		atractivosAlerte.show();
	}	
	
	
	private void ASSISTENCIA(){
		AlertDialog.Builder actualizacoesAlerte = new AlertDialog.Builder(C3_Informacoes.this);
		actualizacoesAlerte.setTitle("ASSISTÊNCIA DA APP");
		actualizacoesAlerte.setMessage("Se encontrar dúvida que deseja ser esclarecida sobre o uso do aplicativo, esteja a vontade em ligar para o nosso número de Assistência Técnica localizado nos CONTACTOS!");
		actualizacoesAlerte.setNeutralButton("OK", null);
		actualizacoesAlerte.show();
	}
	
	
	private void Enderecos(){		
	/*	AlertDialog.Builder enderecoAlerte = new AlertDialog.Builder (C3_Informacoes.this);
		enderecoAlerte.setTitle("ENDEREÇOS");
		enderecoAlerte.setMessage("EMAIL: luanda@unicafarmalda.com \n" + "PÁGINA: fb.com/unicafarmalda1 \n" +  "IG: instagram.com/unicafarmalda \n\n" + 
				"PALANCA: \nAvenida Pedro de Castro, Van-Dúnem Loy, bairro Palanca, município Kilamba Kiaxe, Luanda, Angola \n\n" +
				"CACUACO: \nEstrada Direita de Cacuaco, Km 4,5, Mulemba, bairro Kandua Talhão No. 251/H, Luanda, Angola \n\n" +
				"HUAMBO:  \nRua Principal do Cemitério, S/n, bairro São Pedro, município do Huambo, província do Huambo, Angola \n\n" +
				"LOBITO:  \nAvenida Salvador Correia-Lobito, município do Lobito, província do Lobito, Angola \n\n" );
		enderecoAlerte.setNeutralButton("Voltar", null);
		enderecoAlerte.show();
	*/
		Intent Enderecos = new Intent (C3_Informacoes.this, C32_Enderecos.class);
		startActivity(Enderecos);
	}
	

	private void Contactos(){
		Intent Contactos = new Intent (C3_Informacoes.this,C31_Contactos.class);
		startActivity(Contactos);
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
