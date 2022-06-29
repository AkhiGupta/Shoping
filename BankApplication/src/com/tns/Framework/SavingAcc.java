package com.tns.Framework;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalaried;
	private static final float MINBAL=0.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	public void withdraw(float MINBAL) {
		System.out.println(" Account No is " +this.getAccNo()+"\n" + " Account Name is "+this.getAccNm()+"\n" + " Account Bal is "+this.getAccBal());
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
