import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class fil2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		      File myObj = new File("filename.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String s = myReader.nextLine();
		        System.out.println(s);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
	}
  }
}
