package ridhoaryobimo.MyResponsiMovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import ridhoaryobimo.MyResponsiMovie.adapter.MovieAdapter;
import ridhoaryobimo.MyResponsiMovie.api.ApiClient;
import ridhoaryobimo.MyResponsiMovie.api.ApiInterface;
import ridhoaryobimo.MyResponsiMovie.model.Movie;
import ridhoaryobimo.MyResponsiMovie.model.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView moView;
    MovieAdapter adapView;
    List<Result> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moView = (RecyclerView)findViewById(R.id.movieView);
        moView.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));

        movieLoad("popular");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.list_sort_setting, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.popular){
            movieLoad("popular");
        }else if (id == R.id.top_rated){
            movieLoad("top_rated");
        }

        return super.onOptionsItemSelected(item);
    }

    private void movieLoad(String value){
        ApiInterface api = ApiClient.getRetrofit().create(ApiInterface.class);
        Call<Movie> call= null;
        if (value.equals("popular")){
            call = api.getPopular();
        }else if (value.equals("top_rated")){
            call = api.getRated();
        }
        call.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                Movie movie = response.body();
                adapView = new MovieAdapter(results);
                adapView.setData(movie.getResults());
                moView.setAdapter(adapView);
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {

            }
        });
    }
}
