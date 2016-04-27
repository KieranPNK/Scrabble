import java.util.Scanner;
import java.util.Arrays;


public class Scrabble {
// This class will have a main and call all the other classes and use them

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	System.out.println(Character.toUpperCase('p') );
        Pool pool=new Pool();
Frame frame =new Frame();
        pool.reset();
        
		System.out.println("Cheek if Frame Empty Expected result: true Actual result: " + frame.cheekEmptyFrame());
		frame.refillFrame(pool);
        String toString= new String(frame.FrameArray);
       
        char tochar;
       System.out.println("Expected:Frame array without the letter entered, Actual result:" +toString);
       System.out.println("Cheek if Frame Empty Expected result: false Actual result: " + frame.cheekEmptyFrame());
       Scanner in = new Scanner(System.in);
      System.out.println("Query a letter from the above pool: ");
      tochar= in.nextLine().charAt(0);
      System.out.println("Expected that query will return:true, Actual this letter returns: "+frame.CheekLetter(tochar));
      System.out.println("Enter a letter you want removed from the above pool: ");
      tochar= in.nextLine().charAt(0);
      frame.removeLetter(tochar);
      String toString2= new String(frame.FrameArray);
      System.out.println("Expected: the frame without the letter removed! Actual result:" +toString2);
      System.out.println("Expected: returns frame! Actual: returns "+Arrays.toString(frame.accessLetter()));
      System.out.println("Expected prints out frame! Actual prints off ");
      frame.displayFrame();
      in.close();
      
       
	

	}

}
