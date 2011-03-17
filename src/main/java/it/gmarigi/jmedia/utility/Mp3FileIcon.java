/*
 * Created on 5-feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.utility;

import javax.swing.filechooser.FileView;
import javax.swing.*;

import java.io.File;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Mp3FileIcon extends FileView {
	public Icon getIcon(File f) {
		if(f.getName().toLowerCase().endsWith(".mp3"))
			return new ImageIcon("images/mp3.gif");
		else {
			return null;
		}
		
	}

}
