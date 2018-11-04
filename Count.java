package weekend;

public class Count {
	public static void main(String[] args) {
		int count=0;
		int i=1;
		while(i<10)
		{
			System.out.print(i);
			count=count+1;
			if(count%3==0)
			{
			System.out.println();	
			}
			i++;
		}
	}

}
