package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	
	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		Kort[] copyS = samling.getAllekort();
		
		Kort tmpKort;
		int teller = samling.getAntalKort();

		for (int i = 0 ;i < teller;i++) {
			for (int j = i; j< teller; j++) {
				
				if (copyS[i].compareTo(copyS[j]) > 0) {
					
					tmpKort = copyS[i];
					copyS[i] = copyS[j];
					copyS[j] = tmpKort;
				}
			}
		}		
	}
	

	
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		Kort[] copyS = samling.getAllekort();
		KortSamling nyS = new KortSamling();
		 
		Kort tmpKort;
		int teller = samling.getAntalKort();
		int random;
		
		for(int i = 0; i<teller ;i++) {
			random = (int)((Math.random()*teller));
			if(nyS.har(copyS[random])) {
				i--;
			}else {
				tmpKort = copyS[random];
				nyS.leggTil(tmpKort);
			}
		}
	}	
}
