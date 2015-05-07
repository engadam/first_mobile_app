package com.example.first_android_project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		shownumber();
	}

	private void shownumber() {
		//----------------------------------------------------------
		 Button b0=(Button) findViewById(R.id.btn_0);
		 
		 b0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView tv=(TextView)findViewById(R.id.num_disp);
				String zero="0";
				String s1=(String)tv.getText();
				tv.setText(s1+zero);
				
			}
		});
		
		//----------------------------------------------------------	

		 Button b1=(Button) findViewById(R.id.btn_1);
		 
		 b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView tv=(TextView)findViewById(R.id.num_disp);
				String one="1";
				String s1=(String)tv.getText();
				tv.setText(s1+one);
				
			}
		});

		//----------------------------------------------------------	

		 Button b2=(Button) findViewById(R.id.btn_2);
		 
		 b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView tv=(TextView)findViewById(R.id.num_disp);
				String two="2";
				String s1=(String)tv.getText();
				tv.setText(s1+two);
				
			}
		});
		 
		 
		//----------------------------------------------------------	

		 Button b3=(Button) findViewById(R.id.btn_3);
		 
		 b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView tv=(TextView)findViewById(R.id.num_disp);
				String three="3";
				String s1=(String)tv.getText();
				tv.setText(s1+three);
				
			}
		});

		 
		 
	 Button b7=(Button) findViewById(R.id.btn_7);
	 
	 b7.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			TextView tv=(TextView)findViewById(R.id.num_disp);
			String sevn="7";
			String s1=(String)tv.getText();
			tv.setText(s1+sevn);
			
		}
	});
	 
	}

	

}
