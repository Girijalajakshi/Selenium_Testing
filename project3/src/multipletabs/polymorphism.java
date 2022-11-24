package multipletabs;

public class polymorphism {
	public void add()
	{
		System.out.println("null parameters");
		
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	public void add(String a1,String b1)
	{
		System.out.println(a1+b1);
		
	}
	public void add(double x,double y)
	{
		System.out.println(x+y);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism p=new polymorphism();
		p.add();
		p.add(23.8,34.8);
		p.add(12,56);

	}


}
