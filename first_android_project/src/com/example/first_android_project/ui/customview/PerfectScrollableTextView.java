package com.example.first_android_project.ui.customview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

public class PerfectScrollableTextView extends TextView
{

	public PerfectScrollableTextView(Context context, AttributeSet attrs,
			int defStyle)
	{
		super(context, attrs, defStyle);
		setHorizontallyScrolling(true);
		setVerticalScrollBarEnabled(false);
	}

	public PerfectScrollableTextView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		setHorizontallyScrolling(true);
		setVerticalScrollBarEnabled(false);
	}

	public PerfectScrollableTextView(Context context)
	{
		super(context);
		setHorizontallyScrolling(true);
		setVerticalScrollBarEnabled(false);

	}

	@Override
	protected void onFocusChanged(boolean focused, int direction,
			Rect previouslyFocusedRect)
	{
		if (focused) super.onFocusChanged(focused, direction,
				previouslyFocusedRect);
	}

	@Override
	public void onWindowFocusChanged(boolean focused)
	{
		if (focused) super.onWindowFocusChanged(focused);
	}

	@Override
	public boolean isFocused()
	{
		return true;
	}
}