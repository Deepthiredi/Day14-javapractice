class Pattern
{
	public static void test(int n) 
	{
		for (int i=1;i<=n;i++ )
		{
			for (int j=1;j<=i ;j++ ) 
			{
				System.out.print("*"+ " ");
			}
			System.out.println( );
		}
	}
	public static void main(String[] args) {
		test(3);
	}
}