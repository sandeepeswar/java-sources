

import java.io.*;
import java.util.*;
class  Sum
{
	public static void main(String[] args)throws IOException 
	{
		int i,j,k;
		String str1,str2,str3;
    Scanner scan= new Scanner(System.in);
		System.out.println(" Enter your Name");
	   String name= scan.next(); 
	   System.out.println(" Enter your Address");
	   String address= scan.next(); 
       System.out.println(" Enter your PIN");
	   int pin= scan.nextInt(); 
	   System.out.println(" Enter your States");
	   String  states= scan.next(); 
        
       
    System.out.println("Name:"+name+"Address:"+address+"PIN:"+pin+"States:"+states);
scan.close();
	}
}
