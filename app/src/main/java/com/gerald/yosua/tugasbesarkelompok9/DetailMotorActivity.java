package com.gerald.yosua.tugasbesarkelompok9;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.ButterKnife;

public class DetailMotorActivity extends AppCompatActivity {


    ImageView fotoku;
    TextView nama, detail, detail2, tahun, sampai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_motor);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);

        Motor diterima = getIntent().getParcelableExtra("kunci");

        fotoku = (ImageView) findViewById(R.id.img_view);
        nama = (TextView) findViewById(R.id.txt_nama);
        detail = (TextView) findViewById(R.id.txt_detail);
        detail2 = (TextView) findViewById(R.id.tv_detail_panjang);
        tahun = (TextView) findViewById(R.id.tv_tahun);
        sampai = (TextView) findViewById(R.id.tv_sampai);

        Glide.with(this).load(diterima.getFoto()).override(350, 550).into(fotoku);

        nama.setText(diterima.getNama());
        detail.setText(diterima.getDetail());
        detail2.setText(diterima.getDetail2());
        tahun.setText(diterima.getTahun());
        sampai.setText(diterima.getSampai());

    }
}