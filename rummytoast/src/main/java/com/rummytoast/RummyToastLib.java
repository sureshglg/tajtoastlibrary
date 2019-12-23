package com.rummytoast;

import android.content.Context;
import android.widget.Toast;

public class RummyToastLib {
    public static void displayToast(Context ctx, String msg){
        Toast.makeText(ctx,msg,Toast.LENGTH_LONG).show();
    }
}
