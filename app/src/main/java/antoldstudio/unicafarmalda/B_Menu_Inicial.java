package antoldstudio.unicafarmalda;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class B_Menu_Inicial extends Activity {

	Button button_unicafarma, button_actividades, button_produtos;
	Button button_informacoes, button_imagens, button_comentarios;
	Button button_eventos, button_mais_unica;
	String password;
	String dialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b_menu_inicial);
			
		Toast.makeText(getApplicationContext(), "v1.9", Toast.LENGTH_SHORT).show();		
		
		new Handler().postDelayed(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				criarNotificacaoSimples();
			} 
		}, 500);
	
		button_unicafarma 	= (Button) findViewById(R.id.button_unicafarma);
		button_produtos 	= (Button) findViewById(R.id.button_produtos);
		button_actividades 	= (Button) findViewById(R.id.button_actividades);
		
		button_informacoes 	= (Button) findViewById(R.id.button_informacoes);	
		button_imagens 		= (Button) findViewById(R.id.button_imagens);
		button_comentarios 	= (Button) findViewById(R.id.button_comentarios);
		
		button_eventos 		= (Button) findViewById(R.id.button_eventos);	
		button_mais_unica 	= (Button) findViewById(R.id.button_mais_unica);

		
	button_unicafarma.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			UnicaFarma();		
		}
	});	
	
	
	button_actividades.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Actividades();	
		}
	});	
	
	
	button_informacoes.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Informacoes();	
		}
	});	
	
	button_imagens.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {			
			Imagens();	
		}
	});	

	button_produtos.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			Produtos();					
		}
	});	
	
	button_comentarios.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			Comentarios();	
		}
		});
	
	button_eventos.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {			
			//	Eventos();	
				AlertDialog.Builder saldoAlerte = new AlertDialog.Builder(B_Menu_Inicial.this);
				saldoAlerte.setTitle("EVENTOS E NOTICIAS");
				saldoAlerte.setMessage("De tempo em tempo vamos lançar eventos para os nossos clientes. Tais como: Descontos, Promoções, Compre 1 leve 2 e outros." );
				saldoAlerte.setNegativeButton("Voltar", null);
				saldoAlerte.setPositiveButton("ENTRAR", new DialogInterface.OnClickListener() {			
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Eventos();	
					}
				});
				saldoAlerte.show();	
			}
		});	
	
	button_mais_unica.setOnClickListener(new View.OnClickListener() {		
		@Override
		public void onClick(View v) {			
			Mais_Unica();	
		}
	});

}
	

