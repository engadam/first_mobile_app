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
	private int count;
	private String num1,num2;
	private char p;
	private boolean equal_press=false;
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
				if (equal_press==true){
					tv.setText("");
					equal_press=false;
				}
				
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
				if (equal_press==true){
					tv.setText("");
					equal_press=false;
				}
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
				if (equal_press==true){
					tv.setText("");
					equal_press=false;
				}
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
				if (equal_press==true){
					tv.setText("");
				}
				String three="3";
				equal_press=false;
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
				if (equal_press==true){
					tv.setText("");
					equal_press=false;
				}
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
				if (equal_press==true){
					tv.setText("");
				}
				String five="5";
				String s1=(String)tv.getText();
				tv.setText(s1+five);
				equal_press=false;
				
			}
		});

		//---------------------------------------------------------- 

 Button b6=(Button) findViewById(R.id.btn_6);
		 
		 b6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView tv=(TextView)findViewById(R.id.num_disp);
				if (equal_press==true){
					tv.setText("");
					equal_press=false;
				}
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
			if (equal_press==true){
				tv.setText("");
				equal_press=false;
			}
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
			if (equal_press==true){
				tv.setText("");
				equal_press=false;
			}
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
			if (equal_press==true){
				tv.setText("");
				equal_press=false;
			}
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
			num1=(String)tv.getText();
			tv.setText("");
			p='+';
			}
		}
	});

	//----------------------------------------------------------
	 
Button sub=(Button) findViewById(R.id.btn_sub);
	 
	 sub.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			TextView tv=(TextView)findViewById(R.id.num_disp);
			if(tv.getText()!=""){
			num1=(String)tv.getText();
			tv.setText("");
			p='-';
			}
		}
	});

	 
		//----------------------------------------------------------
	 
	 Button multi=(Button) findViewById(R.id.btn_multi);
	 	 
	 	 multi.setOnClickListener(new View.OnClickListener() {
	 		
	 		@Override
	 		public void onClick(View v) {
	 			TextView tv=(TextView)findViewById(R.id.num_disp);
	 			if(tv.getText()!=""){
	 			num1=(String)tv.getText();
	 			tv.setText("");
	 			p='*';
	 			}
	 		}
	 	});
	 
	 	//----------------------------------------------------------
		 
		 Button div=(Button) findViewById(R.id.btn_div);
		 	 
		 	 div.setOnClickListener(new View.OnClickListener() {
		 		
		 		@Override
		 		public void onClick(View v) {
		 			TextView tv=(TextView)findViewById(R.id.num_disp);
		 			if(tv.getText()!=""){
		 			num1=(String)tv.getText();
		 			tv.setText("");
		 			p='/';
		 			}
		 		}
		 	});
		 
	 
	 //-------------------------------------------------------

Button eql=(Button) findViewById(R.id.btn_eql);
	 
	 eql.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			TextView tv=(TextView)findViewById(R.id.num_disp);
			num2=(String)tv.getText();
			double intnum1=Double.parseDouble(num1);
			double intnum2=Double.parseDouble(num2);
			double sum=0;
			double dtotal;
			int inttotal=(int)sum;
			String t;
			String t2;
			equal_press=true;
			//--
			switch (p)
			{
				case '+' :
				sum=intnum1+intnum2;
				inttotal=(int)sum;
				dtotal=inttotal;
				t=String.valueOf(sum);
				t2=String.valueOf(inttotal);
				//----
				if((sum-dtotal)==0){
				// display integer number if the total are integer
					tv.setText(t2);
				}else{
				// display double number if the total are double
					tv.setText(t);
				}
				break; 
			
			case '-':
				sum=intnum1-intnum2;
				inttotal=(int)sum;
				dtotal=inttotal;
				t=String.valueOf(sum);// change to sum to string
				t2=String.valueOf(inttotal);
				//----
				if((sum-dtotal)==0){
				// display integer number if the total are integer
					tv.setText(t2);
				}else{
				// display double number if the total are double
					tv.setText(t);
				}
				break; 
				
			case '*':
				sum=intnum1*intnum2;
				inttotal=(int)sum;
				dtotal=inttotal;
				
				t=String.valueOf(sum);// change to sum to string
				t2=String.valueOf(inttotal);
				
				//----
				if((sum-dtotal)==0){
				// display integer number if the total are integer
					tv.setText(t2);
				}else{
				// display double number if the total are double
					tv.setText(t);
				}
				break; 

			case '/':
				sum=intnum1/intnum2;
				inttotal=(int)sum;	
				dtotal=inttotal;
				
				t=String.valueOf(sum);// change to sum to string
				
				t2=String.valueOf(inttotal);
				//----
				if((sum-dtotal)==0){
				// display integer number if the total are integer
					tv.setText(t2);
				}else{
				// display double number if the total are double
					tv.setText(t);
				}
				break; 

				
			}//switch end 
			
			p=' ';
		
			}
		
		
		    
	 	});

	 
	 
	}

	

}
