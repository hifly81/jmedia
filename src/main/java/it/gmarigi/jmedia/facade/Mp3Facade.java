/*
 * Created on 5-feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.facade;

import it.gmarigi.jmedia.xplayer.*;
import java.net.URL;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Mp3Facade implements Runnable {
	private Mp3PlayerX mp3;
	private URL url;
	
	public Mp3Facade(URL url) {
		this.url = url;
	}
	
	public void run() {
		try {
			mp3 = new Mp3PlayerX(url);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
