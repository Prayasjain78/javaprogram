package HelloWorld;
public  class Lab142{
 public static void main(String ar[]){

 int a=1000;
 int b=2000;
 int c=300;
 int d=50;
 int e=600;
 int max=0;
 if (a>b&&a>c)
	 max=a;
 else if(b>c&&c>d)
	 max=b;
  else if(c>d&&d>e)
	 max=c;
  else if(d>e&&e>a)
	 max=d;
 else
	 max=e;
 
 System.out.println("Maximum value is "+max);
 
 
 }
 }