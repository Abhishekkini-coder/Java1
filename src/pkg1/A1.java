package pkg1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class A1 {
	

	public static void main(String[] args) throws FileNotFoundException {
		A1 a1 = new A1();
		File f1= new File("dictionary.txt");
		Scanner sc2 = new Scanner(f1);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println(sc2.nextLine());
		System.out.println(sc2.nextLine());
		System.out.println(sc2.nextLine());
		
		

	}

}
