import java.util.Arrays;
public class BoardTest {
	public static void main(String[] args){
	

		//Board board = new Board();
				Pool pool = new Pool();
				
				//board.BoardCoordinates[0][0] = 'a';
				//System.out.println(Arrays.toString(board.BoardCoordinates));
				//System.out.println(""+Arrays.toString(pool.PoolLetters)+"\n");
				 
			    char [][] scrabbleBoard = new char [16][16];
			    

			    for (int i = 0; i<scrabbleBoard.length; i++) 
			    {
			    	if (i != 0)
			    	{
			    		System.out.println("\t");
			            System.out.print(i-1);
			        }
			    	for (int j = 1; j <scrabbleBoard.length; j++)
			    	{
			    		if (j == 8 && i == 8)
			    		{
			    			 System.out.print("\t");
			    			scrabbleBoard[i][j] = '*';
			                System.out.print(scrabbleBoard[i][j]);
			               
			                
			            }
			    		else
			    		{
			    			if (i == 0)
			    			{
			    				System.out.print("\t");
			                    System.out.print(j-1);
			                }
			    			else
			    			{
			    				scrabbleBoard[i][j] = '_';
			                    System.out.print("\t");
			                    System.out.print(""+scrabbleBoard[i][j]);
			                }
			             }
			         }
			     }

}
}
