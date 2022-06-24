package com.tns.Application;
import com.tns.FrameWork.*;
public class GSShopFactory extends ShopFactory {
	public GSPrimeAcc getNewPrimeAcc(int accNo,String accNm,float charges,boolean isPrime) {
		GSPrimeAcc obj = new GSPrimeAcc (accNo,accNm,charges,isPrime);
		return obj;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		GSNormalAcc obj1 = new GSNormalAcc (accNo, accNm, charges,deliveryCharges);
		return obj1;
	}
}
