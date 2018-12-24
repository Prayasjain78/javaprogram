package HelloWorld;
class Hello2{
	char ch;
	void show(){
		System.out.println(ch==0);//true
		System.out.println(ch==' ');//false
		System.out.println(ch=='\u0000');//true
	}
}
public class Lab002 {
public static void main(String[] args) {
	Hello2 h=new Hello2();
	h.show();
	
}
}
