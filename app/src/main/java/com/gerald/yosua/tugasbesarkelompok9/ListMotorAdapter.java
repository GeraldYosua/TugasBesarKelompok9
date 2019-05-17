package com.gerald.yosua.tugasbesarkelompok9;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListMotorAdapter extends RecyclerView.Adapter<ListMotorAdapter.CardViewViewHolder> {

    private Context context;
    private ArrayList<Motor> listMotor;
    private OnClick onClick;

    public ListMotorAdapter(Context context, OnClick onClick) {
        this.context = context;
        this.onClick = onClick;
    }


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_motor, viewGroup, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {

        Motor m = getListMotor().get(i);
        cardViewViewHolder.tampil(m, onClick);

        cardViewViewHolder.btnLike.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View v, int position) {
                Toast.makeText(context, "Anda telah menyukai " + getListMotor().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListMotor().size();
    }

    public ArrayList<Motor> getListMotor() {
        return listMotor;
    }

    public void setListMotor(ArrayList<Motor> listMotor) {
        this.listMotor = listMotor;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama, tvDetail;
        Button btnDetail, btnLike;
        Motor motor;


        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.img_view);
            tvNama = (TextView) itemView.findViewById(R.id.txt_nama);
            tvDetail = (TextView) itemView.findViewById(R.id.txt_detail);
            btnDetail = (Button) itemView.findViewById(R.id.btn_detail);
            btnLike = (Button) itemView.findViewById(R.id.btn_like);

        }

        public void tampil(final Motor motor, final OnClick OnItemClick) {

            Glide.with(context)
                    .load(motor.getFoto())
                    .override(350, 550)

                    .into(imgFoto);

            tvNama.setText(motor.getNama());
            tvDetail.setText(motor.getDetail());

            btnDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClick.onClick(motor);

                }
            });

        }
    }

    public interface OnClick {
        void onClick(Object motor);
    }
}