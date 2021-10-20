import java.io.FileWriter;
import java.io.IOException;
public class fil1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      FileWriter a = new FileWriter("filename.txt");
		      a.write("hi hello ia m sathi!");
		      a.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
	}
}
}