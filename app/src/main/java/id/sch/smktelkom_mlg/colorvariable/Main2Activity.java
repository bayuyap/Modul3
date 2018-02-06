package id.sch.smktelkom_mlg.colorvariable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button btnSubmit, btnHapus;
    EditText editNama, editTahun, editAlamat, editTelepon, editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnHapus = findViewById(R.id.btnHapus);
        editNama = findViewById(R.id.editNama);
        editTahun = findViewById(R.id.editTahun);
        editAlamat = findViewById(R.id.editAlamat);
        editTelepon = findViewById(R.id.editTelepon);
        editEmail = findViewById(R.id.editEmail);
        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNama.setText("");
                editTahun.setText("");
                editAlamat.setText("");
                editTelepon.setText("");
                editEmail.setText("");
            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editNama.getText().toString();
                Integer tahun = Integer.parseInt(editTahun.getText().toString());
                String alamat = editAlamat.getText().toString();
                long telepon = Long.parseLong(editTelepon.getText().toString());
                String email = editEmail.getText().toString();
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);

                Bundle b = new Bundle();
                b.putString("parse_nama", nama);
                b.putInt("parse_tahun", tahun);
                b.putString("parse_alamat", alamat);
                b.putLong("parse_telepon", telepon);
                b.putString("parse_email", email);

                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}
