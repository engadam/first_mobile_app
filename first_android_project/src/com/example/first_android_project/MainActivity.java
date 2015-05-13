package com.example.first_android_project;

import java.io.IOException;

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
				if (!s1.equals("0")){
					tv.setText(s1+zero);
					}else {
						tv.setText(zero);
					}
				
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
				if (!s1.equals("0")){
					tv.setText(s1+one);
					}else {
						tv.setText(one);
					}
				
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
				
				if (!s1.equals("0")){
					tv.setText(s1+two);
					}else {
						tv.setText(two);
					}
				
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
				
				if (!s1.equals("0")){
					tv.setText(s1+three);
					}else {
						tv.setText(three);
					}
				
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
				
				if (!s1.equals("0")){
					tv.setText(s1+four);
					}else {
						tv.setText(four);
					}
				
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
				equal_press=false;
				
				if (!s1.equals("0")){
					tv.setText(s1+five);
					}else {
						tv.setText(five);
					}
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
				
				if (!s1.equals("0")){
					tv.setText(s1+six);
					}else {
						tv.setText(six);
					}
				
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
			
			if (!s1.equals("0")){
			tv.setText(s1+sevn);
			}else {
				tv.setText(sevn);
			}
			
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
			
			if (!s1.equals("0")){
				tv.setText(s1+eight);
				}else {
					tv.setText(eight);
				}
			
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
			
			if (!s1.equals("0")){
				tv.setText(s1+nine);
				}else {
					tv.setText(nine);
				}
			
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
			tv.setText("0");
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
			tv.setText("0");
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
	 			tv.setText("0");
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
		 			tv.setText("0");
		 			p='/';
		 			}
		 		}
		 	});
		 
	 
	 //-------------------------------------------------------

Button eql=(Button) findViewById(R.id.btn_eql);
	 
	 eql.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			try{
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
		
			
			}catch(Exception name){
				
				
			}
			
		
		}
	 
	 	});

	
	//----------------------------------------------------------
	 
	 Button dot=(Button) findViewById(R.id.btn_dot);
	 	 
	 	 dot.setOnClickListener(new View.OnClickListener() {
	 		
	 		@Override
	 		public void onClick(View v) {
	 
	 			TextView tv=(TextView)findViewById(R.id.num_disp);
	 			String s1=(String)tv.getText();
	 			String dot=".";
				if (!(s1.contains("."))){
					tv.setText(s1+dot);
					
				}
				 			
	 			
	 		}
	 	});
	 
	 	//----------------------------------------------------------
		 
		 Button pn=(Button) findViewById(R.id.btn_pn);
		 	 
		 	 pn.setOnClickListener(new View.OnClickListener() {
		 		
		 		@Override
		 		public void onClick(View v) {
		 			TextView tv=(TextView)findViewById(R.id.num_disp);
		 			
		 			String txt=(String) tv.getText();
		 			if(!(txt.charAt(0)=='-')&&(!(txt.equals("0")))){
		 			
		 				tv.setText("-"+ tv.getText());
		 			
		 			}else{
			 			
			 			String a=txt.substring(1);
			 			tv.setText(a);
			 			
			 			
			 			
			 			
			 			
			 			}

		 		}
		 	});
		 
		//---------------------------------------------------------
	 
		 	 
	 
	}

	

}
