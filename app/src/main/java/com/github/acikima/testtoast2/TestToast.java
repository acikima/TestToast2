package com.github.acikima.testtoast2;

import android.content.Context;
import android.widget.Toast;

public class TestToast {
    public void showToast(Context context){

        Toast.makeText(context, "Hello World", Toast.LENGTH_SHORT).show();
    }
}
