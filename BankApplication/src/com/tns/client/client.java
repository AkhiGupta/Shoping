package com.tns.client;

import com.tns.Application.MMBankFactory;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;

import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class client {
	public static void main(String [] args)
	{
		MMBankFactory s = new MMBankFactory();
		SavingAcc p = new MMSavingAcc( 1101,"AKhilesh_Gupta",250,true);
		CurrentAcc n = new MMCurrentAcc ( 1201, "Disha", 5400, 1000);
		
		System.out.println("Saving Account ");
		p.withdraw(p.getAccBal());
		
		System.out.println("Current Account ");
		n.withdraw(n.getAccBal());
		
		
		System.out.println("------------------------------------------------------");
		System.out.println(s.getNewSavingAcc(121, "Kshitij", 186, true));
		System.out.println(s.getNewCurrentAcc(10, "Marshal", 18700, 1000));
		
		System.out.println(p);
		System.out.println(n);
	}

}
