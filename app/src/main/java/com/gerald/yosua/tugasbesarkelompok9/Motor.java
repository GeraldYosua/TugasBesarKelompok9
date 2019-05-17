package com.gerald.yosua.tugasbesarkelompok9;

import android.os.Parcel;
import android.os.Parcelable;

public class Motor implements Parcelable {
    private String nama, detail, foto, detail2, Tahun, Sampai;

    protected Motor(Parcel in) {
        nama = in.readString();
        detail = in.readString();
        foto = in.readString();
        detail2 = in.readString();
        Tahun = in.readString();
        Sampai = in.readString();

    }

    public static final Parcelable.Creator<Motor > CREATOR = new Parcelable.Creator<Motor >() {
        @Override
        public Motor  createFromParcel(Parcel in) {
            return new Motor (in);
        }

        @Override
        public Motor [] newArray(int size) {
            return new Motor [size];
        }
    };

    public Motor () {

    }


    public String getNama() {

        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDetail2() {
        return detail2;
    }

    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }

    public String getTahun() {
        return Tahun;
    }

    public void setTahun(String Tahun) {
        this.Tahun = Tahun;
    }

    public String getSampai() {
        return Sampai;
    }

    public void setSampai(String Sampai) {
        this.Sampai = Sampai;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nama);
        parcel.writeString(this.detail);
        parcel.writeString(this.foto);
        parcel.writeString(this.detail2);
        parcel.writeString(this.Tahun);
        parcel.writeString(this.Sampai);


    }
}