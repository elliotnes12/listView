package com.example.desarollo5.listview;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class MyAdapter extends BaseAdapter {

    private Context contexto;
    private int layout;
    private List<String> lista;

    public MyAdapter(Context contexto, int layout, List<String> lista) {
        this.contexto = contexto;
        this.layout = layout;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return this.lista.size();
    }

    @Override
    public Object getItem(int position) {
        return this.lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null){

            LayoutInflater inflater = LayoutInflater.from(contexto);
            convertView = inflater.inflate(R.layout.list_prueba,null);

            holder = new ViewHolder();

            holder.texto = (TextView) convertView.findViewById(R.id.textGoku);
            convertView.setTag(holder);

        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }


         holder.texto.setText(this.lista.get(position));

        return convertView;
    }
    static class ViewHolder{
        TextView texto;
    }
}
