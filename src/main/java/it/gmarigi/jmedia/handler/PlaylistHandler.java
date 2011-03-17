/*
 * Created on 6-feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.handler;

import it.gmarigi.jmedia.storeservices.BusinessDelegatePlaylist;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PlaylistHandler extends Thread {

	private String nome;
	
	public PlaylistHandler(String nome) {
		this.nome = nome;
	}

	public void run() {
		try {
			BusinessDelegatePlaylist.nuovaPlaylist(nome);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
