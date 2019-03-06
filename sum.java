class sum
{
    public static void main(String [] args)
      {
        int j=0;
		double s=0,f=1,i=0;
		for(i=1;i<=Integer.parseInt(args[0]);i++)
		{
		    f=1;
		    for(j=Integer.parseInt(args[0]);j>0;j--)
		      { 
		        f*=i;
		      }
		    s=s+(i/f);
		}
		System.out.println("sum of series is"+s);
      }
	 
}