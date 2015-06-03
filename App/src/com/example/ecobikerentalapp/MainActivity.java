package com.example.ecobikerentalapp;



import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
            Thread thread=new Thread(){
        	public void run(){
        		try{
        			sleep(2000);
        			
        		         {
        		        	startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
        		        }
        		       
        			
     			     }
        		catch(InterruptedException e){
        			e.printStackTrace();
        		}
        		
        	}
        	
        };
        thread.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
   
}
