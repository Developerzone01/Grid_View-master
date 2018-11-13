package com.lec.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CartoonAdapter extends BaseAdapter {
    ArrayList<Cartoon> cartoons= new ArrayList<>();
    Context context;
    LayoutInflater inflater;

    public CartoonAdapter(ArrayList<Cartoon> cartoons,Context context){
        this.cartoons=cartoons;
        this.context=context;
}

    @Override
    public int getCount() {
        return cartoons.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            inflater=LayoutInflater.from(context);
            view=inflater.inflate(R.layout.list_item,null);
        }
        ImageView imgcartoonThumbnail=view.findViewById(R.id.imageView);
        TextView tvCarName=view.findViewById(R.id.textView_name);
        TextView tvCarDescription=view.findViewById(R.id.textView_Description);
        imgcartoonThumbnail.setImageResource(cartoons.get(i).getThumbnail());
        tvCarName.setText(cartoons.get(i).getName());
        tvCarDescription.setText(cartoons.get(i).getDescription());
        return view;
    }
}
