package apps.sharabash.minimo2shratapp.start;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;

import apps.sharabash.minimo2shratapp.R;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        imitViews();
    }

    private void imitViews() {
        imageView = findViewById(R.id.img_start);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_start:

                break;
        }
    }
}
