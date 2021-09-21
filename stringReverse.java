package codeChallenges;

public class stringReverse {
	String reversed = "";
	
	public String stringReverse (String reverse) {
		String[] reverseIndex = reverse.split("");
		for(int i=reverseIndex.length;i<0;i--) {
			reversed.concat(reverseIndex[i-1]);
		}
		return reversed;
	}

}
