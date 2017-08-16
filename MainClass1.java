//constructor chaining using "super() statement"
//Name: Yogesh Pawar	Date:16/08/2017
class Demo1
{
	Demo1()
	{
		System.out.println("Running Demo1 Constructor...");
	}
}

class Demo2 extends Demo1
{
	Demo2()
	{
		super();
		System.out.println("Runnning Demo2 Constructor...");
	}
}

class Demo3 extends Demo2
{
	Demo3()
	{
		super();
		System.out.println("Running Demo3 Constructor...");
	}
}

class MainClass1
{
	public static void main(String arg[])
	{
		Demo3 d3=new Demo3();
	}
}