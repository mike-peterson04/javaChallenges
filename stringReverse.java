package codeChallenges;

public class StringReverse {
	String reversed = "";
	
	public String StringReverse (String reverse) {
		String[] reverseIndex = reverse.split("");
		for(int i=reverseIndex.length;i>0;i--) {
			reversed = reversed + reverseIndex[i-1];
		}
		return reversed;
	}

}
