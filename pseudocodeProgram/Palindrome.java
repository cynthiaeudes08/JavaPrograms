package pseudocodeProgram;

public class Palindrome {
	public static void main(String[] args) {
		   //declare a variable with inputs
    	   String text = "mom";
    	   
    	   //declare another variable with empty input
    	   String rev = "";
    	   
    	   //covert the string to char array
    	   char[] character = text.toCharArray();
    	   
    	   //iterate the values
    	   for (int i =character.length-1; i >=0 ; i--) {
    	   //sum the values
			rev = rev+character[i];
			
			//print the values
			System.out.println(rev);
		}
    	   //compare a with text to see whether the condition is true or false
    	   if (rev.equals(text)) {
    		   
			System.out.println("The Given String is palindrome");
		} else {
              System.out.println("The Given String is not a palindrome");
		}          	   
	}	               

}
