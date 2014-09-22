package com.CaseySinglehurst.spacegame;

import java.util.List;

import android.graphics.Canvas;

import com.kilobolt.framework.Image;
import com.kilobolt.framework.Input.TouchEvent;

import com.kilobolt.framework.implementation.AndroidInput;

public class Ship {

	public int xpos , ypos;
	public Image sprite = Assets.fighter;
	
	
	public void update(TouchEvent touchevent)
	{
		xpos = touchevent.x;
		ypos = touchevent.y;
		
	}
	
}
