package HelloWorld;

public class Lab222 {
public static void main(String[] args) {
	int arr[][]=null;
	arr=new int[3][];
	int temp[]={99,77,96,54,44};
	System.out.println("Length :"+arr.length);
	arr[0]=new int[4];
    arr[1]=new int[]{10,20,30};
    arr[2]=temp;
    for(int ar[]:arr){
    	for(int a:ar)
    		System.out.print("\t"+a);
    
    System.out.println();
}
}
}