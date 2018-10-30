import java.util.Scanner;

public class Mealreciept 
{

	public static void main(String[] args) 
	{
	Scanner user  = new Scanner(System.in);
	System.out.println("Tax and Tip Calculator");
	System.out.println("Please enter the name of your appetizer:   ");
	String appStr = user.nextLine();
	System.out.println("Please enter the price for the appetizer:  ");
	String apprStr = user.nextLine();
	Double app = Double.parseDouble(apprStr);
	System.out.println("Please enter the price of your entree:   ");
	String entreeStr = user.nextLine();
	Double entree = Double.parseDouble(entreeStr);
	System.out.println("Please enter the name of your dessert:  ");
	String dessertStr = user.nextLine();
	System.out.print("Please enter the price of your desert:  ");

	}

}
