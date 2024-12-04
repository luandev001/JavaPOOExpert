package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	//Injeção de dependencia utilizando o construtor, obriga o contractService a receber uma injeção de dependencias
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			
			Date dueDate = addMonths(contract.getDate(), i);// pega a data do contrato e add i meses
			contract.getInstallments().add(new Installment(dueDate, fullQuota)); // Criará uma nova instacia de das parcelas e add a cada parcela(Installments), ou seja, a cada for uma nova parcela.
		}
	}
	
	//função auxiliar para add meses a uma data.
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N); // add N meses ao calendario
		return calendar.getTime(); // volta a valer um date
	}
}
