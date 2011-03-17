/*
 * Created on 29-gen-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.gmarigi.jmedia.gui;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JFileChooser;

import java.awt.Component;

import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import it.gmarigi.jmedia.xplayer.*;
import it.gmarigi.jmedia.entity.*;
import it.gmarigi.jmedia.utility.Mp3Filter;
import it.gmarigi.jmedia.utility.UtilityConversioni;
import it.gmarigi.jmedia.utility.XmlFilter;
import it.gmarigi.jmedia.utility.DirectoryFilter;
import it.gmarigi.jmedia.utility.Mp3FileIcon;
import it.gmarigi.jmedia.handler.PlaylistHandler;
import it.gmarigi.jmedia.handler.PlaylistAddHandler;
import it.gmarigi.jmedia.storeservices.BusinessDelegateGetPlaylist;

import javax.swing.ButtonGroup;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.io.File;
import java.io.IOException;
import javax.swing.JCheckBox;
import javax.swing.JTabbedPane;
import javax.swing.event.MouseInputAdapter;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.JRadioButtonMenuItem;


//L&F
import com.digitprop.tonic.*;

/**
 * @author HiFly
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class XPlayer extends JFrame implements ActionListener {

	private javax.swing.JPanel jContentPane = null;

	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JPanel jPanel2 = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu1 = null;
	private JMenu jMenu = null;
	private JFileChooser file = null;
	
	private Component mediaComponent = null;
	private Component controlComponent = null;
	
	
	private JMenuItem jMenuItem = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private ID3TableModel modello = null;
	private JTable jTable = null;
	
	private Mp3PlayerX mp3 = null;
	
	private JPanel jPanel3 = null;
	private JPanel jPanel4 = null;
	private JMenuItem jMenuItem1 = null;
	private JSlider jSlider = null;
	private JPanel jPanel5 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JPanel jPanel6 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel18 = null;
	private JLabel jLabel20 = null;
	private JPanel jPanel7 = null;
	private JPanel jPanel8 = null;
	private JPanel jPanel9 = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JButton jButton2 = null;
	private JTextField jTextField = null;
	private JTextField jTextField1 = null;
	private JTextField jTextField2 = null;
	private JMenuItem jMenuItem2 = null;
	
	private File dir_corrente;
	private String nome_playlist;
	private String file_corrente;
	
	
	private JCheckBox jCheckBox = null;
	private JPanel jPanel10 = null;
	private JPanel jPanel11 = null;
	private JPanel jPanel12 = null;
	private JPanel jPanel13 = null;
	private JPanel jPanel14 = null;
	private JLabel jLabel16 = null;
	private JMenu jMenu2 = null;
	private JMenuItem jMenuItem3 = null;
	private JMenuItem jMenuItem4 = null;
	private JLabel jLabel19 = null;
	private JMenuItem jMenuItem5 = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel jPanel15 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel21 = null;
	private JPanel jPanel16 = null;
	private JPanel jPanel17 = null;
	
	private static Hashtable valoriInRow = new Hashtable();
	
	private JMenu jMenu3 = null;
	private JRadioButtonMenuItem jRadioButtonMenuItem = null;
	private JRadioButtonMenuItem jRadioButtonMenuItem1 = null;
	
	
	private JRadioButtonMenuItem jRadioButtonMenuItem2 = null;
	private JRadioButtonMenuItem jRadioButtonMenuItem3 = null;
	private JRadioButtonMenuItem jRadioButtonMenuItem4 = null;
	private JRadioButtonMenuItem jRadioButtonMenuItem5 = null;
	private JRadioButtonMenuItem jRadioButtonMenuItem6 = null;
	public XPlayer() {
		super();
		initialize();
	}
	
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();

		if(source==jRadioButtonMenuItem) {
			 try {
		        UIManager.setLookAndFeel(
		          "javax.swing.plaf.metal.MetalLookAndFeel");
		        
		        SwingUtilities.updateComponentTreeUI(this);
		        
		      }
		      catch (Exception e) {
		        System.out.println ("Couldn't load Metal L&F " + e);
		      }
		      

		}
		if(source==jRadioButtonMenuItem1) {
		    try {
		        UIManager.setLookAndFeel(
		          "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		        
		        SwingUtilities.updateComponentTreeUI(this);
		        
		      }
		      catch (Exception e) {
		        System.out.println ("Couldn't load Motif L&F " + e);
		      }

		}
		if(source==jRadioButtonMenuItem2) {
		    try {
		        UIManager.setLookAndFeel(
		          "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		        
		        SwingUtilities.updateComponentTreeUI(this);
		        
		      }
		      catch (Exception e) {
		        System.out.println ("Couldn't load Windows L&F " + e);
		      }

		}
		if(source==jRadioButtonMenuItem3) {
			
			System.out.println ("init gtk...");
			
		    try {
		        UIManager.setLookAndFeel(
		          "com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		        
		        SwingUtilities.updateComponentTreeUI(this);
		        
		      }
		      catch (Exception e) {
		        System.out.println ("Couldn't load GTK L&F " + e);
		      }

		}
		if(source==jRadioButtonMenuItem4) {
			
			System.out.println ("init synth...");
			
		    try {
		        UIManager.setLookAndFeel(
		          "javax.swing.plaf.synth.SynthLookAndFeel");
		        
		        SwingUtilities.updateComponentTreeUI(this);
		        
		      }
		      catch (Exception e) {
		        System.out.println ("Couldn't load Synth L&F " + e);
		      }

		}
		if(source==jRadioButtonMenuItem5) {
			
			System.out.println ("init basic...");
			
		    try {
		        UIManager.setLookAndFeel(
		          "javax.swing.plaf.basic.BasicLookAndFeel");
		        
		        SwingUtilities.updateComponentTreeUI(this);
		        
		      }
		      catch (Exception e) {
		        System.out.println ("Couldn't load Basic L&F " + e);
		      }

		}
		if(source==jRadioButtonMenuItem6) {
			
			System.out.println ("init tonic...");
			
		    try {
		        UIManager.setLookAndFeel(
		          "com.digitprop.tonic.TonicLookAndFeel");
		        
		        SwingUtilities.updateComponentTreeUI(this);
		        
		      }
		      catch (Exception e) {
		        System.out.println ("Couldn't load Tonic L&F " + e);
		      }

		}
		
	}
	
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		setTitle("JMediaX");
		setJMenuBar(getJJMenuBar());
		
		/* Routine per centrare e recuperare le dimensioni reali dello schermo
    	ed impostare di conseguenza le dimensioni dell'interfaccia */     
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int sh = dim.height;
		int sw = dim.width;
				
		// Dimensione della finestra,posizionamento nello schermo ed icona del JFrame		
		setSize(sw,sh-50);
		setContentPane(getJContentPane());
        setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		// Action Listener che chiude l'interfaccia	
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {	
			   JOptionPane jexit = new JOptionPane();
			   // Creazione di una finestra di conferma chiusura
			   int confirm = jexit.showOptionDialog(XPlayer.this,"Sei sicuro di voler uscire?","Conferma di uscita programma",
			   JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
			   // L'utente ha digitato Ok nella finestra di conferma
			   if (confirm==0) {
			   	dispose();	
			   	if(mp3!=null) {
			   		mp3.stop();
			   		mp3.deallocate();
			   	}
				System.exit(0);
			   }
			}
		});
	}
	
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private javax.swing.JPanel getJContentPane() {
		if(jContentPane == null) {
			jContentPane = new javax.swing.JPanel();
			jContentPane.setLayout(new java.awt.BorderLayout());
			jContentPane.setPreferredSize(new java.awt.Dimension(300,300));
			jContentPane.add(getJPanel7(), java.awt.BorderLayout.NORTH);
			jContentPane.add(getJPanel1(), java.awt.BorderLayout.CENTER);
			jContentPane.add(getJPanel2(), java.awt.BorderLayout.SOUTH);
		}
		return jContentPane;
	}
	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel3 = new JLabel();
			jLabel2 = new JLabel();
			jLabel1 = new JLabel();
			jLabel = new JLabel();
			java.awt.GridLayout gridLayout1 = new GridLayout();
			jPanel = new JPanel();
			jPanel.setLayout(gridLayout1);
			jPanel.setSize(500,50);
			jPanel.setPreferredSize(new java.awt.Dimension(10,45));
			gridLayout1.setRows(3);
			gridLayout1.setColumns(1);
			jLabel.setText("Rate:");
			jLabel.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel1.setText("");
			jLabel1.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel2.setText("Durata:");
			jLabel2.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel3.setText("");
			jLabel3.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
		
			
			jPanel.add(getJTextField(), null);
			jPanel.add(getJTextField1(), null);
			jPanel.add(getJTextField2(), null);
		}
		return jPanel;
	}
	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
	
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BorderLayout());
			jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white,5));
			jPanel1.add(getJPanel11(), java.awt.BorderLayout.CENTER);
			jPanel1.add(getJPanel6(), java.awt.BorderLayout.EAST);
			
			
		}
		return jPanel1;
	}
	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
			jPanel2.setSize(new java.awt.Dimension(500,40));
			jPanel2.setPreferredSize(new java.awt.Dimension(500,60));
			jPanel2.add(getJPanel4(), null);
			jPanel2.add(getJPanel3(), null);
			jPanel2.add(getJPanel5(), null);
		}
		return jPanel2;
	}
	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */    
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
			jJMenuBar.add(getJMenu2());
			jJMenuBar.add(getJMenu3());
		}
		return jJMenuBar;
	}
	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */    
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("File");
			jMenu.add(getJMenuItem());
			jMenu.add(getJMenuItem1());
		}	
			
		return jMenu;
	}
	/**
	 * This method initializes jMenu1	
	 * 	
	 * @return javax.swing.JMenu	
	 */    
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("Edit");
			jMenu1.add(getJMenuItem2());
		}
		return jMenu1;
	}
	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getJMenuItem() {
		if (jMenuItem == null) {
			jMenuItem = new JMenuItem();
			jMenuItem.setText("Apri");
			jMenuItem.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					
					System.out.println("Apertura new file: "+dir_corrente);
					if(mp3!=null) {
						System.out.println("MP3 diverso da null!");
						mp3.stop();
						mp3.deallocate();
						jPanel4.remove(controlComponent);
						jPanel4.validate();
					}
					
					if(dir_corrente!=null && !dir_corrente.getName().equals("")) {
						System.out.println("directory impostata.");
						file = new JFileChooser();
						file.setCurrentDirectory(dir_corrente);
						System.out.println("impostato file chooser.");
						
					}
					else {
						System.out.println("directory nn impostata.");
						file = new JFileChooser(".");
						System.out.println("impostato file chooser.");
					}
					
					
					file.setFileFilter(new Mp3Filter());
					file.setFileView(new Mp3FileIcon());
					
					System.out.println("apertura file chooser.");
					int status = file.showOpenDialog(XPlayer.this);
					System.out.println("file chooser aperto.");
					
					
					if(status== JFileChooser.APPROVE_OPTION) {
						
						//Arriviamo ad una situazione di realized
						try {
							URL url  = file.getSelectedFile().toURL();
							file_corrente = file.getSelectedFile().getCanonicalPath();

							
							
							//Creazione di un nuovo oggetto Mp3
							//L'Mp3 viene creato come RealizedPlayer
							mp3 = new Mp3PlayerX(url);
							

							Component controlComponentTemp = mp3.getComponenteControllo();
							
							if(controlComponentTemp!=null) {
								controlComponent = controlComponentTemp;
								
								//Setting del componente dei controlli media.
								jPanel4.add(controlComponentTemp);
								controlComponentTemp.setSize(500,40);
								jPanel4.validate();
								
								//Acquisizione delle ID3 info relative ad un media.
								MediaInfoHash temp = mp3.getInfoPlayer();
								jLabel3.setText((String)temp.get(MediaInfoHash.DURATA));
								jLabel1.setText((String)temp.get(MediaInfoHash.RATE));
								jLabel5.setText((String)temp.get(MediaInfoHash.LATENZA));
								jTextField2.setText((String)temp.get(MediaInfoHash.ALBUM));
								jTextField1.setText((String)temp.get(MediaInfoHash.TITOLO));
								jTextField.setText((String)temp.get(MediaInfoHash.AUTORE));
								
								if(jCheckBox.isSelected()) {
									jCheckBox.setSelected(false);
									jPanel10.validate();
								}
								
								Component gain = mp3.getGainComponent();
								if(gain!=null) {
									jPanel1.add(gain);
									jPanel1.validate();
								}	

								
								
							}
							
							else if(controlComponent!=null) {
								jPanel2.remove(controlComponent);
								jPanel2.validate();
							}
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
		}
		return jMenuItem;
	}
	/**
	 * This method initializes jPanel3	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jLabel5 = new JLabel();
			jLabel4 = new JLabel();
			java.awt.GridLayout gridLayout11 = new GridLayout();
			jPanel3 = new JPanel();
			jPanel3.setLayout(gridLayout11);
			jPanel3.setPreferredSize(new java.awt.Dimension(185,55));
			gridLayout11.setRows(3);
			gridLayout11.setColumns(2);
			jLabel4.setText("Gap apertura(max)");
			jLabel4.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel4.setPreferredSize(new java.awt.Dimension(105,14));
			jLabel5.setText("");
			jLabel5.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jPanel3.add(jLabel2, null);
			jPanel3.add(jLabel3, null);
			jPanel3.add(jLabel, null);
			jPanel3.add(jLabel1, null);
			jPanel3.add(jLabel4, null);
			jPanel3.add(jLabel5, null);
		}
		return jPanel3;
	}
	/**
	 * This method initializes jPanel4	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			java.awt.FlowLayout flowLayout2 = new FlowLayout();
			jPanel4 = new JPanel();
			jPanel4.setLayout(flowLayout2);
			jPanel4.setPreferredSize(new java.awt.Dimension(185,55));
			flowLayout2.setAlignment(java.awt.FlowLayout.LEFT);
		}
		return jPanel4;
	}
	/**
	 * This method initializes jMenuItem1	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem();
			jMenuItem1.setText("Esci");
		}
		return jMenuItem1;
	}
	/**
	 * This method initializes jSlider	
	 * 	
	 * @return javax.swing.JSlider	
	 */    
	private JSlider getJSlider() {
		if (jSlider == null) {
			jSlider = new JSlider();
			jSlider = new JSlider(JSlider.HORIZONTAL,0,5,0);
	  		jSlider.setMajorTickSpacing(5);
	  		jSlider.setMinorTickSpacing(1);
	  		jSlider.setPaintTicks(true);
	  		jSlider.setMinimum(1);
			jSlider.addChangeListener(new javax.swing.event.ChangeListener() { 
				public void stateChanged(javax.swing.event.ChangeEvent e) {    
					System.out.println("stateChanged()"); 
					
					int value = jSlider.getValue();
					
					System.out.println("value: "+value);
					
					Float rate = new Float(value);
					
					//Viene impostato un nuovo rate sul media.
					if(mp3!=null) {
						mp3.impostaRate(rate.floatValue());
						
						try {
							jLabel1.setText((String)mp3.getInfoPlayer().get(MediaInfoHash.RATE));
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
		}
		return jSlider;
	}
	/**
	 * This method initializes jPanel5	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jPanel5 = new JPanel();
			jPanel5.setLayout(new BorderLayout());
			jPanel5.setPreferredSize(new java.awt.Dimension(105,55));
			jPanel5.add(getJSlider(), java.awt.BorderLayout.NORTH);
		}
		return jPanel5;
	}
	/**
	 * This method initializes jPanel6	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel6() {
		if (jPanel6 == null) {
			jLabel15 = new JLabel();
			jLabel14 = new JLabel();
			jLabel13 = new JLabel();
			jLabel12 = new JLabel();
			jLabel11 = new JLabel();
			jLabel10 = new JLabel();
			jLabel8 = new JLabel();
			jLabel7 = new JLabel();
			jLabel6 = new JLabel();
			java.awt.GridLayout gridLayout12 = new GridLayout();
			jPanel6 = new JPanel();
			jPanel6.setLayout(gridLayout12);
			jPanel6.setPreferredSize(new java.awt.Dimension(100,10));
			gridLayout12.setRows(10);
			gridLayout12.setVgap(1);
			gridLayout12.setColumns(1);
			gridLayout12.setHgap(1);
			jLabel6.setText("add playlist");
			jLabel6.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel7.setText("");
			jLabel8.setText("");
			jLabel10.setText("");
			jLabel11.setText("");
			jLabel12.setText("");
			jLabel13.setText("");
			jLabel14.setText("");
			jLabel15.setText("");
			jPanel6.add(getJPanel10(), null);
			jPanel6.add(jLabel7, null);
			jPanel6.add(jLabel8, null);
			jPanel6.add(getJPanel15(), null);
			jPanel6.add(jLabel10, null);
			jPanel6.add(jLabel11, null);
			jPanel6.add(jLabel12, null);
			jPanel6.add(jLabel13, null);
			jPanel6.add(jLabel14, null);
			jPanel6.add(jLabel15, null);
		}
		return jPanel6;
	}
	/**
	 * This method initializes jPanel7	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel7() {
		if (jPanel7 == null) {
			jPanel7 = new JPanel();
			jPanel7.setLayout(new BorderLayout());
			jPanel7.setPreferredSize(new java.awt.Dimension(110,65));
			jPanel7.add(getJPanel8(), java.awt.BorderLayout.WEST);
			jPanel7.add(getJPanel(), java.awt.BorderLayout.CENTER);
			jPanel7.add(getJPanel9(), java.awt.BorderLayout.EAST);
		}
		return jPanel7;
	}
	/**
	 * This method initializes jPanel8	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel8() {
		if (jPanel8 == null) {
			java.awt.GridLayout gridLayout13 = new GridLayout();
			jPanel8 = new JPanel();
			jPanel8.setLayout(gridLayout13);
			gridLayout13.setRows(3);
			jPanel8.setPreferredSize(new java.awt.Dimension(50,42));
			jLabel20 = new JLabel();
			jLabel17 = new JLabel();
			jLabel18 = new JLabel();
			jLabel20.setText("  Artista");
			jLabel20.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel17.setText("  Titolo");
			jLabel18.setText("  Album");
			jLabel17.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel18.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jPanel8.add(jLabel20, null);
			jPanel8.add(jLabel17, null);
			jPanel8.add(jLabel18, null);
		}
		return jPanel8;
	}
	/**
	 * This method initializes jPanel9	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel9() {
		if (jPanel9 == null) {
			java.awt.GridLayout gridLayout2 = new GridLayout();
			jPanel9 = new JPanel();
			jPanel9.setLayout(gridLayout2);
			jPanel9.setPreferredSize(new java.awt.Dimension(75,10));
			gridLayout2.setRows(3);
			gridLayout2.setVgap(0);
			jPanel9.add(getJButton(), null);
			jPanel9.add(getJButton1(), null);
			jPanel9.add(getJButton2(), null);
		}
		return jPanel9;
	}
	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBorderPainted(false);
		//	jButton.setIcon(new ImageIcon(getClass().getResource("/images/edit.gif")));
			jButton.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					
					if(!jTextField.isEditable()) {
						jTextField.setEditable(true);
					}
					jTextField.requestFocus();
					
					
				}
			});
			jButton.setPreferredSize(new java.awt.Dimension(50,17));
		}
		return jButton;
	}
	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBorderPainted(false);
			jButton1.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					
					if(!jTextField1.isEditable()) {
						jTextField1.setEditable(true);
					}
					jTextField1.requestFocus();
				}
			});
		//	jButton1.setIcon(new ImageIcon(getClass().getResource("/images/edit.gif")));
			jButton1.setPreferredSize(new java.awt.Dimension(50,17));
		}
		return jButton1;
	}
	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setBorderPainted(false);
		//	jButton2.setIcon(new ImageIcon(getClass().getResource("/images/edit.gif")));
			jButton2.setPreferredSize(new java.awt.Dimension(50,17));
			jButton2.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					
					if(!jTextField2.isEditable()) {
						jTextField2.setEditable(true);
					}
					jTextField2.requestFocus();
				}
			});
		}
		return jButton2;
	}
	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setEditable(false);
		}
		return jTextField;
	}
	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setEditable(false);
		}
		return jTextField1;
	}
	/**
	 * This method initializes jTextField2	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setEditable(false);
		}
		return jTextField2;
	}
	/**
	 * This method initializes jMenuItem2	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getJMenuItem2() {
		if (jMenuItem2 == null) {
			jMenuItem2 = new JMenuItem();
			jMenuItem2.setText("Directory predefinita");
			jMenuItem2.addActionListener(new java.awt.event.ActionListener() { 
				
				//ActionListener adibito a settare la directory Preferita.
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					file = new JFileChooser();
					file.setFileFilter(new DirectoryFilter());
					file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

					
					int status = file.showOpenDialog(XPlayer.this);
					if(status== JFileChooser.APPROVE_OPTION) {
						dir_corrente  = file.getSelectedFile();
					}
					try {
						jLabel16.setText(dir_corrente.getCanonicalPath());
					}
					catch(IOException ex) {
						ex.printStackTrace();
					}
				}
		});
	   }		
	  
		return jMenuItem2;
	  
	}		


	/**
	 * This method initializes jCheckBox	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */    
	private JCheckBox getJCheckBox() {
		if (jCheckBox == null) {
			jCheckBox = new JCheckBox();
			jCheckBox.addActionListener(new java.awt.event.ActionListener() { 
				
				//ActionListener adibito ad inserire un nuovo media nella playlist.
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					if(jCheckBox.isSelected()) {
						if(nome_playlist!=null && file_corrente!=null) {
							System.out.println(nome_playlist);
							System.out.println(file_corrente);
							try {
								//Inseriemento nuova_traccia
								ID3TracciaVao id3 = new ID3TracciaVao();
								if(jTextField.getText()!=null && !jTextField.getText().equals("")) {
									id3.setArtista(jTextField.getText());
								}
								if(jTextField1.getText()!=null && !jTextField1.getText().equals("")) {
									id3.setTitolo(jTextField1.getText());
								}
								if(jTextField2.getText()!=null && !jTextField2.getText().equals("")) {
									id3.setAlbum(jTextField2.getText());
								}
								if(jLabel3.getText()!=null && !jLabel3.getText().equals("")) {
									id3.setDurata(jLabel3.getText());
								}
								
								//Thread che inserisce una nuova traccia nella playlist.
								PlaylistAddHandler plist = new PlaylistAddHandler(nome_playlist,file_corrente,id3,jTable,jPanel11);
								plist.start();
								
								
							}
							catch(Exception ex) {
								ex.printStackTrace();
							}
						}
					}	
							
				}
			});
			
		}
		return jCheckBox;
	}
	/**
	 * This method initializes jPanel10	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel10() {
		if (jPanel10 == null) {
			jPanel10 = new JPanel();
			jPanel10.setLayout(new BorderLayout());
			jPanel10.add(getJCheckBox(), java.awt.BorderLayout.WEST);
			jPanel10.add(jLabel6, java.awt.BorderLayout.CENTER);
		}
		return jPanel10;
	}
	/**
	 * This method initializes jPanel11	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel11() {
		if (jPanel11 == null) {
			jPanel11 = new JPanel();
			jPanel11.setLayout(new BorderLayout());
			jPanel11.add(getJPanel12(), java.awt.BorderLayout.NORTH);
			jPanel11.add(getJPanel14(), java.awt.BorderLayout.SOUTH);
			jPanel11.add(getJTabbedPane(), java.awt.BorderLayout.CENTER);
			
		}
		return jPanel11;
	}
	/**
	 * This method initializes jPanel12	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel12() {
		if (jPanel12 == null) {
			jLabel21 = new JLabel();
			jLabel9 = new JLabel();
			jLabel19 = new JLabel();
			jLabel16 = new JLabel();
			jPanel12 = new JPanel();
			jPanel12.setLayout(new BorderLayout());
			jPanel12.setPreferredSize(new java.awt.Dimension(10,70));
			jLabel16.setText("");
			jLabel16.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel16.setToolTipText("Directory predefinita");
			jLabel19.setText("");
			jLabel19.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel9.setText("  Playlist selezionata");
			jLabel9.setSize(new java.awt.Dimension(35,14));
			jLabel9.setPreferredSize(new java.awt.Dimension(35,14));
			jLabel9.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jLabel21.setText("  Directory predefinita");
			jLabel21.setPreferredSize(new java.awt.Dimension(35,14));
			jLabel21.setSize(new java.awt.Dimension(35,14));
			jLabel21.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			jPanel12.add(getJPanel16(), java.awt.BorderLayout.WEST);
			jPanel12.add(getJPanel17(), java.awt.BorderLayout.CENTER);
		}
		return jPanel12;
	}
	/**
	 * This method initializes jPanel13	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel13() {
		if (jPanel13 == null) {
			jPanel13 = new JPanel();
		}
		return jPanel13;
	}
	/**
	 * This method initializes jPanel14	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel14() {
		if (jPanel14 == null) {
			jPanel14 = new JPanel();
		}
		return jPanel14;
	}
	/**
	 * This method initializes jMenu2	
	 * 	
	 * @return javax.swing.JMenu	
	 */    
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("Playlist");
			jMenu2.add(getJMenuItem3());
			jMenu2.add(getJMenuItem4());
			jMenu2.add(getJMenuItem5());
		}
		return jMenu2;
	}
	/**
	 * This method initializes jMenuItem3	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getJMenuItem3() {
		if (jMenuItem3 == null) {
			jMenuItem3 = new JMenuItem();
			jMenuItem3.setText("Crea playlist");
			jMenuItem3.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					nome_playlist = JOptionPane.showInputDialog(XPlayer.this,"Nome della playlist","Creazione playlist",JOptionPane.PLAIN_MESSAGE);
					if(nome_playlist!=null) {
						try {
							PlaylistHandler handler = new PlaylistHandler(nome_playlist);
							handler.start();
					
							jLabel19.setText(nome_playlist);
							
						}
						catch(Exception ex) {
							jLabel19.setText("Impossibile creare playlist!");
							ex.printStackTrace();
						}
					}
				}
			});
		}
		return jMenuItem3;
	}
	/**
	 * This method initializes jMenuItem4	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getJMenuItem4() {
		if (jMenuItem4 == null) {
			jMenuItem4 = new JMenuItem();
			jMenuItem4.setText("Collega playlist");
			jMenuItem4.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					if(nome_playlist==null) {
						file = new JFileChooser();
						file.setFileFilter(new XmlFilter());
						
						int status = file.showOpenDialog(XPlayer.this);
						if(status== JFileChooser.APPROVE_OPTION) {
							nome_playlist  = file.getSelectedFile().getName();
							jLabel19.setText(nome_playlist);
						}
						
					}
					else {
						int selection = JOptionPane.showConfirmDialog(XPlayer.this,"Vuoi cambiare playlist?","Collega playlist",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
						if(selection == JOptionPane.YES_OPTION) {
							file = new JFileChooser();
							file.setFileFilter(new XmlFilter());
							
							int status = file.showOpenDialog(XPlayer.this);
							if(status== JFileChooser.APPROVE_OPTION) {
								nome_playlist  = file.getSelectedFile().getName();
								jLabel19.setText(nome_playlist);
							}
							
						}
					}
					jMenuItem5.setEnabled(true);
					
					//Impostare il table
					try {
						
						Vector lista = BusinessDelegateGetPlaylist.recuperaPlaylist(nome_playlist);
						
						//Salvataggio dell'array in un hashtable
						Enumeration en = lista.elements();
						while(en.hasMoreElements()) {
							ID3TracciaVao vao = (ID3TracciaVao)en.nextElement();
							String indice = vao.getIndice();
							valoriInRow.put(indice,vao);
						}

						modello = new ID3TableModel(lista.size(),4,lista);
						jTable = new JTable(modello);
						
						
						
						
						//Aggiunta di un listener di doppio click.
						jTable.addMouseListener(new MouseInputAdapter() {
							public void mouseClicked(java.awt.event.MouseEvent evt) {
								if(evt.getClickCount() == 1) {
									int row = jTable.rowAtPoint(evt.getPoint());
									ID3TracciaVao temp = (ID3TracciaVao)valoriInRow.get(new Integer(row).toString());
									System.out.println("click su riga: "+row+" elemento: "+temp);
									
								    String message = UtilityConversioni.tracciaFormatDialog(temp);
								    JOptionPane pane = new JOptionPane();
								    pane.setIcon(new ImageIcon("images/mp3.gif"));
								    pane.showMessageDialog(XPlayer.this,message,temp.getTitolo(),JOptionPane.PLAIN_MESSAGE);
								}
							}
						});

						jTable.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
						jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
						jTable.setShowGrid(true);
						jTable.setRowMargin(3);
						jTable.setToolTipText("elenco id3 tracks");
						jTable.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
						
						//Dimensioni colonne su un massimo di 700
						TableColumnModel cmodel = jTable.getColumnModel();
						TableColumn colonna = cmodel.getColumn(ID3TableModel.COL_TITOLO);
						colonna.setPreferredWidth(250);
						
						TableColumn colonna2 = cmodel.getColumn(ID3TableModel.COL_ARTISTA);
						colonna2.setPreferredWidth(150);
						
						TableColumn colonna3 = cmodel.getColumn(ID3TableModel.COL_ALBUM);
						colonna3.setPreferredWidth(200);
						
						TableColumn colonna4 = cmodel.getColumn(ID3TableModel.COL_DURATA);
						colonna4.setPreferredWidth(100);
				
						JScrollPane scroll = new JScrollPane(jTable);
					
						//Aggiunta al tab
						jTabbedPane.add("Playlist",scroll);
						
						
						//jTabbedPane.addTab("Playlist",null);
						jPanel11.validate();
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		}
		return jMenuItem4;
	}
	/**
	 * This method initializes jMenuItem5	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getJMenuItem5() {
		if (jMenuItem5 == null) {
			jMenuItem5 = new JMenuItem();
			jMenuItem5.setText("Esplora playlist");
			jMenuItem5.setEnabled(false);
			jMenuItem5.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					jTabbedPane.addTab("Playlist",null);
				}
			});
		}
		return jMenuItem5;
	}
	/**
	 * This method initializes jTabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */    
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
		}
		return jTabbedPane;
	}
	/**
	 * This method initializes jPanel15	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel15() {
		if (jPanel15 == null) {
			jPanel15 = new JPanel();
		}
		return jPanel15;
	}
	/**
	 * This method initializes jPanel16	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel16() {
		if (jPanel16 == null) {
			java.awt.GridLayout gridLayout14 = new GridLayout();
			jPanel16 = new JPanel();
			jPanel16.setPreferredSize(new java.awt.Dimension(110,42));
			jPanel16.setLayout(gridLayout14);
			gridLayout14.setRows(2);
			jPanel16.add(jLabel9, null);
			jPanel16.add(jLabel21, null);
		}
		return jPanel16;
	}
	/**
	 * This method initializes jPanel17	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getJPanel17() {
		if (jPanel17 == null) {
			java.awt.GridLayout gridLayout15 = new GridLayout();
			jPanel17 = new JPanel();
			jPanel17.setLayout(gridLayout15);
			gridLayout15.setRows(2);
			jPanel17.add(jLabel19, null);
			jPanel17.add(jLabel16, null);
		}
		return jPanel17;
	}
	/**
	 * This method initializes jMenu3	
	 * 	
	 * @return javax.swing.JMenu	
	 */    
	private JMenu getJMenu3() {
		if (jMenu3 == null) {
			jMenu3 = new JMenu();
			jMenu3.setText("Effetti");
			ButtonGroup gruppo = new ButtonGroup();
			jMenu3.add(getJRadioButtonMenuItem());
			jMenu3.add(getJRadioButtonMenuItem1());
			jMenu3.add(getJRadioButtonMenuItem2());
			jMenu3.add(getJRadioButtonMenuItem3());
			jMenu3.add(getJRadioButtonMenuItem4());
			jMenu3.add(getJRadioButtonMenuItem5());
			jMenu3.add(getJRadioButtonMenuItem6());
			
			gruppo.add(getJRadioButtonMenuItem());
			gruppo.add(getJRadioButtonMenuItem1());
			gruppo.add(getJRadioButtonMenuItem2());
			gruppo.add(getJRadioButtonMenuItem3());
			gruppo.add(getJRadioButtonMenuItem4());
			gruppo.add(getJRadioButtonMenuItem5());
			gruppo.add(getJRadioButtonMenuItem6());
			
			
		}
		return jMenu3;
	}
	/**
	 * This method initializes jRadioButtonMenuItem	
	 * 	
	 * @return javax.swing.JRadioButtonMenuItem	
	 */    
	private JRadioButtonMenuItem getJRadioButtonMenuItem() {
		if (jRadioButtonMenuItem == null) {
			jRadioButtonMenuItem = new JRadioButtonMenuItem();
			jRadioButtonMenuItem.setText("classic");
			jRadioButtonMenuItem.addActionListener(this);
		}
		return jRadioButtonMenuItem;
	}
	/**
	 * This method initializes jRadioButtonMenuItem1	
	 * 	
	 * @return javax.swing.JRadioButtonMenuItem	
	 */    
	private JRadioButtonMenuItem getJRadioButtonMenuItem1() {
		if (jRadioButtonMenuItem1 == null) {
			jRadioButtonMenuItem1 = new JRadioButtonMenuItem();
			jRadioButtonMenuItem1.setText("motif");
			jRadioButtonMenuItem1.addActionListener(this);
		
		}
		return jRadioButtonMenuItem1;
	}
	
	
	/**
	 * This method initializes jRadioButtonMenuItem2	
	 * 	
	 * @return javax.swing.JRadioButtonMenuItem	
	 */    
	private JRadioButtonMenuItem getJRadioButtonMenuItem2() {
		if (jRadioButtonMenuItem2 == null) {
			jRadioButtonMenuItem2 = new JRadioButtonMenuItem();
			jRadioButtonMenuItem2.setText("windows");
			jRadioButtonMenuItem2.addActionListener(this);
		}
		return jRadioButtonMenuItem2;
	}
	/**
	 * This method initializes jRadioButtonMenuItem3	
	 * 	
	 * @return javax.swing.JRadioButtonMenuItem	
	 */    
	private JRadioButtonMenuItem getJRadioButtonMenuItem3() {
		if (jRadioButtonMenuItem3 == null) {
			jRadioButtonMenuItem3 = new JRadioButtonMenuItem();
			jRadioButtonMenuItem3.setText("gtk");
			jRadioButtonMenuItem3.addActionListener(this);
		}
		return jRadioButtonMenuItem3;
	}
	/**
	 * This method initializes jRadioButtonMenuItem4	
	 * 	
	 * @return javax.swing.JRadioButtonMenuItem	
	 */    
	private JRadioButtonMenuItem getJRadioButtonMenuItem4() {
		if (jRadioButtonMenuItem4 == null) {
			jRadioButtonMenuItem4 = new JRadioButtonMenuItem();
			jRadioButtonMenuItem4.setText("synth");
			jRadioButtonMenuItem4.addActionListener(this);
		}
		return jRadioButtonMenuItem4;
	}
	/**
	 * This method initializes jRadioButtonMenuItem5	
	 * 	
	 * @return javax.swing.JRadioButtonMenuItem	
	 */    
	private JRadioButtonMenuItem getJRadioButtonMenuItem5() {
		if (jRadioButtonMenuItem5 == null) {
			jRadioButtonMenuItem5 = new JRadioButtonMenuItem();
			jRadioButtonMenuItem5.setText("basic");
			jRadioButtonMenuItem5.addActionListener(this);
		}
		return jRadioButtonMenuItem5;
	}
	/**
	 * This method initializes jRadioButtonMenuItem6	
	 * 	
	 * @return javax.swing.JRadioButtonMenuItem	
	 */    
	private JRadioButtonMenuItem getJRadioButtonMenuItem6() {
		if (jRadioButtonMenuItem6 == null) {
			jRadioButtonMenuItem6 = new JRadioButtonMenuItem();
			jRadioButtonMenuItem6.setText("tonic");
			jRadioButtonMenuItem6.addActionListener(this);
		}
		return jRadioButtonMenuItem6;
	}
       }  //  @jve:decl-index=0:visual-constraint="10,10"


