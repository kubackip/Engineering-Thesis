package EngineersThesis;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import java.awt.Toolkit;

public class MainWindow extends JFrame implements KeyListener
{
	public JPanel contentPane;
	public MWDialog1 mwd1;
	public MWDialog2 mwd2;
	public MWDialog3 mwd3;
	public MWDialog4 mwd4;
	public MWDialog5 mwd5;
	public MWDialog6 mwd6;
	public MWDialog7 mwd7;
	public MWDialog8 mwd8;
	public MWDialog9 mwd9;
	public MWDialog10 mwd10;
	public MWDialog11 mwd11;
	public MenuCodes mc;
	
	public int allBricksValue = 0;
	public int howManyBricks = 0;
	
	private int button1_value = -1;
	private int button2_value = -2;
	private int button3_value = -3;
	private int button4_value = -4;
	private int button5_value = -5;
	private int button6_value = -6;
	private int button7_value = -7;
	private int button8_value = -8;
	private int button9_value = -9;
	
	
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button6;
	private JButton Button7;
	private JButton Button5;
	private JButton Button8;
	private JButton Button9;
	
	private JPanel panelButtons;
	private JPanel showPictPanel;
	
	private JLabel FirstPictogram;
	private JLabel SecPictogram;
	private JLabel ThirdPictogram;
	private JLabel FourthPictogram;
	private JLabel FifthPictogram;
	private JLabel SixthPictogram;
	
	private boolean FirstPictogram_fill = false;
	private boolean SecPictogram_fill = false;
	private boolean ThirdPictogram_fill = false;
	private boolean FourthPictogram_fill = false;
	private boolean FifthPictogram_fill = false;
	private boolean SixthPictogram_fill = false;
	
	private ImageIcon apple = new ImageIcon("img\\PictogramDrawer\\Apple.png");
	private ImageIcon bathroom = new ImageIcon("img\\PictogramDrawer\\bathroom.png");
	private ImageIcon book = new ImageIcon("img\\PictogramDrawer\\book.png");
	private ImageIcon water = new ImageIcon("img\\PictogramDrawer\\Water.png");
	private ImageIcon boy = new ImageIcon("img\\PictogramDrawer\\boy.png");
	private ImageIcon cat = new ImageIcon("img\\PictogramDrawer\\cat.png");
	private ImageIcon clothes = new ImageIcon("img\\PictogramDrawer\\clothes.png");
	private ImageIcon computer = new ImageIcon("img\\PictogramDrawer\\computer.png");
	private ImageIcon dog = new ImageIcon("img\\PictogramDrawer\\dog.png");
	private ImageIcon family = new ImageIcon("img\\PictogramDrawer\\family.png");
	private ImageIcon father = new ImageIcon("img\\PictogramDrawer\\father.png");
	private ImageIcon food = new ImageIcon("img\\PictogramDrawer\\food.png");
	private ImageIcon girl = new ImageIcon("img\\PictogramDrawer\\girl.png");
	private ImageIcon grandma = new ImageIcon("img\\PictogramDrawer\\Grandma.png");
	private ImageIcon grandpa = new ImageIcon("img\\PictogramDrawer\\Grandpa.png");
	private ImageIcon happy = new ImageIcon("img\\PictogramDrawer\\happy.png");
	private ImageIcon heart = new ImageIcon("img\\PictogramDrawer\\heart.png");
	private ImageIcon mother = new ImageIcon("img\\PictogramDrawer\\mother.png");
	private ImageIcon sad = new ImageIcon("img\\PictogramDrawer\\Sad.png");
	private ImageIcon sleep = new ImageIcon("img\\PictogramDrawer\\Sleep.png");
	private ImageIcon sweets = new ImageIcon("img\\PictogramDrawer\\sweets.png");
	private ImageIcon teddy = new ImageIcon("img\\PictogramDrawer\\Teddy.png");
	private ImageIcon telephone = new ImageIcon("img\\PictogramDrawer\\telephone.png");
	private ImageIcon toilet = new ImageIcon("img\\PictogramDrawer\\toilet.png");
	private ImageIcon tv = new ImageIcon("img\\PictogramDrawer\\tv.png");
	
	private String string = " ";
	private JTextArea textArea;
		
	
	/**
	 * Create the frame.
	 */
	public MainWindow() 
	{
		
		initialize();
	}
	
