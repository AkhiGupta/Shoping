package com.tns.Client;
import com.tns.Application.*;
import com.tns.FrameWork.*;
public class client {
	public static void main(String[] args)  {
		
		ShopFactory a = new GSShopFactory();
		PrimeAcc b = new GSPrimeAcc( 123,"Disha",250,true);
		NormalAcc c = new GSNormalAcc ( 124, "Akhilesh", 300, 10);
		
		System.out.println("Prime Account ");
		b.bookProduct(b.getAccCharges());
		
		System.out.println("Normal Account ");
		b.bookProduct(b.getAccCharges());
		
		System.out.println(a.getNewPrimeAcc(1, "Kshitij", 1236, true));
		System.out.println(a.getNewNormalAcc(800, "Freya", 1000, 50));
		
		System.out.println(b);
		System.out.println(c);

	}

}


