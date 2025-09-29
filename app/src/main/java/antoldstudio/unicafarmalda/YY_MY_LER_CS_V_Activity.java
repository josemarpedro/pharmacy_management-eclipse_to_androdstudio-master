package antoldstudio.unicafarmalda;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class YY_MY_LER_CS_V_Activity extends Activity {
	
	 private ListView activity_listView;
	 private YY_ItemArrayAdapter itemArrayAdapter;
	 
	int File_CSV_do_Produto_RAW = C5_Produtos.File_CSV_do_Produto;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yy_activity_listview);

		activity_listView = (ListView) findViewById(R.id.activity_listView);
		itemArrayAdapter = new YY_ItemArrayAdapter(getApplicationContext(), R.layout.yy_my_ler_dados_csv);

		Parcelable state = activity_listView.onSaveInstanceState();
		activity_listView.setAdapter(itemArrayAdapter);
		activity_listView.onRestoreInstanceState(state); 
		
		// ANESTÉSICOS
		if (File_CSV_do_Produto_RAW == 1){
			Ifs_dos_Produtos_1();
		}
		// INFUSÃO / SORO
		if (File_CSV_do_Produto_RAW == 2){
			Ifs_dos_Produtos_2();
		}
		// INJECTÁVEL
		if (File_CSV_do_Produto_RAW == 3){
			Ifs_dos_Produtos_3();
		}
		// COMPRIMIDOS
		if (File_CSV_do_Produto_RAW == 4){
			Ifs_dos_Produtos_4();
		}
		// CÁPSULAS
		if (File_CSV_do_Produto_RAW == 5){
			Ifs_dos_Produtos_5();
		}
		// XAROPES E SUSPENSÕES
		if (File_CSV_do_Produto_RAW == 6){
			Ifs_dos_Produtos_6();
		}
		// GOTAS
		if (File_CSV_do_Produto_RAW == 7){
			Ifs_dos_Produtos_7();
		}
		// SUPOSITÓRIOS
		if (File_CSV_do_Produto_RAW == 8){
			Ifs_dos_Produtos_8();
		}
		// MATERIAL CIRÚRGICO
		if (File_CSV_do_Produto_RAW == 9){
			Ifs_dos_Produtos_9();
		}
		// POMADAS
		if (File_CSV_do_Produto_RAW == 10){
			Ifs_dos_Produtos_10();
		}
		// OUTROS
		if (File_CSV_do_Produto_RAW == 11){
			Ifs_dos_Produtos_11();
		}
		// NOVOS PRODUTOS
		if (File_CSV_do_Produto_RAW == 12){
			Ifs_dos_Produtos_12();
		}
		
	
//		InputStream inputStream = getResources().openRawResource(R.raw.infusao_soros);
//		YY_CSVReader csv = new YY_CSVReader(inputStream);
//		List<String[]> scoreList = csv.read();
		
