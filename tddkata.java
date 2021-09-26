package tddkataex;

public class tddkata {
	String iteration1,iteration2;
	int a;
	public int tddkata(String msg) {
		this.iteration1 = msg;
		this.iteration1 = kataappliication(iteration1);
	    a = findSum(this.iteration1);
	    return a;
	}

	public static String kataappliication(String msg) {
		if(msg.isEmpty()){
			return "0";
		}
		msg = msg.replaceAll("[^\\d]", " ");

		// Remove extra spaces from the beginning and the ending of the string
		msg = msg.trim();

		// Replace all the consecutive white
		// spaces with a single space
		msg = msg.replaceAll(" +", " ");

		if (msg.equals(""))
			return "-1";

		return msg;// TODO Auto-generated constructor stub
	}
	// Function to calculate sum of all numbers present in a string containing alphanumeric characters
	static int findSum(String str){
	    int sum = 0;
	    if(str.contains(",")|str.contains("\n")|str.contains("0")|str.contains("1")){
	    String temp = "0";

		// holds sum of all numbers present in the string
		

		// read each character in input string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int parse=0;
			// if current character is a digit
			if (Character.isDigit(ch)) {
				temp += ch;
				}

			// if current character is an alphabet
			else {
				parse=Integer.parseInt(temp);// increment sum by number found earlier(if any)
				if(parse < 0){
				sum += Integer.parseInt(temp);
				}

				// reset temporary string to empty
				temp = "0";
			}
		}

		// numbers
		return sum + Integer.parseInt(temp);
	}
	return sum;	
	}



}
