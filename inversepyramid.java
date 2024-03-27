
public class inversepyramid {
// Test working code 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print inverse pyramid
		int p=1;
		for(int i=0;i<4;i++)
		{
			//System.out.println("Outer loop started");
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(p);
				System.out.print("\t");
				p++;
			}
			//System.out.println("Outer loop finished");
			System.out.println("");
			
		}
	}

}