//		for(String [] scoreData : scoreList){
//			itemArrayAdapter.add(scoreData);
//		}
	}
	
	
	//ANESTÉSICOS
	public void Ifs_dos_Produtos_1(){
		
		Toast.makeText(getApplicationContext(), "ANESTÉSICOS", Toast.LENGTH_SHORT).show();
		
		InputStream inputStream = getResources().openRawResource(R.raw.anestesicos );
		YY_CSVReader csv = new YY_CSVReader(inputStream);
		List<String[]> scoreList = csv.read();
			
		for(String [] scoreData : scoreList){
			itemArrayAdapter.add(scoreData);
		}
	}
	
	// INFUSÃO / SORO
	public void Ifs_dos_Produtos_2(){
		
		Toast.makeText(getApplicationContext(), "INFUSÃO / SORO", Toast.LENGTH_SHORT).show();
		
		InputStream inputStream = getResources().openRawResource(R.raw.infusao_soros);
		YY_CSVReader csv = new YY_CSVReader(inputStream);
		List<String[]> scoreList = csv.read();
		
		for(String [] scoreData : scoreList){
			itemArrayAdapter.add(scoreData);
		}
	}
	
	// INJECTÁVEL
	public void Ifs_dos_Produtos_3(){
		
		Toast.makeText(getApplicationContext(), "INJECTÁVEL", Toast.LENGTH_SHORT).show();
		
		InputStream inputStream = getResources().openRawResource(R.raw.injectaveis);
		YY_CSVReader csv = new YY_CSVReader(inputStream);
		List<String[]> scoreList = csv.read();
		
		for(String [] scoreData : scoreList){
			itemArrayAdapter.add(scoreData);
		}
	}
	
	// COMPRIMIDOS
	public void Ifs_dos_Produtos_4(){
		
		Toast.makeText(getApplicationContext(), "COMPRIMIDOS", Toast.LENGTH_SHORT).show();
		
		InputStream inputStream = getResources().openRawResource(R.raw.comprimidos);
		YY_CSVReader csv = new YY_CSVReader(inputStream);
		List<String[]> scoreList = csv.read();
		
		for(String [] scoreData : scoreList){
			itemArrayAdapter.add(scoreData);
		}
	}
	
	// CÁPSULAS
		public void Ifs_dos_Produtos_5(){
			
			Toast.makeText(getApplicationContext(), "CÁPSULAS", Toast.LENGTH_SHORT).show();
			
			InputStream inputStream = getResources().openRawResource(R.raw.capsulas);
			YY_CSVReader csv = new YY_CSVReader(inputStream);
			List<String[]> scoreList = csv.read();
			
			for(String [] scoreData : scoreList){
				itemArrayAdapter.add(scoreData);
			}
		}
	
	// XAROPES E SUSPENSÕES
		public void Ifs_dos_Produtos_6(){
			
			Toast.makeText(getApplicationContext(), "XAROPES E SUSPENSÕES", Toast.LENGTH_SHORT).show();
			
			InputStream inputStream = getResources().openRawResource(R.raw.xaropes_e_suspensoes);
			YY_CSVReader csv = new YY_CSVReader(inputStream);
			List<String[]> scoreList = csv.read();
			
			for(String [] scoreData : scoreList){
				itemArrayAdapter.add(scoreData);
			}
		}

		// GOTAS
		public void Ifs_dos_Produtos_7(){
			
			Toast.makeText(getApplicationContext(), "GOTAS", Toast.LENGTH_SHORT).show();
			
			InputStream inputStream = getResources().openRawResource(R.raw.gotas);
			YY_CSVReader csv = new YY_CSVReader(inputStream);
			List<String[]> scoreList = csv.read();
			
			for(String [] scoreData : scoreList){
				itemArrayAdapter.add(scoreData);
			}
		}
	
		//SUPOSITÓRIOS
		public void Ifs_dos_Produtos_8(){
			
			Toast.makeText(getApplicationContext(), "SUPOSITÓRIOS", Toast.LENGTH_SHORT).show();
			
			InputStream inputStream = getResources().openRawResource(R.raw.supositorios );
			YY_CSVReader csv = new YY_CSVReader(inputStream);
			List<String[]> scoreList = csv.read();
				
			for(String [] scoreData : scoreList){
				itemArrayAdapter.add(scoreData);
			}
		}
		
		//MATERIAL CIRÚRGICO
		public void Ifs_dos_Produtos_9(){
			
			Toast.makeText(getApplicationContext(), "MATERIAL CIRÚRGICO", Toast.LENGTH_SHORT).show();
			
			InputStream inputStream = getResources().openRawResource(R.raw.material_cirurgico );
			YY_CSVReader csv = new YY_CSVReader(inputStream);
			List<String[]> scoreList = csv.read();
				
			for(String [] scoreData : scoreList){
				itemArrayAdapter.add(scoreData);
			}
		}		
		
		//POMADAS
		public void Ifs_dos_Produtos_10(){
			
			Toast.makeText(getApplicationContext(), "POMADAS", Toast.LENGTH_SHORT).show();
			
			InputStream inputStream = getResources().openRawResource(R.raw.pomadas_gel );
			YY_CSVReader csv = new YY_CSVReader(inputStream);
			List<String[]> scoreList = csv.read();
				
			for(String [] scoreData : scoreList){
				itemArrayAdapter.add(scoreData);
			}
		}
		
		//OUTROS
		public void Ifs_dos_Produtos_11(){
			
			Toast.makeText(getApplicationContext(), "OUTROS", Toast.LENGTH_SHORT).show();
			
			InputStream inputStream = getResources().openRawResource(R.raw.outros );
			YY_CSVReader csv = new YY_CSVReader(inputStream);
			List<String[]> scoreList = csv.read();
				
			for(String [] scoreData : scoreList){
				itemArrayAdapter.add(scoreData);
			}
		}		
		
		//NOVOS PRODUTOS
		public void Ifs_dos_Produtos_12(){
			
			Toast.makeText(getApplicationContext(), "NOVOS PRODUTOS", Toast.LENGTH_SHORT).show();
			
			InputStream inputStream = getResources().openRawResource(R.raw.novos_produtos );
			YY_CSVReader csv = new YY_CSVReader(inputStream);
			List<String[]> scoreList = csv.read();
				
			for(String [] scoreData : scoreList){
				itemArrayAdapter.add(scoreData);
			}
		}		
				
	
}
