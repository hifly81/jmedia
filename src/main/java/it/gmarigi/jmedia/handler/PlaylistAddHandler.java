/*
 * Created on 7-feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.handler;

import java.util.Vector;

import it.gmarigi.jmedia.storeservices.BusinessDelegateGetPlaylist;
import it.gmarigi.jmedia.storeservices.BusinessDelegatePlaylist;
import it.gmarigi.jmedia.entity.ID3TracciaVao;
import it.gmarigi.jmedia.gui.ID3TableModel;
import javax.swing.JTable;
import javax.swing.JPanel;


/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PlaylistAddHandler extends Thread {

	private String playlist;
	private String file;
	private ID3TracciaVao id3;
	private JTable table;
	private JPanel pan;
	
	public PlaylistAddHandler(String playlist,String file,ID3TracciaVao id3,JTable table,JPanel pan) {
		this.playlist = playlist;
		this.file = file;
		this.id3 = id3;
		this.table = table;
		this.pan = pan;
	}

	public void run() {
		try {
			//Inserisci nuova traccia nella playlist.
			BusinessDelegatePlaylist.inserimentoTraccia(playlist,file,id3);
			//Recupera playlist.
			Vector lista = BusinessDelegateGetPlaylist.recuperaPlaylist(playlist);

			ID3TableModel modello = new ID3TableModel(lista.size(),4,lista);
			table.setModel(modello);
			pan.validate();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
