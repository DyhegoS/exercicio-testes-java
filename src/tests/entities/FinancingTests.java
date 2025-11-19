package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	
	@Test
	public void constructShouldCreateObjetWhenCorrectData() {
		Assertions.assertThrows(IllegalArgumentException.class , () -> {
			double totalAmount = -1000.0;
			double income = -100.0;
			int month = -1;
			Financing fin = FinancingFactory.createinvalidFinancing(totalAmount, income, month);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createEmptyFinancing();
		});
	}
}
