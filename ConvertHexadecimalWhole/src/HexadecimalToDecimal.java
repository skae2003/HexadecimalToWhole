import java.util.*;
import java.lang.Math;

public class HexadecimalToDecimal {
	
	public static void main(String[] args) {
		
		boolean stayInLoop = true;
		
		while(stayInLoop) {
		
			System.out.println("Please enter a hexadecimal number: ");
		
			Scanner input = new Scanner(System.in);
		
			int tries = 0;
		
			String hexadecimal;
		
			boolean valid = false;
		
			while(tries != 3 && !valid) {
			
				hexadecimal = input.nextLine();
		
				for (int i = hexadecimal.length()-1; i >= 0; --i) {
			
					char single =  hexadecimal.charAt(i);
			
					if(Character.isDigit(single)) {
					
						if (i == 0) {
						
							valid = true;
						
						}
				
						continue;
				
					}
					else if (Character.isAlphabetic(single)) {
				
						single = Character.toUpperCase(single);
				
						if('A' <= single && single <= 'F') {
						
							if (i == 0) {
							
								valid = true;
							
							}
					
							continue;
					
						}
						else {
					
							System.out.println("The string entered was not a valid hexadecimal number");
						
							++tries;
						
							if (tries != 3) {
							
								System.out.println("Try again");
							
							}
						
							break;
					
						}
				
					}
					else {
				
						System.out.println("The string entered was not a valid hexadecimal number");
					
						++tries;
					
						if (tries != 3) {
						
							System.out.println("Try again");
						
						}
				
						break;
				
					}
			
				}
			
				if(valid) {
				
					int decimalNumber = 0;
				
					for(int i = hexadecimal.length() - 1; i >= 0; --i) {
					
						int num = 0;
					
						if(Character.isAlphabetic(hexadecimal.charAt(i))) {
						
							num = Character.toUpperCase(hexadecimal.charAt(i)) - 'A' + 10;
						
						}
						else {
						
							num = hexadecimal.charAt(i) - '0';
						
						}
					
						decimalNumber = decimalNumber + num * (int)Math.pow(16, (hexadecimal.length()-1-i));
					
						if(i == 0) {
						
							System.out.println(hexadecimal + " in decimal is " + decimalNumber);
						
						}
					
					}
				
				}
			
			
		
			}
		
			if(tries == 3) {
			
				System.exit(0);
			
			}
			
			System.out.println("Would you like to like to continue?");
			
			String choice = input.nextLine();
			
			choice = choice.toUpperCase();
			
			if(choice.equals("YES") || choice.equals("Y")) {
				
				stayInLoop = true;
				
			}
			else {
				
				System.out.println("Goodbye");
				
				stayInLoop = false;
				
			}
		
		}
		
	}

}
