package pt.ulisboa.tecnico.cmov.servicesimple;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.widget.Toast;

/**
 * My simple service
 */
public class MyService extends Service {

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Service was Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        SharedPreferences settings = getSharedPreferences(MainActivity.PREFS_NAME, 0);
        int counter = settings.getInt(MainActivity.COUNTER_NAME, 0);
        Toast.makeText(this, "Service Started, Counter = " + counter, Toast.LENGTH_SHORT).show();
        return START_STICKY; // read more on: http://developer.android.com/reference/android/app/Service.html
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_SHORT).show();
    }
}
