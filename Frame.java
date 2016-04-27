
public class Frame {
	

	public   char[] FrameArray=new char[7];
	
  public  void  refillFrame(Pool Pool4Frame)	//reads in a pool instance***haven't tested yet***
	 {
	   for(int i=0;i<7;i++)
	   {
	     FrameArray[i]=Pool4Frame.DrawFromPool();
	 	 
	   }  
	 }

public   boolean CheekLetter(char searchLetter)
  {     
	 if(Character.isLowerCase(searchLetter))
	   {
		   Character.toUpperCase(searchLetter);		
	   }
    	boolean letterPresent=false;
    	for(int i = 0; i < 7; i++)
        {
          if(searchLetter==FrameArray[i])
             {
               letterPresent=true;
               break;
             }
         }
         return letterPresent;
   }          
 
   public   boolean cheekEmptyFrame()
             {
				boolean FrameEmpty=false;
               for(int i=0;i<7;i++)
        {
          if('\0'==FrameArray[i])		//the null character of a char
             {
        	  FrameEmpty=true;
             }
            else
            {
            	FrameEmpty=false;		//a non null value has been found
              break;
            }
         }
               return FrameEmpty;
             }
        
   public   void removeLetter(char letter)
             {
	   if(Character.isLowerCase(letter))
	   {
		   Character.toUpperCase(letter);		
	   }
               for(int i=0;i<7;i++)
        {
          if(letter==FrameArray[i])
             {
               FrameArray[i]='\0';
               break;
             }
         }
             }
             
      public   char[] accessLetter()
             {
               return FrameArray;
             }
             
      public   void displayFrame()
             {
                for(int i=0;i<7;i++)
               {
               		System.out.print(FrameArray[i]);
			 
                }
             }

	

}
