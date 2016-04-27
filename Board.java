   // import java.util.Arrays;
public class Board 
{

	
		public char[][] BoardCoordinates = new char[15][15];
		public String[][] BoardValues = new String[][]
		
				{
					{"TW", null, null, "DL", null, null, null, "TW", null, null, null, "DL", null, null, "TW"},
					{null, "DW", null, null, null, "TL", null, null, null, "TL", null, null, null, "DW", null},
					{null, null, "DW", null, null, null, "DL", null, "DL", null, null, null, "DW", null, null},
					{"DL", null, null, "DW", null, null, null, "DL", null, null, null, "DW", null, null, "DL"},
					{null, null, null, null, "DW", null, null, null, null, null, "DW", null, null, null, null},
					{null, "TL", null, null, null, "TL", null, null, null, "TL", null, null, null, "TL", null},
					{null, null, "DL", null, null, null, "DL", null, "DL", null, null, null, "DL", null, null},
					{"TW", null, null, "DL", null, null, null, null, null, null, null, "DL", null, null, "TW"},
					{null, null, "DL", null, null, null, "DL", null, "DL", null, null, null, "DL", null, null},
					{null, "TL", null, null, null, "TL", null, null, null, "TL", null, null, null, "TL", null},
					{null, null, null, null, "DW", null, null, null, null, null, "DW", null, null, null, null},
					{"DL", null, null, "DW", null, null, null, "DL", null, null, null, "DW", null, null, "DL"},
					{null, null, "DW", null, null, null, "DL", null, "DL", null, null, null, "DW", null, null},
					{null, "DW", null, null, null, "TL", null, null, null, "TL", null, null, null, "DW", null},
					{"TW", null, null, "DL", null, null, null, "TW", null, null, null, "DL", null, null, "TW"}
				};
		
		StringBuffer input= new StringBuffer();
	public boolean Cheekword(int startX,int startY, int endX, int endY, Frame frame)
		{
			boolean cheek=true;
			for(int i=0; i<input.length();i++)
			{
				if(!(input.charAt(i)==(frame.FrameArray[i])))
				{
					cheek=false;
					System.out.println("You don't have all the letters");
					break;
				}
			}
			
			if(cheek==true)
			{
				if(startX<1 || endX>15 || startY<1 || endY>15)
				{
					cheek=false;
					System.out.println("co-ordinates out of bounds!");
				}
			}
			
			if(cheek==true)
			{
				if(startY==endY)
				{
					for(int i=startX; i<endX; i++)
					{
						if(BoardCoordinates[i][startY]!='\0')
						{
							cheek=false;
							System.out.println("There is letters already here! ");
						}
					}
				}
				else
				{
					for(int i=startY; i<endY; i++)
					{
						if(BoardCoordinates[startX][i]!='\0')
						{
							cheek=false;
							System.out.println("There is letters already here! ");
						}
					}
				}
				
			}
			
			if(cheek==true)
			{
				if(startX != 8 || startY != 8)
				{
					if (BoardCoordinates[7][7]!='\0')
					{
						cheek=false;
						System.out.println("First entry must be on centre tile");
						
					}
				}
				else
				{
					if((startY > 7 || endY < 7) || (startX > 7 || endX < 7))
					{
						cheek=false;
						System.out.println("First entry must be on centre tile");
					}
				}
			}
			
			if (cheek==true)
			{
				if(startX==endX)
				{
					if(input.length()==endY-startY)
					{
						System.out.println("New word must connect to an existing word!");
						cheek=false;
					}
				}
				else
				{
					if(input.length()==endX-startY)
					{
						System.out.println("New word must connect to an existing word!");
						cheek=false;
					}
				}
			}
			return cheek;
		}
		
		public void Reset()
		{
			for(int i=0; i<15; i++)
			{
				for(int j=0; j<15; j++)
				{
					BoardCoordinates[i][j] = '\0';
				}
			}
		}
	
		
	
}