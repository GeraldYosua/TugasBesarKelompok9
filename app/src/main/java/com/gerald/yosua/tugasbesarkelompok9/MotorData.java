package com.gerald.yosua.tugasbesarkelompok9;

import java.util.ArrayList;

public class MotorData {
    public static String[][] data = new String[][]{
            {
                    "New Scoopy-fi",
                    "New Honda Scoopy-FI sudah menggunakan sistem PGM-FI (injeksi).",
                    "https://www.iwanbanaran.com/wp-content/uploads/2011/04/scoopy_-_blue.jpg",
                    "Honda Scoopy ini sudah menggunakan gaya retro yang khas. Ciri khasnya, lampu sein terpisah dari bodi. Kemudian velg yang digunakan masih ukuran 14 inci layaknya skutik lain.Mesinnya berkapasitas 110 cc dengan karburator. Bagasi Honda Scoopy generasi pertama juga masih belum bisa memuat helm half face.",
                    "20 Mei 2010",
                    "pertengahan 2012"
            },

            {
                    "Suzuki Nex Reborn",
                    "dibekali dengan mesin yang powerful dan teknologi tinggi dibanding kompetitor sekelasnya ",
                    "https://enoanderson.com/wp-content/uploads/2017/05/Suzuki-Nex-Black-Fire.jpg",
                    "Motor ini mengusung mesin 11cc dengan teknologi SUPER FI (Suzuki Performance Fuel Injection) dan mesin berkonsep LeaP (Light, Efficient and Powerful) yang membuatnya memiliki tenaga lebih besar dan semakin irit bahan bakar, nex juga dibekali dengan mesin yang powerful dan teknologi paling ciamik dibanding kompetitor sekelasnya dan mesin yang iri.",
                    "pertengahan 2014",
                    "Akhir 2015"
            },

            {
                    "Vario 110 FI/eSP",
                    "menggunakan basis mesin berpendingin udara dan sistem pengabutan bahan bakar injeksi",
                    "https://d3ejk2xdr0ilnv.cloudfront.net/bikeBlog/wp-content/uploads/2017/11/27064634/Vario-110-warna-baru-02.jpg",
                    "Motor ini memiliki mesin berkapasitas 108,2 cc SOHC satu silinder. Depot daya itu sanggup memuntahkan torsi puncak 9,1 Nm pada 6.000 rpm dan tenaga maksimal 8,7 PS pada 7.500 rpm. Sistem transmisinya menggunakan CVT. Bagasinya memang tidak bisa memuat helm, cuma berkapasitas 13 liter. ",
                    "Awal 2014",
                    "Akhir 2015"
            },

            {
                    "Suzuki Address Playful",
                    "Desainnya terlihat sporty dan memiliki jok dual tone ",
                    "https://www.otomotifo.com/wp-content/uploads/2017/06/Spesifikasi-dan-Harga-Suzuki-Address-Playful.jpg",
                    "Mesin yang dipakainya sama dengan Suzuki Nex, yaitu mesin berkapasitas 113 cc yang dilengkapi teknologi Fuel Injection. Desainnya terlihat sporty dan memiliki jok dual tone yang memadukan warna hitam dan abu-abu. Serta rem belakang Suzuki Address Playful dengan tromol. ",
                    "pertengahan 2017",
                    "Awal 2019"
            },

            {
                    "Scoopy Fi Stylish",
                    " Mesin 110 cc kini disematkan teknologi enhanched smart power (eSP) ",
                    "https://d3ejk2xdr0ilnv.cloudfront.net/bikeBlog/wp-content/uploads/2017/09/07085558/Honda-Scoopy-Generasi-Ketiga-2015-2017.jpg",
                    "Scoopy Fi Stylish memiliki Mesin 110 cc kini disematkan teknologi enhanched smart power (eSP) yang berfungsi memaksimalkan pembakaran dan meminimalisir gesekan agar energi tidak terbuang percuma.Serta memiliki Idling Stop System (ISS) yang mampu menonaktifkan mesin secara otomatis",
                    "2 November 2015",
                    "Awal 2017"
            },

            {
                    "BeAT PGMFI eSP",
                    "Honda BeAT ini memiliki kapasitas penyimpanan yang lebih longgar",
                    "https://s.kaskus.id/r480x480/images/fjb/2015/07/24/honda_beat_pgmfi_esp_cw_putih_biru_561042_1437708021.jpg",
                    "Motor ini memiliki mesin 108,2 cc, SOHC, Pendingin udara, serta Injeksibagasi lebih luas dan tanki BBM lebih besar menjadi 4 liter.Selain itu, Speedometer di rubah dengan perpaduan Analog dan Digital plus penambahan ECO Indicator dan Headlamp serta Casting Wheel (velg) desain baru yang lebih sporty.",
                    "Pertengahan 2016",
                    "Awal 2018"
            },

            {
                    "All New Honda Scoopy",
                    "Motor trendy ini cocok bagi kawula muda yang ingin tampil gaya ",
                    "https://www.otomotifo.com/wp-content/uploads/2017/05/All-New-Honda-Scoopy.jpg",
                    "Beragam fitur juga dimiliki motor matic murah terbaik ini, seperti lampu depan LED Projector dan Power Charger untuk mengisi ulang smartphone ketika berkendara. Fitur Idling Stops System dan Combi Brake System juga dimiliki All New Honda Scoopy",
                    "Akhir 2017",
                    "Awal 2019"
            },

            {
                    "Honda New Spacy CW FI",
                    "Motor ini juga dilengkapi teknologi PGM-FI yang membuatnya semakin hemat",
                    "https://www.hondacengkareng.com/wp-content/uploads/Honda-Spacy-Putih1.jpg",
                    "mesinnya mengusung mesin 108cc berpendingin kipas yang nantinya mampu menghasilkan tenaga sebeasr 8.54 PS pada 8.000 rpm. Sedangkan torsinya menembus 0.82 kgf.m pada 6.000 rpm. Motor ini juga dilengkapi teknologi PGM-FI . New Spacy FI memiliki ruang bagasi mencapai 18 Liter.",
                    "Awal 2016",
                    "Awal 2018"
            },

            {
                    "All New Honda Beat",
                    "Honda Beat Street yang tampil gaya dengan desain adventure.",
                    "https://www.otomotifo.com/wp-content/uploads/2017/05/All-New-Honda-Beat-eSP.jpg",
                    "Motor Honda ini membekalinya dengan ban tubeless dan sederet fitur canggih, seperti Idling Stop System, Combi Brake System, dan mesin 108.2cc yang dilengkapi teknologi PGM-FI. Kapasitas tangkinya juga lebih besar dibandingkan Beat Pop, yaitu mencapai 4.0 Liter.",
                    "Akhir 2016",
                    "Pertengahan 2018"
            }

    };

    public static ArrayList<Motor> getListData() {
        Motor motor = null;
        ArrayList<Motor> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            motor = new Motor();
            motor.setName(data[i][0]);
            motor.setDetail(data[i][1]);
            motor.setFoto(data[i][2]);
            motor.setDetail2(data[i][3]);
            motor.setTahun(data[i][4]);
            motor.setSampai(data[i][5]);

            list.add(motor);

        }
        return list;

    }
}