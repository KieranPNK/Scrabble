public class Player {
	
	
	private String name;
	
	private int score;
	
	void Reset(){
		name.equals("");
		score = 0;
	}
	
	void IncreaseScore(int increase){
		score += increase;
	}
	
	public int AccessScore(){
		return score;
	}
	
	public char[] AccessFrame(char[] frame){		//takes in a char array same type as Fame.FrameArray
		
		return frame;
	}
}