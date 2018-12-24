package HelloWorld;
//Anonymous Array usually can be used with method  calls
public class Lab210 {
public static void main(String[] args) {
	show(new int[]{99,88,77,55});
}

private static void show(int[] arr) {
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	/*99
	88
	77
	55
	*/
}
}
