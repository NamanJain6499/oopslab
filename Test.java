class Animal
{
	public void eat()
	{
		System.out.println("eat");	
	}
}
class  Dog extends Animal
{
	public void bark()
	{
		System.out.println("bark");
	}
}
class Babydog extends Dog
{
	public void weep()
	{
		System.out.println("weep");
	}
}
public class Test 
{
	public static void main(String args[])
	{
		Babydog b= new dog();

	}
	

}