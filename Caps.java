package codeChallenges;

public class Caps {
	
	String result = "";
	
	public String runProcess(String input) {
		
		String[] parser = input.split("");
		result = parser[0].toUpperCase();
		int i = 0;
		while(i+1<parser.length) {
			if(parser[i+1].contains(" ")) {
				while(parser[i+1].contains(" ")) {
					i++;	
				}
				result = result+" "+parser[i+1].toUpperCase();
			}
			else {
				result+=parser[i+1];
			}
			i++;
		}
		
		return result;
	}

}
