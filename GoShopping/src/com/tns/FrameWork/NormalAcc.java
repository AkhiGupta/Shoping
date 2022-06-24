package com.tns.FrameWork;

public abstract class NormalAcc extends ShopAcc {
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	
	public void bookProduct (float charges)
	{
		System.out.println(" Account No is "+this.getAccNo()+"\n" + " Account Name is "+this.getAccNm()+"\n" + " Account charges is "+(charges)+"\n" + "Account Delivery Charges is "+deliveryCharges);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getAccNm()=" + getAccNm() + ", getAccNo()="
				+ getAccNo() + ", getAccCharges()=" + getAccCharges() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
