package antoldstudio.unicafarmalda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class zz_MyLerDadosCSV extends Activity {
	
	String  publicoE, numero_de_agente;
	String publico;
	String[] dataValue;
	String first;
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
		
		try{
			Inicio();				
		}catch (Exception e){
			Toast.makeText(getApplicationContext(), "Sem Dados!", Toast.LENGTH_LONG).show();
			finish();
		}

	//	LeituraDados();
	//	EnviarRelatorio();
		 
	}	
	
	
	private void Inicio(){
	//	InputStream inputStream = getResources().openRawResource(R.raw.agentes_activos);
		File fIn = new File("sdcard/Download/agentes_activos.csv");
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(fIn);
		} catch (FileNotFoundException e) {
			Toast.makeText(getApplicationContext(), "Arquivo csv não encontrado.", Toast.LENGTH_LONG).show();
			e.printStackTrace();
		}
	
	//	CSVFile csvFile = new CSVFile(inputStream);
	//	List<String[]> agentesActivos = csvFile.read();
		CSVFile csvFile = new CSVFile(inputStream);
		List<String[]> agentesActivos = csvFile.read();
		zz_MyListAdapter adapter = new zz_MyListAdapter(this, R.layout.zz_my_ler_dados_csv,R.id.nome_agente, agentesActivos);
		ListView listView=(ListView)findViewById(R.id.listview);		
		listView.setAdapter(adapter);
	}
	
	private class CSVFile {
	//	InputStream inputStream;
		FileInputStream inputStream;

	//	public CSVFile(InputStream inputStream2){
		public CSVFile(FileInputStream inputStream2){
			this.inputStream = inputStream2;
 	  }

/////////////////////////////////////////////////////////////////////////
////////////////	ATENÇÃO		///////////////////////////////////////// 
		
		public List<String[]> read(){
  	 ////// AQUI É ONDE SE VÊ SE É , OU ;
     List<String[]> resultList = new ArrayList<String[]>();
     BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
     try {
        String line;
        while ((line = reader.readLine()) != null) {
           String[] row = line.split(";");
           resultList.add(row);   
           first = Arrays.toString(row);
        }        
     }
     catch (IOException e) {
        Log.e("Main",e.getMessage());
     }
     finally {
        try {
           inputStream.close();
        }
        catch (IOException e) {
        	Log.e("Main",e.getMessage());
        }
     }
     return resultList;
		}
	}
}