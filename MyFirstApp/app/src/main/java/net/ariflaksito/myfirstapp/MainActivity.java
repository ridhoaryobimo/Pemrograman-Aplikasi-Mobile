package net.ariflaksito.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showLog("Activity is being Started");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        showLog("Activity Restarted");
    }

    @Override
    protected void onStart(){
        super.onStart();
        showLog("Activity Started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        showLog("Activity Resumed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        showLog("Activity Paused");
    }

    @Override
    protected void onStop(){
        super.onStop();
        showLog("Activity Stopped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        showLog("Activity is being Destroyed");
    }

    private void showLog(String log){
        Log.d(getPackageName(), log);
    }

}
