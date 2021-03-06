package com.thesandx.sandeep.tiktok;

import android.content.Context;
import android.content.SharedPreferences;

public class TimePrefrence {

    Context context;

    TimePrefrence(Context context){
        this.context  = context;
    }

    public void saveCurrent(Integer date,Integer totaltime,Integer timeleft){
        SharedPreferences sharedPreferences = context.getSharedPreferences("TimeDetails",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt("Date",date);
        editor.putInt("TotalTime",totaltime);
        editor.putInt("TimeLeft",timeleft);
    }



}
