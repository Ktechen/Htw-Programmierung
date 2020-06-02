package user;

public interface INutzer {
	
	
	/** gibt eine Liste der essbaren Produkte des Nutzers zurueck
	 * @return Liste der essbaren Produkte
	 */
	public abstract String[] getEssbar();
	
	
	/**
	 * beantwortet die Frage, ob ein Produkt vom Nutzer essbar ist, oder nicht
	 * @param produkt Produkt, von welchem erfragt wird, ob es essbar ist
	 * @return true, wenn produkt essbar ist
	 */
	public abstract boolean istEssbar(String produkt);
	

	/**
	 * empfaengt eine Meldung 
	 * @param meldung Meldung, die empfangen wird
	 */
	public abstract void empfangeMeldung(String meldung);
	

	/**
	 * gibt alle Eigenschaften des Nutzers in einer lesbaren Form als String zurueck
	 * @return textuelle Repraesentation des Objektes
	 */
	public abstract String toString();

}
