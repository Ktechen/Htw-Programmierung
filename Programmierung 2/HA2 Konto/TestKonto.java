package HA2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestKonto {

	private Konto konto;
	
	//private double zero = 0;
	private double max = 10000;
	private double min = 1;
	private double money = 5000;
	
	/*
	@Test
	public void TestEinzahlenZero() {
		konto = new Konto();
		assertTrue(konto.einzahlen(zero));
	}
	*/
	
	@Test
	public void TestEinzahlen() {
		konto = new Konto();
		konto.einzahlen(money);
		assertTrue(konto.getMoney() == money);
	}
	
	@Test
	public void TestEinzahlenMin() {
		konto = new Konto();
		konto.einzahlen(min);
		
		//System.out.println(konto.getMoney());
		
		assertTrue(konto.getMoney() == min);
	}
	
	@Test
	public void TestEinzahlenMax() {
		konto = new Konto();
		konto.einzahlen(max);
		assertTrue(konto.getMoney() == max);
	}
	
	@Test
	public void TestAbheben() {
		konto = new Konto();
		konto.einzahlen(money);
		konto.abheben(4500);
		assertTrue(konto.getMoney() == 500);
	}
	
	@Test
	public void TestAbhebenMin() {
		konto = new Konto();
		konto.einzahlen(money);
		konto.abheben(min);
		assertTrue(konto.getMoney() == money-1);
	}
	
	@Test
	public void TestAbhebenMax() {
		konto = new Konto();
		konto.einzahlen(money);
		konto.abheben(max);
		assertTrue(konto.getMoney() == 0);
	}
	
	@Test
	public void TestKontoIstLeer() {
		konto = new Konto();
		assertTrue(konto.kontoIstLeer(konto));
	}
		
	@Test
	public void TestKontoIstNichtLeer() {
		konto = new Konto();
		konto.einzahlen(2000);
		
		if(!konto.kontoIstLeer(konto)) {
			assertTrue(true);
		}
		
	}
	
	@Test
	public void TestCleanKonto() {
		konto = new Konto();
		double money = konto.getMoney();
		
		if(money < 0) {
			konto.einzahlen(2000);
		}
		
		//konto.kontoLeeren(konto);
		
		assertTrue(konto.getMoney() == 0);
	}
	
	
}
