package com.example.q.myapplication;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    final String LOG_TAG = "myLogs";
    private Button Button1;
    private Button Button2;
    private Button Button3;
    private Button Button4;
    private Button Button5;
    private Button Button6;
    private Button Button7;
    private Button Button8;
    private Button Button9;
    private TextView Go;
    private EditText X;
    private EditText Zero;
    X_O first_Game = new X_O();
    static String[] mass = new String[9];
    int k = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        X = (EditText) findViewById(R.id.x_name);
        Zero = (EditText) findViewById(R.id.zero_name);
        Zero.setText(getIntent().getExtras().getString("user2"));
        X.setText(getIntent().getExtras().getString("user1"));
        first_Game.getName1(getIntent().getExtras().getString("user1"));
        first_Game.getName2(getIntent().getExtras().getString("user2"));
        Go = (TextView) findViewById(R.id.who_go);
        Go.setText(getIntent().getExtras().getString("user2"));
        //final PorterDuffColorFilter redFilter = new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.DARKEN);
        //final PorterDuffColorFilter bluFilter = new PorterDuffColorFilter(Color.BLUE, PorterDuff.Mode.DARKEN);
        Button1 = (Button) findViewById(R.id.button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k % 2 == 0)
                {
                    Button1.setText("X");
                    Button1.setEnabled(false);
                    Button1.setTextColor(Color.RED);
                    Go.setText(Zero.getText());
                }
                else
                {
                    Button1.setText("0");
                    Button1.setEnabled(false);
                    Button1.setTextColor(Color.BLUE);
                    Go.setText(X.getText().toString());
                }
                k++;
                GetFild();
                Win();
            }
        });

        //-----------------------------------------------------------
        Button2 = (Button) findViewById(R.id.button2);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k % 2 == 0)
                {
                    Button2.setText("X");
                    Button2.setEnabled(false);
                    Button2.setTextColor(Color.RED);
                    Go.setText(Zero.getText());
                }
                else
                {
                    Button2.setText("0");
                    Button2.setEnabled(false);
                    Button2.setTextColor(Color.BLUE);
                    Go.setText(X.getText());
                }
                k++;
                GetFild();
                Win();
            }
        });

        //-----------------------------------------------------------
        Button3 = (Button) findViewById(R.id.button3);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k % 2 == 0)
                {
                    Button3.setText("X");
                    Button3.setEnabled(false);
                    Button3.setTextColor(Color.RED);
                    Go.setText(Zero.getText());
                }
                else
                {
                    Button3.setText("0");
                    Button3.setEnabled(false);
                    Button3.setTextColor(Color.BLUE);
                    Go.setText(X.getText());
                }
                k++;
                GetFild();
                Win();
            }
        });

        //-----------------------------------------------------------
        Button4 = (Button) findViewById(R.id.button4);
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k % 2 == 0)
                {
                    Button4.setText("X");
                    Button4.setEnabled(false);
                    Button4.setTextColor(Color.RED);
                    Go.setText(Zero.getText());
                }
                else
                {
                    Button4.setText("0");
                    Button4.setEnabled(false);
                    Button4.setTextColor(Color.BLUE);
                    Go.setText(X.getText().toString());
                }
                k++;
                GetFild();
                Win();
            }
        });

        //-----------------------------------------------------------
        Button5 = (Button) findViewById(R.id.button5);
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k % 2 == 0)
                {
                    Button5.setText("X");
                    Button5.setEnabled(false);
                    Button5.setTextColor(Color.RED);
                    Go.setText(Zero.getText().toString());
                }
                else
                {
                    Button5.setText("0");
                    Button5.setEnabled(false);
                    Button5.setTextColor(Color.BLUE);
                    Go.setText(X.getText().toString());
                }
                k++;
                GetFild();
                Win();
            }
        });

        //-----------------------------------------------------------
        Button6 = (Button) findViewById(R.id.button6);
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k % 2 == 0)
                {
                    Button6.setText("X");
                    Button6.setEnabled(false);
                    Button6.setTextColor(Color.RED);
                    Go.setText(Zero.getText().toString());
                }
                else
                {
                    Button6.setText("0");
                    Button6.setEnabled(false);
                    Button6.setTextColor(Color.BLUE);
                    Go.setText(X.getText());
                }
                k++;
                GetFild();
                Win();
            }
        });

        //-----------------------------------------------------------
        Button7 = (Button) findViewById(R.id.button7);
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k % 2 == 0)
                {
                    Button7.setText("X");
                    Button7.setEnabled(false);
                    Button7.setTextColor(Color.RED);
                    Go.setText(Zero.getText());
                }
                else
                {
                    Button7.setText("0");
                    Button7.setEnabled(false);
                    Button7.setTextColor(Color.BLUE);
                    Go.setText(X.getText());
                }
                k++;
                GetFild();
                Win();
            }
        });

        //-----------------------------------------------------------
        Button8 = (Button) findViewById(R.id.button8);
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k % 2 == 0)
                {
                    Button8.setText("X");
                    Button8.setEnabled(false);
                    Button8.setTextColor(Color.RED);
                    Go.setText(Zero.getText());
                }
                else
                {
                    Button8.setText("0");
                    Button8.setEnabled(false);
                    Button8.setTextColor(Color.BLUE);
                    Go.setText(X.getText());
                }
                k++;
                GetFild();
                Win();
            }
        });

        //-----------------------------------------------------------
        Button9 = (Button) findViewById(R.id.button9);
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k % 2 == 0)
                {
                    Button9.setText("X");
                    Button9.setEnabled(false);
                    Button9.setTextColor(Color.RED);
                    Go.setText(Zero.getText());
                }
                else
                {
                    Button9.setText("0");
                    Button9.setEnabled(false);
                    Button9.setTextColor(Color.BLUE);
                    Go.setText(X.getText());
                }
                k++;
                GetFild();
                Win();
            }
        });
        Button1.setText("-");
        Button2.setText("-");
        Button3.setText("-");
        Button4.setText("-");
        Button5.setText("-");
        Button6.setText("-");
        Button7.setText("-");
        Button8.setText("-");
        Button9.setText("-");
        Button1.setEnabled(true);
        Button2.setEnabled(true);
        Button3.setEnabled(true);
        Button4.setEnabled(true);
        Button5.setEnabled(true);
        Button6.setEnabled(true);
        Button7.setEnabled(true);
        Button8.setEnabled(true);
        Button9.setEnabled(true);
        Button1.setTextColor(Color.BLACK);
        Button2.setTextColor(Color.BLACK);
        Button3.setTextColor(Color.BLACK);
        Button4.setTextColor(Color.BLACK);
        Button5.setTextColor(Color.BLACK);
        Button6.setTextColor(Color.BLACK);
        Button7.setTextColor(Color.BLACK);
        Button8.setTextColor(Color.BLACK);
        Button9.setTextColor(Color.BLACK);

        //-----------------------------------------------------------

    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putAll(outState);

        outState.putString("b1", Button1.getText().toString());
        outState.putString("b2", Button2.getText().toString());
        outState.putString("b3", Button3.getText().toString());
        outState.putString("b4", Button4.getText().toString());
        outState.putString("b5", Button5.getText().toString());
        outState.putString("b6", Button6.getText().toString());
        outState.putString("b7", Button7.getText().toString());
        outState.putString("b8", Button8.getText().toString());
        outState.putString("b9", Button9.getText().toString());
        /*
        outState.putString("b1_color", Button1.getTextColors().toString());
        outState.putString("b2_color", Button1.getTextColors().toString());
        outState.putString("b3_color", Button1.getTextColors().toString());
        outState.putString("b4_color", Button1.getTextColors().toString());
        outState.putString("b5_color", Button1.getTextColors().toString());
        outState.putString("b6_color", Button1.getTextColors().toString());
        outState.putString("b7_color", Button1.getTextColors().toString());
        outState.putString("b8_color", Button1.getTextColors().toString());
        outState.putString("b9_color", Button1.getTextColors().toString());*/
        super.onSaveInstanceState(outState);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Button1.setText(savedInstanceState.getString("b1"));
        if(savedInstanceState.getString("b1")=="X")
        {
            Button1.setEnabled(false);
            Button1.setTextColor(Color.RED);
        }
        else if(savedInstanceState.getString("b1")=="0")
        {
            Button1.setEnabled(false);
            Button1.setTextColor(Color.BLUE);
        }
        else
        {
            Button1.setEnabled(true);
            Button1.setTextColor(Color.BLACK);
        }
        Button2.setText(savedInstanceState.getString("b2"));
        if(savedInstanceState.getString("b2")=="X")
        {
            Button2.setEnabled(false);
            Button2.setTextColor(Color.RED);
        }
        else if(savedInstanceState.getString("b2")=="0")
        {
            Button2.setEnabled(false);
            Button2.setTextColor(Color.BLUE);
        }
        else
        {
            Button2.setEnabled(true);
            Button2.setTextColor(Color.BLACK);
        }
        Button3.setText(savedInstanceState.getString("b3"));
        if(savedInstanceState.getString("b3")=="X")
        {
            Button3.setEnabled(false);
            Button3.setTextColor(Color.RED);
        }
        else if(savedInstanceState.getString("b3")=="0")
        {
            Button3.setEnabled(false);
            Button3.setTextColor(Color.BLUE);
        }
        else
        {
            Button3.setEnabled(true);
            Button3.setTextColor(Color.BLACK);
        }
        Button4.setText(savedInstanceState.getString("b4"));
        if(savedInstanceState.getString("b4")=="X")
        {
            Button4.setEnabled(false);
            Button4.setTextColor(Color.RED);
        }
        else if(savedInstanceState.getString("b4")=="0")
        {
            Button4.setEnabled(false);
            Button4.setTextColor(Color.BLUE);
        }
        else
        {
            Button4.setEnabled(true);
            Button4.setTextColor(Color.BLACK);
        }
        Button5.setText(savedInstanceState.getString("b5"));
        if(savedInstanceState.getString("b5")=="X")
        {
            Button5.setEnabled(false);
            Button5.setTextColor(Color.RED);
        }
        else if(savedInstanceState.getString("b5")=="0")
        {
            Button5.setEnabled(false);
            Button5.setTextColor(Color.BLUE);
        }
        else
        {
            Button5.setEnabled(true);
            Button5.setTextColor(Color.BLACK);
        }
        Button6.setText(savedInstanceState.getString("b6"));
        if(savedInstanceState.getString("b6")=="X")
        {
            Button6.setEnabled(false);
            Button6.setTextColor(Color.RED);
        }
        else if(savedInstanceState.getString("b6")=="0")
        {
            Button6.setEnabled(false);
            Button6.setTextColor(Color.BLUE);
        }
        else
        {
            Button6.setEnabled(true);
            Button6.setTextColor(Color.BLACK);
        }
        Button7.setText(savedInstanceState.getString("b7"));
        if(savedInstanceState.getString("b7")=="X")
        {
            Button7.setEnabled(false);
            Button7.setTextColor(Color.RED);
        }
        else if(savedInstanceState.getString("b7")=="0")
        {
            Button7.setEnabled(false);
            Button7.setTextColor(Color.BLUE);
        }
        else
        {
            Button7.setEnabled(true);
            Button7.setTextColor(Color.BLACK);
        }
        Button8.setText(savedInstanceState.getString("b8"));
        if(savedInstanceState.getString("b8")=="X")
        {
            Button8.setEnabled(false);
            Button8.setTextColor(Color.RED);
        }
        else if(savedInstanceState.getString("b8")=="0")
        {
            Button8.setEnabled(false);
            Button8.setTextColor(Color.BLUE);
        }
        else
        {
            Button8.setEnabled(true);
            Button8.setTextColor(Color.BLACK);
        }
        Button9.setText(savedInstanceState.getString("b9"));
        if(savedInstanceState.getString("b9")=="X")
        {
            Button9.setEnabled(false);
            Button9.setTextColor(Color.RED);
        }
        else if(savedInstanceState.getString("b9")=="0")
        {
            Button9.setEnabled(false);
            Button9.setTextColor(Color.BLUE);
        }
        else
        {
            Button9.setEnabled(true);
            Button9.setTextColor(Color.BLACK);
        }
    }
    protected void GetFild()
    {
        mass[0] = Button1.getText().toString();
        mass[1] = Button2.getText().toString();
        mass[2] = Button3.getText().toString();
        mass[3] = Button4.getText().toString();
        mass[4] = Button5.getText().toString();
        mass[5] = Button6.getText().toString();
        mass[6] = Button7.getText().toString();
        mass[7] = Button8.getText().toString();
        mass[8] = Button9.getText().toString();
        first_Game.getFild(mass);
    }
    protected void Win()
    {
        first_Game.getName1(getIntent().getExtras().getString("user1"));
        first_Game.getName2(getIntent().getExtras().getString("user2"));
        mass[0] = Button1.getText().toString();
        mass[1] = Button2.getText().toString();
        mass[2] = Button3.getText().toString();
        mass[3] = Button4.getText().toString();
        mass[4] = Button5.getText().toString();
        mass[5] = Button6.getText().toString();
        mass[6] = Button7.getText().toString();
        mass[7] = Button8.getText().toString();
        mass[8] = Button9.getText().toString();

        if(!first_Game.win_player().equals("no win"))
        {
            //MessageBox.Show(first_Game.win_player());
            Toast.makeText(Game.this,
                    first_Game.win_player(),
                    Toast.LENGTH_SHORT).show();
            Button1.setText("-");
            Button2.setText("-");
            Button3.setText("-");
            Button4.setText("-");
            Button5.setText("-");
            Button6.setText("-");
            Button7.setText("-");
            Button8.setText("-");
            Button9.setText("-");
            Button1.setEnabled(true);
            Button2.setEnabled(true);
            Button3.setEnabled(true);
            Button4.setEnabled(true);
            Button5.setEnabled(true);
            Button6.setEnabled(true);
            Button7.setEnabled(true);
            Button8.setEnabled(true);
            Button9.setEnabled(true);
            Button1.setTextColor(Color.BLACK);
            Button2.setTextColor(Color.BLACK);
            Button3.setTextColor(Color.BLACK);
            Button4.setTextColor(Color.BLACK);
            Button5.setTextColor(Color.BLACK);
            Button6.setTextColor(Color.BLACK);
            Button7.setTextColor(Color.BLACK);
            Button8.setTextColor(Color.BLACK);
            Button9.setTextColor(Color.BLACK);
        }
        else if (mass[0]!="-"&& mass[1] != "-" && mass[2] != "-" && mass[3] != "-" && mass[4] != "-" && mass[5] != "-" && mass[6] != "-" && mass[7] != "-" && mass[8] != "-")
        {
            // MessageBox.Show("Ніхто не переміг, спробуйте знову!!!");
            Toast.makeText(Game.this,
                    "Ніхто не переміг, спробуйте знову!!!",
                    Toast.LENGTH_SHORT).show();
            Button1.setText("-");
            Button2.setText("-");
            Button3.setText("-");
            Button4.setText("-");
            Button5.setText("-");
            Button6.setText("-");
            Button7.setText("-");
            Button8.setText("-");
            Button9.setText("-");
            Button1.setEnabled(true);
            Button2.setEnabled(true);
            Button3.setEnabled(true);
            Button4.setEnabled(true);
            Button5.setEnabled(true);
            Button6.setEnabled(true);
            Button7.setEnabled(true);
            Button8.setEnabled(true);
            Button9.setEnabled(true);
            Button1.setTextColor(Color.BLACK);
            Button2.setTextColor(Color.BLACK);
            Button3.setTextColor(Color.BLACK);
            Button4.setTextColor(Color.BLACK);
            Button5.setTextColor(Color.BLACK);
            Button6.setTextColor(Color.BLACK);
            Button7.setTextColor(Color.BLACK);
            Button8.setTextColor(Color.BLACK);
            Button9.setTextColor(Color.BLACK);
        }
        else if (first_Game.win_player().equals("no win"))
        {

        }
        else
        {

        }
    }

}
