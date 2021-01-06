package job6;
public class J2 {
    public static void main(String[] args) {
        J2 circle1 = new J2();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        J2 circle2 = new J2(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        J2 circle3 = new J2(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

    }
    double radius;
    J2(){
        radius = 1;
    }
    J2(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
}


