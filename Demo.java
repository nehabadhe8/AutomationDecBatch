package exception;

public class Demo {
	public static void main(String[] args) {
		
		String str[]= {"java","abc","xyz"};
		try
		{
			System.out.println(str[3]);
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Here Exception occured");
		}
		System.out.println("----End of program---");

}
}