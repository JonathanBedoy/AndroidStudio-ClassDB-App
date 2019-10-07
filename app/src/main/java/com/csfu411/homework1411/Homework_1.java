package com.csfu411.homework1411;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.graphics.Color;

import androidx.annotation.Nullable;

public class Homework_1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.HORIZONTAL);
        root.setBackgroundColor(Color.BLACK);
        root.setColumnCount(25);
        root.setRowCount(20);

        //Define params
        TextView tv;
        GridLayout.Spec row_spec;
        GridLayout.Spec col_spec;
        GridLayout.LayoutParams cParams;

//------------------------------------

//-----------Column 0--------------
        //1-11
        for( int i = 0; i < 11; i++) {
            tv = new TextView(this);
            tv.setText(" "+(i+1));
            tv.setBackgroundColor(Color.GRAY);
            tv.setTextSize(10);
            tv.setGravity(Gravity.CENTER);

            row_spec = GridLayout.spec(i,1,1f);
            col_spec = GridLayout.spec(0,1f);
            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(1,1,1,1);
            tv.setLayoutParams(cParams);

            root.addView(tv);
        }
//(0,1) RULES VOID HELLO1(INT HOUR)
        tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(0,1,1f);
        col_spec = GridLayout.spec(1,24, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);
//-----------Column 1--------------
//(1, 1)-(1,2) PROPERTIES
        tv = new TextView(this);
        tv.setText("properties");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);
        row_spec = GridLayout.spec(1, 2, 1f);
        col_spec = GridLayout.spec(1, 4,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);
//(1, 3) RULE
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);
        row_spec = GridLayout.spec(3,1,1f);
        col_spec = GridLayout.spec(1, 4,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(1, 4)
        tv = new TextView(this);
        tv.setText("");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(4,1,1f);
        col_spec = GridLayout.spec(1,4,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(1, 5)
        tv = new TextView(this);
        tv.setText("");

        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(5,1,1f);
        col_spec = GridLayout.spec(1, 4,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(1, 6) Rule
        tv = new TextView(this);
        tv.setText("Rule");

        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(6,1,1f);
        col_spec = GridLayout.spec(1, 4,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(1,7)-(1,10)
        for(int i = 7; i <= 10; i++) {
            tv = new TextView(this);
            tv.setText("R"+(10*(i-6)));

            tv.setBackgroundColor(Color.WHITE);
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(10);

            row_spec = GridLayout.spec(i,1,1f);
            col_spec = GridLayout.spec(1, 4,1f);
            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(1,1,1,1);
            tv.setLayoutParams(cParams);

            root.addView(tv);
        }

//-----------Column 2--------------
        //(2, 1) name
        tv = new TextView(this);
        tv.setText("name");

        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(1,1,1f);
        col_spec = GridLayout.spec(5,8,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(2, 2) category
        tv = new TextView(this);
        tv.setText("category");

        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(2,1,1f);
        col_spec = GridLayout.spec(5,8,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);


        //(2, 3) C1
        tv = new TextView(this);
        tv.setText("C1");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(3,1,1f);
        col_spec = GridLayout.spec(5,8,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(2, 4) min <= hour && hour <= max
        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(4,1,1f);
        col_spec = GridLayout.spec(5, 8,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(2, 5) int min
        tv = new TextView(this);
        tv.setText("int min");

        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(5,1,1f);
        col_spec = GridLayout.spec(5,4,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);


        //(2, 5) int max
        tv = new TextView(this);
        tv.setText("int max");

        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(5,1,1f);
        col_spec = GridLayout.spec(9,4,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(2, 6) From
        tv = new TextView(this);
        tv.setText("From");

        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(6,1,1f);
        col_spec = GridLayout.spec(5,4,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(2, 7) - (2, 10)
        for(int i = 7; i < 11; i++) {
            tv = new TextView(this);
            if(i == 7) {
                tv.setText("0");
            } else {
                tv.setText(""+(((i-7)*6)+6));
            }

            tv.setBackgroundColor(Color.YELLOW);
            tv.setTextColor(Color.BLACK);
            tv.setGravity(Gravity.RIGHT);
            tv.setTextSize(10);

            row_spec = GridLayout.spec(i,1,1f);
            col_spec = GridLayout.spec(5,4,1f);
            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(1,1,1,1);
            tv.setLayoutParams(cParams);

            root.addView(tv);
        }

        //(2, 6) To
        tv = new TextView(this);
        tv.setText("To");

        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(6,1f);
        col_spec = GridLayout.spec(9,4,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(2, 7) - (2, 10)
        for(int i = 7, temp = 6, pad = 11; i < 11; i++) {
            tv = new TextView(this);
            if(i == 7) {
                tv.setText("11");
            } else {
                tv.setText(""+(pad+=temp));
                temp -= 2;
            }

            tv.setBackgroundColor(Color.YELLOW);
            tv.setTextColor(Color.BLACK);
            tv.setGravity(Gravity.RIGHT);
            tv.setTextSize(10);

            row_spec = GridLayout.spec(i,1f);
            col_spec = GridLayout.spec(9,4,1f);
            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(1,1,1,1);
            tv.setLayoutParams(cParams);

            root.addView(tv);
        }


//-----------Column 3--------------
        //(3, 1) Day Hour Classification
        tv = new TextView(this);
        tv.setText("Day Hour Classification");

        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(1,1f);
        col_spec = GridLayout.spec(13,12,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(3, 2) Day and Time
        tv = new TextView(this);
        tv.setText("Day and Time");

        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(2,1f);
        col_spec = GridLayout.spec(13,12, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(3, 3) A1
        tv = new TextView(this);
        tv.setText("A1");

        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(3,1f);
        col_spec = GridLayout.spec(13,12, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(3, 4) System.Out.Println(greeting+ \", World!\")
        tv = new TextView(this);
        tv.setText("System.Out.Println(greeting+ \", World!\")");

        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(4,1f);
        col_spec = GridLayout.spec(13,12, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(3, 4) String greeting
        tv = new TextView(this);
        tv.setText("String greeting");

        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(13,12, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(3, 6) Greeting
        tv = new TextView(this);
        tv.setText("Greeting");

        tv.setBackgroundColor(Color.rgb(255,204,153));
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(6,1f);
        col_spec = GridLayout.spec(13,12, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(3, 7) Good Morning
        tv = new TextView(this);
        tv.setText("Good Morning");

        tv.setBackgroundColor(Color.rgb(255,204,153));
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(7,1f);
        col_spec = GridLayout.spec(13,12, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(3, 8) Good Afternoon
        tv = new TextView(this);
        tv.setText("Good Afternoon");

        tv.setBackgroundColor(Color.rgb(255,204,153));
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(8,1f);
        col_spec = GridLayout.spec(13,12, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(3, 9) Good Evening
        tv = new TextView(this);
        tv.setText("Good Evening");

        tv.setBackgroundColor(Color.rgb(255,204,153));
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(9,1f);
        col_spec = GridLayout.spec(13,12, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

        //(3, 10) Good Night
        tv = new TextView(this);
        tv.setText("Good Night");

        tv.setBackgroundColor(Color.rgb(255,204,153));
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(10);

        row_spec = GridLayout.spec(10,1f);
        col_spec = GridLayout.spec(13,12, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        tv.setLayoutParams(cParams);

        root.addView(tv);

//        setContentView(root);

        //FOR XML USE THIS
        setContentView(R.layout.homework_1_grid);
    }

}
