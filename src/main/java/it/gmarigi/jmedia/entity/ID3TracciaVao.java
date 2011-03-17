/*
 * Created on 13-feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.entity;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ID3TracciaVao implements java.io.Serializable {
	
	private String titolo;
	private String artista;
	private String album;
	private String durata;
	
	private String indice;
	
	

	/**
	 * @return Returns the album.
	 */
	public String getAlbum() {
		return album;
	}
	/**
	 * @param album The album to set.
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	/**
	 * @return Returns the artista.
	 */
	public String getArtista() {
		return artista;
	}
	/**
	 * @param artista The artista to set.
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}
	/**
	 * @return Returns the titolo.
	 */
	public String getTitolo() {
		return titolo;
	}
	/**
	 * @param titolo The titolo to set.
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String toString() {
		return titolo+" "+artista+" "+album+" "+durata;
	}
	/**
	 * @return Returns the durata.
	 */
	public String getDurata() {
		return durata;
	}
	/**
	 * @param durata The durata to set.
	 */
	public void setDurata(String durata) {
		this.durata = durata;
	}
	/**
	 * @return Returns the indice.
	 */
	public String getIndice() {
		return indice;
	}
	/**
	 * @param indice The indice to set.
	 */
	public void setIndice(String indice) {
		this.indice = indice;
	}
}
