package com.bidjidev.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int jumlahnya = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void tampilJumlah(int angka){
        TextView txtJumlah = (TextView)findViewById(R.id.txtJumlah);
        txtJumlah.setText(angka + "");
    }
    private void tampilHarga(String pesan){
        TextView txtHarga = (TextView)findViewById(R.id.txtHarga);
        txtHarga.setText(pesan);
    }

    public void pesan(View v){
        String tampilkanharga = tampilKanharga(jumlahnya * 3000);
        tampilHarga(tampilkanharga);
    }
    public void Tambah(View v){
        jumlahnya = jumlahnya + 1;
        tampilJumlah(jumlahnya);
    }
    public void Kurang(View v){
        jumlahnya = jumlahnya - 1;
        tampilJumlah(jumlahnya);
    }
    public String tampilKanharga(int harga){
        String pesannya = "Terimakasih telah membeli kopi \n";
        pesannya += "Harga : " + harga;
        return pesannya;
    }
}
