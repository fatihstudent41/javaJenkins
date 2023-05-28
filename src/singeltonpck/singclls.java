package singeltonpck;

public class singclls {
	
	private static singclls instanceFA;
	
	public static singclls getinstance()
	{
		if(instanceFA == null)
		{
			instanceFA = new singclls();
		}
		return instanceFA;
		
	}
	public String conStr = "my connection String";
	
	public String test()
	{
		String text = "data from singelton cls";
		System.out.println(text);
		return text;
		
	}
	

}
