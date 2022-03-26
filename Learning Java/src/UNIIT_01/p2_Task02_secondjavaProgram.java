package UNIIT_01;


//piece of data that never change 
//constants do not change their value
//
//private: inside class only
//public:class + within the package + outside the package
//protected :class +same package
//default : no keyword ,package-private{ not outside package}

public class p2_Task02_secondjavaProgram {
	public static final double pi=3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=10;
		System.out.println(a);
		System.out.println(pi);
		add(1,2);
		diff(2,1);
		
		abc obj= new abc();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.diff(2, 1));
		
		
		
		
		
	
		
		

	}
	static int add(int a,int b)
	{
		
		//sysout(ctrl +spacebar)
		System.out.println(a);
		System.out.println(pi);
		return (a+b);
	}
	static int diff(int a,int b)
	{
		
		//sysout(ctrl +spacebar)
		System.out.println(a);
		System.out.println(pi);
		return (a-b);
	}
	static class abc
	{
		int a=10;
		int add(int a,int b)
		{
			
			System.out.println(pi);
			return (a+b);
		}
		int diff(int a,int b)
		{
			return (a-b);
		}
		
		
	}
}
