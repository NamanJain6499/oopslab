class Animal
{
	void eat()
	{
		System.out.println("eat");	
	};
}
class  Dog extends Animal
{
	void bark();
	{
		System.out.println("bark");;
	}
}
class Babydog extends Dog
{
	void weep();
	{
		Babydog b= new Dog();
	}
}