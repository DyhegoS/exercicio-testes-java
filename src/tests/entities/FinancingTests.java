package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjWhenCorrectData() {
		Assertions.assertDoesNotThrow(() -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		});
	}
	
	@Test
	public void constructorShouldErrorWhenIncorrectData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateValueWhenCorrectData() {
		
		double totalAmount = 100000.0;
		
		Assertions.assertDoesNotThrow(() -> {
			Financing fin = FinancingFactory.createFinancing(0.0, 2000.0, 80);
			fin.setTotalAmount(totalAmount);
		});
		
	}
	
	
	@Test
	public void setTotalAmountShouldErrorWhenIncorrectValue() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(0.0, 2000.0, 20);
			fin.setTotalAmount(100000.0);
		}); 
	}
	
	@Test
	public void setIncomeShouldUpdateWhenCorrectValue() {
		
		Assertions.assertDoesNotThrow(() -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 4000.0, 80);
			fin.setIncome(2000.0);
		}); 
	}
	
	@Test
	public void setIncomeShouldErrorWhenIncorrectData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 20);
			fin.setIncome(1000.0);
		});
	}
}
