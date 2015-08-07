import java.util.*;
public class Magic8 
{
	
	public static void main ( String[] args )
		{
			Scanner keyboard = new Scanner(System.in);
			Random r = new Random();
			String choice, question;
			choice="y";
			
			while (choice.equalsIgnoreCase("y"))
			{
				System.out.println("Please enter your question");
				question=keyboard.next();
				
					int x = 1 + r.nextInt(20);
					String response = "";
		
					if ( x == 1 )
						response = "It is certain";
					else if ( x == 2 )
						response = "It is decidedly so";
					else if ( x == 3 )
						response = "Without a doubt";
					else if ( x == 4 )
						response = "Yes - definitely";
					else if ( x == 5 )
						response = "You may rely on it";
					else if ( x == 6 )
						response = "As I see it, yes";
					else if ( x == 7 )
						response = "Most likely";
					else if ( x == 8 )
						response = "Outlook good";
					else if ( x == 9 )
						response = "Signs point to yes";
					else if ( x == 10 )
						response = "Yes";
					else if ( x == 11 )
						response = "Reply hazy, try again";
					else if ( x == 12 )
						response = "Ask again later";
					else if ( x == 13 )
						response = "Better not tell you now";
					else if ( x == 14 )
						response = "Cannot predict now";
					else if ( x == 15 )
						response = "Concentrate and ask again";
					else if( x== 16)
						response = "Don't count on it";
					else if( x== 17)
						response = "My reply is no";
					else if( x== 18)
						response = "My sources say no";
					else if( x== 19)
						response = "Outlook not so good";
					else if( x== 20)
						response = "Very doubtful";
					else
						response = "8-BALL ERROR!";
	
				System.out.println( "Magic 8-Ball says: " + response + ".\nWould you like to ask another question? (Y/N)" );
				choice=keyboard.next();
				
			}
		}
	}
