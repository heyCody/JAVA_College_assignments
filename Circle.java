import java.util.Scanner;
public class Circle implements Shape {
	Double radius;
    Circle(){
    	System.out.println("enter radius");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextDouble();
        
    }
    
    public void getPerimeter(){
        System.out.println(2*pi*radius);
    }
	
	public void gerArea() {
		System.out.println(pi*radius*radius);
	}
	
	
}
