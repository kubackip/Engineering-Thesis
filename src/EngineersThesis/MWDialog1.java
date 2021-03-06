package EngineersThesis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class MWDialog1 extends JDialog implements KeyListener
{

	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;

	private boolean checkBox_true = false;
	private boolean checkBox_1_true = false;
	private boolean checkBox_2_true = false;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			MWDialog1 dialog = new MWDialog1();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public MWDialog1(JFrame jf) 
	{
		super (jf,"", true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\Sloth.png"));
		setBounds(100, 100, 528, 292);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label1 = new JLabel("");
		label1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		label1.setIcon(new ImageIcon("img\\PictogramDrawer\\father.png"));
		label1.setBounds(28, 49, 96, 96);
		contentPanel.add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		label2.setIcon(new ImageIcon("img\\PictogramDrawer\\family.png"));
		label2.setBounds(216, 49, 96, 96);
		contentPanel.add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		label3.setIcon(new ImageIcon("img\\PictogramDrawer\\mother.png"));
		label3.setBounds(395, 49, 96, 96);
		contentPanel.add(label3);
		
		checkBox = new JCheckBox("");
		buttonGroup.add(checkBox);
		checkBox.setBounds(64, 167, 21, 23);
		checkBox.addKeyListener(this);
		contentPanel.add(checkBox);
		
		checkBox_1 = new JCheckBox("");
		buttonGroup.add(checkBox_1);
		checkBox_1.setBounds(254, 167, 21, 23);
		checkBox_1.addKeyListener(this);
		contentPanel.add(checkBox_1);
		
		checkBox_2 = new JCheckBox("");
		buttonGroup.add(checkBox_2);
		checkBox_2.setBounds(433, 167, 21, 23);
		checkBox_2.addKeyListener(this);
		contentPanel.add(checkBox_2);
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();		
		
		if (keyCode == KeyEvent.VK_NUMPAD4)
		{
			checkBox.setSelected(true);
		}
		else if (keyCode == KeyEvent.VK_NUMPAD5)
		{
			checkBox_1.setSelected(true);
		}
		else if (keyCode == KeyEvent.VK_NUMPAD6)
		{
			checkBox_2.setSelected(true);
		}
		else if (keyCode == KeyEvent.VK_ENTER && checkBox.isSelected())
		{
			checkBox_true = true;
			checkBox_1_true = false;
			checkBox_2_true = false;
			dispose();
		}
		else if (keyCode == KeyEvent.VK_ENTER && checkBox_1.isSelected())
		{
			checkBox_true = false;
			checkBox_1_true = true;
			checkBox_2_true = false;
			dispose();
		}
		else if (keyCode == KeyEvent.VK_ENTER && checkBox_2.isSelected())
		{
			checkBox_true = false;
			checkBox_1_true = false;
			checkBox_2_true = true;
			dispose();
		}
	}
	
	public boolean return0MWD1()
	{
		return checkBox_true;
	}
	public boolean return1MWD1()
	{
		return checkBox_1_true;
	}
	public boolean return2MWD1()
	{
		return checkBox_2_true;
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
}
