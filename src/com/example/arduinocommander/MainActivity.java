package com.example.arduinocommander;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    BlueHandler myBlueHandler=new BlueHandler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.CheckBt();
        myBlueHandler.Connect();

        final Button but_right = (Button) findViewById(R.id.but_right);
        but_right.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myBlueHandler.writeData(65);
            }
        });

        final Button but_left = (Button) findViewById(R.id.but_left);
        but_left.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myBlueHandler.writeData(66);
            }
        });

        final Button but_front = (Button) findViewById(R.id.but_front);
        but_front.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myBlueHandler.writeData(67);
            }
        });

        final Button but_behind = (Button) findViewById(R.id.but_behind);
        but_behind.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myBlueHandler.writeData(68);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*private void CheckBt() {
        CharSequence isConnected = myBlueHandler.CheckBt();
        if (isConnected == null){
            Toast.makeText(getApplicationContext(),
                    isConnected, Toast.LENGTH_SHORT)
                    .show();
        }
    }*/

}