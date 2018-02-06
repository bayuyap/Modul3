package id.sch.smktelkom_mlg.colorvariable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {
    Thread splash;
    TextView title;
    private long ms = 0;
    private long splashtime = 3000;
    private boolean splashactive = true;
    private boolean splashpause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread th = new Thread() {
            public void run() {
                try {
                    while (splashactive && ms < splashtime) {
                        if (!splashpause) {
                            ms = ms + 100;
                        }
                        sleep(100);
                    }
                } catch (Exception e) {

                } finally {
                    {
                        Intent i = new Intent(splash_screen.this, MainActivity.class);
                        startActivity(i);
                    }
                }
            }
        };
        th.start();
    }
}