	public void initialize()
	{
				
		setTitle("Oprogramowanie wspomagaj\u0105ce komunikacj\u0119 z dzie\u0107mi z pora\u017Ceniem m\u00F3zgowym");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\Sloth.png"));
		setResizable(false);
		//setUndecorated(true);
		setBounds(100, 100, 705, 749);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.focus"));
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelButtons = new JPanel();
		panelButtons.setBackground(new Color(46, 139, 87));
		panelButtons.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelButtons.setBounds(107, 12, 475, 475);
		contentPane.add(panelButtons);
		panelButtons.setLayout(null);
				
		
		Button1 = new JButton();
		Button1.setFocusTraversalPolicyProvider(true);
		Button1.setFocusCycleRoot(true);
		Button1.setBackground(Color.WHITE);
		Button1.setBounds(12, 12, 141, 141);
		Button1.addKeyListener(this);
		panelButtons.add(Button1);
		
		
		Button2 = new JButton("");
		Button2.setFocusTraversalPolicyProvider(true);
		Button2.setFocusCycleRoot(true);
		Button2.setBackground(Color.WHITE);
		Button2.setBounds(165, 12, 141, 141);
		Button2.addKeyListener(this);
		panelButtons.add(Button2);
		
		
		
		Button3 = new JButton("");
		Button3.setBackground(Color.WHITE);
		Button3.setBounds(318, 12, 141, 141);
		Button3.addKeyListener(this);
		panelButtons.add(Button3);
		
		
		
		Button4 = new JButton("");
		Button4.setBackground(Color.WHITE);
		Button4.setBounds(12, 165, 141, 141);
		Button4.addKeyListener(this);
		panelButtons.add(Button4);
		
		
		
		Button5 = new JButton("");
		Button5.setBackground(Color.WHITE);
		Button5.setBounds(165, 165, 141, 141);
		Button5.addKeyListener(this);
		panelButtons.add(Button5);
		
		Button8 = new JButton("");
		Button8.setBackground(Color.WHITE);
		Button8.setBounds(165, 318, 141, 141);
		Button8.addKeyListener(this);
		panelButtons.add(Button8);
		
		Button6 = new JButton("");
		Button6.setBounds(318, 165, 141, 141);
		panelButtons.add(Button6);
		Button6.addKeyListener(this);
		Button6.setBackground(Color.WHITE);
		
		Button7 = new JButton("");
		Button7.setBounds(12, 318, 141, 141);
		panelButtons.add(Button7);
		Button7.addKeyListener(this);
		Button7.setBackground(Color.WHITE);
		
		
		Button9 = new JButton("");
		Button9.setBackground(Color.WHITE);
		Button9.setBounds(318, 318, 141, 141);
		Button9.addKeyListener(this);
		panelButtons.add(Button9);
		
		showPictPanel = new JPanel();
		showPictPanel.setBackground(new Color(46, 139, 87));
		showPictPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		showPictPanel.setBounds(12, 508, 674, 121);
		contentPane.add(showPictPanel);
		showPictPanel.setLayout(null);
		
		FirstPictogram = new JLabel("");
		FirstPictogram.setBounds(12, 12, 95, 95);
		showPictPanel.add(FirstPictogram);
		
		SecPictogram = new JLabel("");
		SecPictogram.setBounds(119, 12, 95, 95);
		showPictPanel.add(SecPictogram);
		
		ThirdPictogram = new JLabel("");
		ThirdPictogram.setBounds(226, 12, 95, 95);
		showPictPanel.add(ThirdPictogram);
		
		FourthPictogram = new JLabel("");
		FourthPictogram.setBounds(333, 12, 95, 95);
		showPictPanel.add(FourthPictogram);
		
		FifthPictogram = new JLabel("");
		FifthPictogram.setBounds(440, 12, 95, 95);
		showPictPanel.add(FifthPictogram);
		
		SixthPictogram = new JLabel("");
		SixthPictogram.setBounds(558, 12, 95, 95);
		showPictPanel.add(SixthPictogram);
		
		textArea = new JTextArea();
		textArea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textArea.setBackground(new Color(0, 128, 128));
		textArea.setBounds(12, 647, 674, 50);
		textArea.setFont(textArea.getFont().deriveFont(32f));
		contentPane.add(textArea);
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		// TODO Auto-generated method stub
		int keyCode = e.getKeyCode();
		
		if (keyCode == KeyEvent.VK_NUMPAD7 && button1_value == -1)
		{
			Button1.setBackground(Color.darkGray);
			button1_value = -button1_value;
			allBricksValue += button1_value;
			howManyBricks++;
		}
		
		else if (keyCode == KeyEvent.VK_NUMPAD7 && button1_value == 1)
		{
			Button1.setBackground(Color.white);
			button1_value = -button1_value;
			allBricksValue += button1_value;
			howManyBricks--;
		}
		
		else if (keyCode == KeyEvent.VK_NUMPAD8 && button2_value == -2)
		{
			Button2.setBackground(Color.darkGray);
			button2_value = -button2_value;
			allBricksValue += button2_value;
			howManyBricks++;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD8 && button2_value == 2)
		{
			Button2.setBackground(Color.white);
			button2_value = -button2_value;
			allBricksValue += button2_value;
			howManyBricks--;
		}
		
		else if (keyCode == KeyEvent.VK_NUMPAD9 && button3_value == -3)
		{
			Button3.setBackground(Color.darkGray);
			button3_value = -button3_value;
			allBricksValue += button3_value;
			howManyBricks++;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD9 && button3_value == 3)
		{
			Button3.setBackground(Color.white);
			button3_value = -button3_value;
			allBricksValue += button3_value;
			howManyBricks--;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD4 && button4_value == -4)
		{
			Button4.setBackground(Color.darkGray);
			button4_value = -button4_value;
			allBricksValue += button4_value;
			howManyBricks++;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD4 && button4_value == 4)
		{
			Button4.setBackground(Color.white);
			button4_value = -button4_value;
			allBricksValue += button4_value;
			howManyBricks--;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD5 && button5_value == -5)
		{
			Button5.setBackground(Color.darkGray);
			button5_value = -button5_value;
			allBricksValue += button5_value;
			howManyBricks++;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD5 && button5_value == 5)
		{
			Button5.setBackground(Color.white);
			button5_value = -button5_value;
			allBricksValue += button5_value;
			howManyBricks--;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD6 && button6_value == -6)
		{
			Button6.setBackground(Color.darkGray);
			button6_value = -button6_value;
			allBricksValue += button6_value;
			howManyBricks++;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD6 && button6_value == 6)
		{
			Button6.setBackground(Color.white);
			button6_value = -button6_value;
			allBricksValue += button6_value;
			howManyBricks--;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD1 && button7_value == -7)
		{
			Button7.setBackground(Color.darkGray);
			button7_value = -button7_value;
			allBricksValue += button7_value;
			howManyBricks++;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD1 && button7_value == 7)
		{
			Button7.setBackground(Color.white);
			button7_value = -button7_value;
			allBricksValue += button7_value;
			howManyBricks--;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD2 && button8_value == -8)
		{
			Button8.setBackground(Color.darkGray);
			button8_value = -button8_value;
			allBricksValue += button8_value;
			howManyBricks++;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD2 && button8_value == 8)
		{
			Button8.setBackground(Color.white);
			button8_value = -button8_value;
			allBricksValue += button8_value;
			howManyBricks--;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD3 && button9_value == -9)
		{
			Button9.setBackground(Color.darkGray);
			button9_value = -button9_value;
			allBricksValue += button9_value;
			howManyBricks++;
		}
		else if (keyCode == KeyEvent.VK_NUMPAD3 && button9_value == 9)
		{
			Button9.setBackground(Color.white);
			button9_value = -button9_value;
			allBricksValue += button9_value;
			howManyBricks--;
		}
		
		/////////////////////////////////////////////////////////////////////////////////
				
		else if (keyCode == KeyEvent.VK_NUMPAD0 && allBricksValue != 0 && howManyBricks != 0)
		{
			button1_value = -1;
			button2_value = -2;
			button3_value = -3;
			button4_value = -4;
			button5_value = -5;
			button6_value = -6;
			button7_value = -7;
			button8_value = -8;
			button9_value = -9;
			
			allBricksValue = 0;
			howManyBricks = 0;
			
			Button1.setBackground(Color.white);
			Button2.setBackground(Color.white);
			Button3.setBackground(Color.white);
			Button4.setBackground(Color.white);
			Button5.setBackground(Color.white);
			Button6.setBackground(Color.white);
			Button7.setBackground(Color.white);
			Button8.setBackground(Color.white);
			Button9.setBackground(Color.white);
			
		}
		
		else if (keyCode == KeyEvent.VK_NUMPAD0 && allBricksValue == 0 && howManyBricks == 0)
		{
			FirstPictogram.setIcon(null);
			SecPictogram.setIcon(null);
			ThirdPictogram.setIcon(null);
			FourthPictogram.setIcon(null);
			FifthPictogram.setIcon(null);
			SixthPictogram.setIcon(null);
			
			FirstPictogram_fill = false;
			SecPictogram_fill = false;
			ThirdPictogram_fill = false;
			FourthPictogram_fill = false;
			FifthPictogram_fill = false;
			SixthPictogram_fill = false;
			
			string = " ";
			setString("");
		}
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 5 && howManyBricks == 1)
		{
			mc = new MenuCodes(MainWindow.this);
			mc.setVisible(true);
		}
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 29 && howManyBricks == 7)
		{
			mwd3 = new MWDialog3(MainWindow.this);
			mwd3.setVisible(true);		
			
			if (mwd3.return0MWD3())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(grandma);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(grandma);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(grandma);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(grandma);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(grandma);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(grandma);
			    	SixthPictogram_fill = true;
			    }	
				setString(" GRANDMA");				
			}
			else if (mwd3.return2MWD3())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(grandpa);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(grandpa);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(grandpa);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(grandpa);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(grandpa);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(grandpa);
			    	SixthPictogram_fill = true;
			    }
				setString(" GRANDPA");
			}
		}
		
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 19 && howManyBricks == 5)
		{
			mwd2 = new MWDialog2(MainWindow.this);
			mwd2.setVisible(true);		
			
			if (mwd2.return0MWD2())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(girl);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(girl);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(girl);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(girl);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(girl);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(girl);
			    	SixthPictogram_fill = true;
			    }	
				setString(" GIRL");				
			}
			else if (mwd2.return2MWD2())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(boy);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(boy);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(boy);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(boy);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(boy);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(boy);
			    	SixthPictogram_fill = true;
			    }
				setString(" BOY");
			}
		}
		
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 34 && howManyBricks == 6)
		{
			mwd6 = new MWDialog6(MainWindow.this);
			mwd6.setVisible(true);		
			
			if (mwd6.return0MWD6())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(cat);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(cat);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(cat);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(cat);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(cat);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(cat);
			    	SixthPictogram_fill = true;
			    }	
				setString(" CAT");				
			}
			else if (mwd6.return2MWD6())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(dog);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(dog);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(dog);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(dog);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(dog);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(dog);
			    	SixthPictogram_fill = true;
			    }
				setString(" DOG");
			}
		}
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 27 && howManyBricks == 6)
		{
			mwd7 = new MWDialog7(MainWindow.this);
			mwd7.setVisible(true);		
			
			if (mwd7.return0MWD7())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(bathroom);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(bathroom);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(bathroom);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(bathroom);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(bathroom);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(bathroom);
			    	SixthPictogram_fill = true;
			    }	
				setString(" BATHROOM");				
			}
			else if (mwd7.return2MWD7())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(toilet);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(toilet);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(toilet);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(toilet);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(toilet);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(toilet);
			    	SixthPictogram_fill = true;
			    }
				setString(" TOILET");
			}
		}
		
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 6 && howManyBricks == 3)
		{
			mwd1 = new MWDialog1(MainWindow.this);
			mwd1.setVisible(true);		
			
			if (mwd1.return0MWD1())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(father);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(father);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(father);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(father);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(father);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(father);
			    	SixthPictogram_fill = true;
			    }	
				setString(" FATHER");				
			}
			else if (mwd1.return1MWD1())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(family);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(family);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(family);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(family);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(family);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(family);
			    	SixthPictogram_fill = true;
			    }
				setString(" FAMILY");
			}
			else if (mwd1.return2MWD1())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(mother);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(mother);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(mother);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(mother);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(mother);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(mother);
			    	SixthPictogram_fill = true;
			    }
				setString(" MOTHER");
			}
		}
		
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 20 && howManyBricks == 4)
		{
			mwd8 = new MWDialog8(MainWindow.this);
			mwd8.setVisible(true);		
			
			if (mwd8.return0MWD8())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(tv);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(tv);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(tv);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(tv);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(tv);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(tv);
			    	SixthPictogram_fill = true;
			    }	
				setString(" TV");				
			}
			else if (mwd8.return1MWD8())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(telephone);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(telephone);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(telephone);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(telephone);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(telephone);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(telephone);
			    	SixthPictogram_fill = true;
			    }
				setString(" SMARTPHONE");
			}
			else if (mwd8.return2MWD8())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(computer);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(computer);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(computer);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(computer);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(computer);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(computer);
			    	SixthPictogram_fill = true;
			    }
				setString(" COMPUTER");
			}
		}
		
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 22 && howManyBricks == 5)
		{
			mwd9 = new MWDialog9(MainWindow.this);
			mwd9.setVisible(true);		
			
			if (mwd9.return0MWD9())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(teddy);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(teddy);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(teddy);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(teddy);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(teddy);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(teddy);
			    	SixthPictogram_fill = true;
			    }	
				setString(" TEDDY BEAR");				
			}
			else if (mwd9.return1MWD9())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(book);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(book);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(book);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(book);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(book);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(book);
			    	SixthPictogram_fill = true;
			    }
				setString(" BOOK");
			}
			else if (mwd9.return2MWD9())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(clothes);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(clothes);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(clothes);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(clothes);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(clothes);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(clothes);
			    	SixthPictogram_fill = true;
			    }
				setString(" CLOTHES");
			}
		}
		
		
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 18 && howManyBricks == 3)
		{
			mwd4 = new MWDialog4(MainWindow.this);
			mwd4.setVisible(true);		
			
			if (mwd4.return0MWD4())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(heart);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(heart);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(heart);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(heart);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(heart);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(heart);
			    	SixthPictogram_fill = true;
			    }	
				setString(" LOVE");				
			}
			else if (mwd4.return1MWD4())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(happy);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(happy);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(happy);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(happy);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(happy);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(happy);
			    	SixthPictogram_fill = true;
			    }
				setString(" HAPPY");
			}
			else if (mwd4.return2MWD4())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(sad);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(sad);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(sad);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(sad);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(sad);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(sad);
			    	SixthPictogram_fill = true;
			    }
				setString(" SAD");
			}
		}
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 25 && howManyBricks == 5)
		{
			mwd5 = new MWDialog5(MainWindow.this);
			mwd5.setVisible(true);		
			
			if (mwd5.return0MWD5())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(apple);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(apple);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(apple);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(apple);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(apple);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(apple);
			    	SixthPictogram_fill = true;
			    }	
				setString(" FRUITS");				
			}
			else if (mwd5.return1MWD5())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(food);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(food);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(food);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(food);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(food);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(food);
			    	SixthPictogram_fill = true;
			    }
				setString(" FOOD");
			}
			else if (mwd5.return2MWD5())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(sweets);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(sweets);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(sweets);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(sweets);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(sweets);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(sweets);
			    	SixthPictogram_fill = true;
			    }
				setString(" SWEETS");
			}
		}
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 29 && howManyBricks == 4)
		{
			mwd10 = new MWDialog10(MainWindow.this);
			//mwd10.setVisible(true);		
			
			if (mwd10.return0MWD10())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(water);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(water);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(water);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(water);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(water);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(water);
			    	SixthPictogram_fill = true;
			    }	
				setString(" WATER");				
			}
		}
		
		else if (keyCode == KeyEvent.VK_ENTER && allBricksValue == 32 && howManyBricks == 7)
		{
			mwd11 = new MWDialog11(MainWindow.this);
			//mwd11.setVisible(true);		
			
			if (mwd11.return0MWD11())
			{
				if (FirstPictogram_fill == false) {
			    	FirstPictogram.setIcon(sleep);				    	
			    	FirstPictogram_fill = true;
			    }
			    else if (SecPictogram_fill == false) {
			    	SecPictogram.setIcon(sleep);
			    	SecPictogram_fill = true;
			    }
			    else if (ThirdPictogram_fill == false) {
			    	ThirdPictogram.setIcon(sleep);				    	
			    	ThirdPictogram_fill = true;
			    }
			    else if (FourthPictogram_fill == false) {
			    	FourthPictogram.setIcon(sleep);
			    	FourthPictogram_fill = true;
			    }
			    else if (FifthPictogram_fill == false) {
			    	FifthPictogram.setIcon(sleep);				    	
			    	FifthPictogram_fill = true;
			    }
			    else if (SixthPictogram_fill == false) {
			    	SixthPictogram.setIcon(sleep);
			    	SixthPictogram_fill = true;
			    }	
				setString(" SLEEP");				
			}
		}
		
		
	}
	
	private void setString(String s)
	{
		string += s;
		textArea.setText(string);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

