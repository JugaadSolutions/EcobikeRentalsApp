package com.example.ecobikerentalapp;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		ConnectivityManager connMgr = (ConnectivityManager) 
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo == null ) {
        	// Internet connection is not present
            // Ask user to connect to Internet
            showAlertDialog(WelcomeActivity.this, "No Internet Connection",
                    "You don't have internet connection.", false);
        }
       
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}
	 public void showAlertDialog(Context context, String title, String message, Boolean status) {
	        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
	 
	        // Setting Dialog Title
	        alertDialog.setTitle(title);
	 
	        // Setting Dialog Message
	        alertDialog.setMessage(message);
	         
	        // Setting alert dialog icon
	     //   alertDialog.setIcon((status) ? R.drawable.success : R.drawable.fail);
	 
	        // Setting OK Button
	        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int which) {
	            }
	        });
	 
	        // Showing Alert Message
	        alertDialog.show();
	    }

}
