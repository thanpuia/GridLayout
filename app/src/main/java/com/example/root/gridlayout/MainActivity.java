package com.example.root.gridlayout;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);

    }

    public void buttonTapped(View view) {
        int id = view.getId();

        String ourId="";

        //int[] sounds = new int[]{R.raw.chinese_gong,R.raw.clock_chimes,R.raw.crackling_fireplace,R.raw.frog,R.raw.knife_sharpen,R.raw.pour_water,R.raw.roaring,R.raw.photocopier};

        ourId = view.getResources().getResourceEntryName(id);

       /* int resourceId= getResources().getIdentifier(ourId,"raw","com.example.root.gridlayout");
        mediaPlayer = MediaPlayer.create(getApplicationContext(),resourceId);
        mediaPlayer.start();*/
        Log.i("buttonTapped",""+view.getId());
        switch (ourId){
            case "button1":Log.i("buttonTapped","1");
                mediaPlayer = MediaPlayer.create(this,R.raw.chinese_gong);
                mediaPlayer.start();
            break;
            case "button2":Log.i("buttonTapped","2");
                mediaPlayer = MediaPlayer.create(this,R.raw.clock_chimes);
                mediaPlayer.start();
            break;
            case "button3":Log.i("buttonTapped","3");
                mediaPlayer = MediaPlayer.create(this,R.raw.crackling_fireplace);
                mediaPlayer.start();
                break;
            case "button4":Log.i("buttonTapped","4");
                mediaPlayer = MediaPlayer.create(this,R.raw.frog);
                mediaPlayer.start();
                break;
            case "button5":Log.i("buttonTapped","5");
                mediaPlayer = MediaPlayer.create(this,R.raw.knife_sharpen);
                mediaPlayer.start();
                break;
            case "button6":Log.i("buttonTapped","6");
                mediaPlayer = MediaPlayer.create(this,R.raw.pour_water);
                mediaPlayer.start();
                break;
            case "button7":Log.i("buttonTapped","7");
                mediaPlayer = MediaPlayer.create(this,R.raw.roaring);
                mediaPlayer.start();
                break;
            case "button8":Log.i("buttonTapped","8");
                mediaPlayer = MediaPlayer.create(this,R.raw.photocopier);
                mediaPlayer.start();
                break;

        }
    }
}
