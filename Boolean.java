class Boolean
{
	public static void main(String[] args)
	{
		boolean a = true;
		boolean b = true;
	System.out.println((!(a && b) && (a || b)) || ((a && b) || !(a || b)));
	}
}