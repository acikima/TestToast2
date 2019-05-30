package com.github.acikima.testtoast2;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestToast {
    String greet;

    public TestToast() {
        this.greet = "Hey Ima";
    }

    public String getGreet() {
        return greet;
    }

    public void showToast(Context context){
        Toast.makeText(context, "U made it Imaaaa", Toast.LENGTH_LONG);
    }
}
