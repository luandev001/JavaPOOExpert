package model.service;

public interface OnlinePaymentService {

	double paymentFee(double amount); //pode ser um double simples e não warraper pois sempre será passado um valor para amount.
	
	double interest(double amount, int months);
}
