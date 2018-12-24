package HelloWorld;
//Command Line Arguments
//Values provided by the user from command line while executing the java program are called as Command line arguments.
public class Lab216 {

	public static void main(String[] args) {
		System.out.println("Length : "+args.length);
		System.out.println();
		for(int i=0;i<args.length;i++)
			System.out.println(i+"\t"+args[i]);
		
	}

}
