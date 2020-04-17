import java.lang.*;

public class Typo {
    public static void main(String[] args) {
 	
	 	if(checkTypo("pale", "ple")){
	 		System.out.println("true");
	 	} else {
	 		System.out.println("false");
	 	}
	 	
	 	if(checkTypo("pales", "pale")){
	 		System.out.println("true");
	 	} else {
	 		System.out.println("false");
	 	}
	 	
	 	if(checkTypo("pale", "bale")){
	 		System.out.println("true");
	 	} else {
	 		System.out.println("false");
	 	}
	 	
	 	if(checkTypo("pale", "bake")){
	 		System.out.println("true");
	 	} else {
	 		System.out.println("false");
		}
	}

	private static boolean checkTypo(String first, String second){
		int lenFirst = first.length();
		int lenSecond = second.length();

		if(Math.abs(lenFirst-lenSecond)>1){
			return false;
		}

		int counter = 0, indexA = 0, indexB = 0;

		while(indexA < lenFirst && indexB < lenSecond) {
			if(first.charAt(indexA) != second.charAt(indexB)){
				if(counter == 1){
					return false;
				}
				if(lenFirst > lenSecond){
					indexA++;
				} else if (lenFirst < lenSecond){
					indexB++;
				} else {
					indexA++; indexB++;
				}
				counter = counter + 1;
			} else {
				indexA++; indexB++;
			}
		}
		if(indexA < lenFirst || indexB < lenSecond) {
			counter = counter + 1;
		}

		return (counter == 1);
	}
}
