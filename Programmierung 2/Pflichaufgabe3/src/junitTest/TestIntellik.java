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

		assertTrue(k.getMyProducts().length == 1 && k.getMyProducts()[0].getAnzahl() == 6);
	}

	@Test
	public void getAnzahl() {
		IntelliK k = new IntelliK(new Produkt[] { new Produkt("Milch", 4) },
				new Produkt[] { new Produkt("Eier", 1, new GregorianCalendar()),
						new Produkt("Eier", 5, new GregorianCalendar()),
						new Produkt("Eier", 2, new GregorianCalendar()) });

		assertTrue(k.getAnzahl("Eier") == 8);
	}

	@Test
	public void getAnzahlNameNotEqual() {
		IntelliK k = new IntelliK(new Produkt[] { new Produkt("Milch", 4) },
				new Produkt[] { new Produkt("eieR", 1, new GregorianCalendar()),
						new Produkt("eIer", 5, new GregorianCalendar()),
						new Produkt("EiEr", 2, new GregorianCalendar()) });

		assertTrue(k.getAnzahl("Eier") == 8);
	}

	@Test
	public void zukaufenCurrentDatePart1() {
		IntelliK k = new IntelliK(new Produkt[] { new Produkt("Milch", 4), new Produkt("Eier", 2) },
				new Produkt[] { new Produkt("Milch", 1, new GregorianCalendar(2020, 07, 31)),
						new Produkt("eIer", 5, new GregorianCalendar(2020, 03, 22)),
						new Produkt("Milch", 2, new GregorianCalendar(2020, 02, 24)) });

		assertTrue(k.zuKaufen("eier"));
	}

	@Test
	public void zukaufenCurrentDatePart2() {
		IntelliK k = new IntelliK(new Produkt[] { new Produkt("Milch", 4), new Produkt("Eier", 2) },
				new Produkt[] { new Produkt("Eier", 1, new GregorianCalendar(2020, 07, 31)),
						new Produkt("Milch", 5, new GregorianCalendar(2020, 03, 22)),
						new Produkt("Kuchen", 2, new GregorianCalendar(2020, 02, 24)) });

		assertTrue(k.zuKaufen("milch"));
	}

	@Test
	public void zukaufenCurrentDatePartDoubleProdukts() {
		IntelliK k = new IntelliK(new Produkt[] { new Produkt("Milch", 4), new Produkt("Eier", 2) },
				new Produkt[] { new Produkt("Eier", 1, new GregorianCalendar(2020, 07, 31)),
						new Produkt("Milch", 5, new GregorianCalendar(2020, 03, 22)),
						new Produkt("Kuchen", 2, new GregorianCalendar(2020, 07, 27)),
						new Produkt("Kuchen", 2, new GregorianCalendar(2020, 02, 24)), });

		assertTrue(k.zuKaufen("Kuchen"));
	}

}
