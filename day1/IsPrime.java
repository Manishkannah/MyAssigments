package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n=10;
		boolean f= false;
		for (int i=2;i<=n/2;++i);{
			if (n %2 == 0) {
				f = true;
			}
		}
		if(f)
			System.out.println(n +""+ "is a prime number.");
		else
			System.out.println(n +""+ "is not a prime number");
		
	}

}
