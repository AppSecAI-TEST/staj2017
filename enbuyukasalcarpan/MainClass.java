package enbuyukasalcarpan;

import java.util.Scanner;

public class MainClass {
	
	static long sayi;
	public static void main(String[] args)
	
	{			
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Bir Say� Giriniz: ");
		sayi = input.nextLong();
		long j=2;
		long sayac=0;
		for (long i = 2; i != sayi; ++i)
		{
			if (sayi % i == 0)
			{
				sayi/=i;
				j=i;
				sayac++;
			}
			
		}
		System.out.println("Asal carpanlar: "+j);
		System.out.println("Deneme say�s�: "+sayac);
	}

}
