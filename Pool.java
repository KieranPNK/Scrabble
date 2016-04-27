import java.util.Arrays;
import java.util.Random;


public class Pool {

	public  int[] LetterMultiples= new int[]{2, 9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};// contains the multiples of the letter in alphbetial array
	public  int[] ValuesOfLetters = new int[]{0, 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 4, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};// contains all the scores of the letters listed in alphbhetical order
	public  int[] PoolLetters = new int[]{};
	
	public  void reset()
	{
		PoolLetters= Arrays.copyOf(LetterMultiples, LetterMultiples.length);// puts all the tile back into the current 
	}
	public  boolean isEmpty()
	{
		int sum=0;																	// sum of all the multiples of tiles in the pool, i.e. when a tile is taken from the pool it will be subtracted from its multiple
		for(int count=0;count<PoolLetters.length;count++)
		{
		
			sum=PoolLetters[count]+sum;
			
		}
			return(sum==0);
	}
	public  char DrawFromPool()
	{
		boolean lettersleft=true;												//for using in a loop below to select a random letter that has'nt already beeing used
		int randomIndex=0;
		char letter;
		if (isEmpty())
		{
			System.out.println("No more tiles!");
			
		}
		while(lettersleft){
		Random randomGenerator = new Random();
		 randomIndex=randomGenerator.nextInt(PoolLetters.length);	//picks a random index associated with a character
			if(PoolLetters[randomIndex]>0)
		{
						
				PoolLetters[randomIndex]=PoolLetters[randomIndex]-1;
				break;
		}
		
		}	
		 if(randomIndex==0)							//This is for when a space is drawing
		 {
			
			 return('#');							//This function has to return a char and since a blank space is'nt noticable I choose a #
		 }
		 else
		 {	 
			 letter = (char) (randomIndex+64);//adds special asci number to randomly selected index and converts to char, Capital Letter
			
			 return letter;
		 }
	}
	public  int QueryValue (char letter)
	{
		int index;
		index= ((int) letter)-64;
		return(ValuesOfLetters[index]);
		
	}
	

}
