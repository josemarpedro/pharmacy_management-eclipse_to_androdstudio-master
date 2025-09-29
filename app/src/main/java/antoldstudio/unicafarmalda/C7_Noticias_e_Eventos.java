package antoldstudio.unicafarmalda;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class C7_Noticias_e_Eventos extends Activity {

	WebView webView_noticias_e_eventos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c7_noticias_e_eventos);
		
		Toast.makeText(getApplicationContext(), "Carregando... \nAguarde porfavor!", Toast.LENGTH_LONG).show();
		
		webView_noticias_e_eventos = (WebView) findViewById(R.id.webView_noticias_e_eventos);
		
		webView_noticias_e_eventos.getSettings().setJavaScriptEnabled(true);
		webView_noticias_e_eventos.loadUrl("https://docs.google.com/spreadsheets/d/e/2PACX-1vSSIUpc2hZn6_9Iqb5Xyu3GVqg8sS-Se4YRe6m38D2UoveK7g426m_0aOccZCbc-Y7lYwT6uitDtUL0/pubhtml");
		webView_noticias_e_eventos.setWebViewClient(new WebViewClient()); //Este que faz a página abrir na activity
	
		 //  String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
		 //  webView.loadData(customHtml, "text/html", "UTF-8");
		
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
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
