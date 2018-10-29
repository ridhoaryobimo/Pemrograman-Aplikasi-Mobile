package ridhoaryobimo.MyResponsiMovie.api;

import ridhoaryobimo.MyResponsiMovie.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by AnymX on 29/10/2018.
 */

public interface ApiInterface {

    public static String DB_API="b471ed932969437acac73e532659495f";

//    @GET("popular?api_key="+DB_API)
//    Call<Dates>getDates();

    @GET("popular?api_key="+DB_API)
    Call<Movie>getPopular();

    @GET("top_rated?api_key="+DB_API)
    Call<Movie>getRated();

}
