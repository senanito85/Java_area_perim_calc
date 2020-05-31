import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {

		Starter demo = new Starter();
		demo.menu();
       
	}
	
	private void menu() {
	    Scanner sc = new Scanner(System.in);
	    
	    int l;
	    int w;
	    //Get the length
        do {
            System.out.print("Please enter a positive number for Length: ");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            l = sc.nextInt();
        } while (l < 0);
	    
        
        //get the width
        do {
            System.out.print("Please enter a positive number for Width: ");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            w = sc.nextInt();
        } while (w < 0);
	    
        		
		int area = areaCalc(l, w);
	       System.out.println("Area of th shape is: " + area + " square meters");
	       
		int perim = perimCalc(l, w);
	       System.out.println("Perimeter of th shape is: " + perim + " meters");
	       
		sc.close();
	}

	
	
	 private static int areaCalc(int l, int w) {
		int area = l * w;
		return area;
     }
	 
	 private static int perimCalc(int l, int w) {
		int area = (l + w) * 2 ;
		return area;
     }
	 
}
