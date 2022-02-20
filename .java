public class ICM {
	public static int ekok(int sayi1, int sayi2) {
		int a=0;
		for (int i=sayi1*sayi2; i>0; i--)
		{
			if (i%sayi1==0 && i%sayi2==0)
			{
				a=i;
			}
		}
		return a;
	}
}
