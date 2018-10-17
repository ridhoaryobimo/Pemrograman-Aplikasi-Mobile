package net.ariflaksito.mylistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyListActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] players = new String[]{
            "Cristiano Ronaldo", "Paulo Dybala", "Mario Mandžukić",
            "Miralem Pjanić", "Sami Khedira", "Emre Can", "Claudio Marchisio",
            "Medhi Benatia", "Giorgio Chiellini", "Leonardo Bonuci",
            "Wojciech Szczęsny"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MyListActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, players);

        lvItem.setAdapter(adapter);

    }

}
