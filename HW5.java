import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Input values for a, b and c.
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Compute the discriminant .
		double discriminant = Math.pow(b, 2) - 4 * a * c;

		// Compute the roots of the quadriatic equation.
		System.out.print("The equation has ");
                                //Compute the real roots.
		if (discriminant > 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);  
			System.out.println("two roots " + root1 + " and " + root2);
		}
                                //Compute the equal roots. 
		else if (discriminant == 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("one root " + root1);
		}
                                //Compute the complex roots.
		else
                                {
                                                double real = (-b)/(2 * a);
                                                double imaginary  = (Math.pow(-discriminant, 0.5))/(2 * a); 
			System.out.println("two complex roots " + real + " + "+imaginary + "j"+ " and " + real +" - "+imaginary + "j");
                                 }
	}
}