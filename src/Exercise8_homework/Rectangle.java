package Exercise8_homework;

public class Rectangle {
	
	double weigth = 1;
	double height = 1;
	
	Rectangle(){	
	}
	
	Rectangle(double weigth,double height){
		this.height = height;
		this.weigth = weigth;		
	}
	double getArea(){
		return this.weigth * this.height;
	}
	double getPerimeter(){
		return this.weigth * 2 + this.height * 2;
	}
	public static void main(String[] agre){
		Rectangle rect = new Rectangle(4,40);
		Rectangle rect1 = new Rectangle(3.5,35.9);
		System.out.print("The area is : " + rect.getArea() + " and perimeter is :" + rect.getPerimeter() + "\n");
		System.out.print("The area is : " + rect1.getArea() + " and perimeter is :" + rect1.getPerimeter());
	}
}

