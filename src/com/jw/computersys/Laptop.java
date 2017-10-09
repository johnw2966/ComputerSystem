package com.jw.computersys;

public class Laptop extends Computer {
	private boolean touchscreen;
	
	public Laptop(String id, String make,String memType,int memSize, boolean touchScreen){
		super(id,make,memType,memSize);
		setTouchScreen(touchScreen);
	}

	public boolean isTouchscreen() {
		return touchscreen;
	}

	public void setTouchScreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}
	
	public String toString(){
		return super.toString()+"\nTouch Screen: "+isTouchscreen();
	}

}
