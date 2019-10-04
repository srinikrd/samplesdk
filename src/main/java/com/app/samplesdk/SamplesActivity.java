package com.app.samplesdk;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

public class SamplesActivity{

    private Context ctx;

    public SamplesActivity(Context context) {
        this.ctx = context;
    }

    public int SampleMethod(int value1, int value2) {
        return value1 + value2;
    }

    public void showPopup() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setTitle("Simple Alert");
        builder.setMessage("We have a message");
        builder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ctx,
                                "OK was clicked",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        builder.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(ctx,
                        android.R.string.no, Toast.LENGTH_SHORT).show();
            }
        });
        builder.setCancelable(false);
        builder.show();
    }

}
