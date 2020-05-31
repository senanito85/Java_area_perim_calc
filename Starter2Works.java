import java.util.Scanner;

public class Starter2Works {

	public static void main(String[] args) {

		
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght: ");
		
		int l = sc.nextInt();
		

		
		
		System.out.println("Enter the width: ");
		int w = sc.nextInt();
		
		
		sc.close();
 
	   int area = areaCalc(l, w);
       System.out.println("Area of th shape is: " + area + " square meters");
       
	   int perim = perimCalc(l, w);
       System.out.println("Perimeter of th shape is: " + perim + " meters");
       
	}

	
	
	 private static int areaCalc(int length, int width) {
		int area = length * width;
		return area;
     }
	 
	 private static int perimCalc(int length, int width) {
		int area = (length + width) * 2 ;
		return area;
     }
}
