
class Solution26 {

	public static void main(String[] args) { 
// a=24, b=36
// a=24, b=12
// a=12, b=12
		System.out.println( gcf (74, 24));
	}	
public static int gcf(int a, int b) {
	while(a!=b)
	{
		if(b>a)
		{
			b = b - a;
		}
		else
		{
			a = a - b;	      
		}
	}
	return a;
}
}



