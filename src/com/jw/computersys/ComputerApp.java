package com.jw.computersys;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.JOptionPane;
public class ComputerApp {
	
	public ComputerApp(){
		
		Set<Computer> computers = new TreeSet<Computer>();
		while (JOptionPane.showConfirmDialog(null,"Make a computer ?")==JOptionPane.YES_OPTION){
		
		String answer=JOptionPane.showInputDialog("Computer(C)orLaptop(L)");
			if (answer.charAt(0)=='C'){
				Computer computer=makeComputer();
				computers.add(computer);
			}
			else if (answer.charAt(0)=='L'){
				Laptop laptop= makeLaptop();		
				computers.add(laptop);
			}
		}//end make computers
		
		String message="";
		for (Computer c:computers){
			message+=c.toString();
		}
		JOptionPane.showMessageDialog(null,message);
		
		//allcomputers with memory size greater than 2GB
		
		computersgreater2(computers);
		
		
		
	}
	
	private void computersgreater2(Set<Computer> computers) {
		
		TreeSet<Computer> sortedComputersGT2=new TreeSet<Computer>();
		for(Computer c:computers){
			if (c.memory.getSize()>2){
				sortedComputersGT2.add(c);
				}
			}
				
		String message="";
		Iterator<Computer> it=sortedComputersGT2.iterator();
		
		while(it.hasNext()){
			message+=it.next().toString();
		}
						
			JOptionPane.showMessageDialog(null, "Computers with Memory Strage over 2GB\n "+message);
		
		
	}

	public static void main(String args[]){
		ComputerApp computerapp=new ComputerApp();
		
	}
	
	public Laptop makeLaptop(){
		String make,memType,id;
		int memSize;
		boolean touchScreen;
		id=JOptionPane.showInputDialog("Enter Computer ID");
		make=JOptionPane.showInputDialog("Enter Computer Make");
		memType=JOptionPane.showInputDialog("Enter Computer Memory Type");
		memSize=Integer.parseInt(JOptionPane.showInputDialog("Enter Computer Memory Size"));
		touchScreen=Boolean.parseBoolean(JOptionPane.showInputDialog("Touch Screen true/false"));
		Laptop laptop=new Laptop(id,make,memType,memSize,touchScreen);
		return laptop;
	}
	
	public Computer makeComputer(){
		String make,memType,id;
		int memSize;
		id=JOptionPane.showInputDialog("Enter Computer ID");
		make=JOptionPane.showInputDialog("Enter Computer Make");
		memType=JOptionPane.showInputDialog("Enter Computer Memory Type");
		memSize=Integer.parseInt(JOptionPane.showInputDialog("Enter Computer Memory Size"));
		Computer computer=new Computer(id,make,memType,memSize);
		return computer;
	}

}
