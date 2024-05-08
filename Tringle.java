import java.util.*;
public class Tringle implements Shape {
	Double side1,side2,side3,semi;
    Tringle(){
    	System.out.println("enter the three sides");
        Scanner sc=new Scanner(System.in);
        side1=sc.nextDouble();
        side2=sc.nextDouble();
        side3=sc.nextDouble();

    }
    public void getPerimeter(){
    	semi=(side1+side2+side3)/2;
        System.out.println(side1+side2+side3);
    }
	
	public void gerArea() {
		System.out.println(Math.sqrt(semi*(semi-side1)*(semi-side2)*(semi-side3)));
	}
	
}
