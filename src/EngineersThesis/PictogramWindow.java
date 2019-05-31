package EngineersThesis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import java.awt.Image;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.event.KeyEvent;


public class PictogramWindow extends JFrame 
{
	static PictogramWindow frame = new PictogramWindow();
	private MenuClass menuclass;
	
	private JButton button_verb;
	private JButton button_person;
	private JButton button_adj;
	private JButton button_prepositions;
	private JButton button_feelings;
	private JButton button_body;
	private JButton button_animal;
	private JButton button_rooms;
	private JButton button_things;
	private JButton button_main;
	
	private JPanel panel_main;
	private JPanel panel_verbs;
	private JPanel panel_people;
	private JPanel panel_adjective;
	private JPanel panel_prep;
	private JPanel panel_feel;
	private JPanel panel_body;
	private JPanel panel_animal;
	private JPanel panel_room;
	private JPanel panel_things;
	private JPanel main_panel;
	
	public boolean sen_label_1_fill = false;
	public boolean sen_label_2_fill = false;
	public boolean sen_label_3_fill = false;
	public boolean sen_label_4_fill = false;
	public boolean sen_label_5_fill = false;
	public boolean sen_label_6_fill = false;
	public boolean sen_label_7_fill = false;
	public boolean sen_label_8_fill = false;
	public boolean sen_label_9_fill = false;
	
	private JLabel Sentence_label;
	private JLabel Sentence_label_1;
	private JLabel Sentence_label_2;
	private JLabel Sentence_label_3;
	private JLabel Sentence_label_4;
	private JLabel Sentence_label_5;
	private JLabel Sentence_label_6;
	private JLabel Sentence_label_7;
	private JLabel Sentence_label_8;
	
	
	private ImageIcon bad;
	private ImageIcon big;
	private ImageIcon different;
	private ImageIcon early;
	private ImageIcon few;
	private ImageIcon first;
	private ImageIcon good;
	private ImageIcon great;
	private ImageIcon high;
	private ImageIcon important;
	private ImageIcon last;
	private ImageIcon little;
	private ImageIcon long_img;
	private ImageIcon new_img;
	private ImageIcon next_img;
	private ImageIcon old;
	private ImageIcon same;
	private ImageIcon small_img;
	private ImageIcon young_img;
	private ImageIcon bear;
	private ImageIcon bird;
	private ImageIcon cat;
	private ImageIcon chicken;
	private ImageIcon cow;
	private ImageIcon dog;
	private ImageIcon dragon;
	private ImageIcon fish;
	private ImageIcon hamster;
	private ImageIcon horse;
	private ImageIcon mouse;
	private ImageIcon parrot;
	private ImageIcon pig;
	private ImageIcon rabbit;
	private ImageIcon turtle;
	private ImageIcon arm;
	private ImageIcon body_img;
	private ImageIcon ears;
	private ImageIcon eyes;
	private ImageIcon foot;
	private ImageIcon hair;
	private ImageIcon hand;
	private ImageIcon head;
	private ImageIcon leg;
	private ImageIcon mouth;
	private ImageIcon nose;
	private ImageIcon stomach;
	private ImageIcon tooth;
	private ImageIcon clock;
	private ImageIcon computer;
	private ImageIcon lamp;
	private ImageIcon laptop;
	private ImageIcon light;
	private ImageIcon radio;
	private ImageIcon remotectrl;
	private ImageIcon tablet;
	private ImageIcon telephone;
	private ImageIcon tv;
	private ImageIcon angry;
	private ImageIcon fear;
	private ImageIcon happy;
	private ImageIcon hungry;
	private ImageIcon hurt;
	private ImageIcon like;
	private ImageIcon love;
	private ImageIcon pain;
	private ImageIcon sad;
	private ImageIcon sleep;
	private ImageIcon no_img;
	private ImageIcon not;
	private ImageIcon will;
	private ImageIcon yes;
	private ImageIcon aunt;
	private ImageIcon boy;
	private ImageIcon family;
	private ImageIcon father;
	private ImageIcon girl;
	private ImageIcon grandma;
	private ImageIcon grandpa;
	private ImageIcon he;
	private ImageIcon i;
	private ImageIcon it;
	private ImageIcon me;
	private ImageIcon men;
	private ImageIcon mother;
	private ImageIcon she;
	private ImageIcon they;
	private ImageIcon uncle;
	private ImageIcon we;
	private ImageIcon woman;
	private ImageIcon you;
	private ImageIcon about;
	private ImageIcon after;
	private ImageIcon as;
	private ImageIcon at;
	private ImageIcon before;
	private ImageIcon by;
	private ImageIcon for_img;
	private ImageIcon from;
	private ImageIcon in;
	private ImageIcon into;
	private ImageIcon off;
	private ImageIcon on;
	private ImageIcon to;
	private ImageIcon under;
	private ImageIcon with;
	private ImageIcon bathroom;
	private ImageIcon bedroom;
	private ImageIcon corridor;
	private ImageIcon kitchen;
	private ImageIcon livingroom;
	private ImageIcon room;
	private ImageIcon ball;
	private ImageIcon bed;
	private ImageIcon blouse;
	private ImageIcon car;
	private ImageIcon chair;
	private ImageIcon desk;
	private ImageIcon doll;
	private ImageIcon dorr;
	private ImageIcon glasses;
	private ImageIcon hat;
	private ImageIcon jacket;
	private ImageIcon pen;
	private ImageIcon plane;
	private ImageIcon shoes;
	private ImageIcon sofa;
	private ImageIcon table;
	private ImageIcon teddybear;
	private ImageIcon toy;
	private ImageIcon trousers;
	private ImageIcon tshirt;
	private ImageIcon wardrobe;
	private ImageIcon am;
	private ImageIcon are;
	private ImageIcon ask;
	private ImageIcon can;
	private ImageIcon close;
	private ImageIcon come;
	private ImageIcon do_img;
	private ImageIcon feel;
	private ImageIcon find;
	private ImageIcon get;
	private ImageIcon give;
	private ImageIcon go;
	private ImageIcon have;
	private ImageIcon is;
	private ImageIcon know;
	private ImageIcon leave;
	private ImageIcon look;
	private ImageIcon make;
	private ImageIcon open;
	private ImageIcon play;
	private ImageIcon say;
	private ImageIcon see;
	private ImageIcon take;
	private ImageIcon tell;
	private ImageIcon think;
	private ImageIcon try_img;
	private ImageIcon use;
	private ImageIcon want;
	
	public String string = " ";
	
	private JPanel show_sentence_panel;
	public JTextArea textArea;
	public JPanel contentPane;
	public JPanel buttons_panel;
	
	Color lightice   = Color.decode("#F1F1F2");
	Color warmgray_0 = Color.decode("#CCCCCC");
	Color ice 		 = Color.decode("#A1D6E2");
	Color blue_0 	 = Color.decode("#F1995AD");
	
	Color woodgray = Color.decode("#81715E");
	Color yellow_0 = Color.decode("#FAAE3D");
	Color orange_0 = Color.decode("#E38533");
	Color pink_0   = Color.decode("#E4535E");
	
	Color darkest	 = Color.decode("#2A2922");
	Color brown_0	 = Color.decode("#7D5642");
	Color lightgray	 = Color.decode("#F1F1F2");
	
	
	/**
	 * Launch the application.
	 */
	public static void ShowPicogramWindow() 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try 
				{					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	/**
	 * Create the frame.
	 */
	public PictogramWindow() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\Sloth.png"));
		init();			
	}	
	
