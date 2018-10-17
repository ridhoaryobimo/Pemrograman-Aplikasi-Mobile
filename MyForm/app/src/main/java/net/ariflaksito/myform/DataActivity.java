package net.ariflaksito.myform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static net.ariflaksito.myform.MainActivity.EXT_EMAIL;
import static net.ariflaksito.myform.MainActivity.EXT_HP;
import static net.ariflaksito.myform.MainActivity.EXT_NAMA;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView tvNama = (TextView)findViewById(R.id.tv_nama);
        TextView tvEmail = (TextView)findViewById(R.id.tv_email);
        TextView tvHp = (TextView)findViewById(R.id.tv_hp);

        tvNama.setText("Nama: "+getIntent().getStringExtra(EXT_NAMA));
        tvEmail.setText("Email: "+getIntent().getStringExtra(EXT_EMAIL));
        tvHp.setText("HP: "+getIntent().getStringExtra(EXT_HP));
    }
}
