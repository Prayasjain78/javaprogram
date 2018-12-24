package HelloWorld;

public class Lab197 {
public static void main(String[] args) {
	byte b=5;
	int arr1[]=new int[b];
	short s=4;
	int arr2[]=new int[s];
	System.out.println(arr1);//[I@1db9742
	System.out.println(arr2);//[I@106d69c
	System.out.println(arr1.length);//5
	System.out.println(arr2.length);//4
	char ch='A';
	int arr3[]=new int[ch];
	System.out.println(arr3.length);//65
	int arr4[]=new int[5];
	System.out.println(arr4.length);//5
	int arr5[]=new int[10+20/5];
	System.out.println(arr5.length);//14
	double d=122.325;
	int arr6[]=new int[(int)d];
	System.out.println(arr6.length);//122
	
	
	System.out.println();
	

}
}
