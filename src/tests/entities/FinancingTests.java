package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjWhenCorrectData() {
		
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, fin.getTotalAmount());
		Assertions.assertEquals(2000.0, fin.getIncome());
		Assertions.assertEquals(80, fin.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenCorrectData() {
		
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		
		fin.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, fin.getTotalAmount());
		
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
			fin.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldSetDataWhenCorrectData() {
		
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		
		fin.setIncome(2100.0);
		
		Assertions.assertEquals(2100.0, fin.getIncome());
		
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
			fin.setIncome(1900.0);
		});
	}
	
	@Test
	public void setMonthsShouldSetDataWhenCorrectData() {
		
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		
		fin.setMonths(81);
		
		Assertions.assertEquals(81, fin.getMonths());
		
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 79);
			fin.setMonths(79);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(20000.0, fin.entry());
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1000.0, fin.quota());
	}
	
}
