package javaprogram;

public class Sbi implements Java {
	public void salary() {
		System.out.println("salary account");
	}
    public void saving() {
    	System.out.println("savings account");
    	}
    public void current() {
    	System.out.println("current account");
    }
    public static void main(String[]args) {
    	Sbi obj = new Sbi();
    	obj.saving();
    	obj.current();
    	obj.salary();
    }
    }
 
