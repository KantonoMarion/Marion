package com.mycode.marion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = (EditText)findViewById(R.id.nme);
        final EditText university = (EditText)findViewById(R.id.uni);
        final EditText course = (EditText)findViewById(R.id.cous);
        final EditText year = (EditText)findViewById(R.id.year);

        final TextView hold = (TextView)findViewById(R.id.outpt);
        Button click = (Button)findViewById(R.id.button) ;
        click.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String Name = name.getText().toString();
                String univ = university.getText().toString();
                String cos = course.getText().toString();
                String yr = year.getText().toString();
                String output = Name+" "+univ+" "+cos+" "+yr;
                hold.setText(output);

            }
        });
    }

}
