public class Jumbled {
    public static void main(String[] args) { 

	    if (checkJumbled("you", "yuo")) {
	    	System.out.println("\"you\", \"yuo\" -> true");
	    } else {
	    	System.out.println("\"you\", \"yuo\" -> false");
	    }  
	    
	    if(checkJumbled("probably", "porbalby")){
	    	System.out.println("\"probably\", \"porbalby\" -> true");
	    } else {
	    	System.out.println("\"probably\", \"porbalby\" -> false");
	    }
	    
	    if(checkJumbled("despite", "desptie")) {
	    	System.out.println("\"despite\", \"desptie\" -> true");
	    } else {  
	    	System.out.println("\"despite\", \"desptie\" -> false");
	    }
	    
	    if(checkJumbled("moon", "nmoo")) {
	    	System.out.println("\"moon\", \"nmoo\" -> true");
	    } else {
	    	System.out.println("\"moon\", \"nmoo\" -> false");
	    }
	    
	    if(checkJumbled("misspellings", "mpeissngslli")) {
	    	System.out.println("\"misspellings\", \"mpeissngslli\" -> true");
	    } else {
	    	System.out.println("\"mpeissngslli\", \"yuo\" -> false");
	    } 

    }

    private static boolean checkJumbled(String first, String second){
 		if(second.length() == first.length()) {
 			if(first.charAt(0) == second.charAt(0)){
 				int wordLen = second.length();
 				int charDiffCounter = 0;
 				for(int i = 0; i < wordLen; i++){
 					if(second.charAt(i) != first.charAt(i)){
 						charDiffCounter = charDiffCounter + 1;
 					}
 				}

 				if(wordLen > 3){
 					Double calc = wordLen * (2.0/3.0);
 					if(charDiffCounter < calc){
 						return true;
 					} else {
 						return false;
 					}
 				} else {
 					return (charDiffCounter > 0);
 				}
 			} else {
 				return false;
 			}
 		}

 		return false;
    }

}