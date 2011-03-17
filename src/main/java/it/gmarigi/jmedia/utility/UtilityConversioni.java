/*
 * Created on 30-gen-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.utility;

import it.gmarigi.jmedia.entity.ID3TracciaVao;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class UtilityConversioni {

	public static String secondiToMinuti(double seconds) {
		int limite = 60;
		int contatoreSec = 0;
		int contatoreMin = 0;
		int scorritore = 0;
		
		System.out.println(seconds);
		
		while(scorritore < seconds) {
			scorritore++;
			contatoreSec++;
			if(contatoreSec == limite) {
				contatoreMin++;
				contatoreSec = 0;
			}
		}
		
		//Fine ciclo
		System.out.println(contatoreMin+" "+contatoreSec);
		Integer min = new Integer(contatoreMin);
		Integer sec = new Integer(contatoreSec);
		
		if(min.toString().equals("0")) {
			return sec.toString()+"''";
		}
		else {
			return min.toString()+"'"+sec.toString()+"''";
		}
	}
	
	public static String tracciaFormatDialog(ID3TracciaVao traccia) {
		String titolo = traccia.getTitolo();
		String artista = traccia.getArtista();
		String album = traccia.getAlbum();
		String durata = traccia.getDurata();
		
		if(titolo==null)
			titolo="";
		
		if(artista==null)
			artista="";
		
		if(album==null)
			album="";
		
		if(durata==null)
			durata="";
		
		
		
		return "Titolo: "+titolo
		+"\nArtista: "+artista
		+"\nAlbum: "+album
		+"\nDurata: "+durata;
		
		
	}
	
	
}
