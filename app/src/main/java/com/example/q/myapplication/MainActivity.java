package com.example.q.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button mButtonStart;
    private EditText edit1;
    private EditText edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        }
        setContentView(R.layout.activity_main);
        mButtonStart = (Button) findViewById(R.id.button_start);
        edit1=(EditText) findViewById(R.id.input_name1);
        edit2=(EditText) findViewById(R.id.input_name2);
        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Game.class);

                String transitionName = getString(R.string.blue_name);
                String transitionName1 = getString(R.string.orange_name);
                View sharedView =edit1;
                View sharedView1 =edit2;
                ActivityOptions transitionActivityOptions = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, Pair.create(sharedView,transitionName),Pair.create(sharedView1,transitionName1));
                }
                intent.putExtra("user1", edit1.getText().toString());
                intent.putExtra("user2", edit2.getText().toString());
                if (transitionActivityOptions != null) {
                    startActivity(intent,transitionActivityOptions.toBundle());
                }
                else
                {
                    startActivity(intent);
                }

            }
        });
    }

}
