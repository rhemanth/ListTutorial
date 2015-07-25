package com.punithhemanth.listtutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by labuser on 7/25/15.
 */
public class MySimpleArrayAdapter extends ArrayAdapter<String> {

    Context context;
    ArrayList<String> list;

    public MySimpleArrayAdapter(Context context, List<String> objects) {
        super(context, -1, objects);
        this.context = context;
        this.list = (ArrayList<String>) objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout,parent,false);
        TextView textView = (TextView) rowView.findViewById(R.id.titleHolder);
        textView.setText(list.get(position));
        ImageView imageView = (ImageView) rowView.findViewById(R.id.iconHolder);
        imageView.setImageResource(R.drawable.india);
        return rowView;


    }
}
