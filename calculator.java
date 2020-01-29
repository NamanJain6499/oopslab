class Calculator {
    public static void main(String[] args)
	{
	int x = Integer.parseInt(args[0]);
        	int y = Integer.parseInt(args[1]);
	int z= Integer.parseInt(args[2]);
	switch(z){
		case 1:
			System.out.println(x+y);
			break;
		case 2:
			System.out.println(x-y);
			break;
		case 3:
			System.out.println(x*y);
			break;
		case 4:
			System.out.println(x/y);
			break;
		default:
			System.out.println("Invalid");
		}
	}
}