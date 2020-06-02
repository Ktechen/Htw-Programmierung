package intelligent.Lebensmittel;

import java.util.GregorianCalendar;


public interface ILebensmittel {
	
	//gibt den Namen zurueck
	public abstract String getName();	
	
	//gibt das Verfallsdatum zurueck
	public abstract GregorianCalendar getVerfallsDatum();
	
	//liefert true zurueck, wenn das Lebensmittel am angegebenen Datum abgelaufen ist
	public abstract boolean istAbgelaufen(GregorianCalendar datum);
	
	//gibt alle Eigenschaften eines Lebensmittels in einer lesbaren Form als String zurueck
	public abstract String toString();

}
