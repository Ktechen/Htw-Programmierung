package junitTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import org.junit.Test;

import kuehlschrank.IntelliK;
import lebensmittel.Produkt;

public class TestIntellik {

	@Test
	public void setMinAnzahl() {

		IntelliK k = new IntelliK(new Produkt[] { new Produkt("Milch", 4) });

		assertTrue(k.getMinProduct()[0].getName() == "Milch");

	}

	@Test
	public void setMinAnzahlPart2() {

		IntelliK k = new IntelliK(new Produkt[] { new Produkt("Milch", 4) });
		k.setMinAnzahl("Eier", 6);

		assertTrue(k.getMinProduct()[1].getName() == "Eier");
	}

	@Test
	public void setMinAnzahlNotNull() {

		IntelliK k = new IntelliK(new Produkt[] { new Produkt("Milch", 4) });

		assertNotNull(k.getMinProduct());
	}

	@Test
	public void add() {
		IntelliK k = new IntelliK();

		k.add("Tim", "Milch", 4, new GregorianCalendar());
		k.add("Paul", "Eier", 2, new GregorianCalendar());
		k.add("Paul", "Schinken", 2, new GregorianCalendar());

		assertTrue(k.getMyProducts().length == 3 && k.getMyProducts()[2].getName() == "Schinken");
	}

	@Test
	public void addNotNull() {
		IntelliK k = new IntelliK(new Produkt[] { new Produkt("Milch", 4) },
				new Produkt[] { new Produkt("Milch", 10, new GregorianCalendar()),
						new Produkt("Eier", 5, new GregorianCalendar()),
						new Produkt("Schinken", 2, new GregorianCalendar()) });

		assertNotNull(k.getMyProducts());
	}

	@Test(expected = NullPointerException.class)
	public void addCallNullpointer() {
		IntelliK k = new IntelliK();

		k.add("Tim", "Milich", 3, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addCallValueNNegativ() {
		IntelliK k = new IntelliK();

		k.add("Tim", "Milch", -1, new GregorianCalendar());
	}

	@Test
	public void addNotDouble() {
		IntelliK k = new IntelliK();

		k.add("Kevin", "Eier", 2, new GregorianCalendar());
		k.add("Kevin", "Eier", 4, new GregorianCalendar());

		for (int i = 0; i < k.getMyProducts().length; i++) {
			System.out.println(k);
		}
		
		assertTrue(k.getMyProducts().length == 1 && k.getMyProducts()[0].getAnzahl() == 6);
	}

}
