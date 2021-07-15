package business;

public class BasicCalculations {
	
	public int square(int nbr) {
		
		return nbr = (int) Math.pow(nbr, 2);
		
	}
	
	public int countA(String string) {
		

        int totalCharacters = 0;
        char temp;
        for (int i = 0; i < string.length(); i++) {	// Looping through each individual character of the string

            temp = string.charAt(i);				// Setting temp(char) equal to current iteration of individual character.
            if (temp == 'a' || temp == 'A')
                totalCharacters++;
        }

        System.out.println("A appears " + totalCharacters + " times in exampleString");
		return totalCharacters;
    
		
	}

}
