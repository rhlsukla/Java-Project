public class SwitchCase
{
	public static void main(String args[])
	{
		String vov="";
		java.util.Scanner scn= new java.util.Scanner(System.in);
		System.out.println("please enter the string");
		vov= scn.nextLine();
		char vovels[]=vov.toCharArray();
			for(int i=0;i<vovels.length;i++)
				{
					switch(vovels[i])
					{	
						case 'a':
						case 'e':
						case 'i':
						case 'o':
						case 'u':
						{
							System.out.println("vowel at index["+i+"]");
							break;
						}
						default:
						{
						System.out.println("consonants at index["+i+"]");
						break;
						}
					}
				}
		}
}
							