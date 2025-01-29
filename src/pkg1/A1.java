package pkg1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
public class A1 {
	

	public static void main(String[] args) throws FileNotFoundException {
		A1 a1 = new A1();
		String line1 = "";
		List<String>list1 = new ArrayList<>();
		File f1= new File("dictionary.txt");
		Scanner sc2 = new Scanner(f1);
		Scanner sc1 = new Scanner(System.in);
		while(sc2.hasNext()) {
			line1 = sc2.nextLine();
			list1.add(line1);
		}
	  
		
		System.out.println(list1);
		
		

	}

}
