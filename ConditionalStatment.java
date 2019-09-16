class ConditionalStatment
{
	public static void main(String args[])
	{
	String username="";
	String password="";

		java.util.Scanner scn= new java.util.Scanner(System.in);
		System.out.println("please enter the username");
		username= scn.nextLine();
		System.out.println("please enter the password");
		password= scn.nextLine();
		if(username.equals("admin") && password.equals("123"))
		{
			System.out.println("Login succeed");
		}
		else
		{
			System.out.println("Login failed");
		}
	}
}