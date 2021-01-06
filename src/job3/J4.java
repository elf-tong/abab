package job3;
import java.util.Scanner;
public class J4 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        double edge1,edge2,edge3,perimeterTriangle = 0;
		
		// Prompt the user to enter three edges
		System.out.print("Enter the first edge of the triangle: ");
		Scanner input = new Scanner(System.in);
		edge1 = input.nextDouble();
		
		System.out.print("Enter the second edge of the triangle: ");
		edge2 = input.nextDouble();
		
		System.out.print("Enter the third edge of the triangle: ");
		edge3 = input.nextDouble();
		
		// Check whether it's a triangle or it's not
		if(edge1+edge2>edge3 && edge1+edge3>edge2 && edge2+edge3>edge1)
			perimeterTriangle = edge1 + edge2 + edge3;
		else
			System.out.println("The input is invalid");
		
		if(perimeterTriangle != 0)
			System.out.println("The perimeter of the triangle is " + perimeterTriangle);
		
		input.close();
	}
}



