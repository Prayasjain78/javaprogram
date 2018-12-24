package HelloWorld;

public class Lab211 {
public static void main(String[] args) {
	//show(new int[4]{99,88,77,12});//	Cannot define dimension expressions when an array initializer is provided
	show(new int[]{99,88,77,12});
}

private static void show(int[] is) {
for(int i=0;i<is.length;i++)
	System.out.println(is[i]);


}
}
