package halilJava;
import java.util.Scanner;

public class a5q2 {
public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i;   
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
        int count = input.nextInt();
		 System.out.print(n1+" "+n2);    
		    
		 for(i=2;i < count;++i) 
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}

}
