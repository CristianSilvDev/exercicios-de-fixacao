package model.services;

public class PaypalService implements OnlinePaymentService {

	public static final double PAYMENT_FEE = 0.02;
	public static final double MONTHLY_INTEREST = 0.01;
	
	@Override
	public double paymentFee(Double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTHLY_INTEREST;
	}
	
}
