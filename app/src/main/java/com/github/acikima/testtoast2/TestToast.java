package com.github.acikima.testtoast2;

import android.content.Context;
import android.widget.Toast;

public class TestToast {
    String message;
    public TestToast(Context ctx){
        message = "Hello World";
    }
    public void showToast(Context context){

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
