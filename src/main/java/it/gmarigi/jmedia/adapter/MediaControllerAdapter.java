/*
 * Created on 30-gen-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.adapter;

import javax.media.*;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MediaControllerAdapter extends ControllerAdapter {
	
	private static int count = 0;
	
	public void endOfMedia(EndOfMediaEvent e) {
		System.out.println("INIT_end_of_media");
		
		Controller controller = (Controller)e.getSource(); 
		controller.stop(); 
		controller.setMediaTime(new Time(0)); 
		controller.deallocate(); 
	}
	
	public void restarting(RestartingEvent e) {
		System.out.println("INIT_restarting");
		
		count++;
	}

	
}
