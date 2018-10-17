package net.ariflaksito.mylistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnList = findViewById(R.id.btn_list);
        btnList.setOnClickListener(this);

        Button btnCus = findViewById(R.id.btn_cus);
        btnCus.setOnClickListener(this);

        Button btnRec = findViewById(R.id.btn_rec);
        btnRec.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Class<?> tClass = null;
        if (view.getId() == R.id.btn_list)
            tClass = MyListActivity.class;

        else if (view.getId() == R.id.btn_cus)
            tClass = MyCustomActivity.class;

        else if (view.getId() == R.id.btn_rec)
            tClass = MyRecyclerActivity.class;

        Intent intent = new Intent(this, tClass);
        startActivity(intent);
    }
}
