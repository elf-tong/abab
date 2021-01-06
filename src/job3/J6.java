package job3;
import java.util.Scanner;
public class J6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        double pointX,pointY,distance;
		
		System.out.print("Enter a point with two coordinates:");
		Scanner input = new Scanner(System.in);
		pointX = input.nextDouble();
		pointY = input.nextDouble(); 
		
		// Calculate the distance from (0,0) to (pointX,pointY)
		distance = Math.pow(Math.pow(pointX, 2) + Math.pow(pointY, 2), 0.5);
		
		// Check if point is in the circle
		if(distance <= 10)
			System.out.println("Point " + "(" + pointX + "," + pointY + ")"
								+ " is in the circle");
		else
			System.out.println("Point " + "(" + pointX + "," + pointY + ")"
								+ " is not in the circle");
		
		input.close();
	}

}
