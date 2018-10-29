package ridhoaryobimo.MyResponsiMovie.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.gson.GsonBuilder;
import com.squareup.picasso.Picasso;

import java.util.List;


import ridhoaryobimo.MyResponsiMovie.DetailActivity;
import ridhoaryobimo.MyResponsiMovie.R;
import ridhoaryobimo.MyResponsiMovie.model.Result;

/**
 * Created by AnymX on 29/10/2018.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {

//    TextView Judul,Overview;
    List<Result> results;

    Result result;
    public MovieAdapter(List<Result> results){
        this.results = results;
    }

    @Override
    public MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_movie , parent ,false);
        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(final MovieHolder holder, final int position) {
        Picasso.with(holder.itemView.getContext())
                .load("https://image.tmdb.org/t/p/w185/"+results.get(position).getPosterPath())
                .into(holder.Poster);
//        Judul.setText(result.getTitle());
//        Overview.setText(result.getOverview());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Result data = results.get(position);
                Intent detail = new Intent(holder.itemView.getContext(), DetailActivity.class);
                detail.putExtra("movie", new GsonBuilder().create().toJson(data));
                holder.itemView.getContext().startActivity(detail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public void setData(List<Result> results){
        this.results = results;
    }

    class MovieHolder extends RecyclerView.ViewHolder{
        ImageView Poster;
//        TextView Judul, Overview;
        public MovieHolder(View itemView){
            super(itemView);
            Poster = (ImageView)itemView.findViewById(R.id.poster);
//            Judul = (TextView)itemView.findViewById(R.id.title_main);
//            Overview = (TextView)itemView.findViewById(R.id.overview);
//            result = new GsonBuilder()
//                    .create()
//                    .fromJson(String.valueOf(getItemId()), Result.class);
//            Judul.setText(result.getTitle());
//            Overview.setText(result.getOverview());
        }
    }

}


