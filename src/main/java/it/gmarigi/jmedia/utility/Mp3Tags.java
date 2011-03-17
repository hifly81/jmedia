package it.gmarigi.jmedia.utility;

import de.ueberdosis.mp3info.ID3Reader;

public class Mp3Tags extends ID3Reader {
    
	public Mp3Tags (String filename) throws java.io.IOException {
        super (filename);
    }
	
    public String getInfo() {
        return "\""+xtag.getTitle()+"\";\""+xtag.getArtist ()
            +"\";\""+xtag.getAlbum ()+"\";\""+xtag.getYear()+"\";\""
            +xtag.getComment ()+"\";\""+xtag.getTrackS ()+"\";\""
            +xtag.getGenreS ()+"\";\""+xtag.getBitrateS()+"\"";
    }
    
    public String getTitle() {
        return xtag.getTitle ();
    }
    public String getArtist () {
        return xtag.getArtist ();
    }
    public String getAlbum () {
        return xtag.getAlbum ();
    }
    public String getYear () {
        return xtag.getYear ();
    }
    public String getComment () {
        return xtag.getComment ();
    }
    public String getTrack () {
        return xtag.getTrackS ();
    }
    public String getGenre () {
        return xtag.getGenreS ();
    }
    public String getBitRate() {
        return xtag.getBitrateS ();
    }


}