	public void init()
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1118, 785);
		
		//JPopupMenu popupMenu = new JPopupMenu();
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(darkest);	//nice dark gray color
		
		
		
		buttons_panel = new JPanel();
		buttons_panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		buttons_panel.setBounds(10, 29, 1090, 112);
		buttons_panel.setBackground(new Color(125,86,66));	//color brown
		contentPane.add(buttons_panel);
		
		button_adj = new JButton("");
		button_adj.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_adj.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_adj.setIcon(new ImageIcon("img\\adjective.png"));
		button_adj.setBackground(new Color (243,235,221));
		button_adj.setFocusPainted(false);
		button_adj.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_adjective);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		
		button_feelings = new JButton("");
		button_feelings.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_feelings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_feelings.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_feel);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		button_feelings.setIcon(new ImageIcon("img\\feelingss.png"));
		button_feelings.setFocusPainted(false);		
		button_feelings.setBackground(new Color(243,235,221));
		
		button_person = new JButton("");
		button_person.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_person.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_person.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_people);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		button_person.setIcon(new ImageIcon("img\\person.png"));
		button_person.setFocusPainted(false);
		button_person.setBackground(new Color(243,235,221));
		
		button_prepositions = new JButton("");
		button_prepositions.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_prepositions.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_prepositions.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_prep);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		button_prepositions.setIcon(new ImageIcon("img\\prepositionss.png"));
		button_prepositions.setFocusPainted(false);
		button_prepositions.setBackground(new Color(243,235,221));
		
		button_rooms = new JButton("");
		button_rooms.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_rooms.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_rooms.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_room);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		button_rooms.setIcon(new ImageIcon("img\\rooms.png"));
		button_rooms.setFocusPainted(false);
		button_rooms.setBackground(new Color(243,235,221));
		
		button_things = new JButton("");
		button_things.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_things.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_things.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_things);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		button_things.setIcon(new ImageIcon("img\\thingss.png"));
		button_things.setFocusPainted(false);
		button_things.setBackground(new Color(243,235,221));
		
		button_verb = new JButton("");
		button_verb.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_verb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_verb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_verbs);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		button_verb.setIcon(new ImageIcon("img\\verb.png"));
		button_verb.setBackground(new Color(243,235,221));
		button_verb.setFocusPainted(false);
		
		button_main = new JButton("");
		button_main.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_main.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_main.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_main);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		button_main.setIcon(new ImageIcon("img\\mainn.png"));
		button_main.setBackground(new Color(243,235,221));
		button_main.setFocusPainted(false);
		
		button_body = new JButton("");
		button_body.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_body.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_body.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_body);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		button_body.setIcon(new ImageIcon("img\\bodyy.png"));
		button_body.setBackground(new Color(243,235,221));
		button_body.setFocusPainted(false);
		
		button_animal = new JButton("");
		button_animal.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_animal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_animal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.removeAll();
				main_panel.repaint();
				main_panel.revalidate();
				
				main_panel.add(panel_animal);
				main_panel.repaint();
				main_panel.revalidate();
			}
		});
		button_animal.setBackground(new Color(243,235,221));
		button_animal.setIcon(new ImageIcon("img\\animal.png"));
		button_animal.setFocusPainted(false);
		
		GroupLayout gl_buttons_panel = new GroupLayout(buttons_panel);
		gl_buttons_panel.setHorizontalGroup(
			gl_buttons_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttons_panel.createSequentialGroup()
					.addGap(14)
					.addComponent(button_main, GroupLayout.PREFERRED_SIZE, 91, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_verb, GroupLayout.PREFERRED_SIZE, 99, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_person, GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_adj, GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_prepositions, GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_feelings, GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_body, GroupLayout.PREFERRED_SIZE, 91, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_animal, GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_rooms, GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_things, GroupLayout.PREFERRED_SIZE, 93, Short.MAX_VALUE)
					.addGap(18))
		);
		gl_buttons_panel.setVerticalGroup(
			gl_buttons_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_buttons_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_buttons_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button_main, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_things, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_rooms, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_verb, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_person, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_adj, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
						.addGroup(gl_buttons_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(button_prepositions, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_feelings, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_body, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_animal, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		buttons_panel.setLayout(gl_buttons_panel);
		
		////////////////////////////////////
		///////		multiple panels
		////////////////////////////////////
		main_panel = new JPanel();
		main_panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		main_panel.setBounds(10, 175, 1090, 340);
		contentPane.add(main_panel);
		main_panel.setLayout(new CardLayout(0, 0));
		main_panel.setBackground(new Color(125,86,66,20));	//color brown
		
		///////////
		///	panel
		///////////
		panel_main = new JPanel();
		panel_main.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel_main.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_main, "name_442581126980732");
		panel_main.setLayout(null);
		panel_main.setBackground(new Color(125,86,66));	//color brown
		
		
		JLabel main_label = new JLabel("");
		main_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		main_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				    if (sen_label_1_fill == false) {
				    	Sentence_label.setIcon(no_img);				    	
				    	sen_label_1_fill = true;
				    }
				    else if (sen_label_2_fill == false) {
				    	Sentence_label_1.setIcon(no_img);
				    	sen_label_2_fill = true;
				    }
				    else if (sen_label_3_fill == false) {
				    	Sentence_label_2.setIcon(no_img);				    	
				    	sen_label_3_fill = true;
				    }
				    else if (sen_label_4_fill == false) {
				    	Sentence_label_3.setIcon(no_img);
				    	sen_label_4_fill = true;
				    }
				    else if (sen_label_5_fill == false) {
				    	Sentence_label_4.setIcon(no_img);				    	
				    	sen_label_5_fill = true;
				    }
				    else if (sen_label_6_fill == false) {
				    	Sentence_label_5.setIcon(no_img);
				    	sen_label_6_fill = true;
				    }
				    else if (sen_label_7_fill == false) {
				    	Sentence_label_6.setIcon(no_img);				    	
				    	sen_label_7_fill = true;
				    }
				    else if (sen_label_8_fill == false) {
				    	Sentence_label_7.setIcon(no_img);
				    	sen_label_8_fill = true;
				    }
				    else if (sen_label_9_fill == false) {
				    	Sentence_label_8.setIcon(no_img);
				    	sen_label_9_fill = true;
				    }
				    
				    setString(" NO");
			}
		});
		main_label.setBounds(10, 11, 80, 80);
		main_label.setForeground(new Color (243,235,221));
		panel_main.add(main_label);
		try 
		{
			Connection conmain = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stmain = conmain.createStatement();
			ResultSet rsmain = stmain.executeQuery("select * from main where id = 1");
			Connection conmain1 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski_pl","root","");
			Statement stmain1 = conmain1.createStatement();
			ResultSet rsmain1 = stmain1.executeQuery("select * from main where id = 1");
			
			if (rsmain.next())
			{
				byte[] img = rsmain.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                no_img = newImage;	//wazne aby dodac!
                main_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		
		JLabel label_27 = new JLabel("");
		label_27.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(not);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(not);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(not);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(not);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(not);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(not);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(not);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(not);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(not);
			    	sen_label_9_fill = true;
			    }
				
				setString(" NOT");
			}
		});
		label_27.setBounds(100, 11, 80, 80);
		panel_main.add(label_27);
		try 
		{
			Connection con27 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement st27 = con27.createStatement();
			ResultSet rs27 = st27.executeQuery("select * from main where id = 2");		
			
			if (rs27.next())
			{
				byte[] img = rs27.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                not = newImage;
                label_27.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label_28 = new JLabel("");
		label_28.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(will);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(will);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(will);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(will);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(will);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(will);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(will);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(will);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(will);
			    	sen_label_9_fill = true;
			    }
				
				setString(" WILL");
			}
		});
		label_28.setBounds(190, 11, 80, 80);
		panel_main.add(label_28);
		try 
		{
			Connection con28 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement st28 = con28.createStatement();
			ResultSet rs28 = st28.executeQuery("select * from main where id = 3");		
			
			if (rs28.next())
			{
				byte[] img = rs28.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                will = newImage;
                label_28.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_29 = new JLabel("");
		label_29.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(yes);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(yes);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(yes);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(yes);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(yes);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(yes);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(yes);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(yes);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(yes);
			    	sen_label_9_fill = true;
			    }
				
				setString(" YES");
			}
		});
		label_29.setBounds(280, 11, 80, 80);
		panel_main.add(label_29);
		
		
		JLabel label_146 = new JLabel("");
		label_146.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_146.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setString(" A");
			}
		});
		label_146.setBounds(370, 11, 80, 80);
		panel_main.add(label_146);
		try 
		{
			Connection con146 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement st146 = con146.createStatement();
			ResultSet rs146 = st146.executeQuery("select * from main where id = 5");		
			
			if (rs146.next())
			{
				byte[] img = rs146.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                label_146.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_147 = new JLabel("");
		label_147.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_147.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setString(".");
			}
		});
		label_147.setBounds(460, 11, 80, 80);
		panel_main.add(label_147);
		try 
		{
			Connection con147 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement st147 = con147.createStatement();
			ResultSet rs147 = st147.executeQuery("select * from main where id = 6");		
			
			if (rs147.next())
			{
				byte[] img = rs147.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                //will = newImage;
                label_147.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_148 = new JLabel("");
		label_148.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_148.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setString("ES");
			}
		});
		label_148.setBounds(550, 11, 80, 80);
		panel_main.add(label_148);
		try 
		{
			Connection con148 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement st148 = con148.createStatement();
			ResultSet rs148 = st148.executeQuery("select * from main where id = 7");		
			
			if (rs148.next())
			{
				byte[] img = rs148.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                //will = newImage;
                label_148.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_149 = new JLabel("");
		label_149.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_149.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setString("?");
			}
		});
		label_149.setBounds(640, 11, 80, 80);
		panel_main.add(label_149);
		try 
		{
			Connection con149 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement st149 = con149.createStatement();
			ResultSet rs149 = st149.executeQuery("select * from main where id = 8");		
			
			if (rs149.next())
			{
				byte[] img = rs149.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                //will = newImage;
                label_149.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_150 = new JLabel("");
		label_150.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_150.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setString("S");
			}
		});
		label_150.setBounds(730, 11, 80, 80);
		panel_main.add(label_150);
		try 
		{
			Connection con150 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement st150 = con150.createStatement();
			ResultSet rs150 = st150.executeQuery("select * from main where id = 9");		
			
			if (rs150.next())
			{
				byte[] img = rs150.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                //will = newImage;
                label_150.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_154 = new JLabel("");
		label_154.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_154.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setString(" THE");
			}
		});
		label_154.setBounds(820, 11, 80, 80);
		panel_main.add(label_154);
		
		try 
		{
			Connection con154 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement st154 = con154.createStatement();
			ResultSet rs154 = st154.executeQuery("select * from main where id = 10");		
			
			if (rs154.next())
			{
				byte[] img = rs154.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                //will = newImage;
                label_154.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		
		
		
		
		try 
		{
			Connection con29 = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement st29 = con29.createStatement();
			ResultSet rs29 = st29.executeQuery("select * from main where id = 4");		
			
			if (rs29.next())
			{
				byte[] img = rs29.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                yes = newImage;
                label_29.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		///////////
		///	panel
		///////////
		panel_verbs = new JPanel();
		panel_verbs.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_verbs, "name_442565797391652");
		panel_verbs.setLayout(null);
		panel_verbs.setBackground(new Color(125,86,66));	//color brown
		
		JLabel verbs_label = new JLabel("");
		verbs_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		verbs_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(am);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(am);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(am);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(am);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(am);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(am);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(am);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(am);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(am);
			    	sen_label_9_fill = true;
			    }
				setString(" AM");
			}
		});
		verbs_label.setBounds(10, 11, 80, 80);
		panel_verbs.add(verbs_label);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs = stVerbs.executeQuery("select * from verbs where id = 1");		
			
			if (rsVerbs.next())
			{
				byte[] img = rsVerbs.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                am = newImage;
                verbs_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label = new JLabel("");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(are);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(are);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(are);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(are);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(are);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(are);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(are);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(are);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(are);
			    	sen_label_9_fill = true;
			    }
				setString(" ARE");
			}
		});
		label.setBounds(100, 11, 80, 80);
		panel_verbs.add(label);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs1 = stVerbs.executeQuery("select * from verbs where id = 2");		
			
			if (rsVerbs1.next())
			{
				byte[] img = rsVerbs1.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                are = newImage;
                label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label_1 = new JLabel("");
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(ask);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(ask);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(ask);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(ask);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(ask);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(ask);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(ask);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(ask);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(ask);
			    	sen_label_9_fill = true;
			    }
				setString(" ASK");
			}
		});
		label_1.setBounds(190, 11, 80, 80);
		panel_verbs.add(label_1);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs2 = stVerbs.executeQuery("select * from verbs where id = 3");		
			
			if (rsVerbs2.next())
			{
				byte[] img = rsVerbs2.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                ask = newImage;
                label_1.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label_2 = new JLabel("");
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(can);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(can);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(can);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(can);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(can);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(can);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(can);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(can);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(can);
			    	sen_label_9_fill = true;
			    }
				setString(" CAN");
			}
		});
		label_2.setBounds(280, 11, 80, 80);
		panel_verbs.add(label_2);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs3 = stVerbs.executeQuery("select * from verbs where id = 4");		
			
			if (rsVerbs3.next())
			{
				byte[] img = rsVerbs3.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                can = newImage;
                label_2.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label_3 = new JLabel("");
		label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
		    	Sentence_label.setIcon(close);				    	
		    	sen_label_1_fill = true;
		    }
		    else if (sen_label_2_fill == false) {
		    	Sentence_label_1.setIcon(close);
		    	sen_label_2_fill = true;
		    }
		    else if (sen_label_3_fill == false) {
		    	Sentence_label_2.setIcon(close);				    	
		    	sen_label_3_fill = true;
		    }
		    else if (sen_label_4_fill == false) {
		    	Sentence_label_3.setIcon(close);
		    	sen_label_4_fill = true;
		    }
		    else if (sen_label_5_fill == false) {
		    	Sentence_label_4.setIcon(close);				    	
		    	sen_label_5_fill = true;
		    }
		    else if (sen_label_6_fill == false) {
		    	Sentence_label_5.setIcon(close);
		    	sen_label_6_fill = true;
		    }
		    else if (sen_label_7_fill == false) {
		    	Sentence_label_6.setIcon(close);				    	
		    	sen_label_7_fill = true;
		    }
		    else if (sen_label_8_fill == false) {
		    	Sentence_label_7.setIcon(close);
		    	sen_label_8_fill = true;
		    }
		    else if (sen_label_9_fill == false) {
		    	Sentence_label_8.setIcon(close);
		    	sen_label_9_fill = true;
		    }

				setString(" CLOSE");
			}
		});
		label_3.setBounds(370, 11, 80, 80);
		panel_verbs.add(label_3);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs4 = stVerbs.executeQuery("select * from verbs where id = 5");		
			
			if (rsVerbs4.next())
			{
				byte[] img = rsVerbs4.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                close = newImage;
                label_3.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label_4 = new JLabel("");
		label_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(come);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(come);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(come);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(come);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(come);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(come);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(come);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(come);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(come);
			    	sen_label_9_fill = true;
			    }
				
				setString(" COME");
			}
		});
		label_4.setBounds(460, 11, 80, 80);
		panel_verbs.add(label_4);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs5 = stVerbs.executeQuery("select * from verbs where id = 6");		
			
			if (rsVerbs5.next())
			{
				byte[] img = rsVerbs5.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                come = newImage;
                label_4.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label_5 = new JLabel("");
		label_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(do_img);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(do_img);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(do_img);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(do_img);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(do_img);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(do_img);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(do_img);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(do_img);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(do_img);
			    	sen_label_9_fill = true;
			    }
				
				setString(" DO");
			}
		});
		label_5.setBounds(550, 11, 80, 80);
		panel_verbs.add(label_5);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs6 = stVerbs.executeQuery("select * from verbs where id = 7");		
			
			if (rsVerbs6.next())
			{
				byte[] img = rsVerbs6.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                do_img = newImage;
                label_5.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label_6 = new JLabel("");
		label_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(feel);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(feel);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(feel);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(feel);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(feel);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(feel);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(feel);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(feel);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(feel);
			    	sen_label_9_fill = true;
			    }
				
				setString(" FEEL");
			}
		});
		label_6.setBounds(640, 11, 80, 80);
		panel_verbs.add(label_6);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs7 = stVerbs.executeQuery("select * from verbs where id = 8");		
			
			if (rsVerbs7.next())
			{
				byte[] img = rsVerbs7.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                feel = newImage;
                label_6.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label_7 = new JLabel("");
		label_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(find);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(find);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(find);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(find);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(find);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(find);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(find);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(find);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(find);
			    	sen_label_9_fill = true;
			    }
				setString(" FIND");
			}
		});
		label_7.setBounds(730, 11, 80, 80);
		panel_verbs.add(label_7);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs8 = stVerbs.executeQuery("select * from verbs where id = 9");		
			
			if (rsVerbs8.next())
			{
				byte[] img = rsVerbs8.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                find = newImage;
                label_7.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		} 
		
		JLabel label_8 = new JLabel("");
		label_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(get);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(get);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(get);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(get);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(get);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(get);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(get);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(get);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(get);
			    	sen_label_9_fill = true;
			    }
				setString(" GET");
			}
		});
		label_8.setBounds(820, 11, 80, 80);
		panel_verbs.add(label_8);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs9 = stVerbs.executeQuery("select * from verbs where id = 10");		
			
			if (rsVerbs9.next())
			{
				byte[] img = rsVerbs9.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                get = newImage;
                label_8.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_9 = new JLabel("");
		label_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(give);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(give);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(give);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(give);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(give);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(give);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(give);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(give);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(give);
			    	sen_label_9_fill = true;
			    }
				
				setString(" GIVE");
			}
		});
		label_9.setBounds(910, 11, 80, 80);
		panel_verbs.add(label_9);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs10 = stVerbs.executeQuery("select * from verbs where id = 11");		
			
			if (rsVerbs10.next())
			{
				byte[] img = rsVerbs10.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                give = newImage;
                label_9.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_10 = new JLabel("");
		label_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(go);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(go);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(go);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(go);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(go);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(go);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(go);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(go);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(go);
			    	sen_label_9_fill = true;
			    }
				setString(" GO");
			}
		});
		label_10.setBounds(1000, 11, 80, 80);
		panel_verbs.add(label_10);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs11 = stVerbs.executeQuery("select * from verbs where id = 12");		
			
			if (rsVerbs11.next())
			{
				byte[] img = rsVerbs11.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                go = newImage;
                label_10.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_11 = new JLabel("");
		label_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(have);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(have);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(have);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(have);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(have);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(have);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(have);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(have);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(have);
			    	sen_label_9_fill = true;
			    }
				setString(" HAVE");
			}
		});
		label_11.setBounds(10, 102, 80, 80);
		panel_verbs.add(label_11);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs12 = stVerbs.executeQuery("select * from verbs where id = 13");		
			
			if (rsVerbs12.next())
			{
				byte[] img = rsVerbs12.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                have = newImage;
                label_11.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_12 = new JLabel("");
		label_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(is);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(is);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(is);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(is);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(is);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(is);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(is);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(is);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(is);
			    	sen_label_9_fill = true;
			    }
				setString(" IS");
			}
		});
		label_12.setBounds(100, 102, 80, 80);
		panel_verbs.add(label_12);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs13 = stVerbs.executeQuery("select * from verbs where id = 14");		
			
			if (rsVerbs13.next())
			{
				byte[] img = rsVerbs13.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                is = newImage;
                label_12.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_13 = new JLabel("");
		label_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(know);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(know);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(know);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(know);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(know);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(know);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(know);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(know);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(know);
			    	sen_label_9_fill = true;
			    }
				setString(" KNOW");
			}
		});
		label_13.setBounds(190, 102, 80, 80);
		panel_verbs.add(label_13);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs14 = stVerbs.executeQuery("select * from verbs where id = 15");		
			
			if (rsVerbs14.next())
			{
				byte[] img = rsVerbs14.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                know = newImage;
                label_13.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_14 = new JLabel("");
		label_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(leave);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(leave);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(leave);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(leave);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(leave);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(leave);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(leave);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(leave);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(leave);
			    	sen_label_9_fill = true;
			    }
				setString(" LEAVE");
			}
		});
		label_14.setBounds(280, 102, 80, 80);
		panel_verbs.add(label_14);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs15 = stVerbs.executeQuery("select * from verbs where id = 16");		
			
			if (rsVerbs15.next())
			{
				byte[] img = rsVerbs15.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                leave = newImage;
                label_14.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_15 = new JLabel("");
		label_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(look);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(look);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(look);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(look);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(look);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(look);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(look);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(look);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(look);
			    	sen_label_9_fill = true;
			    }
				setString(" LOOK");
			}
		});
		label_15.setBounds(370, 102, 80, 80);
		panel_verbs.add(label_15);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs16 = stVerbs.executeQuery("select * from verbs where id = 17");		
			
			if (rsVerbs16.next())
			{
				byte[] img = rsVerbs16.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                look = newImage;
                label_15.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_16 = new JLabel("");
		label_16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(make);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(make);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(make);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(make);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(make);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(make);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(make);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(make);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(make);
			    	sen_label_9_fill = true;
			    }
				setString(" MAKE");
			}
		});
		label_16.setBounds(460, 102, 80, 80);
		panel_verbs.add(label_16);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs17 = stVerbs.executeQuery("select * from verbs where id = 18");		
			
			if (rsVerbs17.next())
			{
				byte[] img = rsVerbs17.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                make = newImage;
                label_16.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_17 = new JLabel("");
		label_17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(open);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(open);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(open);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(open);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(open);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(open);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(open);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(open);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(open);
			    	sen_label_9_fill = true;
			    }
				setString(" OPEN");
			}
		});
		label_17.setBounds(550, 102, 80, 80);
		panel_verbs.add(label_17);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs18 = stVerbs.executeQuery("select * from verbs where id = 19");		
			
			if (rsVerbs18.next())
			{
				byte[] img = rsVerbs18.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                open = newImage;
                label_17.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_18 = new JLabel("");
		label_18.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(play);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(play);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(play);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(play);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(play);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(play);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(play);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(play);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(play);
			    	sen_label_9_fill = true;
			    }
				setString(" PLAY");
			}
		});
		label_18.setBounds(640, 102, 80, 80);
		panel_verbs.add(label_18);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs19 = stVerbs.executeQuery("select * from verbs where id = 20");		
			
			if (rsVerbs19.next())
			{
				byte[] img = rsVerbs19.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                play = newImage;
                label_18.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_19 = new JLabel("");
		label_19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(say);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(say);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(say);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(say);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(say);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(say);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(say);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(say);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(say);
			    	sen_label_9_fill = true;
			    }
				setString(" SAY");
			}
		});
		label_19.setBounds(730, 102, 80, 80);
		panel_verbs.add(label_19);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs20 = stVerbs.executeQuery("select * from verbs where id = 21");		
			
			if (rsVerbs20.next())
			{
				byte[] img = rsVerbs20.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                say = newImage;
                label_19.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_20 = new JLabel("");
		label_20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(see);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(see);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(see);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(see);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(see);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(see);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(see);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(see);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(see);
			    	sen_label_9_fill = true;
			    }
				setString(" SEE");
			}
		});
		label_20.setBounds(820, 102, 80, 80);
		panel_verbs.add(label_20);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs21 = stVerbs.executeQuery("select * from verbs where id = 22");		
			
			if (rsVerbs21.next())
			{
				byte[] img = rsVerbs21.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                see = newImage;
                label_20.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_21 = new JLabel("");
		label_21.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(take);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(take);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(take);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(take);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(take);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(take);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(take);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(take);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(take);
			    	sen_label_9_fill = true;
			    }
				setString(" TAKE");
			}
		});
		label_21.setBounds(910, 102, 80, 80);
		panel_verbs.add(label_21);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs22 = stVerbs.executeQuery("select * from verbs where id = 23");		
			
			if (rsVerbs22.next())
			{
				byte[] img = rsVerbs22.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                take = newImage;
                label_21.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_22 = new JLabel("");
		label_22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(tell);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(tell);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(tell);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(tell);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(tell);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(tell);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(tell);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(tell);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(tell);
			    	sen_label_9_fill = true;
			    }
				setString(" TELL");
			}
		});
		label_22.setBounds(1000, 102, 80, 80);
		panel_verbs.add(label_22);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs23 = stVerbs.executeQuery("select * from verbs where id = 24");		
			
			if (rsVerbs23.next())
			{
				byte[] img = rsVerbs23.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                tell = newImage;
                label_22.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_23 = new JLabel("");
		label_23.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(think);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(think);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(think);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(think);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(think);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(think);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(think);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(think);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(think);
			    	sen_label_9_fill = true;
			    }
				setString(" THINK");
			}
		});
		label_23.setBounds(10, 200, 80, 80);
		panel_verbs.add(label_23);
		
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs24 = stVerbs.executeQuery("select * from verbs where id = 25");		
			
			if (rsVerbs24.next())
			{
				byte[] img = rsVerbs24.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                think = newImage;
                label_23.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_143 = new JLabel("");
		label_143.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_143.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(try_img);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(try_img);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(try_img);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(try_img);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(try_img);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(try_img);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(try_img);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(try_img);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(try_img);
			    	sen_label_9_fill = true;
			    }
				setString(" TRY");
			}
		});
		label_143.setBounds(100, 200, 80, 80);
		panel_verbs.add(label_143);
		
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs143 = stVerbs.executeQuery("select * from verbs where id = 26");		
			
			if (rsVerbs143.next())
			{
				byte[] img = rsVerbs143.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                try_img = newImage;
                label_143.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_144 = new JLabel("");
		label_144.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_144.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(use);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(use);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(use);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(use);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(use);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(use);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(use);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(use);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(use);
			    	sen_label_9_fill = true;
			    }
				setString(" USE");
			}
		});
		label_144.setBounds(190, 200, 80, 80);
		panel_verbs.add(label_144);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs144 = stVerbs.executeQuery("select * from verbs where id = 27");		
			
			if (rsVerbs144.next())
			{
				byte[] img = rsVerbs144.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                use = newImage;
                label_144.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_145 = new JLabel("");
		label_145.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_145.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(want);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(want);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(want);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(want);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(want);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(want);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(want);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(want);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(want);
			    	sen_label_9_fill = true;
			    }
				setString(" WANT");
			}
		});
		label_145.setBounds(280, 200, 80, 80);
		panel_verbs.add(label_145);
		try 
		{
			Connection conVerbs = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stVerbs = conVerbs.createStatement();
			ResultSet rsVerbs145 = stVerbs.executeQuery("select * from verbs where id = 28");		
			
			if (rsVerbs145.next())
			{
				byte[] img = rsVerbs145.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                want = newImage;
                label_145.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		///////////
		///	panel
		///////////
		panel_people = new JPanel();
		panel_people.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_people, "name_444174328217593");
		panel_people.setLayout(null);
		panel_people.setBackground(new Color(125,86,66));
		
		JLabel people_label = new JLabel("");
		people_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		people_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(aunt);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(aunt);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(aunt);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(aunt);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(aunt);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(aunt);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(aunt);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(aunt);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(aunt);
			    	sen_label_9_fill = true;
			    }
				setString(" AUNT");
			}
		});
		people_label.setBounds(10, 11, 80, 80);
		panel_people.add(people_label);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople = stPeople.executeQuery("select * from persons where id = 1");		
			
			if (rsPeople.next())
			{
				byte[] img = rsPeople.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                aunt = newImage;
                people_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_30 = new JLabel("");
		label_30.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(boy);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(boy);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(boy);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(boy);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(boy);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(boy);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(boy);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(boy);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(boy);
			    	sen_label_9_fill = true;
			    }
				setString(" BOY");
			}
		});
		label_30.setBounds(100, 11, 80, 80);
		panel_people.add(label_30);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople30 = stPeople.executeQuery("select * from persons where id = 2");		
			
			if (rsPeople30.next())
			{
				byte[] img = rsPeople30.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                boy = newImage;
                label_30.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_31 = new JLabel("");
		label_31.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(family);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(family);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(family);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(family);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(family);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(family);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(family);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(family);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(family);
			    	sen_label_9_fill = true;
			    }
				setString(" FAMILY");
			}
		});
		label_31.setBounds(190, 11, 80, 80);
		panel_people.add(label_31);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople31 = stPeople.executeQuery("select * from persons where id = 3");		
			
			if (rsPeople31.next())
			{
				byte[] img = rsPeople31.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                family = newImage;
                label_31.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_32 = new JLabel("");
		label_32.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(father);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(father);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(father);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(father);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(father);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(father);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(father);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(father);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(father);
			    	sen_label_9_fill = true;
			    }
				setString(" FATHER");
			}
		});
		label_32.setBounds(280, 11, 80, 80);
		panel_people.add(label_32);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople32 = stPeople.executeQuery("select * from persons where id = 4");		
			
			if (rsPeople32.next())
			{
				byte[] img = rsPeople32.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                father = newImage;
                label_32.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_33 = new JLabel("");
		label_33.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(girl);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(girl);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(girl);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(girl);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(girl);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(girl);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(girl);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(girl);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(girl);
			    	sen_label_9_fill = true;
			    }
				setString(" GIRL");
			}
		});
		label_33.setBounds(370, 11, 80, 80);
		panel_people.add(label_33);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople33 = stPeople.executeQuery("select * from persons where id = 5");		
			
			if (rsPeople33.next())
			{
				byte[] img = rsPeople33.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                girl = newImage;
                label_33.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_34 = new JLabel("");
		label_34.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(grandma);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(grandma);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(grandma);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(grandma);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(grandma);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(grandma);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(grandma);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(grandma);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(grandma);
			    	sen_label_9_fill = true;
			    }
				setString(" GRANDMA");
			}
		});
		label_34.setBounds(460, 11, 80, 80);
		panel_people.add(label_34);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople34 = stPeople.executeQuery("select * from persons where id = 6");		
			
			if (rsPeople34.next())
			{
				byte[] img = rsPeople34.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                grandma = newImage;
                label_34.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_35 = new JLabel("");
		label_35.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(grandpa);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(grandpa);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(grandpa);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(grandpa);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(grandpa);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(grandpa);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(grandpa);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(grandpa);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(grandpa);
			    	sen_label_9_fill = true;
			    }
				setString(" GRANDPA");
			}
		});
		label_35.setBounds(550, 11, 80, 80);
		panel_people.add(label_35);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople35 = stPeople.executeQuery("select * from persons where id = 7");		
			
			if (rsPeople35.next())
			{
				byte[] img = rsPeople35.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                grandpa = newImage;
                label_35.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_36 = new JLabel("");
		label_36.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(he);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(he);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(he);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(he);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(he);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(he);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(he);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(he);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(he);
			    	sen_label_9_fill = true;
			    }
				setString(" HE");
			}
		});
		label_36.setBounds(640, 11, 80, 80);
		panel_people.add(label_36);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople36 = stPeople.executeQuery("select * from persons where id = 8");		
			
			if (rsPeople36.next())
			{
				byte[] img = rsPeople36.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                he = newImage;
                label_36.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_37 = new JLabel("");
		label_37.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(i);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(i);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(i);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(i);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(i);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(i);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(i);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(i);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(i);
			    	sen_label_9_fill = true;
			    }
				setString(" I");
			}
		});
		label_37.setBounds(730, 11, 80, 80);
		panel_people.add(label_37);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople37 = stPeople.executeQuery("select * from persons where id = 9");		
			
			if (rsPeople37.next())
			{
				byte[] img = rsPeople37.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                i = newImage;
                label_37.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		
		
		JLabel label_38 = new JLabel("");
		label_38.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(it);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(it);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(it);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(it);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(it);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(it);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(it);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(it);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(it);
			    	sen_label_9_fill = true;
			    }
				setString(" IT");
			}
		});
		label_38.setBounds(820, 11, 80, 80);
		panel_people.add(label_38);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople38 = stPeople.executeQuery("select * from persons where id = 10");		
			
			if (rsPeople38.next())
			{
				byte[] img = rsPeople38.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                it = newImage;
                label_38.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		
		
		JLabel label_39 = new JLabel("");
		label_39.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(me);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(me);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(me);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(me);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(me);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(me);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(me);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(me);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(me);
			    	sen_label_9_fill = true;
			    }
				setString(" MY");
			}
		});
		label_39.setBounds(910, 11, 80, 80);
		panel_people.add(label_39);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople39 = stPeople.executeQuery("select * from persons where id = 11");		
			
			if (rsPeople39.next())
			{
				byte[] img = rsPeople39.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                me = newImage;
                label_39.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_40 = new JLabel("");
		label_40.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(men);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(men);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(men);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(men);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(men);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(men);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(men);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(men);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(men);
			    	sen_label_9_fill = true;
			    }
				setString(" MEN");
			}
		});
		label_40.setBounds(1000, 11, 80, 80);
		panel_people.add(label_40);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople40 = stPeople.executeQuery("select * from persons where id = 12");		
			
			if (rsPeople40.next())
			{
				byte[] img = rsPeople40.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                men = newImage;
                label_40.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_41 = new JLabel("");
		label_41.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(mother);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(mother);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(mother);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(mother);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(mother);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(mother);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(mother);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(mother);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(mother);
			    	sen_label_9_fill = true;
			    }
				setString(" MOTHER");
			}
		});
		label_41.setBounds(10, 102, 80, 80);
		panel_people.add(label_41);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople41 = stPeople.executeQuery("select * from persons where id = 13");		
			
			if (rsPeople41.next())
			{
				byte[] img = rsPeople41.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                mother = newImage;
                label_41.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_42 = new JLabel("");
		label_42.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(she);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(she);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(she);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(she);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(she);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(she);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(she);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(she);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(she);
			    	sen_label_9_fill = true;
			    }
				setString(" SHE");
			}
		});
		label_42.setBounds(100, 102, 80, 80);
		panel_people.add(label_42);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople42 = stPeople.executeQuery("select * from persons where id = 14");		
			
			if (rsPeople42.next())
			{
				byte[] img = rsPeople42.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                she = newImage;
                label_42.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_43 = new JLabel("");
		label_43.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(they);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(they);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(they);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(they);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(they);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(they);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(they);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(they);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(they);
			    	sen_label_9_fill = true;
			    }
				setString(" THEY");
			}
		});
		label_43.setBounds(190, 102, 80, 80);
		panel_people.add(label_43);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople43 = stPeople.executeQuery("select * from persons where id = 15");		
			
			if (rsPeople43.next())
			{
				byte[] img = rsPeople43.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                they = newImage;
                label_43.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_44 = new JLabel("");
		label_44.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(uncle);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(uncle);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(uncle);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(uncle);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(uncle);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(uncle);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(uncle);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(uncle);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(uncle);
			    	sen_label_9_fill = true;
			    }
				setString(" UNCLE");
			}
		});
		label_44.setBounds(280, 102, 80, 80);
		panel_people.add(label_44);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople44 = stPeople.executeQuery("select * from persons where id = 16");		
			
			if (rsPeople44.next())
			{
				byte[] img = rsPeople44.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                uncle = newImage;
                label_44.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_45 = new JLabel("");
		label_45.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_45.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(we);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(we);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(we);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(we);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(we);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(we);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(we);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(we);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(we);
			    	sen_label_9_fill = true;
			    }
				setString(" WE");
			}
		});
		label_45.setBounds(370, 102, 80, 80);
		panel_people.add(label_45);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople45 = stPeople.executeQuery("select * from persons where id = 17");		
			
			if (rsPeople45.next())
			{
				byte[] img = rsPeople45.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                we = newImage;
                label_45.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_46 = new JLabel("");
		label_46.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_46.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(woman);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(woman);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(woman);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(woman);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(woman);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(woman);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(woman);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(woman);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(woman);
			    	sen_label_9_fill = true;
			    }
				setString(" WOMAN");
			}
		});
		label_46.setBounds(460, 102, 80, 80);
		panel_people.add(label_46);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople46 = stPeople.executeQuery("select * from persons where id = 18");		
			
			if (rsPeople46.next())
			{
				byte[] img = rsPeople46.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                woman = newImage;
                label_46.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_47 = new JLabel("");
		label_47.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_47.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(you);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(you);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(you);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(you);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(you);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(you);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(you);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(you);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(you);
			    	sen_label_9_fill = true;
			    }
				setString(" YOU");
			}
		});
		label_47.setBounds(550, 102, 80, 80);
		panel_people.add(label_47);
		try 
		{
			Connection conPeople = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPeople = conPeople.createStatement();
			ResultSet rsPeople47 = stPeople.executeQuery("select * from persons where id = 19");		
			
			if (rsPeople47.next())
			{
				byte[] img = rsPeople47.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                you = newImage;
                label_47.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		///////////
		///	panel
		///////////
		panel_adjective = new JPanel();
		panel_adjective.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_adjective, "name_439642613734792");
		panel_adjective.setLayout(null);
		panel_adjective.setBackground(new Color(125,86,66));
		
		JLabel adjective_label = new JLabel("");
		adjective_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		adjective_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(bad);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(bad);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(bad);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(bad);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(bad);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(bad);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(bad);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(bad);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(bad);
			    	sen_label_9_fill = true;
			    }
				setString(" BAD");
			}
		});
		adjective_label.setBounds(10, 11, 80, 80);
		panel_adjective.add(adjective_label);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective = stAdjectives.executeQuery("select * from adjectives where id = 1");		
			
			if (rsAdjective.next())
			{
				byte[] img = rsAdjective.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                bad = newImage;
                adjective_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_49 = new JLabel("");
		label_49.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_49.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(big);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(big);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(big);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(big);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(big);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(big);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(big);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(big);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(big);
			    	sen_label_9_fill = true;
			    }
				setString(" BIG");
			}
		});
		label_49.setBounds(100, 11, 80, 80);
		panel_adjective.add(label_49);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective49 = stAdjectives.executeQuery("select * from adjectives where id = 2");		
			
			if (rsAdjective49.next())
			{
				byte[] img = rsAdjective49.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                big = newImage;
                label_49.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_50 = new JLabel("");
		label_50.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_50.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(different);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(different);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(different);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(different);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(different);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(different);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(different);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(different);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(different);
			    	sen_label_9_fill = true;
			    }
				setString(" DIFFERENT");
			}
		});
		label_50.setBounds(190, 11, 80, 80);
		panel_adjective.add(label_50);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective50 = stAdjectives.executeQuery("select * from adjectives where id = 3");		
			
			if (rsAdjective50.next())
			{
				byte[] img = rsAdjective50.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                different = newImage;
                label_50.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_51 = new JLabel("");
		label_51.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(early);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(early);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(early);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(early);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(early);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(early);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(early);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(early);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(early);
			    	sen_label_9_fill = true;
			    }
				setString(" EARLY");
			}
		});
		label_51.setBounds(280, 11, 80, 80);
		panel_adjective.add(label_51);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective51 = stAdjectives.executeQuery("select * from adjectives where id = 4");		
			
			if (rsAdjective51.next())
			{
				byte[] img = rsAdjective51.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                early = newImage;
                label_51.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_52 = new JLabel("");
		label_52.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(few);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(few);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(few);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(few);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(few);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(few);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(few);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(few);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(few);
			    	sen_label_9_fill = true;
			    }
				setString(" FEW");
			}
		});
		label_52.setBounds(370, 11, 80, 80);
		panel_adjective.add(label_52);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective52 = stAdjectives.executeQuery("select * from adjectives where id = 5");		
			
			if (rsAdjective52.next())
			{
				byte[] img = rsAdjective52.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                few = newImage;
                label_52.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_53 = new JLabel("");
		label_53.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_53.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(first);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(first);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(first);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(first);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(first);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(first);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(first);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(first);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(first);
			    	sen_label_9_fill = true;
			    }
				setString(" FIRST");
			}
		});
		label_53.setBounds(460, 11, 80, 80);
		panel_adjective.add(label_53);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective53 = stAdjectives.executeQuery("select * from adjectives where id = 6");		
			
			if (rsAdjective53.next())
			{
				byte[] img = rsAdjective53.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                first = newImage;
                label_53.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_54 = new JLabel("");
		label_54.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(good);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(good);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(good);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(good);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(good);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(good);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(good);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(good);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(good);
			    	sen_label_9_fill = true;
			    }
				setString(" GOOD");
			}
		});
		label_54.setBounds(550, 11, 80, 80);
		panel_adjective.add(label_54);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective54 = stAdjectives.executeQuery("select * from adjectives where id = 7");		
			
			if (rsAdjective54.next())
			{
				byte[] img = rsAdjective54.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                good = newImage;
                label_54.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_55 = new JLabel("");
		label_55.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_55.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(great);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(great);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(great);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(great);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(great);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(great);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(great);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(great);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(great);
			    	sen_label_9_fill = true;
			    }
				setString(" GREAT");
			}
		});
		label_55.setBounds(640, 11, 80, 80);
		panel_adjective.add(label_55);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective55 = stAdjectives.executeQuery("select * from adjectives where id = 8");		
			
			if (rsAdjective55.next())
			{
				byte[] img = rsAdjective55.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                great = newImage;
                label_55.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_56 = new JLabel("");
		label_56.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_56.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(high);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(high);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(high);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(high);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(high);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(high);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(high);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(high);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(high);
			    	sen_label_9_fill = true;
			    }
				setString(" HIGH");
			}
		});
		label_56.setBounds(730, 11, 80, 80);
		panel_adjective.add(label_56);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective56 = stAdjectives.executeQuery("select * from adjectives where id = 9");		
			
			if (rsAdjective56.next())
			{
				byte[] img = rsAdjective56.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                high = newImage;
                label_56.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_57 = new JLabel("");
		label_57.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_57.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(important);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(important);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(important);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(important);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(important);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(important);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(important);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(important);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(important);
			    	sen_label_9_fill = true;
			    }
				setString(" IMPORTANT");
			}
		});
		label_57.setBounds(820, 11, 80, 80);
		panel_adjective.add(label_57);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective57 = stAdjectives.executeQuery("select * from adjectives where id = 10");		
			
			if (rsAdjective57.next())
			{
				byte[] img = rsAdjective57.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                important = newImage;
                label_57.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_58 = new JLabel("");
		label_58.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_58.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(last);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(last);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(last);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(last);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(last);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(last);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(last);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(last);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(last);
			    	sen_label_9_fill = true;
			    }
				setString(" LAST");
			}
		});
		label_58.setBounds(910, 11, 80, 80);
		panel_adjective.add(label_58);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective58 = stAdjectives.executeQuery("select * from adjectives where id = 11");		
			
			if (rsAdjective58.next())
			{
				byte[] img = rsAdjective58.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                last = newImage;
                label_58.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_59 = new JLabel("");
		label_59.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_59.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(little);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(little);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(little);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(little);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(little);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(little);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(little);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(little);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(little);
			    	sen_label_9_fill = true;
			    }
				setString(" LITTLE");
			}
		});
		label_59.setBounds(1000, 11, 80, 80);
		panel_adjective.add(label_59);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective59 = stAdjectives.executeQuery("select * from adjectives where id = 12");		
			
			if (rsAdjective59.next())
			{
				byte[] img = rsAdjective59.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                little = newImage;
                label_59.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_60 = new JLabel("");
		label_60.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_60.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(long_img);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(long_img);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(long_img);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(long_img);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(long_img);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(long_img);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(long_img);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(long_img);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(long_img);
			    	sen_label_9_fill = true;
			    }
				setString(" LONG");
			}
		});
		label_60.setBounds(10, 102, 80, 80);
		panel_adjective.add(label_60);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective60 = stAdjectives.executeQuery("select * from adjectives where id = 13");		
			
			if (rsAdjective60.next())
			{
				byte[] img = rsAdjective60.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                long_img = newImage;
                label_60.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_61 = new JLabel("");
		label_61.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(new_img);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(new_img);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(new_img);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(new_img);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(new_img);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(new_img);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(new_img);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(new_img);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(new_img);
			    	sen_label_9_fill = true;
			    }
				setString(" NEW");
			}
		});
		label_61.setBounds(100, 102, 80, 80);
		panel_adjective.add(label_61);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective61 = stAdjectives.executeQuery("select * from adjectives where id = 14");		
			
			if (rsAdjective61.next())
			{
				byte[] img = rsAdjective61.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                new_img = newImage;
                label_61.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_62 = new JLabel("");
		label_62.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_62.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(next_img);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(next_img);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(next_img);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(next_img);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(next_img);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(next_img);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(next_img);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(next_img);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(next_img);
			    	sen_label_9_fill = true;
			    }
				setString(" NEXT");
			}
		});
		label_62.setBounds(190, 102, 80, 80);
		panel_adjective.add(label_62);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective62 = stAdjectives.executeQuery("select * from adjectives where id = 15");		
			
			if (rsAdjective62.next())
			{
				byte[] img = rsAdjective62.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                next_img = newImage;
                label_62.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_63 = new JLabel("");
		label_63.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(old);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(old);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(old);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(old);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(old);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(old);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(old);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(old);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(old);
			    	sen_label_9_fill = true;
			    }
				setString(" OLD");
			}
		});
		label_63.setBounds(280, 102, 80, 80);
		panel_adjective.add(label_63);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective63 = stAdjectives.executeQuery("select * from adjectives where id = 16");		
			
			if (rsAdjective63.next())
			{
				byte[] img = rsAdjective63.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                old = newImage;
                label_63.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_64 = new JLabel("");
		label_64.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_64.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(same);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(same);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(same);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(same);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(same);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(same);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(same);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(same);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(same);
			    	sen_label_9_fill = true;
			    }
				setString(" SAME");
			}
		});
		label_64.setBounds(370, 102, 80, 80);
		panel_adjective.add(label_64);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective64 = stAdjectives.executeQuery("select * from adjectives where id = 17");		
			
			if (rsAdjective64.next())
			{
				byte[] img = rsAdjective64.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                same = newImage;
                label_64.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_65 = new JLabel("");
		label_65.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_65.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(small_img);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(small_img);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(small_img);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(small_img);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(small_img);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(small_img);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(small_img);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(small_img);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(small_img);
			    	sen_label_9_fill = true;
			    }
				setString(" SMALL");
			}
		});
		label_65.setBounds(460, 102, 80, 80);
		panel_adjective.add(label_65);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective65 = stAdjectives.executeQuery("select * from adjectives where id = 18");		
			
			if (rsAdjective65.next())
			{
				byte[] img = rsAdjective65.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                small_img = newImage;
                label_65.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_66 = new JLabel("");
		label_66.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_66.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(young_img);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(young_img);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(young_img);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(young_img);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(young_img);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(young_img);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(young_img);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(young_img);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(young_img);
			    	sen_label_9_fill = true;
			    }
				setString(" YOUNG");
			}
		});
		label_66.setBounds(550, 102, 80, 80);
		panel_adjective.add(label_66);
		try 
		{
			Connection conAdjectives = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAdjectives = conAdjectives.createStatement();
			ResultSet rsAdjective66 = stAdjectives.executeQuery("select * from adjectives where id = 19");		
			
			if (rsAdjective66.next())
			{
				byte[] img = rsAdjective66.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                young_img = newImage;
                label_66.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		
		///////////
		///	panel
		///////////
		panel_prep = new JPanel();
		panel_prep.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_prep, "name_439659961473079");
		panel_prep.setLayout(null);
		panel_prep.setBackground(new Color(125,86,66));
		
		JLabel prep_label = new JLabel("");
		prep_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		prep_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(about);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(about);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(about);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(about);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(about);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(about);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(about);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(about);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(about);
			    	sen_label_9_fill = true;
			    }
				setString(" ABOUT");
			}
		});
		prep_label.setBounds(10, 11, 80, 80);
		panel_prep.add(prep_label);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions = stPrepositions.executeQuery("select * from prepositions where id = 1");		
			
			if (rsPrepositions.next())
			{
				byte[] img = rsPrepositions.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                about = newImage;
                prep_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_68 = new JLabel("");
		label_68.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_68.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(after);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(after);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(after);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(after);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(after);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(after);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(after);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(after);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(after);
			    	sen_label_9_fill = true;
			    }
				setString(" AFTER");
			}
		});
		label_68.setBounds(100, 11, 80, 80);
		panel_prep.add(label_68);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions68 = stPrepositions.executeQuery("select * from prepositions where id = 2");		
			
			if (rsPrepositions68.next())
			{
				byte[] img = rsPrepositions68.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                after = newImage;
                label_68.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_69 = new JLabel("");
		label_69.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_69.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(as);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(as);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(as);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(as);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(as);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(as);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(as);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(as);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(as);
			    	sen_label_9_fill = true;
			    }
				setString(" AS");
			}
		});
		label_69.setBounds(190, 11, 80, 80);
		panel_prep.add(label_69);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions69 = stPrepositions.executeQuery("select * from prepositions where id = 3");		
			
			if (rsPrepositions69.next())
			{
				byte[] img = rsPrepositions69.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                as = newImage;
                label_69.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		
		JLabel label_70 = new JLabel("");
		label_70.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_70.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(at);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(at);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(at);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(at);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(at);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(at);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(at);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(at);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(at);
			    	sen_label_9_fill = true;
			    }
				setString(" AT");
			}
		});
		label_70.setBounds(280, 11, 80, 80);
		panel_prep.add(label_70);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions70 = stPrepositions.executeQuery("select * from prepositions where id = 4");		
			
			if (rsPrepositions70.next())
			{
				byte[] img = rsPrepositions70.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                at = newImage;
                label_70.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_71 = new JLabel("");
		label_71.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_71.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(before);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(before);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(before);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(before);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(before);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(before);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(before);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(before);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(before);
			    	sen_label_9_fill = true;
			    }
				setString(" BEFORE");
			}
		});
		label_71.setBounds(370, 11, 80, 80);
		panel_prep.add(label_71);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions71 = stPrepositions.executeQuery("select * from prepositions where id = 5");		
			
			if (rsPrepositions71.next())
			{
				byte[] img = rsPrepositions71.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                before = newImage;
                label_71.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_72 = new JLabel("");
		label_72.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_72.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(by);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(by);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(by);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(by);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(by);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(by);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(by);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(by);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(by);
			    	sen_label_9_fill = true;
			    }
				setString(" BY");
			}
		});
		label_72.setBounds(460, 11, 80, 80);
		panel_prep.add(label_72);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions72 = stPrepositions.executeQuery("select * from prepositions where id = 6");		
			
			if (rsPrepositions72.next())
			{
				byte[] img = rsPrepositions72.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                by = newImage;
                label_72.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_73 = new JLabel("");
		label_73.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_73.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(for_img);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(for_img);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(for_img);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(for_img);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(for_img);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(for_img);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(for_img);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(for_img);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(for_img);
			    	sen_label_9_fill = true;
			    }
				setString(" FOR");
			}
		});
		label_73.setBounds(550, 11, 80, 80);
		panel_prep.add(label_73);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions73 = stPrepositions.executeQuery("select * from prepositions where id = 7");		
			
			if (rsPrepositions73.next())
			{
				byte[] img = rsPrepositions73.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                for_img = newImage;
                label_73.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_74 = new JLabel("");
		label_74.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_74.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(from);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(from);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(from);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(from);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(from);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(from);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(from);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(from);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(from);
			    	sen_label_9_fill = true;
			    }
				setString(" FROM");
			}
		});
		label_74.setBounds(640, 11, 80, 80);
		panel_prep.add(label_74);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions74 = stPrepositions.executeQuery("select * from prepositions where id = 8");		
			
			if (rsPrepositions74.next())
			{
				byte[] img = rsPrepositions74.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                from = newImage;
                label_74.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_75 = new JLabel("");
		label_75.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_75.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(in);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(in);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(in);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(in);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(in);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(in);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(in);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(in);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(in);
			    	sen_label_9_fill = true;
			    }
				setString(" IN");
			}
		});
		label_75.setBounds(730, 11, 80, 80);
		panel_prep.add(label_75);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions75 = stPrepositions.executeQuery("select * from prepositions where id = 9");		
			
			if (rsPrepositions75.next())
			{
				byte[] img = rsPrepositions75.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                in = newImage;
                label_75.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_76 = new JLabel("");
		label_76.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_76.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(into);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(into);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(into);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(into);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(into);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(into);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(into);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(into);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(into);
			    	sen_label_9_fill = true;
			    }
				setString(" INTO");
			}
		});
		label_76.setBounds(820, 11, 80, 80);
		panel_prep.add(label_76);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions76 = stPrepositions.executeQuery("select * from prepositions where id = 10");		
			
			if (rsPrepositions76.next())
			{
				byte[] img = rsPrepositions76.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                into = newImage;
                label_76.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_77 = new JLabel("");
		label_77.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_77.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(off);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(off);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(off);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(off);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(off);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(off);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(off);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(off);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(off);
			    	sen_label_9_fill = true;
			    }
				setString(" OFF");
			}
		});
		label_77.setBounds(910, 11, 80, 80);
		panel_prep.add(label_77);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions77 = stPrepositions.executeQuery("select * from prepositions where id = 11");		
			
			if (rsPrepositions77.next())
			{
				byte[] img = rsPrepositions77.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                off = newImage;
                label_77.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_78 = new JLabel("");
		label_78.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_78.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(on);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(on);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(on);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(on);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(on);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(on);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(on);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(on);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(on);
			    	sen_label_9_fill = true;
			    }
				setString(" ON");
			}
		});
		label_78.setBounds(1000, 11, 80, 80);
		panel_prep.add(label_78);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions78 = stPrepositions.executeQuery("select * from prepositions where id = 12");		
			
			if (rsPrepositions78.next())
			{
				byte[] img = rsPrepositions78.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                on = newImage;
                label_78.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_79 = new JLabel("");
		label_79.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_79.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(to);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(to);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(to);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(to);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(to);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(to);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(to);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(to);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(to);
			    	sen_label_9_fill = true;
			    }
				setString(" TO");
			}
		});
		label_79.setBounds(10, 102, 80, 80);
		panel_prep.add(label_79);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions79 = stPrepositions.executeQuery("select * from prepositions where id = 13");		
			
			if (rsPrepositions79.next())
			{
				byte[] img = rsPrepositions79.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                to = newImage;
                label_79.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_80 = new JLabel("");
		label_80.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_80.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(under);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(under);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(under);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(under);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(under);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(under);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(under);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(under);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(under);
			    	sen_label_9_fill = true;
			    }
				setString(" UNDER");
			}
		});
		label_80.setBounds(100, 102, 80, 80);
		panel_prep.add(label_80);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions80 = stPrepositions.executeQuery("select * from prepositions where id = 14");		
			
			if (rsPrepositions80.next())
			{
				byte[] img = rsPrepositions80.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                under = newImage;
                label_80.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_81 = new JLabel("");
		label_81.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_81.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(with);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(with);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(with);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(with);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(with);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(with);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(with);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(with);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(with);
			    	sen_label_9_fill = true;
			    }
				setString(" WITH");
			}
		});
		label_81.setBounds(190, 102, 80, 80);
		panel_prep.add(label_81);
		try 
		{
			Connection conPrepositions = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stPrepositions = conPrepositions.createStatement();
			ResultSet rsPrepositions81 = stPrepositions.executeQuery("select * from prepositions where id = 15");		
			
			if (rsPrepositions81.next())
			{
				byte[] img = rsPrepositions81.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                with = newImage;
                label_81.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		///////////
		///	panel
		///////////
		panel_feel = new JPanel();
		panel_feel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_feel, "name_439668726232167");
		panel_feel.setLayout(null);
		panel_feel.setBackground(new Color(125,86,66));
		
		JLabel feel_label = new JLabel("");
		feel_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		feel_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(angry);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(angry);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(angry);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(angry);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(angry);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(angry);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(angry);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(angry);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(angry);
			    	sen_label_9_fill = true;
			    }
				setString(" ANGRY");
				
			}
		});
		feel_label.setBounds(10, 11, 80, 80);
		panel_feel.add(feel_label);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings = stFeelings.executeQuery("select * from feelings where id = 1");		
			
			if (rsFeelings.next())
			{
				byte[] img = rsFeelings.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                angry = newImage;
                feel_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_83 = new JLabel("");
		label_83.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_83.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(fear);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(fear);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(fear);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(fear);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(fear);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(fear);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(fear);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(fear);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(fear);
			    	sen_label_9_fill = true;
			    }
				setString(" FEAR");
			}
		});
		label_83.setBounds(100, 11, 80, 80);
		panel_feel.add(label_83);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings83 = stFeelings.executeQuery("select * from feelings where id = 2");		
			
			if (rsFeelings83.next())
			{
				byte[] img = rsFeelings83.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                fear = newImage;
                label_83.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_84 = new JLabel("");
		label_84.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_84.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(happy);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(happy);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(happy);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(happy);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(happy);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(happy);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(happy);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(happy);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(happy);
			    	sen_label_9_fill = true;
			    }
				setString(" HAPPY");
			}
		});
		label_84.setBounds(190, 11, 80, 80);
		panel_feel.add(label_84);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings84 = stFeelings.executeQuery("select * from feelings where id = 3");		
			
			if (rsFeelings84.next())
			{
				byte[] img = rsFeelings84.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                happy = newImage;
                label_84.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_85 = new JLabel("");
		label_85.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_85.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(hungry);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(hungry);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(hungry);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(hungry);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(hungry);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(hungry);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(hungry);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(hungry);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(hungry);
			    	sen_label_9_fill = true;
			    }
				setString(" HUNGRY");
			}
		});
		label_85.setBounds(280, 11, 80, 80);
		panel_feel.add(label_85);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings85 = stFeelings.executeQuery("select * from feelings where id = 4");		
			
			if (rsFeelings85.next())
			{
				byte[] img = rsFeelings85.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                hungry = newImage;
                label_85.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_86 = new JLabel("");
		label_86.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_86.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(hurt);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(hurt);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(hurt);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(hurt);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(hurt);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(hurt);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(hurt);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(hurt);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(hurt);
			    	sen_label_9_fill = true;
			    }
				setString(" HURT");
			}
		});
		label_86.setBounds(370, 11, 80, 80);
		panel_feel.add(label_86);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings86 = stFeelings.executeQuery("select * from feelings where id = 5");		
			
			if (rsFeelings86.next())
			{
				byte[] img = rsFeelings86.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                hurt = newImage;
                label_86.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_87 = new JLabel("");
		label_87.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_87.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(like);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(like);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(like);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(like);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(like);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(like);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(like);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(like);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(like);
			    	sen_label_9_fill = true;
			    }
				setString(" LIKE");
			}
		});
		label_87.setBounds(460, 11, 80, 80);
		panel_feel.add(label_87);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings87 = stFeelings.executeQuery("select * from feelings where id = 6");		
			
			if (rsFeelings87.next())
			{
				byte[] img = rsFeelings87.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                like = newImage;
                label_87.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_88 = new JLabel("");
		label_88.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_88.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(love);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(love);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(love);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(love);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(love);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(love);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(love);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(love);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(love);
			    	sen_label_9_fill = true;
			    }
				setString(" LOVE");
			}
		});
		label_88.setBounds(550, 11, 80, 80);
		panel_feel.add(label_88);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings88 = stFeelings.executeQuery("select * from feelings where id = 7");		
			
			if (rsFeelings88.next())
			{
				byte[] img = rsFeelings88.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                love = newImage;
                label_88.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_89 = new JLabel("");
		label_89.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_89.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(pain);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(pain);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(pain);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(pain);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(pain);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(pain);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(pain);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(pain);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(pain);
			    	sen_label_9_fill = true;
			    }
				setString(" PAIN");
			}
		});
		label_89.setBounds(640, 11, 80, 80);
		panel_feel.add(label_89);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings89 = stFeelings.executeQuery("select * from feelings where id = 8");		
			
			if (rsFeelings89.next())
			{
				byte[] img = rsFeelings89.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                pain = newImage;
                label_89.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_90 = new JLabel("");
		label_90.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_90.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(sad);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(sad);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(sad);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(sad);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(sad);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(sad);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(sad);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(sad);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(sad);
			    	sen_label_9_fill = true;
			    }
				setString(" SAD");
			}
		});
		label_90.setBounds(730, 11, 80, 80);
		panel_feel.add(label_90);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings90 = stFeelings.executeQuery("select * from feelings where id = 9");		
			
			if (rsFeelings90.next())
			{
				byte[] img = rsFeelings90.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                sad = newImage;
                label_90.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}

		
		JLabel label_156 = new JLabel("");
		label_156.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_156.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(sleep);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(sleep);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(sleep);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(sleep);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(sleep);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(sleep);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(sleep);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(sleep);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(sleep);
			    	sen_label_9_fill = true;
			    }
				setString(" SLEEP");
			}
		});
		label_156.setBounds(820, 11, 80, 80);
		panel_feel.add(label_156);
		try 
		{
			Connection conFeelings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stFeelings = conFeelings.createStatement();
			ResultSet rsFeelings156 = stFeelings.executeQuery("select * from feelings where id = 10");		
			
			if (rsFeelings156.next())
			{
				byte[] img = rsFeelings156.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                sleep = newImage;
                label_156.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		///////////
		///	panel
		///////////
		panel_body = new JPanel();
		panel_body.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_body, "name_439679347108353");
		panel_body.setLayout(null);
		panel_body.setBackground(new Color(125,86,66));
		
		JLabel body_label = new JLabel("");
		body_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		body_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(arm);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(arm);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(arm);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(arm);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(arm);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(arm);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(arm);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(arm);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(arm);
			    	sen_label_9_fill = true;
			    }
				setString(" ARM");
			}
		});
		body_label.setBounds(10, 11, 80, 80);
		panel_body.add(body_label);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody = stBody.executeQuery("select * from body where id = 1");		
			
			if (rsBody.next())
			{
				byte[] img = rsBody.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                arm = newImage;
                body_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_93 = new JLabel("");
		label_93.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_93.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(body_img);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(body_img);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(body_img);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(body_img);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(body_img);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(body_img);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(body_img);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(body_img);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(body_img);
			    	sen_label_9_fill = true;
			    }
				setString(" BODY");
			}
		});
		label_93.setBounds(100, 11, 80, 80);
		panel_body.add(label_93);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody93 = stBody.executeQuery("select * from body where id = 2");		
			
			if (rsBody93.next())
			{
				byte[] img = rsBody93.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                body_img = newImage;
                label_93.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_94 = new JLabel("");
		label_94.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_94.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(ears);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(ears);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(ears);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(ears);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(ears);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(ears);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(ears);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(ears);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(ears);
			    	sen_label_9_fill = true;
			    }
				setString(" EARS");
			}
		});
		label_94.setBounds(190, 11, 80, 80);
		panel_body.add(label_94);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody94 = stBody.executeQuery("select * from body where id = 3");		
			
			if (rsBody94.next())
			{
				byte[] img = rsBody94.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                ears = newImage;
                label_94.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_95 = new JLabel("");
		label_95.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_95.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(eyes);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(eyes);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(eyes);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(eyes);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(eyes);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(eyes);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(eyes);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(eyes);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(eyes);
			    	sen_label_9_fill = true;
			    }
				setString(" EYES");
			}
		});
		label_95.setBounds(280, 11, 80, 80);
		panel_body.add(label_95);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody95 = stBody.executeQuery("select * from body where id = 4");		
			
			if (rsBody95.next())
			{
				byte[] img = rsBody95.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                eyes= newImage;
                label_95.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_96 = new JLabel("");
		label_96.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_96.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(foot);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(foot);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(foot);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(foot);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(foot);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(foot);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(foot);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(foot);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(foot);
			    	sen_label_9_fill = true;
			    }
				setString(" FOOT");
			}
		});
		label_96.setBounds(370, 11, 80, 80);
		panel_body.add(label_96);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody96 = stBody.executeQuery("select * from body where id = 5");		
			
			if (rsBody96.next())
			{
				byte[] img = rsBody96.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                foot = newImage;
                label_96.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_97 = new JLabel("");
		label_97.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_97.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(hair);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(hair);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(hair);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(hair);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(hair);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(hair);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(hair);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(hair);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(hair);
			    	sen_label_9_fill = true;
			    }
				setString(" HAIR");
			}
		});
		label_97.setBounds(460, 11, 80, 80);
		panel_body.add(label_97);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody97 = stBody.executeQuery("select * from body where id = 6");		
			
			if (rsBody97.next())
			{
				byte[] img = rsBody97.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                hair = newImage;
                label_97.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_98 = new JLabel("");
		label_98.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_98.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(hand);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(hand);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(hand);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(hand);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(hand);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(hand);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(hand);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(hand);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(hand);
			    	sen_label_9_fill = true;
			    }
				setString(" HAND");
			}
		});
		label_98.setBounds(550, 11, 80, 80);
		panel_body.add(label_98);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody98 = stBody.executeQuery("select * from body where id = 7");		
			
			if (rsBody98.next())
			{
				byte[] img = rsBody98.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                hand = newImage;
                label_98.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_99 = new JLabel("");
		label_99.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_99.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(head);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(head);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(head);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(head);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(head);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(head);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(head);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(head);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(head);
			    	sen_label_9_fill = true;
			    }
				setString(" HEAD");
			}
		});
		label_99.setBounds(640, 11, 80, 80);
		panel_body.add(label_99);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody99 = stBody.executeQuery("select * from body where id = 8");		
			
			if (rsBody99.next())
			{
				byte[] img = rsBody99.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                head = newImage;
                label_99.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_100 = new JLabel("");
		label_100.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_100.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(leg);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(leg);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(leg);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(leg);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(leg);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(leg);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(leg);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(leg);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(leg);
			    	sen_label_9_fill = true;
			    }
				setString(" LEG");
			}
		});
		label_100.setBounds(730, 11, 80, 80);
		panel_body.add(label_100);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody100 = stBody.executeQuery("select * from body where id = 9");		
			
			if (rsBody100.next())
			{
				byte[] img = rsBody100.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                leg = newImage;
                label_100.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_101 = new JLabel("");
		label_101.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_101.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(mouth);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(mouth);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(mouth);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(mouth);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(mouth);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(mouth);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(mouth);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(mouth);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(mouth);
			    	sen_label_9_fill = true;
			    }
				setString(" MOUTH");
			}
		});
		label_101.setBounds(820, 11, 80, 80);
		panel_body.add(label_101);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody101 = stBody.executeQuery("select * from body where id = 10");		
			
			if (rsBody101.next())
			{
				byte[] img = rsBody101.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                mouth = newImage;
                label_101.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_102 = new JLabel("");
		label_102.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_102.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(nose);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(nose);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(nose);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(nose);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(nose);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(nose);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(nose);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(nose);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(nose);
			    	sen_label_9_fill = true;
			    }
				setString(" NOSE");
			}
		});
		label_102.setBounds(910, 11, 80, 80);
		panel_body.add(label_102);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody102 = stBody.executeQuery("select * from body where id = 11");		
			
			if (rsBody102.next())
			{
				byte[] img = rsBody102.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                nose = newImage;
                label_102.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_103 = new JLabel("");
		label_103.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_103.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(stomach);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(stomach);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(stomach);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(stomach);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(stomach);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(stomach);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(stomach);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(stomach);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(stomach);
			    	sen_label_9_fill = true;
			    }
				setString(" STOMACH");
			}
		});
		label_103.setBounds(1000, 11, 80, 80);
		panel_body.add(label_103);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody103 = stBody.executeQuery("select * from body where id = 12");		
			
			if (rsBody103.next())
			{
				byte[] img = rsBody103.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                stomach = newImage;
                label_103.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_104 = new JLabel("");
		label_104.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_104.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(tooth);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(tooth);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(tooth);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(tooth);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(tooth);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(tooth);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(tooth);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(tooth);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(tooth);
			    	sen_label_9_fill = true;
			    }
				setString(" TOOTH");
			}
		});
		label_104.setBounds(10, 102, 80, 80);
		panel_body.add(label_104);
		try 
		{
			Connection conBody = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stBody = conBody.createStatement();
			ResultSet rsBody104 = stBody.executeQuery("select * from body where id = 13");		
			
			if (rsBody104.next())
			{
				byte[] img = rsBody104.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                tooth = newImage;
                label_104.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		
		///////////
		///	panel
		///////////
		panel_animal = new JPanel();
		panel_animal.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_animal, "name_439689441426585");
		panel_animal.setLayout(null);
		panel_animal.setBackground(new Color(125,86,66));
		
		JLabel animal_label = new JLabel("");
		animal_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		animal_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(bear);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(bear);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(bear);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(bear);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(bear);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(bear);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(bear);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(bear);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(bear);
			    	sen_label_9_fill = true;
			    }
				setString(" BEAR");
			}
		});
		animal_label.setBounds(10, 11, 80, 80);
		panel_animal.add(animal_label);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal = stAnimal.executeQuery("select * from animals where id = 1");		
			
			if (rsAnimal.next())
			{
				byte[] img = rsAnimal.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                bear = newImage;
                animal_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_106 = new JLabel("");
		label_106.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_106.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(bird);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(bird);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(bird);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(bird);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(bird);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(bird);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(bird);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(bird);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(bird);
			    	sen_label_9_fill = true;
			    }
				setString(" BIRD");
			}
		});
		label_106.setBounds(100, 11, 80, 80);
		panel_animal.add(label_106);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal106 = stAnimal.executeQuery("select * from animals where id = 2");		
			
			if (rsAnimal106.next())
			{
				byte[] img = rsAnimal106.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                bird = newImage;
                label_106.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_107 = new JLabel("");
		label_107.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_107.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(cat);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(cat);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(cat);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(cat);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(cat);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(cat);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(cat);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(cat);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(cat);
			    	sen_label_9_fill = true;
			    }
				setString(" CAT");
			}
		});
		label_107.setBounds(190, 11, 80, 80);
		panel_animal.add(label_107);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal107 = stAnimal.executeQuery("select * from animals where id = 3");		
			
			if (rsAnimal107.next())
			{
				byte[] img = rsAnimal107.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                cat = newImage;
                label_107.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_108 = new JLabel("");
		label_108.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_108.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(chicken);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(chicken);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(chicken);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(chicken);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(chicken);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(chicken);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(chicken);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(chicken);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(chicken);
			    	sen_label_9_fill = true;
			    }
				setString(" CHICKEN");
			}
		});
		label_108.setBounds(280, 11, 80, 80);
		panel_animal.add(label_108);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal108 = stAnimal.executeQuery("select * from animals where id = 4");		
			
			if (rsAnimal108.next())
			{
				byte[] img = rsAnimal108.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                chicken = newImage;
                label_108.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_109 = new JLabel("");
		label_109.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_109.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(cow);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(cow);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(cow);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(cow);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(cow);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(cow);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(cow);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(cow);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(cow);
			    	sen_label_9_fill = true;
			    }
				setString(" COW");
			}
		});
		label_109.setBounds(370, 11, 80, 80);
		panel_animal.add(label_109);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal109 = stAnimal.executeQuery("select * from animals where id = 5");		
			
			if (rsAnimal109.next())
			{
				byte[] img = rsAnimal109.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                cow = newImage;
                label_109.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_110 = new JLabel("");
		label_110.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_110.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(dog);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(dog);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(dog);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(dog);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(dog);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(dog);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(dog);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(dog);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(dog);
			    	sen_label_9_fill = true;
			    }
				setString(" DOG");
			}
		});
		label_110.setBounds(460, 11, 80, 80);
		panel_animal.add(label_110);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal110 = stAnimal.executeQuery("select * from animals where id = 6");		
			
			if (rsAnimal110.next())
			{
				byte[] img = rsAnimal110.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                dog = newImage;
                label_110.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_111 = new JLabel("");
		label_111.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_111.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(dragon);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(dragon);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(dragon);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(dragon);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(dragon);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(dragon);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(dragon);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(dragon);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(dragon);
			    	sen_label_9_fill = true;
			    }
				setString(" DRAGON");
			}
		});
		label_111.setBounds(550, 11, 80, 80);
		panel_animal.add(label_111);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal111 = stAnimal.executeQuery("select * from animals where id = 7");		
			
			if (rsAnimal111.next())
			{
				byte[] img = rsAnimal111.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                dragon = newImage;
                label_111.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_112 = new JLabel("");
		label_112.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_112.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(fish);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(fish);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(fish);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(fish);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(fish);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(fish);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(fish);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(fish);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(fish);
			    	sen_label_9_fill = true;
			    }
				setString(" FISH");
			}
		});
		label_112.setBounds(640, 11, 80, 80);
		panel_animal.add(label_112);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal112 = stAnimal.executeQuery("select * from animals where id = 8");		
			
			if (rsAnimal112.next())
			{
				byte[] img = rsAnimal112.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                fish = newImage;
                label_112.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_113 = new JLabel("");
		label_113.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_113.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(hamster);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(hamster);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(hamster);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(hamster);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(hamster);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(hamster);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(hamster);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(hamster);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(hamster);
			    	sen_label_9_fill = true;
			    }
				setString(" HAMSTER");
			}
		});
		label_113.setBounds(730, 11, 80, 80);
		panel_animal.add(label_113);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal113 = stAnimal.executeQuery("select * from animals where id = 9");		
			
			if (rsAnimal113.next())
			{
				byte[] img = rsAnimal113.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                hamster = newImage;
                label_113.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_114 = new JLabel("");
		label_114.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_114.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(horse);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(horse);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(horse);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(horse);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(horse);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(horse);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(horse);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(horse);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(horse);
			    	sen_label_9_fill = true;
			    }
				setString(" HORSE");
			}
		});
		label_114.setBounds(820, 11, 80, 80);
		panel_animal.add(label_114);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal114 = stAnimal.executeQuery("select * from animals where id = 10");		
			
			if (rsAnimal114.next())
			{
				byte[] img = rsAnimal114.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                horse = newImage;
                label_114.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_115 = new JLabel("");
		label_115.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_115.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(mouse);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(mouse);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(mouse);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(mouse);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(mouse);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(mouse);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(mouse);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(mouse);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(mouse);
			    	sen_label_9_fill = true;
			    }
				setString(" MOUSE");
			}
		});
		label_115.setBounds(910, 11, 80, 80);
		panel_animal.add(label_115);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal115 = stAnimal.executeQuery("select * from animals where id = 11");		
			
			if (rsAnimal115.next())
			{
				byte[] img = rsAnimal115.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                mouse = newImage;
                label_115.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_116 = new JLabel("");
		label_116.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_116.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(parrot);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(parrot);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(parrot);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(parrot);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(parrot);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(parrot);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(parrot);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(parrot);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(parrot);
			    	sen_label_9_fill = true;
			    }
				setString(" PARROT");
			}
		});
		label_116.setBounds(1000, 11, 80, 80);
		panel_animal.add(label_116);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal116 = stAnimal.executeQuery("select * from animals where id = 12");		
			
			if (rsAnimal116.next())
			{
				byte[] img = rsAnimal116.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                parrot = newImage;
                label_116.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_117 = new JLabel("");
		label_117.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_117.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(pig);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(pig);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(pig);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(pig);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(pig);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(pig);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(pig);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(pig);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(pig);
			    	sen_label_9_fill = true;
			    }
				setString(" PIG");
			}
		});
		label_117.setBounds(10, 102, 80, 80);
		panel_animal.add(label_117);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal117 = stAnimal.executeQuery("select * from animals where id = 13");		
			
			if (rsAnimal117.next())
			{
				byte[] img = rsAnimal117.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                pig = newImage;
                label_117.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_118 = new JLabel("");
		label_118.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_118.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(rabbit);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(rabbit);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(rabbit);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(rabbit);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(rabbit);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(rabbit);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(rabbit);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(rabbit);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(rabbit);
			    	sen_label_9_fill = true;
			    }
				setString(" RABBIT");
			}
		});
		label_118.setBounds(100, 102, 80, 80);
		panel_animal.add(label_118);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal118 = stAnimal.executeQuery("select * from animals where id = 14");		
			
			if (rsAnimal118.next())
			{
				byte[] img = rsAnimal118.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                rabbit = newImage;
                label_118.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_119 = new JLabel("");
		label_119.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_119.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(turtle);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(turtle);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(turtle);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(turtle);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(turtle);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(turtle);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(turtle);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(turtle);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(turtle);
			    	sen_label_9_fill = true;
			    }
				setString(" TURTLE");
			}
		});
		label_119.setBounds(190, 102, 80, 80);
		panel_animal.add(label_119);
		try 
		{
			Connection conAnimal = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stAnimal = conAnimal.createStatement();
			ResultSet rsAnimal119 = stAnimal.executeQuery("select * from animals where id = 15");		
			
			if (rsAnimal119.next())
			{
				byte[] img = rsAnimal119.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                turtle = newImage;
                label_119.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		///////////
		///	panel
		///////////
		panel_room = new JPanel();
		panel_room.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_room, "name_439705484845439");
		panel_room.setLayout(null);
		panel_room.setBackground(new Color(125,86,66));
		
		JLabel room_label = new JLabel("");
		room_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		room_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(bathroom);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(bathroom);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(bathroom);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(bathroom);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(bathroom);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(bathroom);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(bathroom);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(bathroom);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(bathroom);
			    	sen_label_9_fill = true;
			    }
				setString(" BATHROOM");
			}
		});
		room_label.setBounds(10, 11, 80, 80);
		panel_room.add(room_label);
		try 
		{
			Connection conRoom = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stRoom = conRoom.createStatement();
			ResultSet rsRoom = stRoom.executeQuery("select * from room where id = 1");		
			
			if (rsRoom.next())
			{
				byte[] img = rsRoom.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                bathroom = newImage;
                room_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_121 = new JLabel("");
		label_121.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_121.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(bedroom);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(bedroom);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(bedroom);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(bedroom);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(bedroom);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(bedroom);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(bedroom);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(bedroom);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(bedroom);
			    	sen_label_9_fill = true;
			    }
				setString(" BEDROOM");
			}
		});
		label_121.setBounds(100, 11, 80, 80);
		panel_room.add(label_121);
		try 
		{
			Connection conRoom = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stRoom = conRoom.createStatement();
			ResultSet rsRoom121 = stRoom.executeQuery("select * from room where id = 2");		
			
			if (rsRoom121.next())
			{
				byte[] img = rsRoom121.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                bedroom = newImage;
                label_121.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_122 = new JLabel("");
		label_122.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_122.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(corridor);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(corridor);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(corridor);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(corridor);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(corridor);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(corridor);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(corridor);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(corridor);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(corridor);
			    	sen_label_9_fill = true;
			    }
				setString(" CORRIDOR");
			}
		});
		label_122.setBounds(190, 11, 80, 80);
		panel_room.add(label_122);
		try 
		{
			Connection conRoom = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stRoom = conRoom.createStatement();
			ResultSet rsRoom122 = stRoom.executeQuery("select * from room where id = 3");		
			
			if (rsRoom122.next())
			{
				byte[] img = rsRoom122.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                corridor = newImage;
                label_122.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_123 = new JLabel("");
		label_123.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_123.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(kitchen);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(kitchen);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(kitchen);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(kitchen);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(kitchen);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(kitchen);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(kitchen);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(kitchen);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(kitchen);
			    	sen_label_9_fill = true;
			    }
				setString(" KITCHEN");
			}
		});
		label_123.setBounds(280, 11, 80, 80);
		panel_room.add(label_123);
		try 
		{
			Connection conRoom = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stRoom = conRoom.createStatement();
			ResultSet rsRoom123 = stRoom.executeQuery("select * from room where id = 4");		
			
			if (rsRoom123.next())
			{
				byte[] img = rsRoom123.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                kitchen = newImage;
                label_123.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_124 = new JLabel("");
		label_124.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_124.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(livingroom);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(livingroom);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(livingroom);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(livingroom);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(livingroom);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(livingroom);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(livingroom);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(livingroom);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(livingroom);
			    	sen_label_9_fill = true;
			    }
				setString(" LIVING ROOM");
			}
		});
		label_124.setBounds(370, 11, 80, 80);
		panel_room.add(label_124);
		try 
		{
			Connection conRoom = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stRoom = conRoom.createStatement();
			ResultSet rsRoom124 = stRoom.executeQuery("select * from room where id = 5");		
			
			if (rsRoom124.next())
			{
				byte[] img = rsRoom124.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                livingroom = newImage;
                label_124.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_125 = new JLabel("");
		label_125.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_125.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(room);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(room);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(room);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(room);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(room);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(room);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(room);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(room);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(room);
			    	sen_label_9_fill = true;
			    }
				setString(" ROOM");
			}
		});
		label_125.setBounds(460, 11, 80, 80);
		panel_room.add(label_125);
		try 
		{
			Connection conRoom = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stRoom = conRoom.createStatement();
			ResultSet rsRoom125 = stRoom.executeQuery("select * from room where id = 6");		
			
			if (rsRoom125.next())
			{
				byte[] img = rsRoom125.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                room = newImage;
                label_125.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		///////////
		///	panel
		///////////
		panel_things = new JPanel();
		panel_things.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		main_panel.add(panel_things, "name_439769759281267");
		panel_things.setLayout(null);
		panel_things.setBackground(new Color(125,86,66));
		
		JLabel things_label = new JLabel("");
		things_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		things_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(ball);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(ball);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(ball);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(ball);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(ball);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(ball);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(ball);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(ball);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(ball);
			    	sen_label_9_fill = true;
			    }
				setString(" BALL");
			}
		});
		things_label.setBounds(10, 11, 80, 80);
		panel_things.add(things_label);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings = stThings.executeQuery("select * from things where id = 1");		
			
			if (rsThings.next())
			{
				byte[] img = rsThings.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                ball = newImage;
                things_label.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_127 = new JLabel("");
		label_127.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_127.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(bed);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(bed);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(bed);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(bed);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(bed);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(bed);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(bed);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(bed);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(bed);
			    	sen_label_9_fill = true;
			    }
				setString(" BED");
			}
		});
		label_127.setBounds(100, 11, 80, 80);
		panel_things.add(label_127);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings127 = stThings.executeQuery("select * from things where id = 2");		
			
			if (rsThings127.next())
			{
				byte[] img = rsThings127.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                bed = newImage;
                label_127.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_128 = new JLabel("");
		label_128.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_128.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(blouse);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(blouse);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(blouse);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(blouse);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(blouse);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(blouse);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(blouse);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(blouse);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(blouse);
			    	sen_label_9_fill = true;
			    }
				setString(" BLOUSE");
			}
		});
		label_128.setBounds(190, 11, 80, 80);
		panel_things.add(label_128);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings128 = stThings.executeQuery("select * from things where id = 3");		
			
			if (rsThings128.next())
			{
				byte[] img = rsThings128.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                blouse = newImage;
                label_128.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_129 = new JLabel("");
		label_129.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_129.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(car);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(car);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(car);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(car);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(car);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(car);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(car);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(car);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(car);
			    	sen_label_9_fill = true;
			    }
				setString(" CAR");
			}
		});
		label_129.setBounds(280, 11, 80, 80);
		panel_things.add(label_129);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings129 = stThings.executeQuery("select * from things where id = 4");		
			
			if (rsThings129.next())
			{
				byte[] img = rsThings129.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                car = newImage;
                label_129.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_130 = new JLabel("");
		label_130.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_130.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(chair);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(chair);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(chair);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(chair);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(chair);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(chair);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(chair);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(chair);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(chair);
			    	sen_label_9_fill = true;
			    }
				setString(" CHAIR");
			}
		});
		label_130.setBounds(370, 11, 80, 80);
		panel_things.add(label_130);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings130 = stThings.executeQuery("select * from things where id = 5");		
			
			if (rsThings130.next())
			{
				byte[] img = rsThings130.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                chair = newImage;
                label_130.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_131 = new JLabel("");
		label_131.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_131.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(desk);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(desk);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(desk);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(desk);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(desk);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(desk);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(desk);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(desk);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(desk);
			    	sen_label_9_fill = true;
			    }
				setString(" DESK");
			}
		});
		label_131.setBounds(460, 11, 80, 80);
		panel_things.add(label_131);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings131 = stThings.executeQuery("select * from things where id = 6");		
			
			if (rsThings131.next())
			{
				byte[] img = rsThings131.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                desk = newImage;
                label_131.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_132 = new JLabel("");
		label_132.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_132.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(doll);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(doll);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(doll);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(doll);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(doll);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(doll);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(doll);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(doll);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(doll);
			    	sen_label_9_fill = true;
			    }
				setString(" DOLL");
			}
		});
		label_132.setBounds(550, 11, 80, 80);
		panel_things.add(label_132);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings132 = stThings.executeQuery("select * from things where id = 7");		
			
			if (rsThings132.next())
			{
				byte[] img = rsThings132.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                doll = newImage;
                label_132.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_133 = new JLabel("");
		label_133.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_133.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(dorr);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(dorr);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(dorr);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(dorr);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(dorr);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(dorr);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(dorr);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(dorr);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(dorr);
			    	sen_label_9_fill = true;
			    }
				setString(" DOOR");
			}
		});
		label_133.setBounds(640, 11, 80, 80);
		panel_things.add(label_133);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings133 = stThings.executeQuery("select * from things where id = 21");		
			
			if (rsThings133.next())
			{
				byte[] img = rsThings133.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                dorr = newImage;
                label_133.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_134 = new JLabel("");
		label_134.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_134.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(glasses);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(glasses);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(glasses);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(glasses);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(glasses);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(glasses);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(glasses);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(glasses);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(glasses);
			    	sen_label_9_fill = true;
			    }
				setString(" GLASSES");
			}
		});
		label_134.setBounds(730, 11, 80, 80);
		panel_things.add(label_134);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings134 = stThings.executeQuery("select * from things where id = 8");		
			
			if (rsThings134.next())
			{
				byte[] img = rsThings134.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                glasses = newImage;
                label_134.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_135 = new JLabel("");
		label_135.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_135.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(hat);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(hat);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(hat);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(hat);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(hat);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(hat);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(hat);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(hat);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(hat);
			    	sen_label_9_fill = true;
			    }
				setString(" HAT");
			}
		});
		label_135.setBounds(820, 11, 80, 80);
		panel_things.add(label_135);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings135 = stThings.executeQuery("select * from things where id = 9");		
			
			if (rsThings135.next())
			{
				byte[] img = rsThings135.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                hat = newImage;
                label_135.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_136 = new JLabel("");
		label_136.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_136.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(jacket);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(jacket);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(jacket);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(jacket);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(jacket);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(jacket);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(jacket);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(jacket);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(jacket);
			    	sen_label_9_fill = true;
			    }
				setString(" JACKET");
			}
		});
		label_136.setBounds(910, 11, 80, 80);
		panel_things.add(label_136);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings136 = stThings.executeQuery("select * from things where id = 10");		
			
			if (rsThings136.next())
			{
				byte[] img = rsThings136.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                jacket = newImage;
                label_136.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_137 = new JLabel("");
		label_137.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_137.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(pen);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(pen);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(pen);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(pen);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(pen);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(pen);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(pen);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(pen);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(pen);
			    	sen_label_9_fill = true;
			    }
				setString(" PEN");
			}
		});
		label_137.setBounds(1000, 11, 80, 80);
		panel_things.add(label_137);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings137 = stThings.executeQuery("select * from things where id = 11");		
			
			if (rsThings137.next())
			{
				byte[] img = rsThings137.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                pen = newImage;
                label_137.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_138 = new JLabel("");
		label_138.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_138.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(plane);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(plane);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(plane);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(plane);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(plane);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(plane);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(plane);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(plane);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(plane);
			    	sen_label_9_fill = true;
			    }
				setString(" PLANE");
			}
		});
		label_138.setBounds(10, 102, 80, 80);
		panel_things.add(label_138);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings138 = stThings.executeQuery("select * from things where id = 12");		
			
			if (rsThings138.next())
			{
				byte[] img = rsThings138.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                plane = newImage;
                label_138.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_139 = new JLabel("");
		label_139.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_139.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(shoes);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(shoes);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(shoes);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(shoes);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(shoes);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(shoes);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(shoes);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(shoes);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(shoes);
			    	sen_label_9_fill = true;
			    }
				setString(" SHOES");
			}
		});
		label_139.setBounds(100, 102, 80, 80);
		panel_things.add(label_139);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings139 = stThings.executeQuery("select * from things where id = 13");		
			
			if (rsThings139.next())
			{
				byte[] img = rsThings139.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                shoes = newImage;
                label_139.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_140 = new JLabel("");
		label_140.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_140.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(sofa);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(sofa);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(sofa);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(sofa);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(sofa);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(sofa);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(sofa);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(sofa);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(sofa);
			    	sen_label_9_fill = true;
			    }
				setString(" SOFA");
			}
		});
		label_140.setBounds(190, 102, 80, 80);
		panel_things.add(label_140);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings140 = stThings.executeQuery("select * from things where id = 14");		
			
			if (rsThings140.next())
			{
				byte[] img = rsThings140.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                sofa = newImage;
                label_140.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_141 = new JLabel("");
		label_141.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_141.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(table);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(table);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(table);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(table);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(table);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(table);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(table);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(table);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(table);
			    	sen_label_9_fill = true;
			    }
				setString(" TABLE");
			}
		});
		label_141.setBounds(280, 102, 80, 80);
		panel_things.add(label_141);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings141 = stThings.executeQuery("select * from things where id = 15");		
			
			if (rsThings141.next())
			{
				byte[] img = rsThings141.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                table = newImage;
                label_141.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_142 = new JLabel("");
		label_142.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_142.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(teddybear);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(teddybear);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(teddybear);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(teddybear);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(teddybear);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(teddybear);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(teddybear);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(teddybear);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(teddybear);
			    	sen_label_9_fill = true;
			    }
				setString(" TEDDYBEAR");
			}
		});
		label_142.setBounds(370, 102, 80, 80);
		panel_things.add(label_142);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings142 = stThings.executeQuery("select * from things where id = 16");		
			
			if (rsThings142.next())
			{
				byte[] img = rsThings142.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                teddybear = newImage;
                label_142.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_24 = new JLabel("");
		label_24.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(toy);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(toy);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(toy);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(toy);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(toy);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(toy);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(toy);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(toy);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(toy);
			    	sen_label_9_fill = true;
			    }
				setString(" TOY");
			}
		});
		label_24.setBounds(460, 102, 80, 80);
		panel_things.add(label_24);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings24 = stThings.executeQuery("select * from things where id = 17");		
			
			if (rsThings24.next())
			{
				byte[] img = rsThings24.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                toy = newImage;
                label_24.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_25 = new JLabel("");
		label_25.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(trousers);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(trousers);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(trousers);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(trousers);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(trousers);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(trousers);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(trousers);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(trousers);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(trousers);
			    	sen_label_9_fill = true;
			    }
				setString(" TROUSERS");
			}
		});
		label_25.setBounds(550, 102, 80, 80);
		panel_things.add(label_25);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings25 = stThings.executeQuery("select * from things where id = 18");		
			
			if (rsThings25.next())
			{
				byte[] img = rsThings25.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                label_25.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_26 = new JLabel("");
		label_26.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(tshirt);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(tshirt);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(tshirt);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(tshirt);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(tshirt);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(tshirt);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(tshirt);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(tshirt);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(tshirt);
			    	sen_label_9_fill = true;
			    }
				setString(" T-SHIRT");
			}
		});
		label_26.setBounds(640, 102, 80, 80);
		panel_things.add(label_26);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings26 = stThings.executeQuery("select * from things where id = 19");		
			
			if (rsThings26.next())
			{
				byte[] img = rsThings26.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                tshirt = newImage;
                label_26.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_48 = new JLabel("");
		label_48.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_48.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(wardrobe);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(wardrobe);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(wardrobe);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(wardrobe);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(wardrobe);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(wardrobe);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(wardrobe);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(wardrobe);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(wardrobe);
			    	sen_label_9_fill = true;
			    }
				setString(" WARDROBE");
			}
		});
		label_48.setBounds(730, 102, 80, 80);
		panel_things.add(label_48);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings48 = stThings.executeQuery("select * from things where id = 20");		
			
			if (rsThings48.next())
			{
				byte[] img = rsThings48.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                wardrobe = newImage;
                label_48.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_67 = new JLabel("");
		label_67.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_67.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(clock);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(clock);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(clock);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(clock);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(clock);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(clock);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(clock);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(clock);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(clock);
			    	sen_label_9_fill = true;
			    }
				setString(" CLOCK");
			}
		});
		label_67.setBounds(820, 102, 80, 80);
		panel_things.add(label_67);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings67 = stThings.executeQuery("select * from things where id = 22");		
			
			if (rsThings67.next())
			{
				byte[] img = rsThings67.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                clock = newImage;
                label_67.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_82 = new JLabel("");
		label_82.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_82.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(computer);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(computer);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(computer);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(computer);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(computer);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(computer);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(computer);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(computer);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(computer);
			    	sen_label_9_fill = true;
			    }
				setString(" COMPUTER");
			}
		});
		label_82.setBounds(910, 102, 80, 80);
		panel_things.add(label_82);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings82 = stThings.executeQuery("select * from things where id = 23");		
			
			if (rsThings82.next())
			{
				byte[] img = rsThings82.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                computer = newImage;
                label_82.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_91 = new JLabel("");
		label_91.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_91.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(lamp);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(lamp);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(lamp);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(lamp);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(lamp);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(lamp);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(lamp);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(lamp);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(lamp);
			    	sen_label_9_fill = true;
			    }
				setString(" LAMP");
			}
		});
		label_91.setBounds(1000, 102, 80, 80);
		panel_things.add(label_91);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings91 = stThings.executeQuery("select * from things where id = 24");		
			
			if (rsThings91.next())
			{
				byte[] img = rsThings91.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                lamp = newImage;
                label_91.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_92 = new JLabel("");
		label_92.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_92.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(laptop);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(laptop);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(laptop);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(laptop);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(laptop);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(laptop);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(laptop);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(laptop);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(laptop);
			    	sen_label_9_fill = true;
			    }
				setString(" LAPTOP");
			}
		});
		label_92.setBounds(10, 193, 80, 80);
		panel_things.add(label_92);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings92 = stThings.executeQuery("select * from things where id = 25");		
			
			if (rsThings92.next())
			{
				byte[] img = rsThings92.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                laptop = newImage;
                label_92.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_105 = new JLabel("");
		label_105.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_105.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(light);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(light);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(light);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(light);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(light);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(light);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(light);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(light);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(light);
			    	sen_label_9_fill = true;
			    }
				setString(" LIGHT");
			}
		});
		label_105.setBounds(100, 193, 80, 80);
		panel_things.add(label_105);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings105 = stThings.executeQuery("select * from things where id = 26");		
			
			if (rsThings105.next())
			{
				byte[] img = rsThings105.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                light = newImage;
                label_105.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_120 = new JLabel("");
		label_120.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_120.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(radio);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(radio);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(radio);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(radio);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(radio);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(radio);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(radio);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(radio);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(radio);
			    	sen_label_9_fill = true;
			    }
				setString(" RADIO");
			}
		});
		label_120.setBounds(190, 193, 80, 80);
		panel_things.add(label_120);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings120 = stThings.executeQuery("select * from things where id = 27");		
			
			if (rsThings120.next())
			{
				byte[] img = rsThings120.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                radio = newImage;
                label_120.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_126 = new JLabel("");
		label_126.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_126.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(remotectrl);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(remotectrl);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(remotectrl);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(remotectrl);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(remotectrl);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(remotectrl);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(remotectrl);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(remotectrl);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(remotectrl);
			    	sen_label_9_fill = true;
			    }
				setString(" REMOTE CONTROL");
			}
		});
		label_126.setBounds(280, 193, 80, 80);
		panel_things.add(label_126);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings126 = stThings.executeQuery("select * from things where id = 28");		
			
			if (rsThings126.next())
			{
				byte[] img = rsThings126.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                remotectrl = newImage;
                label_126.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_151 = new JLabel("");
		label_151.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_151.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(tablet);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(tablet);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(tablet);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(tablet);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(tablet);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(tablet);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(tablet);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(tablet);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(tablet);
			    	sen_label_9_fill = true;
			    }
				setString(" TABLET");
			}
		});
		label_151.setBounds(370, 193, 80, 80);
		panel_things.add(label_151);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings151 = stThings.executeQuery("select * from things where id = 29");		
			
			if (rsThings151.next())
			{
				byte[] img = rsThings151.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                tablet = newImage;
                label_151.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_152 = new JLabel("");
		label_152.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_152.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(telephone);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(telephone);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(telephone);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(telephone);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(telephone);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(telephone);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(telephone);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(telephone);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(telephone);
			    	sen_label_9_fill = true;
			    }
				setString(" TELEPHONE");
			}
		});
		label_152.setBounds(460, 193, 80, 80);
		panel_things.add(label_152);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings152 = stThings.executeQuery("select * from things where id = 30");		
			
			if (rsThings152.next())
			{
				byte[] img = rsThings152.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                telephone = newImage;
                label_152.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
		
		JLabel label_153 = new JLabel("");
		label_153.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_153.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sen_label_1_fill == false) {
			    	Sentence_label.setIcon(tv);				    	
			    	sen_label_1_fill = true;
			    }
			    else if (sen_label_2_fill == false) {
			    	Sentence_label_1.setIcon(tv);
			    	sen_label_2_fill = true;
			    }
			    else if (sen_label_3_fill == false) {
			    	Sentence_label_2.setIcon(tv);				    	
			    	sen_label_3_fill = true;
			    }
			    else if (sen_label_4_fill == false) {
			    	Sentence_label_3.setIcon(tv);
			    	sen_label_4_fill = true;
			    }
			    else if (sen_label_5_fill == false) {
			    	Sentence_label_4.setIcon(tv);				    	
			    	sen_label_5_fill = true;
			    }
			    else if (sen_label_6_fill == false) {
			    	Sentence_label_5.setIcon(tv);
			    	sen_label_6_fill = true;
			    }
			    else if (sen_label_7_fill == false) {
			    	Sentence_label_6.setIcon(tv);				    	
			    	sen_label_7_fill = true;
			    }
			    else if (sen_label_8_fill == false) {
			    	Sentence_label_7.setIcon(tv);
			    	sen_label_8_fill = true;
			    }
			    else if (sen_label_9_fill == false) {
			    	Sentence_label_8.setIcon(tv);
			    	sen_label_9_fill = true;
			    }
				setString(" TV");
			}
		});
		label_153.setBounds(550, 193, 80, 80);
		panel_things.add(label_153);
		try 
		{
			Connection conThings = DriverManager.getConnection("jdbc:mysql://localhost/projekt_inzynierski","root","");
			Statement stThings = conThings.createStatement();
			ResultSet rsThings153 = stThings.executeQuery("select * from things where id = 31");		
			
			if (rsThings153.next())
			{
				byte[] img = rsThings153.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                tv = newImage;
                label_153.setIcon(newImage); 
			}
			else 
				JOptionPane.showMessageDialog(null, "No data");
		} 
		catch (Exception excep) 
		{
			excep.printStackTrace();
		}
				
		show_sentence_panel = new JPanel();
		show_sentence_panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		show_sentence_panel.setBounds(10, 553, 882, 105);
		contentPane.add(show_sentence_panel);
		show_sentence_panel.setLayout(null);
		show_sentence_panel.setBackground(new Color(125,86,66));	//color brown
		
		Sentence_label = new JLabel("");
		Sentence_label.setBounds(25, 11, 83, 83);
		show_sentence_panel.add(Sentence_label);
		
		Sentence_label_1 = new JLabel("");
		Sentence_label_1.setBounds(118, 11, 83, 83);
		show_sentence_panel.add(Sentence_label_1);
		
		Sentence_label_2 = new JLabel("");
		Sentence_label_2.setBounds(211, 11, 83, 83);
		show_sentence_panel.add(Sentence_label_2);
		
		Sentence_label_3 = new JLabel("");
		Sentence_label_3.setBounds(304, 11, 83, 83);
		show_sentence_panel.add(Sentence_label_3);
		
		Sentence_label_4 = new JLabel("");
		Sentence_label_4.setBounds(397, 11, 83, 83);
		show_sentence_panel.add(Sentence_label_4);
		
		Sentence_label_5 = new JLabel("");
		Sentence_label_5.setBounds(490, 11, 83, 83);
		show_sentence_panel.add(Sentence_label_5);
		
		Sentence_label_6 = new JLabel("");
		Sentence_label_6.setBounds(583, 11, 83, 83);
		show_sentence_panel.add(Sentence_label_6);
		
		Sentence_label_7 = new JLabel("");
		Sentence_label_7.setBounds(676, 11, 83, 83);
		show_sentence_panel.add(Sentence_label_7);
		
		Sentence_label_8 = new JLabel("");
		Sentence_label_8.setBounds(769, 11, 83, 83);
		show_sentence_panel.add(Sentence_label_8);
		
		JButton pupup_button = new JButton("");
		pupup_button.setMnemonic(KeyEvent.VK_NUMPAD5);
		pupup_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pupup_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (menuclass == null)
				{
					menuclass = new MenuClass(PictogramWindow.this);
				}
				menuclass.setVisible(true);
				
				
				if (menuclass.setClear())
				{
					Sentence_label.setIcon(null);
					Sentence_label_1.setIcon(null);
					Sentence_label_2.setIcon(null);
					Sentence_label_3.setIcon(null);
					Sentence_label_4.setIcon(null);
					Sentence_label_5.setIcon(null);
					Sentence_label_6.setIcon(null);
					Sentence_label_7.setIcon(null);
					Sentence_label_8.setIcon(null);
					
					sen_label_1_fill = false;
					sen_label_2_fill = false;
					sen_label_3_fill = false;
					sen_label_4_fill = false;
					sen_label_5_fill = false;
					sen_label_6_fill = false;
					sen_label_7_fill = false;
					sen_label_8_fill = false;
					sen_label_9_fill = false;
					
					string = " ";
					textArea.setText(null);
				}
				
				if (menuclass.setDark())
				{
					contentPane.setBackground(darkest);	
					
					buttons_panel.setBackground(brown_0);
					show_sentence_panel.setBackground(brown_0);
					
					panel_main.setBackground(brown_0);
					panel_verbs.setBackground(brown_0);
					panel_people.setBackground(brown_0);
					panel_adjective.setBackground(brown_0);
					panel_prep.setBackground(brown_0);
					panel_feel.setBackground(brown_0);
					panel_body.setBackground(brown_0);
					panel_animal.setBackground(brown_0);
					panel_room.setBackground(brown_0);
					panel_things.setBackground(brown_0);
					main_panel.setBackground(brown_0);
					
					button_verb.setBackground(lightgray);
					button_person.setBackground(lightgray);
					button_adj.setBackground(lightgray);
					button_prepositions.setBackground(lightgray);
					button_feelings.setBackground(lightgray);
					button_body.setBackground(lightgray);
					button_animal.setBackground(lightgray);
					button_rooms.setBackground(lightgray);
					button_things.setBackground(lightgray);
					button_main.setBackground(lightgray);
					
					textArea.setBackground(lightgray);
					textArea.setForeground(darkest);
				}
				else if(menuclass.setIce())
				{
					contentPane.setBackground(blue_0);	
					
					buttons_panel.setBackground(ice);
					show_sentence_panel.setBackground(ice);
					
					panel_main.setBackground(warmgray_0);
					panel_verbs.setBackground(warmgray_0);
					panel_people.setBackground(warmgray_0);
					panel_adjective.setBackground(warmgray_0);
					panel_prep.setBackground(warmgray_0);
					panel_feel.setBackground(warmgray_0);
					panel_body.setBackground(warmgray_0);
					panel_animal.setBackground(warmgray_0);
					panel_room.setBackground(warmgray_0);
					panel_things.setBackground(warmgray_0);
					main_panel.setBackground(warmgray_0);
					
					button_verb.setBackground(lightice);
					button_person.setBackground(lightice);
					button_adj.setBackground(lightice);
					button_prepositions.setBackground(lightice);
					button_feelings.setBackground(lightice);
					button_body.setBackground(lightice);
					button_animal.setBackground(lightice);
					button_rooms.setBackground(lightice);
					button_things.setBackground(lightice);
					button_main.setBackground(lightice);
					
					textArea.setBackground(lightice);
					textArea.setForeground(blue_0);
				}
				else if(menuclass.setWarm())
				{
					contentPane.setBackground(woodgray);	
					
					buttons_panel.setBackground(orange_0);
					show_sentence_panel.setBackground(yellow_0);
					
					panel_main.setBackground(orange_0);
					panel_verbs.setBackground(orange_0);
					panel_people.setBackground(orange_0);
					panel_adjective.setBackground(orange_0);
					panel_prep.setBackground(orange_0);
					panel_feel.setBackground(orange_0);
					panel_body.setBackground(orange_0);
					panel_animal.setBackground(orange_0);
					panel_room.setBackground(orange_0);
					panel_things.setBackground(orange_0);
					main_panel.setBackground(orange_0);
					
					button_verb.setBackground(pink_0);
					button_person.setBackground(pink_0);
					button_adj.setBackground(pink_0);
					button_prepositions.setBackground(pink_0);
					button_feelings.setBackground(pink_0);
					button_body.setBackground(pink_0);
					button_animal.setBackground(pink_0);
					button_rooms.setBackground(pink_0);
					button_things.setBackground(pink_0);
					button_main.setBackground(pink_0);
					
					textArea.setBackground(pink_0);
					textArea.setForeground(yellow_0);
				}
				
				if (menuclass.openWindowEN() || menuclass.openWindowPL())
				{
					dispose();
				}
				
			}
		});
		pupup_button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pupup_button.setIcon(new ImageIcon("img\\Menu.png"));
		pupup_button.setBounds(955, 553, 105, 105);
		pupup_button.setBackground(new Color(243,235,221));
		pupup_button.setFocusable(false);
		contentPane.add(pupup_button);
		
		textArea = new JTextArea();
		textArea.setDropMode(DropMode.INSERT);
		textArea.setFont(new Font("Rockwell", Font.PLAIN, 24));
		textArea.setBounds(10, 695, 1090, 50);
		textArea.setBackground(new Color(243,235,221));
		textArea.setForeground(new Color(42, 41, 34));
		textArea.setFont(textArea.getFont().deriveFont(32f));
		contentPane.add(textArea);
	}
	
	private void setString(String s)
	{
		string += s;
		textArea.setText(string);
	}
}