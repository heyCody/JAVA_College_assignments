import java.util.*;
public class Sortable_Main {

	public static void main(String[] args) {
		System.out.println("enter the no of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements");
		for (int i=0; i<n; ++i)
        arr[i]=sc.nextInt();
		}
		BubbleSort b=new BubbleSort();
		SelectionSort s=new SelectionSort();
		b.sort(arr);
		s.sort(arr);
		
	}

}
