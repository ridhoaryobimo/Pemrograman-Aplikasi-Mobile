package net.ariflaksito.myintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static net.ariflaksito.myintent.MainActivity.EXT_EMAIL;
import static net.ariflaksito.myintent.MainActivity.EXT_NAMA;

public class MoveDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_data);

        TextView tvNama = (TextView)findViewById(R.id.tv_nama);
        TextView tvEmail = (TextView)findViewById(R.id.tv_email);

        String exNama = getIntent().getStringExtra(EXT_NAMA);
        String exEmail = getIntent().getStringExtra(EXT_EMAIL);

        tvNama.setText(exNama);
        tvEmail.setText(exEmail);
    }
}
