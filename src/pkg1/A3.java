package pkg1;
import java.util.Scanner;
public class A3 {
        
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("START1> ");
		int start1 = sc1.nextInt();
		
		System.out.print("START2> ");
		int start2 = sc1.nextInt();
		
		System.out.print("STOP1> ");
		int stop1  = sc1.nextInt();
		
		System.out.print("STOP2> ");
		int stop2  = sc1.nextInt();
		
		for(int j = start1; j < stop1+1; j++) {
			for(int i = start2; i < stop2+1; i++) {
				System.out.println(j+"*"+i+"="+j*i);
			}
			System.out.println();
		}
		
		
	}

}
