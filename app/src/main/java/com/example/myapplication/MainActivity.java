
package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.widget.Button;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);


        textView = findViewById(R.id.date);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "hh:mm");
        String Time = simpleDateFormat.format(calendar.getTime());
        textView.setText(Time);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, Screen2.class);
        startActivity(intent);
    }

}