package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePorHour;
	private Double pricePourDay;
	
	private TaxService taxService;

	public RentalService(Double pricePorHour, Double pricePourDay, TaxService taxService) {
		this.pricePorHour = pricePorHour;
		this.pricePourDay = pricePourDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();//Para captuarr em millisegundos
		long t2 = carRental.getFinish().getTime();
		
		double hours = (double) (t2-t1) / 1000 / 60 / 60; //para capturar a diferença em horas
		
		double basicPayment;
		
		if (hours <=12.0) {
			basicPayment = Math.ceil(hours) * pricePorHour; // Math.ceil() --> arredonda para cima;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePourDay;
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax)); //Foi criado um novo objeto de pagamento new Invoice(), e associei ele com o objeto de aluguel carRental()
	}
	
}
