import java.util.Scanner;
class CalculationOfArea
{
	public static void main(String []ar)
	{
		Scanner sc=new Scanner(System.in);
		//variables
		double innerarea;
		double outer;
		double primeter;
		double area;
		
		System.out.print("Enter the inner rudios of the ring:");
		innerarea=sc.nextDouble();
		System.out.print("Enter the Outer rudios of the ring:");
		outer=sc.nextDouble();
		//calculatins
		primeter= (2*3.14*(innerarea+outer));
		area =3.14*(innerarea*innerarea+outer*outer);
		
		//inputs
		System.out.println("Area of ring is:" +area);
		System.out.println("Primeter of ring is:" +primeter);

		
		
	}







}