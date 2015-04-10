import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Prob04
	{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("Prob04.txt"));
		String constants = "";
	
	while(input.hasNextLine())
		{
		String sentence = input.nextLine();
		String[] myArray = sentence.split(" ");
	for(int i = 0; i < myArray.length; i++)
			{
		String current = myArray[i];
		current = current.toLowerCase();
        char v = Character.toLowerCase(current.charAt(0));
        char t = Character.toLowerCase(current.charAt(1));
		if(v == 'a' ||v == 'e' || v == 'i' || v == 'o' || v == 'u')
			{
			System.out.print(current + "yay ");
			}
		
		else if(v != 'a' ||v != 'e' || v != 'i' || v != 'o' || v != 'u' && t == 'a' ||t == 'e' || t == 'i' || t == 'o' || t == 'u')
			{
			System.out.print(current.substring(1) + v  + "ay ");
			}
		
		else 
			{
			System.out.print(current.substring(2) + t  + v + "ay ");
			}
			}
		System.out.println();
		}
	
		}

	}

