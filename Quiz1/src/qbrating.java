import java.util.Scanner;
	
public class qbrating {
	
	public static double rating(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//How many attempts have they tried to pass?
		System.out.print("Number of passing attempts? ");
		int ATT = input.nextInt();
		
		//How many of those passes were caught?
		System.out.print("Number of completions? ");
		int COMP = input.nextInt();
		
		//Anmount of yards gained passing
		System.out.println("Passing Yards? ");
		int YDS = input.nextInt();
		
		//Number of touchdown passes
		System.out.println("Touchdown Passes?");
		int TD = input.nextInt();
		
		//Number of passes intercepted
		System.out.println("Interceptions? ");
		int INT = input.nextInt();
		
		double a = ((COMP/ATT)-.3)*5;
		double b = (((YDS/ATT)-3)*.25);
		double c = (TD/ATT)*20;
		double d = 2.375-((INT/ATT)*25);
		
			if (a > 2.375){
				a = 2.375;
			}
			
			if (b > 2.375){
				b = 2.375;
			}
			
			if (c > 2.375){
				c = 2.375;
			}
			if (d > 2.375){
				d = 2.375;
			}
			
			if (a < 0){
				a = 0;
			}
			if (b < 0){
				b = 0;
			}
			if (c < 0){
				c = 0;
			}
			if (d < 0){
				d = 0;
			}

		double rating = ((a+b+c+d)/6)*100;
		
		System.out.println("QB rating is: ");
		//Returns the final Quarterback rating
		return rating;
	}
	
	public static void main(String[] args){
		System.out.println(rating(args));
	}
}
