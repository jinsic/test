package com.example.dlwls.quickcoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView_01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_01 = (TextView) findViewById(R.id.Result);

    }

    public void onClick01(View v){
        textView_01.setText(String.valueOf(MyMinimum.getResult()));
    }

    public void onClick02(View v){
        textView_01.setText(String.valueOf(MyAverage.getResult()));
    }

    public static class  MyValue{
        static int getResult(){
            return 0;
        }

        int[] arr={1,2,3,4,5,6,7,8,9};

    }

    public static class MyMinimum extends MyValue{
        static int getResult()
        {
            int[] arr={1,2,3,4,5,6,7,8,9};

            int result = 0;
            for(int i = 0; i< arr.length;++i)
            {
                if(result < arr[i])
                    result = arr[i];
            }

            return result;
        }

    }


    public static class MyAverage extends MyValue{
        static int getResult()
        {
            int[] arr={1,2,3,4,5,6,7,8,9};

            int result = 0;
            for(int i = 0; i< arr.length;++i)
                result+=arr[i];

            return result/arr.length;


        }

    }
}
