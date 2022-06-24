package com.tns.Application;
import com.tns.FrameWork.*;
public class GSPrimeAcc extends PrimeAcc {
	private static final float Charges=0.0f;
	
	public GSPrimeAcc( int accNo, String accNm, float charges, boolean isPrime) 
	{
		super( accNo, accNm, charges, isPrime);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getAccNm()=" + getAccNm() + ", getAccNo()="
				+ getAccNo() + ", getAccCharges()=" + getAccCharges() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}



