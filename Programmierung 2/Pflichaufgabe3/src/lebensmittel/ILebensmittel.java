package lebensmittel;

import java.util.GregorianCalendar;


public interface ILebensmittel {
	
	/**
	 * gibt den Namen zurueck
	 * @return String
	 */
	public abstract String getName();	
	
	/**
	 * gibt das Verfallsdatum zurueck 
	 * @return GregorianCalendar
	 * @throws NullPointerException
	 */
	public abstract GregorianCalendar getVerfallsDatum() throws NullPointerException;
	
	/**
	 * liefert true zurueck, wenn das Lebensmittel am angegebenen Datum abgelaufen ist
	 * @param datum
	 * @return boolean
	 * @throws NullPointerException
	 */
	public abstract boolean istAbgelaufen(GregorianCalendar datum) throws NullPointerException;
	
	/**
	 * gibt alle Eigenschaften eines Lebensmittels in einer lesbaren Form als String zurueck
	 * @return String
	 */
	public abstract String toString();

}
