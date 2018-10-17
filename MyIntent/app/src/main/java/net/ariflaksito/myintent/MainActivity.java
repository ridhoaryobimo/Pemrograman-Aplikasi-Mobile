package net.ariflaksito.myintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public static final String EXT_NAMA = "extra_nama";
    public static final String EXT_EMAIL = "extra_email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMove = (Button)findViewById(R.id.btn_move_activity);
        buttonMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(in);
            }
        });

        Button btnMoveData = (Button)findViewById(R.id.btn_move_activity_data);
        btnMoveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, MoveDataActivity.class);
                in.putExtra(EXT_NAMA, "Arif Laksito");
                in.putExtra(EXT_EMAIL, "arif.laksito@amikom.ac.id");

                startActivity(in);
            }
        });

        Button btnDialer = (Button)findViewById(R.id.btn_dial_number);
        btnDialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "*123#";
                Intent in = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                startActivity(in);
            }
        });
    }
}
