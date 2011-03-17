/*
 * Created on 12-feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.storeservices;

import noNamespace.PlaylistDocument;
import java.io.FileReader;
import java.util.Vector;

import it.gmarigi.jmedia.entity.ID3TracciaVao;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class BusinessDelegateGetPlaylist {
	
	public static synchronized Vector  recuperaPlaylist(String path_playlist) throws Exception {
		Vector lista = new Vector();
		
		PlaylistDocument doc = null;
		if(!path_playlist.substring(path_playlist.length()-4).equals(".xml")) {
			System.out.println(path_playlist.substring(0,path_playlist.length()-4));
			path_playlist = path_playlist.concat(".xml");
		}
		FileReader fr = new FileReader("playlist/"+path_playlist);
        doc = PlaylistDocument.Factory.parse(fr);
        PlaylistDocument.Playlist.Traccia[] tracce = doc.getPlaylist().getTracciaArray();
        
        //con le tracce ho solo il path del media file
        for(int i=0;i<tracce.length;i++) {
        	PlaylistDocument.Playlist.Traccia temp = tracce[i];
        	ID3TracciaVao otemp = new ID3TracciaVao();
        	
        	otemp.setIndice(new Integer(i).toString());
        	
        	System.out.println(temp.getID3Traccia().getTitolo());
        	otemp.setTitolo(temp.getID3Traccia().getTitolo());
        	
        	System.out.println(temp.getID3Traccia().getArtista());
        	otemp.setArtista(temp.getID3Traccia().getArtista());
        	
        	System.out.println(temp.getID3Traccia().getAlbum());
        	otemp.setAlbum(temp.getID3Traccia().getAlbum());
        	
        	System.out.println(temp.getID3Traccia().getAlbum());
        	otemp.setDurata(temp.getID3Traccia().getDurata());
        	
        	lista.add(otemp);
        	
        }
        
		
		return lista;
		
	}

}
