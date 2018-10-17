package net.ariflaksito.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MyCustomActivity extends AppCompatActivity {

    private ListView lvCustom;
    private String[] players = new String[]{
            "Cristiano Ronaldo", "Paulo Dybala", "Mario Mandžukić",
            "Miralem Pjanić", "Sami Khedira", "Emre Can", "Claudio Marchisio",
            "Medhi Benatia", "Giorgio Chiellini", "Leonardo Bonuci",
            "Wojciech Szczęsny"
    };

    private String[] pos = new String[]{
            "Forward", "Forward", "Forward",
            "Midfilder", "Midfilder", "Midfilder", "Midfilder",
            "Defender", "Defender", "Defender",
            "Goal Keeper"
    };

    private int[] num = {7,10,17,5,6,23,8,4,3,19,1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_custom);

        lvCustom = findViewById(R.id.list_view);
        JuveAdapter adapter = new JuveAdapter(this, players, pos, num);
        lvCustom.setAdapter(adapter);
    }
}
