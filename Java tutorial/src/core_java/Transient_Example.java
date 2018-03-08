package core_java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Transient_Example implements Serializable{
	
	private static final long serialVersionUID = 1997761441396803858L;

	int i = 10, j = 20;
	
	transient int k = 30;
	
	transient static int l = 40;
	transient final int m = 50;
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Transient_Example test = new Transient_Example();
		
		FileOutputStream fos = new FileOutputStream("D:\\test\\abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(test);
		
		oos.close();
		
		FileInputStream fis = new FileInputStream("D:\\test\\abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Transient_Example output = (Transient_Example) ois.readObject();
		System.out.println(output.i);
		System.out.println(output.j);
		System.out.println(output.k);
		System.out.println(output.l);
		System.out.println(output.m);
		
		ois.close();
		
	}
}
