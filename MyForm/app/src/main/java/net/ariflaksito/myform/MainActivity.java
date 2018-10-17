package net.ariflaksito.myform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXT_NAMA = "ex_nama";
    public static final String EXT_EMAIL = "ex_email";
    public static final String EXT_HP = "ex_hp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNama, txtEmail, txtPhone, txtPwd;
        Button btnSave;

        txtNama = (EditText)findViewById(R.id.txtNama);
        txtEmail = (EditText)findViewById(R.id.txtEmail);
        txtPhone = (EditText)findViewById(R.id.txtPhone);
        txtPwd = (EditText)findViewById(R.id.txtPwd);

        btnSave = (Button)findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Nama", txtNama.getText().toString());
                Log.d("Email", txtEmail.getText().toString());
                Log.d("Phone", txtPhone.getText().toString());
                Log.d("Password", txtPwd.getText().toString());

                Intent in = new Intent(MainActivity.this, DataActivity.class);
                in.putExtra(EXT_NAMA, txtNama.getText().toString());
                in.putExtra(EXT_EMAIL, txtEmail.getText().toString());
                in.putExtra(EXT_HP, txtPhone.getText().toString());

                startActivity(in);
            }
        });
    }
}
