package id.sch.smktelkom_mlg.colorvariable;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView txtNama, txtTahun, txtAlamat, txtTelepon, txtEmail;
    String get_nama, get_alamat, get_email;
    Integer get_tahun;
    long get_telepon;
    Button exit, balik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtNama = findViewById(R.id.txtNama);
        txtTahun = findViewById(R.id.txtTahun);
        txtAlamat = findViewById(R.id.txtAlamat);
        txtTelepon = findViewById(R.id.txtTelepon);
        txtEmail = findViewById(R.id.txtEmail);
        exit = findViewById(R.id.button2);
        balik = findViewById(R.id.button3);
        Bundle b = getIntent().getExtras();
        get_nama = b.getString("parse_nama");
        get_tahun = b.getInt("parse_tahun");
        get_alamat = b.getString("parse_alamat");
        get_telepon = b.getLong("parse_telepon");

        get_email = b.getString("parse_email");
        txtNama.setText("Nama Anda adalah " + get_nama);
        txtTahun.setText("Tahun lahir Anda " + get_tahun);
        txtAlamat.setText("Alamat Anda adalah " + get_alamat);
        txtTelepon.setText("Tahun lahir Anda " + get_telepon);
        txtEmail.setText("Nama Anda adalah " + get_email);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialog();
            }
        });
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }
        });
    }

    private void showDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Keluar dari aplikasi?");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Klik Ya untuk keluar!")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Main3Activity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }

}
