/*
 * Created on 29-gen-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.player;



/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class PlayerX {

	public abstract void play();
	
	public abstract void stop();
	
	public abstract void deallocate();
	
	public abstract void impostaRate(float value);
	
	public abstract void controlliSupportati() throws Exception; 
	
	
}
