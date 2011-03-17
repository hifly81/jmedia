/*
 * Created on 6-feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.storeservices;

import noNamespace.PlaylistDocument;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import it.gmarigi.jmedia.entity.ID3TracciaVao;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class BusinessDelegatePlaylist {
	
	public static void nuovaPlaylist(String nome) throws Exception {
		PlaylistDocument pd = PlaylistDocument.Factory.newInstance();
		PlaylistDocument.Playlist plist = pd.addNewPlaylist();
        plist.setNome(nome);
        plist.setPath("playlist/"+nome+".xml");
        FileOutputStream fos = new FileOutputStream(new File(plist.getPath()));
        pd.save(fos);
        fos.close();
	}
	
	public synchronized static void inserimentoTraccia(String path_playlist,String path_file,ID3TracciaVao id3) throws Exception {
		PlaylistDocument doc = null;
		if(!path_playlist.substring(path_playlist.length()-4).equals(".xml")) {
			System.out.println(path_playlist.substring(0,path_playlist.length()-4));
			path_playlist = path_playlist.concat(".xml");
		}
		
		FileReader fr = new FileReader("playlist/"+path_playlist);
        doc = PlaylistDocument.Factory.parse(fr);
        PlaylistDocument.Playlist.Traccia traccia = doc.getPlaylist().addNewTraccia();
		traccia.setPath(path_file);
		
		PlaylistDocument.Playlist.Traccia.ID3Traccia itraccia = null;
		
		if(id3!=null) {
			itraccia = traccia.addNewID3Traccia();
		}
		
		if(id3.getTitolo()!=null && !id3.getTitolo().equals("")) {
			itraccia.setTitolo(id3.getTitolo());
		}
		if(id3.getArtista()!=null && !id3.getArtista().equals("")) {
			itraccia.setArtista(id3.getArtista());
		}
		if(id3.getAlbum()!=null && !id3.getAlbum().equals("")) {
			itraccia.setAlbum(id3.getAlbum());
		}
		if(id3.getDurata()!=null && !id3.getDurata().equals("")) {
			itraccia.setDurata(id3.getDurata());
		}
		
        fr.close();

        FileWriter fw = new FileWriter("playlist/"+path_playlist);
        doc.save(fw);	
        
       
        fw.close();
        
        doc = null;
		
	}

}
