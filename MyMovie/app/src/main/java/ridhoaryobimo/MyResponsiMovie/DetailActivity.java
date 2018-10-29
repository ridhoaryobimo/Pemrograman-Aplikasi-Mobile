package ridhoaryobimo.MyResponsiMovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.GsonBuilder;
import com.squareup.picasso.Picasso;

import ridhoaryobimo.MyResponsiMovie.model.Result;

public class DetailActivity extends AppCompatActivity {

    ImageView poster;
    TextView Judul, Rating, Release, Overview;

    Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        poster = (ImageView)findViewById(R.id.poster);
        Judul = (TextView)findViewById(R.id.judul);
        Rating = (TextView)findViewById(R.id.rating);
        Release = (TextView)findViewById(R.id.release);
        Overview = (TextView)findViewById(R.id.overview);

        result = new GsonBuilder()
                .create()
                .fromJson(getIntent().getStringExtra("movie"), Result.class);

        Picasso.with(DetailActivity.this)
                .load("http://image.tmdb.org/t/p/w185/"+result.getPosterPath())
                .into(poster);
        Judul.setText(result.getTitle());
        Rating.setText(Double.toString(result.getVoteAverage()));
        Release.setText(result.getReleaseDate());
        Overview.setText(result.getOverview());

    }
}
