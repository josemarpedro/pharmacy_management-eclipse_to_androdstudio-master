package antoldstudio.unicafarmalda;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class YY_ItemArrayAdapter extends ArrayAdapter<String[]> {

	private List<String[]> scoreList = new ArrayList<String[]>();
	
	static class ItemViewHolder{
		TextView nome_marca;
		TextView nome_composicao;
		TextView nome_dosagem;
		TextView nome_embalagem;
	}
	
	public YY_ItemArrayAdapter(Context context, int resource) {
		super(context, resource);
	}
	
	public void add(String[] object) {
		scoreList.add(object);
		super.add(object);
	}

	public int getCount(){
		return this.scoreList.size();
	}
	
	@Override
	public String[] getItem(int position) {
		return this.scoreList.get(position);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		ItemViewHolder viewHolder;
		if(row == null){
			LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.yy_my_ler_dados_csv, parent, false);
			viewHolder = new ItemViewHolder();
			viewHolder.nome_marca 		= (TextView) row.findViewById(R.id.nome_marca);
			viewHolder.nome_composicao 	= (TextView) row.findViewById(R.id.nome_composicao);
			viewHolder.nome_dosagem 	= (TextView) row.findViewById(R.id.nome_dosagem);
			viewHolder.nome_embalagem 	= (TextView) row.findViewById(R.id.nome_embalagem);
			row.setTag(viewHolder);
		} else {
			viewHolder = (ItemViewHolder) row.getTag();
		}
		String[] stat = getItem(position);
		viewHolder.nome_marca.setText(stat[0]);
		viewHolder.nome_composicao.setText(stat[1]);
		viewHolder.nome_dosagem.setText(stat[2]);
		viewHolder.nome_embalagem.setText(stat[3]);
		return row;
	}
	
}
