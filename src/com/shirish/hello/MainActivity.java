package com.shirish.hello;

import android.app.*;
import android.os.*;
import android.text.method.ScrollingMovementMethod;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
	private Button b;
			EditText etname,etemail,etpassword;
			TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {   //You initialize most of your activity’s class-wide variables here.
		super.onCreate(savedInstanceState);            //This line directs the base Activity class to perform setup work for the MainActivity class
		setContentView(R.layout.activity_main);        //To set the content view for the activity
		b=(Button)findViewById(R.id.click);
		tv=(TextView)findViewById(R.id.display);
		tv.setMovementMethod(new ScrollingMovementMethod());
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				etname=(EditText)findViewById(R.id.name);
				etemail=(EditText)findViewById(R.id.email);
				etpassword=(EditText)findViewById(R.id.password);
				
				tv.setText("Your Input: \n"+etname.getText().toString()+"\n"+etemail.getText().toString()+"\n"+etpassword.getText().toString()+"\nEnd.");
			}
		});
	}
}
