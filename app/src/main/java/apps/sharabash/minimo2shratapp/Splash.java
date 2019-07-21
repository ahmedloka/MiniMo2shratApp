package apps.sharabash.minimo2shratapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import apps.sharabash.minimo2shratapp.utils.Constant;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent intent = new Intent(Splash.this.getApplicationContext(), LoginActivity.class);
                Splash.this.startActivity(intent);
                Splash.this.overridePendingTransition(R.anim.pull_in_left, R.anim.pull_in_right);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                Splash.this.finish();
//            }


            }
        }, 3500);
        Constant.hideStatusBar(this);
        setContentView(R.layout.activity_splash);
    }
}
