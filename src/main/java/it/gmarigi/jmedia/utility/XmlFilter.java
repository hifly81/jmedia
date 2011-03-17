/*
 * Created on 5-feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.utility;

import java.io.File;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class XmlFilter extends javax.swing.filechooser.FileFilter {

	
	public boolean accept(File pathname) {
		if(pathname.getName().toLowerCase().endsWith(".xml"))
			return true;
		if(pathname.isDirectory())
			return true;
		
		return false;
	}
	
	public String getDescription() {
		return "XML file";
	}

}

