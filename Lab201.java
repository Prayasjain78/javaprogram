package HelloWorld;

public class Lab201 {
public static void main(String[] args) {
	int arr[]=new int[1];
	System.out.println("LEN : "+arr.length);//1
	System.out.println(arr[0]);//0
	
	int arr1[]=new int[0];
	System.out.println("LEN : "+arr1.length);//0
	
	System.out.println(arr1[0]);//java.lang.ArrayIndexOutOfBoundsException: 0
	
	
			
		}
}

