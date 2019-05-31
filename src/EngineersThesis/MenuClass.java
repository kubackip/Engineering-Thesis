package EngineersThesis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuClass extends JDialog 
{
	private MainWindow mw;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private MainClass mc;
	private PictogramWindowPL pwPL;
	
	private boolean DarkTheme = false;
	private boolean IceTheme = false;
	private boolean WarmTheme = false;
	private boolean Clear = false;
	private boolean wlaczPierwszaKlase = false;
	private boolean wlaczDrugaKlase = false;
	
	private boolean SendMSG = false;
	/**
	 * Create the dialog.
	 */
	public MenuClass(JFrame f) 
	{
		super(f,"",true);
		setUndecorated(true);
		setBounds(740, 400, 300, 480);
		Clear = false;
		
		JPanel ContentPane = new JPanel();
		ContentPane.setBackground(new Color(210, 180, 140));
		ContentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		ContentPane.setBounds(0, 0, 300, 480);
		getContentPane().add(ContentPane);
		ContentPane.setLayout(null);
		
		JButton btnChangeToPictogram = new JButton("Change to Pictogram Drawer");
		btnChangeToPictogram.setMnemonic(KeyEvent.VK_NUMPAD5);
		btnChangeToPictogram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				mw = new MainWindow();
				mw.setVisible(true);
				dispose();
				wlaczPierwszaKlase = true;
				wlaczDrugaKlase = true;
				
			}
		});
		btnChangeToPictogram.setBackground(new Color(255, 255, 224));
		btnChangeToPictogram.setIcon(new ImageIcon("img\\MenuGUI\\Draw.png"));
		btnChangeToPictogram.setBounds(10, 113, 280, 60);
		ContentPane.add(btnChangeToPictogram);
		
		JLabel ChooseTheLanguageLabel = new JLabel("Choose the Language");
		ChooseTheLanguageLabel.setFont(new Font("Rockwell", Font.PLAIN, 12));
		ChooseTheLanguageLabel.setBounds(89, 184, 122, 29);
		ContentPane.add(ChooseTheLanguageLabel);
		
		JButton EnglishButton = new JButton("English");
		EnglishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				wlaczPierwszaKlase = true;
				wlaczDrugaKlase = false;
				mc = new MainClass();
				mc.main(null);
				dispose();
			}
		});
		EnglishButton.setBackground(new Color(255, 255, 224));
		EnglishButton.setFont(new Font("Rockwell", Font.PLAIN, 12));
		EnglishButton.setIcon(new ImageIcon("img\\MenuGUI\\Great Britain.png"));
		EnglishButton.setBounds(21, 224, 109, 29);
		ContentPane.add(EnglishButton);
		
		JButton PolishButton = new JButton("Polish");
		PolishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				wlaczDrugaKlase = false;
				wlaczPierwszaKlase = true;
				pwPL = new PictogramWindowPL();
				pwPL.setVisible(true);
				dispose();
			}
		});
		PolishButton.setBackground(new Color(255, 255, 224));
		PolishButton.setFont(new Font("Rockwell", Font.PLAIN, 12));
		PolishButton.setIcon(new ImageIcon("img\\MenuGUI\\Poland.png"));
		PolishButton.setBounds(169, 224, 109, 29);
		ContentPane.add(PolishButton);
		
		JLabel lblChooseTheTheme = new JLabel("Choose the Theme");
		lblChooseTheTheme.setFont(new Font("Rockwell", Font.PLAIN, 12));
		lblChooseTheTheme.setBounds(98, 264, 132, 29);
		ContentPane.add(lblChooseTheTheme);
		
		JRadioButton DarkThemeRButton = new JRadioButton("Dark");
		DarkThemeRButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 DarkTheme = true;
				 IceTheme = false;
				 WarmTheme = false;
			}
		});
		DarkThemeRButton.setBackground(new Color(210, 180, 140));
		DarkThemeRButton.setFont(new Font("Rockwell", Font.PLAIN, 12));
		DarkThemeRButton.setSelected(true);
		buttonGroup.add(DarkThemeRButton);
		DarkThemeRButton.setBounds(34, 300, 76, 23);
		ContentPane.add(DarkThemeRButton);
		
		JRadioButton IceThemeRButton = new JRadioButton("Ice");
		IceThemeRButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				IceTheme = true;
				DarkTheme = false;
				WarmTheme = false;
			}
		});
		IceThemeRButton.setBackground(new Color(210, 180, 140));
		IceThemeRButton.setFont(new Font("Rockwell", Font.PLAIN, 12));
		buttonGroup.add(IceThemeRButton);
		IceThemeRButton.setBounds(129, 300, 49, 23);
		ContentPane.add(IceThemeRButton);
		
		JRadioButton WarmThemeRButton = new JRadioButton("Warm");
		WarmThemeRButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				WarmTheme = true;
				DarkTheme = false;
				IceTheme = false;
			}
		});
		WarmThemeRButton.setBackground(new Color(210, 180, 140));
		WarmThemeRButton.setFont(new Font("Rockwell", Font.PLAIN, 12));
		buttonGroup.add(WarmThemeRButton);
		WarmThemeRButton.setBounds(212, 300, 62, 23);
		ContentPane.add(WarmThemeRButton);
		
		JButton btnSend = new JButton("Send");
		btnSend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				SendMSG = true;
			}
		});
		btnSend.setBackground(new Color(255, 255, 224));
		btnSend.setIcon(new ImageIcon("img\\MenuGUI\\Send.png"));
		btnSend.setBounds(10, 11, 280, 60);
		ContentPane.add(btnSend);
		
		JButton btnClearSentence = new JButton("Clear");
		btnClearSentence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Clear = true;
				dispose();
			}
		});
		btnClearSentence.setBackground(new Color(255, 255, 224));
		btnClearSentence.setIcon(new ImageIcon("img\\MenuGUI\\Clear.png"));
		btnClearSentence.setFont(new Font("Rockwell", Font.PLAIN, 12));
		btnClearSentence.setBounds(10, 330, 280, 60);
		btnClearSentence.setFocusable(false);
		ContentPane.add(btnClearSentence);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
			}
		});
		btnClose.setBackground(new Color(255, 255, 224));
		btnClose.setIcon(new ImageIcon("img\\MenuGUI\\Close.png"));
		btnClose.setFont(new Font("Rockwell", Font.PLAIN, 12));
		btnClose.setBounds(10, 401, 280, 60);
		btnClose.setFocusable(false);
		ContentPane.add(btnClose);
	}
	
	public boolean setClear()
	{
		return Clear;
	}
	
	public boolean setDark()
	{
		return DarkTheme;
	}
	
	public boolean setIce()
	{
		return IceTheme;
	}
	
	public boolean setWarm()
	{
		return WarmTheme;
	}
	
	public boolean openWindowEN()
	{
		return wlaczPierwszaKlase;
	}
	
	public boolean openWindowPL()
	{
		return wlaczDrugaKlase;
	}
	
	public boolean msgSendt()
	{
		return SendMSG;
	}
}

