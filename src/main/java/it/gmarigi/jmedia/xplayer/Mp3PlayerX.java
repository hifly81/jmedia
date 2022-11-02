/*
 * Created on 29-gen-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.xplayer;

import it.gmarigi.jmedia.player.PlayerX;
import it.gmarigi.jmedia.utility.UtilityConversioni;
import it.gmarigi.jmedia.entity.MediaInfoHash; 
import it.gmarigi.jmedia.adapter.MediaControllerAdapter;

import javax.media.Player;
import javax.media.Manager;
import javax.media.Control;
import javax.media.GainControl;
import java.net.URL;
import java.awt.Component;
import java.io.File;



/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Mp3PlayerX extends PlayerX {
	
	private URL path;
	private Player p;
	private GainControl gainControl;
	private Component componenteVisuale;
	private Component componenteControllo;
	
	
	private String stato = null;
	private String latenzaApertura = null;
	
	public Mp3PlayerX(URL path) {
		 try {
		 	this.path = path;

		 	//Creazione indiretta del player tramite il MANAGER
		 	//Realized
		 	p = Manager.createRealizedPlayer(path);
		 	p.addControllerListener(new MediaControllerAdapter());
		 	
		 	String latenza = new Double(p.getStartLatency().getSeconds()).toString().substring(0,3);
		 	double latenza_approx = Double.parseDouble(latenza);
		 	
		 	latenzaApertura = UtilityConversioni.secondiToMinuti(latenza_approx);
		 		
		 	System.out.println("LATENZA: "+UtilityConversioni.secondiToMinuti(latenza_approx));
		 	System.out.println("MEDIA_TIME: "+p.getMediaTime());
		 	
		 	System.out.println("Costruttore_ccontrollo: "+p.getControlPanelComponent().getClass().getName());
		 	
		 	componenteControllo = p.getControlPanelComponent();
		 	if(componenteControllo!=null) {
		 		stato = "realized";
		 	}	
		 		
		 	else {
		 		stato = "prefetched";
		 	}	
		 }		
		 catch(Exception e) {
		 	e.printStackTrace();
		 }
	}
	

	
	public void play() {
		try {
		      p.start();
		      stato = "started";
		
		}
		catch(Exception e) {
			e.printStackTrace();
			stato = "destroyed";
			System.exit(1);
		}
	}
	
	public void stop() {
		try {
		      p.stop();
		      stato = "stopped";
		
		}
		catch(Exception e) {
			e.printStackTrace();
			stato = "destroyed";
			System.exit(1);
		}
	}
	
	public void deallocate() {
		try {
		      p.deallocate();
		      stato = "deallocated";
		
		}
		catch(Exception e) {
			e.printStackTrace();
			stato = "destroyed";
			System.exit(1);
		}
	}
	
	public void impostaRate(float value) {
		if(!stato.equals("deallocated")) {
			p.setRate(value);
		}
	}
	
	
	public Component getComponenteVisuale() {
		return componenteVisuale;
	}
	
	
	public void setComponenteControllo(Component value) {
		this.componenteControllo = value;
	}
	
	public void setStato(String value) {
		this.stato = value;
	}
	
	//Ritorna un componente con i comandio per gestire il flusso di un media.
	public Component getComponenteControllo() {
		if(stato.equals("realized")) {
			return componenteControllo;
		}
		else {
			return null;
		}
	}
	
	public Component getGainComponent() {
		
		Component gain = null;
		
		try {
			controlliSupportati();
			gain = gainControl.getControlComponent();
			
			if(gain!=null) {
				
				System.out.println("Gain control presente!");
				return gain;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return gain;
		
		
		
	}
	
	public MediaInfoHash getInfoPlayer()throws Exception  {
		
		//Creazione di una mappa con i parametri del media.
		MediaInfoHash temp = new MediaInfoHash();

		
		String durata = UtilityConversioni.secondiToMinuti(p.getDuration().getSeconds());
		temp.put(MediaInfoHash.DURATA,durata);
		temp.put(MediaInfoHash.RATE,new Float(p.getRate()).toString());
		temp.put(MediaInfoHash.LATENZA,latenzaApertura);

		
		String titolo;

		File ftemp = new File(path.getFile());
		titolo = ftemp.getName()+" (no id3 title tag)";

		temp.put(MediaInfoHash.TITOLO,titolo);
	
		return temp;
	}
	
	public void controlliSupportati() throws Exception {

		if(p!=null) {
			Control[] controlli = p.getControls();
			int numeroControlli = controlli.length;
			
			for(int i=0;i<numeroControlli;i++) {
				
				System.out.println(controlli[i].getClass().getName());
				
				//Controllo su GainController
				if(controlli[i] instanceof com.sun.media.controls.GainControlAdapter) {
					System.out.println("Istanza_GainControl");
					
					GainControl gain = p.getGainControl();
					if(gain!=null) {		
						System.out.println("GAIN: "+gain.getDB()+" "+gain.getLevel());
						
						gainControl = gain;
					}
					
				}
				
			
				
				if(gainControl==null) {
					throw new Exception("Gain Control non presente!");
				}
				
			}
		}
	
	}
	
	

}
