package com.example.first_android_project.utilities;

public class MathUtils
{

	public static String displayNumber(double xdouble)
	{
		String result = "";
		int xint = (int) xdouble;
	
		if (xdouble - xint == 0)
		{
	
			result = String.valueOf(xint);
	
		}
		else
		{
			result = String.valueOf(xdouble);
		}
	
		return result;
	}

}
