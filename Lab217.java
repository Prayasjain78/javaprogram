package HelloWorld;

public class Lab217 {
public static void main(String[] args) {
	if(args.length>=2){
		String str1=args[0];
		String str2=args[1];
		System.out.println(str1+str2);
		
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		System.out.println(a+b);
		
	}
	else{
		System.out.println("Enter 2 int value as CLA");
	}
}
}
