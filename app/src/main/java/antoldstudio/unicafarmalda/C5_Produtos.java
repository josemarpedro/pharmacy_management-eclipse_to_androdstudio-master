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

public class C5_Produtos extends Activity {

	Button button_anestesicos, button_infusao_soros, button_injectaveis, button_comprimidos, button_capsulas, button_xaropes_e_suspensoes;
	Button button_gotas, button_supositores, button_materiais_cirurgicos, button_pomadas_e_gel, button_outros, button_novos_produtos, button_voltar_4;
	
	public static int File_CSV_do_Produto = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c5_produtos);
		
		button_anestesicos 			= (Button) findViewById(R.id.button_anestesicos);		
		button_infusao_soros		= (Button) findViewById(R.id.button_infusao_soros);
		button_injectaveis 			= (Button) findViewById(R.id.button_injectaveis);
				
		button_comprimidos 			= (Button) findViewById(R.id.button_comprimidos);		
		button_capsulas 			= (Button) findViewById(R.id.button_capsulas);
		button_xaropes_e_suspensoes	= (Button) findViewById(R.id.button_xaropes_e_suspensoes);
		
		button_gotas 				= (Button) findViewById(R.id.button_gotas);	
		button_supositores 			= (Button) findViewById(R.id.button_supositores);
		button_materiais_cirurgicos	= (Button) findViewById(R.id.button_materiais_cirurgicos);
		
		button_pomadas_e_gel 		= (Button) findViewById(R.id.button_pomadas_e_gel);		
		button_outros				= (Button) findViewById(R.id.button_outros);		
		button_novos_produtos		= (Button) findViewById(R.id.button_novos_produtos);
		
		button_voltar_4 			= (Button) findViewById(R.id.button_voltar_4);

		
	button_anestesicos.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			File_CSV_do_Produto = 1;
			Intent Anastesicos = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Anastesicos);
			
		}
	});	
	
	
	button_infusao_soros.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 2;
			Intent Infusao_Soros = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Infusao_Soros);
		}
	});	

	
	button_injectaveis.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 3;
			Intent Injectaveis = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Injectaveis);
		}
	});
	
	
	button_comprimidos.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 4;
			Intent Comprimidos = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Comprimidos);
		}
	});
	
	
	button_capsulas.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 5;
			Intent Capsulas = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Capsulas);
		}
	});
	
	
	button_xaropes_e_suspensoes.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 6;
			Intent Xaropes_e_Suspensoes = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Xaropes_e_Suspensoes);
		}
	});
	
	
	button_gotas.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 7;
			Intent Gotas = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Gotas);
		}
	});
	
	
	button_supositores.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 8;
			Intent Supositores = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Supositores);
		}
	});
	
	
	button_materiais_cirurgicos.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 9;
			Intent Materiais_Cirurgicos = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Materiais_Cirurgicos);
		}
	});
	
	
	button_pomadas_e_gel.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 10;
			Intent Pomadas_e_Gel = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Pomadas_e_Gel);
		}
	});
	
	
	button_outros.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			File_CSV_do_Produto = 11;
			Intent Outros = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
			startActivity(Outros);
		}
	});
	
	
	button_novos_produtos.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			AlertDialog.Builder novosProdutos = new AlertDialog.Builder (C5_Produtos.this);
			novosProdutos.setTitle("NOVOS PRODUTOS");
			novosProdutos.setMessage("Temos novos produtos para si, e pode visualizar no botão OFFLINE. Futuramente traremos outros novos produtos na qual poderá visualizar no botão ONLINE.");
			novosProdutos.setNeutralButton("OFFLINE", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					File_CSV_do_Produto = 12;
					Intent Novos_Produtos = new Intent (C5_Produtos.this,YY_MY_LER_CS_V_Activity.class);
					startActivity(Novos_Produtos);
				}
			});
			novosProdutos.setPositiveButton("ONLINE", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "Aguarde Por favor...",Toast.LENGTH_LONG).show();
					Intent produtosOnline = new Intent(Intent.ACTION_VIEW);
					produtosOnline.setData(Uri.parse("https://docs.google.com/spreadsheets/d/e/2PACX-1vS2faiD4bSnjiQiZmlIj37znH8NoCANTRHv3oYecQ0FcmHhzrsHD2CfxnpVi8M8S5FGDX_2q5NIvbWh/pubhtml"));
					startActivity(produtosOnline);
				}
			});
			novosProdutos.show();
			
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
