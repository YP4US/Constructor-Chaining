//Access DataMember of superClass using "super" keyword
//To elucidate the difference between this and super keyword(note that here this is keyword not statement(super())) 
//Name: Yogesh Pawar  	Date:16/08/2017
class Demo1
{
	int k=10;
	
}

class Demo2 extends Demo1
{
	int k=11;
	void test()
	{
		System.out.println("Running test() of Demo2 class...");
		System.out.println("K value is:"+super.k);						//here super is keyword which will copy the value of Super class data member in subclass
		System.out.println("K value is:"+this.k);						//this keyword used here to indicate current instance of class instance
	}
	
}

class MainClass2
{
	public static void main(String arg[])
	{
		Demo2 d2=new Demo2();
		d2.test();
	}
}