package sajat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class tombos {

	public static void main(String[] args)
	{
		File f = new File("developer.txt");
		ArrayList<dolg> dolgozo=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		dolg s1=new dolg("Varga Tom", 450000, 2, dolg.beosztas.JUNIOR);
		dolg s2=new dolg("Kiss Bence", 520000, 5, dolg.beosztas.JUNIOR);
		dolg s3=new dolg("Balogh Attila", 750000, 6, dolg.beosztas.SENIOR);
		dolg s4=new dolg("Nagy Gyula", 1200000, 15, dolg.beosztas.MANAGER);
		dolg s5=new dolg("Kiss David", 800000, 10, dolg.beosztas.SENIOR);
		
		dolgozo.add(s1);
		dolgozo.add(s2);
		dolgozo.add(s3);
		dolgozo.add(s4);
		dolgozo.add(s5);
		
		System.out.println("Felhaszn�l�k sz�ma: "+dolgozo.size());
	
	
	System.out.println("Keresett felhaszn�l� neve: ");
	String st=sc.nextLine();
		if(st.equals(s1.getUserName()))
			System.out.println(s1.getUserName()+" nev� felhaszn�l� adatai:"+s1);
		else if(st.equals(s2.getUserName()))
			System.out.println(s2.getUserName()+" nev� felhaszn�l� adatai:"+s2);
		else if(st.equals(s3.getUserName()))
			System.out.println(s3.getUserName()+" nev� felhaszn�l� adatai:"+s3);
		else if(st.equals(s4.getUserName()))
			System.out.println(s4.getUserName()+" nev� felhaszn�l� adatai:"+s4);
		else if(st.equals(s5.getUserName()))
			System.out.println(s5.getUserName()+" nev� felhaszn�l� adatai:"+s5);
		else 
			System.out.println("Nincs ilyen nev� felhaszn�l� az adatb�zisban!");
	
	System.out.println("Megadott felhaszn�l� t�rl�se:");
	String sd=sc.nextLine();
	if(sd.equals(s1.getUserName())) {
		System.out.println(dolgozo.remove(s1));
		System.out.println(s1.getUserName()+" t�r�lve!");
	}
	else if(sd.equals(s2.getUserName())) {
		System.out.println(dolgozo.remove(s2));
		System.out.println(s2.getUserName()+" t�r�lve!");
	}
	else if(sd.equals(s3.getUserName()))
	{
		System.out.println(dolgozo.remove(s3));
		System.out.println(s3.getUserName()+" t�r�lve!");
	}
	else if(sd.equals(s4.getUserName()))
	{
		System.out.println(dolgozo.remove(s4));
		System.out.println(s4.getUserName()+" t�r�lve!");
	}
	else if(sd.equals(s5.getUserName())) {
		System.out.println(dolgozo.remove(s5));
		System.out.println(s5.getUserName()+" t�r�lve!");
	}
	else
		System.out.println("Nincs ilyen nev� felhaszn�l� az adatb�zisban!");
 
	dolg.osszehasonlit(s1, s2);
	
	}
	
}
