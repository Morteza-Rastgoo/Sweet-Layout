package com.mrastgoo.sweetlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.mrastgoo.sweetalert.SweetAlertLayout;

import static com.mrastgoo.sweetalert.SweetAlertLayout.*;

public class MainActivity extends AppCompatActivity {

    private SweetAlertLayout sweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sweet = (SweetAlertLayout) findViewById(R.id.sweet);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.progress:
                changeAlertType(PROGRESS_TYPE);
                return true;
            case R.id.fail:
                changeAlertType(ERROR_TYPE);
                return true;
            case R.id.tick:
                changeAlertType(SUCCESS_TYPE);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    private void changeAlertType(int progressType) {
        sweet.changeAlertType(progressType);
    }
}
