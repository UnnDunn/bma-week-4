class LoopTester3 {
	public static void main (String[] args) {
		if (args.length == 0) {
			System.out.println("Please enter some parameters");
			return;
		}
		
		String action = args[0];
		String[] values = new String[args.length - 1];
		if (args.length >= 2)
			for(int i = 1; i < args.length; i++){
				values[i - 1] = args[i];
			}
		
		System.out.println("Action is currently '" + action + "'");
		
		switch (action)
		{
			case "for-each":
				testForEach(values);
				break;
			case "for":
				testFor(values);
				break;
			case "while":
				testWhile(values);
				break;
			default:
				System.out.println("No match found for '" + action + "'");
		}		
	}
	
	public static void testForEach(String[] args)
	{
		System.out.println("Testing 'for-each'");
		for(String value : args)
		{
			System.out.println(value);
		}
	}
	
	public static void testFor(String[] args)
	{
		System.out.println("Testing 'for'");
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
	
	public static void testWhile(String[] args)
	{
		System.out.println("Testing 'while'");
		int i = 0;
		while(i < args.length)
		{
			System.out.println(args[i]);
			i++;
		}
	}
}

