package antoldstudio.unicafarmalda;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class C8_Desafios_Numeros extends Activity {

	Button button_voltar_numeros;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c6_desafios_numeros);
		
		button_voltar_numeros = (Button) findViewById(R.id.button_voltar_numeros);		

	
		button_voltar_numeros.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			finish();					
		}
	});		

}		
	
	
/////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
/*			
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}	
*/
}