/////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
	
	
	
	private void UnicaFarma(){
		Intent UnicaFarma = new Intent (this,C1_UnicaFarma.class);
		startActivity(UnicaFarma);
	}	
	
	private void Actividades(){
		Intent Actividades = new Intent (this,C2_Actividades.class);
		startActivity(Actividades);
	}
	
	private void Informacoes(){
		Intent Informacoes = new Intent (this,C3_Informacoes.class);
		startActivity(Informacoes);
	}
	
	private void Imagens(){
		Intent Imagens = new Intent (this,C4_Imagens.class);
		startActivity(Imagens);
	}
	
	private void Comentarios(){
		Toast.makeText(getApplicationContext(), "Ligue a Internet!", Toast.LENGTH_SHORT).show();
		Intent enviarMensagem = new Intent(B_Menu_Inicial.this, C6_Mensagem.class);
		startActivity(enviarMensagem);
	}
	
	private void Mais_Unica(){
		Intent Mais_Unica = new Intent (this,C9_Mais_Unica.class);
		startActivity(Mais_Unica);
	}
		
	private void Eventos(){
		Intent Noticias_e_Eventos = new Intent (this,C7_Noticias_e_Eventos.class);
		startActivity(Noticias_e_Eventos);	
	}
	
	private void Produtos(){		
		AlertDialog.Builder cardapioAlerte = new AlertDialog.Builder(B_Menu_Inicial.this);
		cardapioAlerte.setTitle("Produtos a Venda");
		cardapioAlerte.setMessage("Nesta secção, será possivel ver os nossos produtos listados. \n\nIntroduza o código de acesso.");
		final EditText editText_dialog = new EditText(this);		
		cardapioAlerte.setView(editText_dialog);
		editText_dialog.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
		cardapioAlerte.setNeutralButton("Voltar", null);
		cardapioAlerte.setPositiveButton("CONTINUAR", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				final Calendar c = Calendar.getInstance();
			    int year = c.get(Calendar.YEAR);
			    int month = c.get(Calendar.MONTH) + 1;
			    int day = c.get(Calendar.DAY_OF_MONTH);
			
			try {
			    String XsenhaDialog = editText_dialog.getText().toString();
				int senhaDialog = Integer.parseInt(XsenhaDialog);
				int senha = Integer.parseInt("0" + day + "0");
			
				if (senha == senhaDialog){
				//	Toast.makeText(getApplicationContext(), "Aguarde Por favor...",Toast.LENGTH_LONG).show();
				//	Intent Produtos = new Intent(Intent.ACTION_VIEW);
				//	Produtos.setData(Uri.parse("https://docs.google.com/spreadsheets/u/1/d/e/2PACX-1vQOXlzNcNkd6TpH99hIHcbdnItU7gQuTEVP8i9OqPfft7xqCAXo5bwSzAirkBMo-SGJqDCdY8b2glqy/pubhtml"));
					Intent Produtos = new Intent(B_Menu_Inicial.this, C5_Produtos.class);
					startActivity(Produtos);
					}
				else{
					Toast.makeText(getApplicationContext(), "Senha Incorrecta.",Toast.LENGTH_LONG).show();
				}
			}
			catch (Exception E){
				Toast.makeText(getApplicationContext(), "Digite apenas números por favor!",Toast.LENGTH_LONG).show();
				}
				
			}
		});
		AlertDialog ad2 = cardapioAlerte.create();
		ad2.show();		
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
			AlertDialog.Builder alertaPrincipal = new AlertDialog.Builder(B_Menu_Inicial.this);
			alertaPrincipal.setTitle("Sobre o Aplicativo");
			alertaPrincipal.setMessage("O QUE HÁ DE NOVO:\n\n"
						+ "1) Tamanho do aplicativo reduzido, agora mais leve.\n\n"
						+ "2) Aplicativo com funções Online e funções Offline.\n\n"
						+ "3) Ver actividades, informações e contactos sem internet.\n\n"
						+ "4) Acompanhe noticias, promoções e outros eventos da Empresa.\n\n"
						+ "5) Botão WHATSAPP para nos enviar mensagem diretamente.\n\n"
						+ "6) Botão +ÚNICA para o entreter depois de usar nossos serviços.\n\n"
						+ "7) Clientes obterão o código de acesso para a lista de produtos.\n\n"
						+ "8) Envie-nos mensagens de avaliação ou de feedback.\n\n"
						+ "9) Dicas de Saúde para melhorar o seu estilo de vida.\n\n\n"
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


	private void addNotification() {
	      Intent intent = new Intent(this, B_Menu_Inicial.class);
        PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, 0);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(
                this).setSmallIcon(R.drawable.ic_launcher)
                .addAction(R.drawable.ic_launcher, "call", pIntent)
                .addAction(R.drawable.ic_launcher, "more", pIntent)
                .addAction(R.drawable.ic_launcher, "add more", pIntent)
                .setContentTitle("My notification")
                .setContentText("Hello World!");
        // Creates an explicit intent for an Activity in your app
        Intent resultIntent = new Intent(this, B_Menu_Inicial.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);

        stackBuilder.addParentStack(B_Menu_Inicial.class);

        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(100, mBuilder.build());
        
        Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		Ringtone toque = RingtoneManager.getRingtone(getApplicationContext(), som);
		toque.play();
	   }
	

	public void criarNotificacaoSimples(){
	    int id = 1;
	    Intent intent = new Intent(B_Menu_Inicial.this, C7_Noticias_e_Eventos.class);
	   
	    NotificationCompat.Builder notificacao = new NotificationCompat.Builder(this);
	    notificacao.setSmallIcon(R.drawable.ic_launcher);
	    notificacao.setContentTitle("Promoção de Produtos");
	    notificacao.setContentText("Entre em Noticias para ver os descontos.");
	    notificacao.setContentIntent(getPendingIntent(id, intent, this));

	    NotificationManagerCompat nm = NotificationManagerCompat.from(this);
	    nm.notify(id, notificacao.build());
	    
	    Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		Ringtone toque = RingtoneManager.getRingtone(getApplicationContext(), som);
		toque.play();
	}

	private PendingIntent getPendingIntent(int id, Intent intent, Context context){
	    TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
	    stackBuilder.addParentStack(intent.getComponent());
	    stackBuilder.addNextIntent(intent);

	    PendingIntent p = stackBuilder.getPendingIntent(id, PendingIntent.FLAG_UPDATE_CURRENT);
	    return p;
	}
	
	public void NotificationService(){
		Timer timer;
        Handler handler;
        TimerTask timer_task;
        
        timer = new Timer();
        timer_task = new TimerTask() {

           @Override
           public void run() {

        //       Intent intent = new Intent(B_Menu_Inicial.this, Androidservice.class);
        //         B_Menu_Inicial.this.startService(intent);
           }
       };
       timer.schedule(timer_task, 5,5000);

	    Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		Ringtone toque = RingtoneManager.getRingtone(getApplicationContext(), som);
		toque.play();
	}

}
