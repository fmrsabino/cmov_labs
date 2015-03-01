package pt.ulisboa.tecnico.cmov.servicesimple;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import pt.ulisboa.tecnico.cmov.servicesimple.R;


public class MainActivity extends ActionBarActivity {

    public static String PREFS_NAME = "Prefs";
    public static String COUNTER_NAME = "counter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Start the service
    public void startService(View view) {
        incrementCounter();
        startService(new Intent(this, MyService.class));
    }

    // Stop the service
    public void stopService(View view) {
        stopService(new Intent(this, MyService.class));
    }

    private void incrementCounter() {
        //read counter
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        int counter = settings.getInt(COUNTER_NAME, 0);
        counter++;

        //write new counter
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(COUNTER_NAME, counter);
        editor.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
