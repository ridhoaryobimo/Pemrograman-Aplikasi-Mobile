package net.ariflaksito.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class JuveAdapter extends BaseAdapter {

    Context context;
    String[] players;
    String[] position;
    int[] num;
    LayoutInflater layoutInflater;

    public JuveAdapter(Context context, String[] players, String[] position, int[] num) {
        this.context = context;
        this.players = players;
        this.position = position;
        this.num = num;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return players.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.list_players, null);

        TextView tvPlayers = view.findViewById(R.id.tv_player);
        TextView tvPosition = view.findViewById(R.id.tv_pos);
        TextView tvNumber = view.findViewById(R.id.tv_number);

        tvPlayers.setText(players[i]);
        tvPosition.setText(position[i]);
        tvNumber.setText(num[i]+"");

        return view;
    }
}
