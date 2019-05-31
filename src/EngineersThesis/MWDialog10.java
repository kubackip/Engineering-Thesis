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

public class MWDialog10 extends JDialog
{

	private final JPanel contentPanel = new JPanel();

	private boolean checkBox_true = true;

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
	public MWDialog10(JFrame jf) 
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
		label1.setIcon(new ImageIcon("img\\PictogramDrawer\\Water.png"));
		label1.setBounds(83, 49, 96, 96);
		contentPanel.add(label1);		
	}
	
	public boolean return0MWD10()
	{
		return checkBox_true;
	}
}

