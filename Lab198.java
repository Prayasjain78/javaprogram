package HelloWorld;

public class Lab198 {
public static void main(String[] args) {
	//int arr[]=new int[5L];//cannot convert from long to int
	//int arr1[]=new int[5.0];//cannot convert from double to int
	System.out.println();
	int arr2[]=new int[2147483647];
	System.out.println(arr2.length);//java.lang.OutOfMemoryError
	//int arr3[]=new int[2147483648];
	//System.out.println(arr3);//The literal 2147483648 of type int is out of range 
}
}
