package mypackage;

public class Addition
{    
    public int add(int a,int b)
    {
    	int c ;
		return  c=a+b;
    	
    }
	
	
	
	public static void main(String args[] )
     {
    	 Addition ad = new Addition();
    	int x= ad.add(4, 5) ;
    	 System.out.println("Sum of 2 numbers is :" +x ) ;
     }
}
