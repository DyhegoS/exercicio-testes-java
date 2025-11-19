package tests.factory;

import entities.Financing;

public class FinancingFactory {
	public static Financing createEmptyFinancing() {
		return new Financing(0.0, 0.0, 0);
	}
	
	public static Financing createinvalidFinancing(Double totalAmount, Double income, Integer months) {
		if(totalAmount < 0.0 && income < 0.0 && months < 0) {
			throw new IllegalArgumentException("Dados invalidos!");
		}
		return new Financing(totalAmount, income, months);
	}
	
	public static Financing createFinancing(Double totalAmount, Double income, Integer months) {
		return new Financing(totalAmount, income, months);
	}
}
