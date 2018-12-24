package HelloWorld;

public class Lab222a{
	public static void main(String arg[]){
	int arr[][]=null;
arr=new int[3][];
int temp[]={99,88,77,66,55};
System.out.println("L :"+arr.length);
arr[0]=new int[4];
arr[1]=new int[]{10,30,20};
arr[2]=temp;
for(int ar[]:arr){
for(int a:ar)
System.out.print("\t"+ar);
System.out.println();
}
	}	
		
		
	
}

/*L :3
        0       0       0       0
        10      30      20
        99      88      77      66      55
		
		
		*/