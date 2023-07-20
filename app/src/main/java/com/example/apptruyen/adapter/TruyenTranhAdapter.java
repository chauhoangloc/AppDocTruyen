package com.example.apptruyen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.apptruyen.R;
import com.example.apptruyen.TruyenTranh.TruyenTranh;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TruyenTranhAdapter extends ArrayAdapter<TruyenTranh> {
    private Context ct;
    private ArrayList<TruyenTranh> arr;
    public TruyenTranhAdapter(Context context,int resource, List<TruyenTranh> object){
        super(context,resource,object);
        this.ct= context;
        this.arr= new ArrayList<>(object);
    }
    public void sortTruyenTranh(String s) {
        s = s.toLowerCase();
        int k = 0;
        for (int i = 0; i < arr.size(); i++) {
            TruyenTranh t = arr.get(i);
            String ten = t.getNameT().toLowerCase();
            if (ten.indexOf(s) >= 0) {
                arr.set(i, arr.get(k));
                arr.set(k, t);
                k++;
            }
        }
        notifyDataSetChanged();
    }
    @Override
    public View getView(int postion, View convertView, ViewGroup parent){
        if(convertView==null){
            LayoutInflater infalter=(LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=infalter.inflate(R.layout.item_truyen,null);

        }
        if(arr.size()>0){
            TruyenTranh truyenTranh= this.arr.get(postion);

            TextView tentruyentranh=convertView.findViewById(R.id.txtTenTruyen);
            TextView tenloaiTruyen=convertView.findViewById(R.id.txtloaiTruyen);
            ImageView imageTruyen=convertView.findViewById(R.id.imageTruyen);

            tentruyentranh.setText(truyenTranh.getNameT());
            tenloaiTruyen.setText(truyenTranh.getLoaiTruyen());
            Glide.with(this.ct).load(truyenTranh.getLinkAnh()).into(imageTruyen);
        }
        return convertView;
    }

}
