import java.util.*;
public class DecimalToBinary
	{
		static Scanner userInput = new Scanner(System.in);
		
		public static void covertToBinary()
		{
			ArrayList <Integer> binaryNumber = new ArrayList <Integer>();
			boolean running = true;
			System.out.println("What would you like to covert your decimal number into?");
			System.out.println("(1) Binary");
			System.out.println("(2) Hexadecimal");
			int userChoice = userInput.nextInt();
			if(userChoice == 1)
				{
					System.out.println("Please enter a number less than 128");
					int userNumber = userInput.nextInt();
					do
						{
							if(userNumber != 0)
								{
									binaryNumber.add(userNumber % 2);
									userNumber = userNumber/2;
								}
							else
								{
									running = false;
								}
						}while(running);
					Collections.reverse(binaryNumber);
					for(int i : binaryNumber)
						{
							System.out.print(i);
						}
				}
			else if(userChoice == 2)
				{
							
				}
			}
	}