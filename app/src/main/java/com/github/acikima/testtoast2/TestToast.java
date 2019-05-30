package com.github.acikima.testtoast2;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestToast {
    String message;

    public TestToast(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(Context context, String message) {
        this.message = message;
        showToast(context);
    }

    public void showToast(Context context){
        Toast.makeText(context, this.message, Toast.LENGTH_LONG);
    }
}
