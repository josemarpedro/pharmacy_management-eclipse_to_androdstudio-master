package antoldstudio.unicafarmalda;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class D3_Venda_a_Retalho extends Activity {

	Button button_voltar_31;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.d3_venda_a_retalho);
		
		button_voltar_31 = (Button) findViewById(R.id.button_voltar_31);		

	
	button_voltar_31.setOnClickListener(new View.OnClickListener() {
		
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
