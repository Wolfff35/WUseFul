package com.wolff.wuseful;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.wolff.wuseful.custom_view.DurationTextView;
import com.wolff.wuseful.fragments.Settings_fragment;
import com.wolff.wuseful.tools.UITools;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){

        }
        if(newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO){

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestGeneric<String> t = new TestGeneric<>();
        t.WtiteType();
        TestGeneric<WTestObject> tt = new TestGeneric<>();
        tt.WtiteType();

        //startService(new Intent(MainActivity.this,WService.class));
        //stopService(new Intent(MainActivity.this,WService.class));

        //i_getRunningServices();

        /*
        WBroadcastReceiver receiver = new WBroadcastReceiver();
        // Создаем фильтр намерения
        IntentFilter iFilter =
                new IntentFilter(Intent.ACTION_CAMERA_BUTTON);
        // Добавляем действие в фильтр
        iFilter.addAction(Intent.ACTION_PACKAGE_ADDED);
        // Регистрируем приемник
        registerReceiver(receiver, iFilter);
        */
        /*
        // Загружаем картинку
        ImageView image = (ImageView) findViewById(R.id.imageView);
        // Загружаем анимацию из файла alpha.xml
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        // Запускаем анимацию
        image.startAnimation(animation);
        */
        /*
        // Находим область ImageView
        ImageView image = (ImageView)findViewById(R.id.image);
        // Загружаем анимацию из файла frames.xml
        image.setBackgroundResource(R.anim.frames);
        AnimationDrawable myAnim = (AnimationDrawable)image.getBackground();
        myAnim.start();
        */
/*
        TelephonyManager tm = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
        Log.e("NUMBER 1"," = "+tm.getLine1Number());
        Log.e("IMEI 0"," = "+tm.getImei(0));
        Log.e("IMEI 1"," = "+tm.getImei(1));
        Log.e("IMEI 2"," = "+tm.getImei(2));
        Log.e("ID 0"," = "+tm.getMeid(0));
        Log.e("ID 1"," = "+tm.getMeid(1));
        Log.e("ID 2"," = "+tm.getMeid(2));
*/
 /*       SensorManager sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        List<Sensor> l = sensorManager.getSensorList(1);
        for(int i=0;i<l.size();i++){
            Log.e("SENSOR",""+l.get(i).getName()+"; "+l.get(i).getStringType());
        }
        */
        //CompassView cv = new CompassView(this);
        //setContentView(cv);
        //CompassView cv = (CompassView)findViewById(R.id.compassView);
        //cv.setBearing(45);

 /*       DurationTextView durationView1 = (DurationTextView) findViewById(R.id.durationview1);
        durationView1.setDuration(25);

        DurationTextView durationView2 = (DurationTextView) findViewById(R.id.durationview2);
        durationView2.setDuration(78);

        DurationTextView durationView3 = (DurationTextView) findViewById(R.id.durationview3);
        durationView3.setDuration(2378);

        DurationTextView durationView4 = (DurationTextView) findViewById(R.id.durationview4);
        durationView4.setDuration(3670);

        DurationTextView durationView5 = (DurationTextView) findViewById(R.id.durationview5);
        durationView5.setDuration(18550);
  */
        Settings_fragment sf = Settings_fragment.newInstance();
        new UITools().displayFragment(this,sf);
    }
    @Override
    protected void onDestroy() {
        // Уничтожаем приемник при завершении приложения
        //unregisterReceiver(receiver);
        super.onDestroy();
    }

    private void i_getRunningServices(){
        ActivityManager am = (ActivityManager) this
                .getSystemService(ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> services = am.getRunningServices(50);
        for (int i = 0; i < services.size(); i++) {
            ActivityManager.RunningServiceInfo rsi = services.get(i);
            Log.i("Service", "Process " + rsi.process + " with component "
                    + rsi.service.getClassName());
        }
    }
//--------------------------------------------------------------------------------------------------
    private void WThread() {
        Thread mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                play_smth();
            }
        });
        mThread.setPriority(Thread.MIN_PRIORITY);
        mThread.setDaemon(true);
        mThread.start();
    }
//--------------------------------------------------------------------------------------------------
    private void WHandler() {
        Handler mHandler = new Handler();
        mHandler.removeCallbacks(mRunnable);
        mHandler.postDelayed(mRunnable,1000);

    }

    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {

        }
    };
    private void play_smth() {

    }
}
