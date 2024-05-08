import java.util.Scanner;
public class Rectangle implements Shape {
	Double length,width;
    Rectangle(){
    	System.out.println("enter len and width");
        Scanner sc=new Scanner(System.in);
        length=sc.nextDouble();
        width=sc.nextDouble();
    }
    
    public void getPerimeter(){
        System.out.println(2*(length+width));
    }
	
	public void gerArea() {
		System.out.println(length*width);
	}
	
	
}
