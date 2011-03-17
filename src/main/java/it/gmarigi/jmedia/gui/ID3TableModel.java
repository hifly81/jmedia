
package it.gmarigi.jmedia.gui;

import javax.swing.table.*;

import java.util.*;

import it.gmarigi.jmedia.entity.ID3TracciaVao;


public class ID3TableModel extends AbstractTableModel {
	
	private int righe,colonne = 0;
	private Vector tracce;
	private String[]columnNames = {"Titolo","Artista","Album","Durata"};
	
	public static int COL_TITOLO = 0;
	public static int COL_ARTISTA = 1;
	public static int COL_ALBUM = 2;
	public static int COL_DURATA = 3;
	
	public ID3TableModel(int righe,int colonne,Vector tracce) {
		this.righe = righe;
		this.colonne = colonne;
		this.tracce = tracce;
	}
	
	public int getRowCount() {
		return this.righe;
	}
	
	public int getColumnCount() {
		return this.colonne;
	}
	
	public Object getValueAt(int r,int c) {
		ID3TracciaVao[]coll = new ID3TracciaVao[tracce.size()];
		System.out.println("\nmodello id3Vector: "+tracce.size());
		
		//riempimento array
		for(int i=0;i<coll.length;i++) {
			coll[i] = (ID3TracciaVao)tracce.elementAt(i);
		}

		ID3TracciaVao traccia = coll[r];
		
		switch( c ){
        case 0:
        if(traccia.getTitolo()==null || traccia.getTitolo().equals("")) {
        	return "assente";
        }
        else {
           return traccia.getTitolo();
        }   
        case 1:
            if(traccia.getArtista()==null || traccia.getArtista().equals("")) {
            	return "assente";
            }
            else {
               return traccia.getArtista();
            }   
        case 2:
        	 if(traccia.getAlbum()==null || traccia.getAlbum().equals("")) {
            	return "assente";
            }
            else {
               return traccia.getAlbum();
            }   
        case 3:
       	 if(traccia.getDurata()==null || traccia.getDurata().equals("")) {
           	return "assente";
           }
           else {
              return traccia.getDurata();
           } 	 
       
        default:
            return new Object();
		}
		

	}
	
	public String getColumnName(int col) {
        return columnNames[col];
    }
	
	public boolean isCellEditable(int r,int c) {
		return c == COL_TITOLO ||
			c == COL_ARTISTA ||
			c == COL_ALBUM;
	}	
	
	
	

	
}
