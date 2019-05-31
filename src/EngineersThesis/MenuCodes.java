package EngineersThesis;

import java.awt.BorderLayout;
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

public class MenuCodes extends JDialog implements KeyListener
{

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public MenuCodes(JFrame f) 
	{
		super(f,"",true);
		setBounds(100, 100, 1750, 764);
		addKeyListener(this);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img\\menuCodes\\menu1.png"));
		lblNewLabel.setBounds(10, 11, 201, 200);
		contentPanel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("img\\menuCodes\\menu2.png"));
		label.setBounds(10, 260, 201, 200);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("img\\menuCodes\\menu3.png"));
		label_1.setBounds(10, 514, 201, 200);
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("img\\menuCodes\\menu4.png"));
		label_2.setBounds(455, 11, 201, 200);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("img\\menuCodes\\menu5.png"));
		label_3.setBounds(455, 260, 201, 200);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("img\\menuCodes\\menu6.png"));
		label_4.setBounds(455, 514, 201, 200);
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("img\\menuCodes\\menu7.png"));
		label_5.setBounds(912, 11, 201, 200);
		contentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("img\\menuCodes\\menu8.png"));
		label_6.setBounds(912, 260, 201, 200);
		contentPanel.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("img\\menuCodes\\menu9.png"));
		label_7.setBounds(912, 514, 201, 200);
		contentPanel.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("img\\menuCodes\\menu10.png"));
		label_8.setBounds(1340, 11, 201, 200);
		contentPanel.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("img\\menuCodes\\menu11.png"));
		label_9.setBounds(1340, 260, 201, 200);
		contentPanel.add(label_9);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(221, 11, 60, 60);
		lblNewLabel_1.setIcon(new ImageIcon("img\\PictogramDrawer\\father2.png"));
		contentPanel.add(lblNewLabel_1);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(221, 82, 60, 60);
		label_10.setIcon(new ImageIcon("img\\PictogramDrawer\\mother2.png"));
		contentPanel.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(221, 153, 60, 60);
		label_11.setIcon(new ImageIcon("img\\PictogramDrawer\\family2.png"));
		contentPanel.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(221, 293, 60, 60);
		label_12.setIcon(new ImageIcon("img\\PictogramDrawer\\boy2.png"));
		contentPanel.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setBounds(221, 364, 60, 60);
		label_13.setIcon(new ImageIcon("img\\PictogramDrawer\\girl2.png"));
		contentPanel.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setBounds(221, 552, 60, 60);
		label_14.setIcon(new ImageIcon("img\\PictogramDrawer\\Grandma2.png"));
		contentPanel.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(221, 623, 60, 60);
		label_15.setIcon(new ImageIcon("img\\PictogramDrawer\\Grandpa2.png"));
		contentPanel.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("img\\PictogramDrawer\\heart2.png"));
		label_16.setBounds(666, 11, 60, 60);
		
		contentPanel.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("img\\PictogramDrawer\\happy2.png"));
		label_17.setBounds(666, 82, 60, 60);
		contentPanel.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("img\\PictogramDrawer\\Sad2.png"));
		label_18.setBounds(666, 153, 60, 60);
		contentPanel.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("img\\PictogramDrawer\\Apple2.png"));
		label_19.setBounds(666, 260, 60, 60);
		contentPanel.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("img\\PictogramDrawer\\food2.png"));
		label_20.setBounds(666, 331, 60, 60);
		contentPanel.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("img\\PictogramDrawer\\sweets2.png"));
		label_21.setBounds(666, 400, 60, 60);
		contentPanel.add(label_21);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("img\\PictogramDrawer\\cat2.png"));
		label_22.setBounds(666, 552, 60, 60);
		contentPanel.add(label_22);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("img\\PictogramDrawer\\dog2.png"));
		label_23.setBounds(666, 623, 60, 60);
		contentPanel.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("img\\PictogramDrawer\\bathroom2.png"));
		label_24.setBounds(1123, 54, 60, 60);
		contentPanel.add(label_24);
		
		JLabel label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon("img\\PictogramDrawer\\toilet2.png"));
		label_25.setBounds(1123, 125, 60, 60);
		contentPanel.add(label_25);
		
		JLabel label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon("img\\PictogramDrawer\\tv2.png"));
		label_26.setBounds(1123, 260, 60, 60);
		contentPanel.add(label_26);
		
		JLabel label_27 = new JLabel("");
		label_27.setIcon(new ImageIcon("img\\PictogramDrawer\\telephone2.png"));
		label_27.setBounds(1123, 331, 60, 60);
		contentPanel.add(label_27);
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(new ImageIcon("img\\PictogramDrawer\\computer2.png"));
		label_28.setBounds(1123, 400, 60, 60);
		contentPanel.add(label_28);
		
		JLabel label_29 = new JLabel("");
		label_29.setIcon(new ImageIcon("img\\PictogramDrawer\\Teddy2.png"));
		label_29.setBounds(1123, 514, 60, 60);
		contentPanel.add(label_29);
		
		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon("img\\PictogramDrawer\\book2.png"));
		label_30.setBounds(1123, 585, 60, 60);
		contentPanel.add(label_30);
		
		JLabel label_31 = new JLabel("");
		label_31.setIcon(new ImageIcon("img\\PictogramDrawer\\clothes2.png"));
		label_31.setBounds(1123, 656, 60, 60);
		contentPanel.add(label_31);
		
		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon("img\\PictogramDrawer\\Water2.png"));
		label_32.setBounds(1551, 82, 60, 60);
		contentPanel.add(label_32);
		
		JLabel label_33 = new JLabel("");
		label_33.setIcon(new ImageIcon("img\\PictogramDrawer\\Sleep2.png"));
		label_33.setBounds(1551, 331, 60, 60);
		contentPanel.add(label_33);
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		int KeyCode = e.getKeyCode();
		
		// TODO Auto-generated method stub
		if (KeyCode == KeyEvent.VK_NUMPAD0)
		{
			dispose();
		}
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
