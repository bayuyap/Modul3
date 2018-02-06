package id.sch.smktelkom_mlg.colorvariable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton r1, r2, r3, r4, r5, r6, r7, r8;
    TextView warna;
    Button exit, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.rdb1);
        r2 = findViewById(R.id.rdb2);
        r3 = findViewById(R.id.rdb3);
        r4 = findViewById(R.id.rdb4);
        r5 = findViewById(R.id.rdb5);
        r6 = findViewById(R.id.rdb6);
        r7 = findViewById(R.id.rdb7);
        r8 = findViewById(R.id.rdb8);
        warna = findViewById(R.id.txtwarna);
        exit = findViewById(R.id.btnexit);
        next = findViewById(R.id.button);
        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        r5.setOnClickListener(this);
        r6.setOnClickListener(this);
        r7.setOnClickListener(this);
        r8.setOnClickListener(this);
        exit.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == exit) {
            finish();
        } else if (v == r1) {
            warna.setBackgroundResource(R.color.backRed);
        } else if (v == r2) {
            warna.setBackgroundResource(R.color.backGreen);
        } else if (v == r3) {
            warna.setBackgroundResource(R.color.backBlue);
        } else if (v == r4) {
            warna.setBackgroundResource(R.color.backWhite);
        } else if (v == r5) {
            warna.setBackgroundResource(R.color.backYellow);
        } else if (v == r6) {
            warna.setBackgroundResource(R.color.backDark);
        } else if (v == r7) {
            warna.setBackgroundResource(R.color.backPink);
        } else if (v == r8) {
            warna.setBackgroundResource(R.color.backCayon);
        } else if (v == next) {
            Intent i = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(i);
        }
    }
}
