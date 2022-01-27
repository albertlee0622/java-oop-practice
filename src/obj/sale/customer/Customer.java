package obj.sale.customer;

import obj.sale.Buy;
import obj.sale.Sell;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {
		Sell.super.order();
	}
	
}
