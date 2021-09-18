package org.system;

public class Desktop  extends Computer{
	public void desktopSize()
	{
		int size=32;
		System.out.println("Desktop size "+size);
	}
	public static void main(String[] args) {
		Desktop dtp=new Desktop();
	    String model2 = dtp.model;
		System.out.println("Computer Model :"+model2);
		dtp.desktopSize();
		dtp.computerModel();
	}

}
