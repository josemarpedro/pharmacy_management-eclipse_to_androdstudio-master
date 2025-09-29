package antoldstudio.unicafarmalda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.StaticLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

	public class zz_MyListAdapter extends ArrayAdapter<String[]>{
	
		int groupid;
		List<String[]> items;
		Context context;
		String path;
		public static String publicoEstatico;
		String[] row;
		
		public zz_MyListAdapter(Context context, int vg, int id, List<String[]> items){
			super(context,vg, id, items);
			this.context=context;
			groupid=vg;
			this.items=items;
		}

////////////////////////////////////////////////////////////////////////////////////////
//////////// AQUI ONDE ESTÃO AS VARIÁVEIS ////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////		
		
		static class ViewHolder {
			public TextView nome_agente, encomendaGlobal, numeroSenhaGlobalPRI, numeroSenhaGlobalULT;
   
		}	
		
		public View getView(int position, View convertView, ViewGroup parent) {

			View rowView = convertView;
			if(rowView==null){
				LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				rowView= inflater.inflate(groupid, parent, false); 
	            ViewHolder viewHolder 			= new ViewHolder();
				viewHolder.nome_agente 			= (TextView) rowView.findViewById(R.id.nome_agente); 
				viewHolder.encomendaGlobal 		= (TextView) rowView.findViewById(R.id.encomendaGlobal); 
				viewHolder.numeroSenhaGlobalPRI = (TextView) rowView.findViewById(R.id.numeroSenhaGlobalPRI); 
				viewHolder.numeroSenhaGlobalULT = (TextView) rowView.findViewById(R.id.numeroSenhaGlobalULT); 
				rowView.setTag(viewHolder);
		}
			
     // Fill data
     ViewHolder holder = (ViewHolder) rowView.getTag();     
     row=items.get(position);     
//   guardarDados();
     holder.nome_agente.setText(row[0]);
     holder.encomendaGlobal.setText(row[1] + " AKZ");
     holder.numeroSenhaGlobalPRI.setText(row[2]);
     holder.numeroSenhaGlobalULT.setText(row[3]);
     
     return rowView;     
		
	}
		
}
