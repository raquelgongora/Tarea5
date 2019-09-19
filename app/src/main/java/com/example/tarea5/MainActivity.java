package com.example.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  implements SeekBar.OnSeekBarChangeListener{



    SeekBar rColor, gColor, bColor;
    TextView hexText, rText,gText, bText;
    View color;
    int r=0, g=0, b=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rColor = (SeekBar) findViewById(R.id.rColor) ;
        gColor = (SeekBar) findViewById(R.id.gColor) ;
        bColor = (SeekBar) findViewById(R.id.bColor) ;
        hexText = (TextView) findViewById(R.id.hexText);
        color = (View) findViewById(R.id.color);
        rText = (TextView) findViewById(R.id.rText);
        gText = (TextView) findViewById(R.id.gText);
        bText = (TextView) findViewById(R.id.bText);





           rColor.setOnSeekBarChangeListener(this);
           gColor.setOnSeekBarChangeListener(this);
           bColor.setOnSeekBarChangeListener(this);

           hexText.setText("#00000");
           rText.setText("R:");
           gText.setText("G:");
           bText.setText("B:");



    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()) {
            case R.id.rColor:
                r=progress;
                break;

            case R.id.gColor:
                g=progress;
                break;

            case R.id.bColor:
                b=progress;
                break;
        }

        String c = ColorHex(r,g,b);
        hexText.setText(" " + c);
        color.setBackgroundColor(android.graphics.Color.rgb(r,b,g));

    }

    public String ColorHex( int r, int g, int b){
        String color = "";
        color = "#";
        color += Integer.toHexString(r);
        color += Integer.toHexString(g);
        color += Integer.toHexString(b);



        return color;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        rText.setText ("R: " + r);
        bText.setText("B: " +b);
        gText.setText("G: "+g);


    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        rText.setText ("R: " + r);
        bText.setText("B: " +b);
        gText.setText("G: "+g);


    }
}
