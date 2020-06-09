package lebensmittel;

import java.util.GregorianCalendar;


public interface ILebensmittel {
	
	/**
	 * 
	 * @return gibt den Namen zurueck
	 */
	public abstract String getName();	
	
	/**
	 *
	 * @return gibt das Verfallsdatum zurueck 
	 */
	public abstract GregorianCalendar getVerfallsDatum();
	
	/**
	 * liefert true zurueck, wenn das Lebensmittel am angegebenen Datum abgelaufen ist
	 * @param datum
	 * @return boolean
	 */
	public abstract boolean istAbgelaufen(GregorianCalendar datum);
	
	/**
	 * gibt alle Eigenschaften eines Lebensmittels in einer lesbaren Form als String zurueck
	 * @return
	 */
	public abstract String toString();

}
