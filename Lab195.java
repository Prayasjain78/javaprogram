package HelloWorld;
//you can declare and construct an array in one statement also
public class Lab195 {
public static void main(String[] args) {
	int arr[]=new int[3];
	System.out.println("Length :"+arr.length);
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	System.out.println("----------");
	arr[0]=10;arr[1]=20;arr[2]=30;
	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
}
}
/*
Len :3
0
0
0
----------
10
20
30
*/