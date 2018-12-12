package Exercise8_homework;

public class TestCircel {
	public static void main(String[] agre){
		Circle1  circle1= new Circle1();
		System.out.print("The are of the circle of radius " +circle1.radius + " is " + circle1.getArea() + "\n");
		
		Circle1 circle2 = new Circle1(25);
		System.out.print("The are of the circle of radius " +circle2.radius + " is " + circle2.getArea() + "\n");
		
		circle2.radius = 100;
		System.out.print("The are of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}
}	
class Circle1{
		double radius;
		Circle1(){
			radius = 1.0;
		}
		Circle1(double newRadius){
			radius = newRadius;
		}
		double getArea(){
			return radius * radius * Math.PI;
		}
}
