package com.example.first_android_project;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

		//---------------------------------------------------------- 

	

		 Button b4=(Button) findViewById(R.id.btn_4);
		 
		 b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView tv=(TextView)findViewById(R.id.num_disp);
				String four="4";
				String s1=(String)tv.getText();
				tv.setText(s1+four);
				
			}
		});

		//---------------------------------------------------------- 


 Button b5=(Button) findViewById(R.id.btn_5);
		 
		 b5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView tv=(TextView)findViewById(R.id.num_disp);
				String five="5";
				String s1=(String)tv.getText();
				tv.setText(s1+five);
				
			}
		});

		//---------------------------------------------------------- 

 Button b6=(Button) findViewById(R.id.btn_6);
		 
		 b6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView tv=(TextView)findViewById(R.id.num_disp);
				String six="6";
				String s1=(String)tv.getText();
				tv.setText(s1+six);
				
			}
		});

		//---------------------------------------------------------- 

		 
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
	 
		//----------------------------------------------------------
	 Button b8=(Button) findViewById(R.id.btn_8);
	 
	 b8.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			TextView tv=(TextView)findViewById(R.id.num_disp);
			String eight="8";
			String s1=(String)tv.getText();
			tv.setText(s1+eight);
			
		}
	});
	 
	 Button b9=(Button) findViewById(R.id.btn_9);
	 
	 b9.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			TextView tv=(TextView)findViewById(R.id.num_disp);
			String nine="9";
			String s1=(String)tv.getText();
			tv.setText(s1+nine);
			
		}
	});

	//---------------------------------------------------------- 

	 Button pluse=(Button) findViewById(R.id.btn_plus);
	 
	 pluse.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			TextView tv=(TextView)findViewById(R.id.num_disp);
			if(tv.getText()!=""){
			String num1=(String)tv.getText();
			Toast.makeText(MainActivity.this, num1, Toast.LENGTH_LONG).show();
			tv.setText("");
			}
		}
	});

	//---------------------------------------------------------- 

 

	 
	 
	}

	

}
