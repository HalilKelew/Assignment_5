package halilJava;
import java.util.Scanner;

public class a5q4 {
	public static void main(String[] args) {
		int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
	}
}
