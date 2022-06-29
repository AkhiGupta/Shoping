package com.tns.Application;

import com.tns.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL=0.0f;

	public MMSavingAcc( int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		super( accNo, accNm, accBal, isSalaried);
	}
	
	public void withdraw(float MINBAL)
	{
		System.out.println(MINBAL);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	

}
