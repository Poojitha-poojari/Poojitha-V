import java.util.Scanner;

class Calculator {
	
	double calculate(double a, double b, String operation) {
		switch(operation.toLowerCase()) {
		case "add":
			return a + b;
			
		case "subtract":
			return a - b;
			
		case "multiply":
			return a * b;
			
		case "divide":
			if(b != 0) 
      {
				return a/b;
			  }
      else 
      {
				System.out.println("Division by zero is not allowed");
				return 0;
			}
			
			default:
				System.out.println("Invalid");
				return 0;
		}	
	}
}
public class Problem1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter value of a : ");
		double a = sc.nextDouble();
		System.out.print("Enter value of b : ");
		double b = sc.nextDouble();
		
    sc.nextLine();
		
    System.out.println("Enter the option which you want to perform(add/subtract/multiply/divide): ");
		String operation = sc.nextLine();
		
		Calculator cal = new Calculator();
		double result = cal.calculate(a, b, operation);
		
		System.out.println("RESULT: " + result);
    
		}
}



