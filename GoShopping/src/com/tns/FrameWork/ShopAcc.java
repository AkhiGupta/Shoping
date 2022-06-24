package com.tns.FrameWork;

public abstract class ShopAcc {
	
	private int accNo;
	private String accNm;
	private float charges;
	
	
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	public void withdraw (float charges)
    {
        System.out.println(charges);
    }
   public void deposite (float charges)
   {
	   System.out.println(charges);
   }
   
   public String getAccNm()
   {
	   return accNm;
   }
   
   public int getAccNo()
   {
	   return accNo;
   }
   
   public float getAccCharges()
   {
	   return charges;
   }

@Override
public String toString() {
	return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
}
   
   

   
}
