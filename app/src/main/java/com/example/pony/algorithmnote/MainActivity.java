package com.example.pony.algorithmnote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.pony.algorithmnote.algorithm.SortUtils;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    int[] arrys = {6,5,3,8,1,2,4,9,9,7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //选择排序
        int[] ints = SortUtils.bubbleSort(arrys);
        Log.e(TAG, Arrays.toString(ints));
        //
    }
}
