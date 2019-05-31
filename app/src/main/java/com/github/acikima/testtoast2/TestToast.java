package com.github.acikima.testtoast2;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestToast extends Application {
    private static TestToast mContext;
    String greet;

    public TestToast() {
        mContext = this;
        this.greet = "Hey Ima";
    }

    public static Context getContext() {
        return mContext;
    }

    public String getGreet() {
        return greet;
    }

    public void showToast(){
        Toast.makeText(TestToast.getContext(), "U made it Imaaaa", Toast.LENGTH_LONG);
    }
}
