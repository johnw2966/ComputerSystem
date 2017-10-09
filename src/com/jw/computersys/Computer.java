package com.jw.computersys;

public class Computer implements IDable,Comparable<Computer> {
	private String id;
	private String make;
	protected Memory memory;
		
	public Computer(String id, String make,String memType,int memSize){
		setMake(make);
		setID(id);
		memory=new Memory(memType,memSize);
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setID(String id) {
		this.id=id;
	}
		public String getID() {
		return id;
	}
	public String toString(){
		return "ID: " + id +"\nMake: "+ getMake()+memory.toString();
	}

	public int compareTo(Computer c) {
		return this.getID().compareTo(c.getID());
	}
}
