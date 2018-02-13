package Library;
import java.util.Scanner;
public class LibraryTest {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the library's location, total staff, total books, and yearly expenses?");
		Library lb1= new Library(scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
		System.out.println(lb1.location);
		System.out.println(lb1.tStaff);
		System.out.println(lb1.tBooks);
		System.out.println(lb1.yearlyex);
		scanner.nextLine();
		
		System.out.println("What is the library's location, total staff, total books, and yearly expenses?");
		Library lb2= new Library(scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
		System.out.println(lb2.location);
		System.out.println(lb2.tStaff);
		System.out.println(lb2.tBooks);
		System.out.println(lb2.yearlyex);
		scanner.nextLine();
		
		System.out.println("What is the library's location, total staff, total books, and yearly expenses?");
		Library lb3= new Library(scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
		System.out.println(lb3.location);
		System.out.println(lb3.tStaff);
		System.out.println(lb3.tBooks);
		System.out.println(lb3.yearlyex);
		scanner.nextLine();
		
		System.out.println("What is the library's location, total staff, total books, and yearly expenses?");
		Library lb4= new Library(scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
		System.out.println(lb4.location);
		System.out.println(lb4.tStaff);
		System.out.println(lb4.tBooks);
		System.out.println(lb4.yearlyex);
		scanner.nextLine();
		
	}

}
