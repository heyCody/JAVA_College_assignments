package String;

public class Character_check {

	public static void main(String[] args) {
		
		String s="Umbrella";
		
        
        
        for (int i = 0; i < s.length(); i++) {
           
            if (s.charAt(i) == 'e') {
            	System.out.println("'e' is present in the word 'Umbrella' at "+(i+1)+" position");
            }
        }
        
	}

}
