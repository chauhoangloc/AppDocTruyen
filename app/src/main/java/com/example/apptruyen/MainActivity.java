package com.example.apptruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.GridView;

import com.example.apptruyen.TruyenTranh.TruyenTranh;
import com.example.apptruyen.adapter.TruyenTranhAdapter;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {
    GridView DSTruyen;
    TruyenTranhAdapter adapter;
    ArrayList<TruyenTranh> truyentranhArrList;
    EditText etxtSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClick();



    }
    private void init(){
        truyentranhArrList= new ArrayList<>();
        truyentranhArrList.add(new TruyenTranh("Solo Leveling","Chapter 1","https://st.nettruyenmax.com/data/comics/188/solo-leveling-ss3.jpg"));
        truyentranhArrList.add(new TruyenTranh("Đấu La đại lục","Chapter 1","https://st.nettruyenmax.com/data/comics/84/dau-la-dai-luc-5.jpg"));
        truyentranhArrList.add(new TruyenTranh("Siêu Phàm Sát Thần","Chapter 1","https://st.nettruyenmax.com/data/comics/124/sieu-pham-sat-than.jpg"));
        truyentranhArrList.add(new TruyenTranh("Luyện Võ Đỉnh Phong","Chapter 1","https://st.nettruyenmax.com/data/comics/32/vo-luyen-dinh-phong.jpg"));

        adapter = new TruyenTranhAdapter(this,0,truyentranhArrList);

    }
    private void anhXa(){
        DSTruyen = findViewById(R.id.DStruyen);
        /*etxtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String s = etxtSearch.getText().toString();
                adapter.sortTruyenTranh(s);
            }
        });*/
    }
    private void setUp(){
        DSTruyen.setAdapter(adapter);

    }
    private void setClick(){}
}