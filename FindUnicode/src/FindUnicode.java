import java.util.Scanner;

public class FindUnicode 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char letter;
        
        System.out.print("Enter a character: ");
        String userLetter = input.nextLine();
        letter = userLetter.charAt(0);
        int userDecimal = (int)letter;
        System.out.println("The Unicode for the character " + letter + " is " + userDecimal);
        
    }
    
}
