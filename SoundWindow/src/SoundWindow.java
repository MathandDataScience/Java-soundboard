import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;

public class SoundWindow extends JFrame
{

	//creates a jpanel in the JFrame that will contain all the other JPanels
	private JPanel contentPane;
	//creates a Jpanel in the Animal tab where the different animal button sound boards will show up
	private JPanel buttonPanel;
	//creates a menu item for the menu bar for each animal sound board
	private JMenuItem chickenItem;
	private JMenuItem cowItem;
	private JMenuItem horseItem;
	private JMenuItem zebraItem;	
	private JMenuItem rhinoItem;
	private JMenuItem elephantItem;
	//creates a tab for the animal sounds
	private JPanel animalPanel;
	//creates sound board panels for each animal
	private JPanel chickenButtonPanel;
	private JPanel cowButtonPanel;
	private JPanel horseButtonPanel;
	private JPanel zebraButtonPanel;
	private JPanel rhinoButtonPanel;
	private JPanel elephantButtonPanel;
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					SoundWindow frame = new SoundWindow();
					frame.setSize(752, 620);
					frame.setResizable(false);
					frame.setVisible(true);
					frame.setFocusable(true);
					frame.setFocusTraversalKeysEnabled(false);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	//an actionlistener class for the menu items in the menubar
		public class MenuListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				/*
				 * if the chicken menu item is selected, it'll remove whatever existing panels are in button panel 
				 * and update the GUI so that it reflects the removal (instead of being left in the background). Then
				 * it'll add the chicken sound board (which is in the chicken button panel).
				 */
				if(chickenItem.isArmed())
				{
					buttonPanel.removeAll();
					buttonPanel.updateUI();
					buttonPanel.add(chickenButtonPanel);
				}
				
				/*
				 * if the cow menu item is selected, it'll remove whatever existing panels are in button panel 
				 * and update the GUI so that it reflects the removal (instead of being left in the background). Then
				 * it'll add the cow sound board (which is in the cow button panel).
				 */
				else if(cowItem.isArmed())
				{
					buttonPanel.removeAll();
					buttonPanel.updateUI();
					buttonPanel.add(cowButtonPanel);
				}
				
				//Basically, will bring up the horse sound board when the horse menu button is selected in the menu bar
				else if(horseItem.isArmed())
				{
					buttonPanel.removeAll();
					buttonPanel.updateUI();
					buttonPanel.add(horseButtonPanel);
				}
				
				//Basically, will bring up the zebra sound board when the zebra menu button is selected in the menu bar
				else if(zebraItem.isArmed())
				{
					buttonPanel.removeAll();
					buttonPanel.updateUI();
					buttonPanel.add(zebraButtonPanel);
				}
				
				//Basically, will bring up the rhino sound board when the rhino menu button is selected in the menu bar
				else if(rhinoItem.isArmed())
				{
					buttonPanel.removeAll();
					buttonPanel.updateUI();
					buttonPanel.add(rhinoButtonPanel);
				}
				
				//Basically, will bring up the elephant sound board when the elephant menu button is selected in the menu bar
				else if(elephantItem.isArmed())
				{
					buttonPanel.removeAll();
					buttonPanel.updateUI();
					buttonPanel.add(elephantButtonPanel);
				}
			}


		}


	
	
	
	/**
	 * Create the frame.
	 */
	public SoundWindow()
	{
		 //if the cross out button is pressed, closes window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //set size of frame
		setBounds(100, 100, 752, 635);
		//creates main jpanel in the frame/window
		contentPane = new JPanel();
		//sets border of jpanel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//sets the layout manager to borderlayout 
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		//creates a jpanel with tabs
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		//add keyaction to frame
		addKeyListener(new KeyAction());
	
		//creates the animal tab
		JPanel animalPanel = new JPanel();
		//creates beveled border for animal panel/tab
		animalPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//adds title and animal panel/ tab to tabbed panel
		tabbedPane.addTab("Animals", null, animalPanel, null);
		//changes layout manager to borderlayout
		animalPanel.setLayout(new BorderLayout(0, 0));
//		
		//creates a panel to hold the menubar
		JPanel menuBarPanel = new JPanel();
		//changes border
		menuBarPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		animalPanel.add(menuBarPanel, BorderLayout.NORTH);
		//changes layout to border
		menuBarPanel.setLayout(new BorderLayout(0, 0));

		//creates a menubar and adds it to menubarpanel
		JMenuBar menuBar = new JMenuBar();
		menuBarPanel.add(menuBar, BorderLayout.NORTH);
		
		// creates a menu, category, sets its size, and places it into the menubar
		JMenu categoryMenu = new JMenu("Select a Category");
		categoryMenu.setPreferredSize(new Dimension(420, 20));
		menuBar.add(categoryMenu);
		
		//creates and adds a two submenus under category menu in the menubar 
		JMenu farmAnimalMenu = new JMenu("Farm Animals");
		categoryMenu.add(farmAnimalMenu);
		JMenu safariAnimalMenu = new JMenu("Safari Animals");
		categoryMenu.add(safariAnimalMenu);
		
		//creates an instance of the menulistener
		MenuListener ml = new MenuListener();
		/*
	      creates a menu item for each type of animal listed under the appropriate 
	      animal submenu in the category menu in the menu bar
	     */
		chickenItem = new JMenuItem("Chicken");
		chickenItem.addActionListener(ml);
		farmAnimalMenu.add(chickenItem);
		cowItem = new JMenuItem("Cow");
		cowItem.addActionListener(ml);
		farmAnimalMenu.add(cowItem);
		horseItem = new JMenuItem("Horse");
		horseItem.addActionListener(ml);
		farmAnimalMenu.add(horseItem);
		
		zebraItem = new JMenuItem("Zebra");
		zebraItem.addActionListener(ml);
		safariAnimalMenu.add(zebraItem);
		rhinoItem = new JMenuItem("Rhino");
		rhinoItem.addActionListener(ml);
		safariAnimalMenu.add(rhinoItem);
		elephantItem = new JMenuItem("Elephant");
		elephantItem.addActionListener(ml);
		safariAnimalMenu.add(elephantItem);
		
		//creates jpanel that will hold each of different animal sound boards
		buttonPanel = new JPanel();
		
		//adds buttonpanel to the animal panel
		animalPanel.add(buttonPanel, BorderLayout.CENTER);
		
		
		//Sound Board with buttons for each of the animals in the animals tab
		/*Note, it does the same thing for each of the animal panels(chicken, cow, horse, zebra, rhino, elephant)
	       just with different names*/

		
		//Sound board for chicken menu item
		chickenButtonPanel = new JPanel();
		chickenButtonPanel.setForeground(new Color(255, 102, 0));
		
		//adjusts aesthetics of panel, including the border
		TitledBorder buttonBorder = new TitledBorder(new LineBorder(new Color(255, 153, 0), 3, true), "Farm Animals - Chicken", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 102, 0));
		buttonBorder.setTitleFont(new Font("Tekton Pro Ext", Font.BOLD, 25));
		chickenButtonPanel.setBorder(buttonBorder);
		
		//creates and adjusts aesthetics of chicken button and adds it to the panel and adds buttonlistener so it plays sound
		JButton chickenButton = new JButton("Chickens");
		chickenButton.setForeground(Color.BLACK);
		chickenButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		chickenButton.setBackground(new Color(255, 102, 0));
		chickenButton.addActionListener(new ButtonListener());
		chickenButtonPanel.add(chickenButton);
		
		//creates and adjusts aesthetics of another button and adds it to the panel and adds a buttonlistener so it plays sound
		JButton chickButton = new JButton("Chicks");
		chickButton.setForeground(Color.BLACK);
		chickButton.setBackground(new Color(255, 102, 0));
		chickButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		chickButton.addActionListener(new ButtonListener());
		chickenButtonPanel.add(chickButton);
		
		//creates and adjusts aesthetics of another button and adds it to the panel and adds a buttonlistener so it plays sound
		JButton roosterButton = new JButton("Rooster");
		roosterButton.setForeground(Color.BLACK);
		roosterButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		roosterButton.setBackground(new Color(255, 102, 0));
		roosterButton.addActionListener(new ButtonListener());
		chickenButtonPanel.add(roosterButton);
		
		//sound board for cow menu item
		cowButtonPanel = new JPanel();
		cowButtonPanel.setForeground(new Color(255, 102, 0));
		
		//adjusts aesthetics of panel, including the border
		TitledBorder cowButtonBorder = new TitledBorder(new LineBorder(new Color(51, 51, 0), 3, true), "Farm Animals - Cow", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(51, 51, 0));
		cowButtonBorder.setTitleFont(new Font("Tekton Pro Ext", Font.BOLD, 25));
		cowButtonPanel.setBorder(cowButtonBorder);
		
		//creates and adjusts aesthetics of cow button and adds it to the paneland adds button listener so it plays sound
		JButton cow1Button = new JButton("Cow 1");
		cow1Button.setForeground(Color.BLACK);
		cow1Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		cow1Button.setBackground(new Color(51, 51, 0));
		cow1Button.addActionListener(new ButtonListener());
		cowButtonPanel.add(cow1Button);
		
		//creates and adjusts aesthetics of another button and adds it to the panel and adds a buttonlistener so it plays sound
		JButton cow2Button = new JButton("Cow 2");
		cow2Button.setForeground(Color.BLACK);
		cow2Button.setBackground(new Color(51, 51, 0));
		cow2Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		cow2Button.addActionListener(new ButtonListener());
		cowButtonPanel.add(cow2Button);
		
		//creates and adjusts aesthetics of another button and adds it to the panel and adds a buttonlistener so it plays sound
		JButton cow3Button = new JButton("Cow 3");
		cow3Button.setForeground(Color.BLACK);
		cow3Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		cow3Button.setBackground(new Color(51, 51, 0));
		cow3Button.addActionListener(new ButtonListener());
		cowButtonPanel.add(cow3Button);
		
		//sound board for horse menu item
		horseButtonPanel = new JPanel();
		horseButtonPanel.setForeground(new Color(255, 102, 0));
		
		TitledBorder horseButtonBorder = new TitledBorder(new LineBorder(new Color(102, 51, 0), 3, true), "Farm Animals - Horse", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(102, 51, 0));
		horseButtonBorder.setTitleFont(new Font("Tekton Pro Ext", Font.BOLD, 25));
		horseButtonPanel.setBorder(horseButtonBorder);
		
		
		JButton neighButton = new JButton("Neigh");
		neighButton.setForeground(Color.BLACK);
		neighButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		neighButton.setBackground(new Color(102, 51, 0));
		neighButton.addActionListener(new ButtonListener());
		horseButtonPanel.add(neighButton);
		
		JButton sputterButton = new JButton("Sputter");
		sputterButton.setForeground(Color.BLACK);
		sputterButton.setBackground(new Color(102, 51, 0));
		sputterButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		sputterButton.addActionListener(new ButtonListener());
		horseButtonPanel.add(sputterButton);
		
		JButton angryButton = new JButton("Angry");
		angryButton.setForeground(Color.BLACK);
		angryButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		angryButton.setBackground(new Color(102, 51, 0));
		angryButton.addActionListener(new ButtonListener());
		horseButtonPanel.add(angryButton);
		
		//sound board for zebra menu item
		zebraButtonPanel = new JPanel();
		zebraButtonPanel.setForeground(new Color(255, 102, 0));
		
		TitledBorder zebraButtonBorder = new TitledBorder(new LineBorder(new Color(255, 0, 0), 3, true), "Safari Animals - Zebra", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 0, 0));
		zebraButtonBorder.setTitleFont(new Font("Tekton Pro Ext", Font.BOLD, 25));
		zebraButtonPanel.setBorder(zebraButtonBorder);
		
		
		JButton zebra1Button = new JButton("Zebra 1");
		zebra1Button.setForeground(Color.BLACK);
		zebra1Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		zebra1Button.setBackground(new Color(255, 0, 0));
		zebra1Button.addActionListener(new ButtonListener());
		zebraButtonPanel.add(zebra1Button);
		
		JButton zebra2Button = new JButton("Zebra 2");
		zebra2Button.setForeground(Color.BLACK);
		zebra2Button.setBackground(new Color(255, 0, 0));
		zebra2Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		zebra2Button.addActionListener(new ButtonListener());
		zebraButtonPanel.add(zebra2Button);
		
		JButton zebra3Button = new JButton("Zebra 3");
		zebra3Button.setForeground(Color.BLACK);
		zebra3Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		zebra3Button.setBackground(new Color(255, 0, 0));
		zebra3Button.addActionListener(new ButtonListener());
		zebraButtonPanel.add(zebra3Button);
		
		//sound board for rhino menu item
		
		rhinoButtonPanel = new JPanel();
		rhinoButtonPanel.setForeground(new Color(255, 102, 0));
		
		TitledBorder rhinoButtonBorder = new TitledBorder(new LineBorder(new Color(51, 204, 204), 3, true), "Safari Animals - Rhino", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(51, 204, 204));
		rhinoButtonBorder.setTitleFont(new Font("Tekton Pro Ext", Font.BOLD, 25));
		rhinoButtonPanel.setBorder(rhinoButtonBorder);
		
		
		JButton rhino1Button = new JButton("Rhino 1");
		rhino1Button.setForeground(Color.BLACK);
		rhino1Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		rhino1Button.setBackground(new Color(51, 204, 204));
		rhino1Button.addActionListener(new ButtonListener());
		rhinoButtonPanel.add(rhino1Button);
		
		JButton rhino2Button = new JButton("Rhino 2");
		rhino2Button.setForeground(Color.BLACK);
		rhino2Button.setBackground(new Color(51, 204, 204));
		rhino2Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		rhino2Button.addActionListener(new ButtonListener());
		rhinoButtonPanel.add(rhino2Button);
		
		JButton rhino3Button = new JButton("Rhino 3");
		rhino3Button.setForeground(Color.BLACK);
		rhino3Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		rhino3Button.setBackground(new Color(51, 204, 204));
		rhino3Button.addActionListener(new ButtonListener());
		rhinoButtonPanel.add(rhino3Button);
		
		//sound board for elephant menu item
		elephantButtonPanel = new JPanel();
		elephantButtonPanel.setForeground(new Color(255, 102, 0));
		
		TitledBorder elephantButtonBorder = new TitledBorder(new LineBorder(new Color(102, 0, 153), 3, true), "Safari Animals - Elephant", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(102, 0, 153));
		elephantButtonBorder.setTitleFont(new Font("Tekton Pro Ext", Font.BOLD, 25));
		elephantButtonPanel.setBorder(elephantButtonBorder);
		
		JButton elephant1Button = new JButton("Elephant 1");
		elephant1Button.setForeground(Color.BLACK);
		elephant1Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		elephant1Button.setBackground(new Color(102, 0, 153));
		elephant1Button.addActionListener(new ButtonListener());
		elephantButtonPanel.add(elephant1Button);
		
		JButton elephant2Button = new JButton("Elephant 2");
		elephant2Button.setForeground(Color.BLACK);
		elephant2Button.setBackground(new Color(102, 0, 153));
		elephant2Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		elephant2Button.addActionListener(new ButtonListener());
		elephantButtonPanel.add(elephant2Button);
		
		JButton elephant3Button = new JButton("Elephant 3");
		elephant3Button.setForeground(Color.BLACK);
		elephant3Button.setFont(new Font("Tekton Pro Ext", Font.BOLD, 20));
		elephant3Button.setBackground(new Color(102, 0, 153));
		elephant3Button.addActionListener(new ButtonListener());
		elephantButtonPanel.add(elephant3Button);
		
		
		//adds keyaction to the frame and focuses to the frame
        addKeyListener(new KeyAction());
		
		
		ImagePanel dj = new ImagePanel(new ImageIcon("DJbackground.png").getImage());
		//JPanel dj = new JPanel();
		tabbedPane.add("DJ mixer", dj);
		dj.setLayout(null);
		
		//these create new jbuttons w/ customized appearances; this is the same for the next several dj buttons
		JButton btnHorn = new JButton("1. Air Horn");
		btnHorn.setForeground(Color.WHITE);
		btnHorn.setBounds(34, 61, 195, 70);
		dj.add(btnHorn);
		//these three functions set to false make the buttons transparent
		btnHorn.setOpaque(false);
		btnHorn.setContentAreaFilled(false);
		btnHorn.setBorderPainted(false);
		//when button is clicked, it'll make a sound
		btnHorn.addActionListener(new ButtonListener());
		//when the corresponding keyboard key is pressed, it activates the corresponding button
		btnHorn.addKeyListener(new KeyAction());
		
		
		JButton btnNewButton_1 = new JButton("2. Goes like this");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(264, 61, 195, 70);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		dj.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ButtonListener());
		btnNewButton_1.addKeyListener(new KeyAction());
		
		JButton btnNewButton_2 = new JButton("3. Bass");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBounds(493, 61, 195, 70);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		dj.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ButtonListener());
		btnNewButton_2.addKeyListener(new KeyAction());
		
						
		JButton btnNewButton_3 = new JButton("4. Kick");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBounds(34, 157, 195, 70);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		dj.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ButtonListener());
		btnNewButton_3.addKeyListener(new KeyAction());
		
		JButton btnNewButton_4 = new JButton("5. Tom");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBounds(264, 157, 195, 70);
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		dj.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ButtonListener());
		btnNewButton_4.addKeyListener(new KeyAction());
		
		JButton btnNewButton_5 = new JButton("6. Cymbal");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBounds(493, 157, 195, 70);
		btnNewButton_5.setOpaque(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		dj.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ButtonListener());
		btnNewButton_5.addKeyListener(new KeyAction());
		
		JButton btnNewButton_6 = new JButton("7. Snare");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBounds(34, 252, 195, 70);
		btnNewButton_6.setOpaque(false);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorderPainted(false);
		dj.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ButtonListener());
		btnNewButton_6.addKeyListener(new KeyAction());
		
		JButton btnNewButton_7 = new JButton("8. Clap");
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBounds(264, 252, 195, 70);
		btnNewButton_7.setOpaque(false);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setBorderPainted(false);
		dj.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ButtonListener());
		btnNewButton_7.addKeyListener(new KeyAction());
		
		JButton btnNewButton_8 = new JButton("9. Bass Drop");
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBounds(493, 252, 195, 70);
		btnNewButton_8.setOpaque(false);
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setBorderPainted(false);
		dj.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ButtonListener());
		btnNewButton_8.addKeyListener(new KeyAction());
		
		//a jlabel for the dj panel w// customization
		JLabel lblDjMixer = new JLabel("DJ Mixer");
		lblDjMixer.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblDjMixer.setForeground(Color.WHITE);
		lblDjMixer.setBounds(44, 6, 141, 32);
		dj.add(lblDjMixer);
		
		
						
		//creates a scroll panel for the voice tab
		JScrollPane voice  = new JScrollPane();
		voice.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		voice.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tabbedPane.addTab("Voice", null, voice , null);
						
		JPanel panel = new JPanel();
		voice.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		//creates greeting panel
		ImagePanel panel_1 = new ImagePanel(new ImageIcon("greeting.png").getImage());
		//JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 702, 208);
		panel.add(panel_1);
		
		//creates border for greeting panel
		TitledBorder greetings = new TitledBorder(UIManager.getBorder("TitledBorder.aquaVariant"), "Greetings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0));
		panel_1.setBorder(greetings);
		
				panel_1.setLayout(new GridLayout(2, 2, 0, 0));
				
				//creates the buttons for the voice panel, adds the sound, and customzies them
				JRadioButton rdbtnSound = new JRadioButton("Hello");
				rdbtnSound.setFont(new Font("Lucida Grande", Font.PLAIN, 15));;
				panel_1.add(rdbtnSound);
				rdbtnSound.addActionListener(new ButtonListener());
				rdbtnSound.setOpaque(false);
				
				JRadioButton rdbtnNewRadioButton = new JRadioButton("Yo");
				rdbtnNewRadioButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));;
				panel_1.add(rdbtnNewRadioButton);
				rdbtnNewRadioButton.addActionListener(new ButtonListener());
				rdbtnNewRadioButton.setOpaque(false);
				
				JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("What's up doc");
				rdbtnNewRadioButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_1.add(rdbtnNewRadioButton_1);
				rdbtnNewRadioButton_1.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_1.setOpaque(false);
				
				JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Goodbye");
				rdbtnNewRadioButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_1.add(rdbtnNewRadioButton_2);
				rdbtnNewRadioButton_2.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_2.setOpaque(false);
				
				
				//groups the radiobuttons into groups so only one can be selected at a time
				ButtonGroup Gr = new ButtonGroup();
				Gr.add(rdbtnNewRadioButton_1);
				Gr.add(rdbtnNewRadioButton_2);
				Gr.add(rdbtnNewRadioButton);
				Gr.add(rdbtnSound);
				
		
		//creates question panel in voice panel		
		ImagePanel panel_2 = new ImagePanel(new ImageIcon("questions.png").getImage());		
		//JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		//customizes border of question panel
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.aquaVariant"), "Questions/Misc.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
				
			//creates radiobuttons, customizes them, and allows them to play sound with the actionlistener; same for other radio buttons
				JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Is Mayo?");
				rdbtnNewRadioButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_2.add(rdbtnNewRadioButton_4);
				rdbtnNewRadioButton_4.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_4.setOpaque(false);
			
				JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Patrick Star 2");
				rdbtnNewRadioButton_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_2.add(rdbtnNewRadioButton_5);
				rdbtnNewRadioButton_5.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_5.setOpaque(false);
				
				JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Patrick Star 1");
				rdbtnNewRadioButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_2.add(rdbtnNewRadioButton_3);
				rdbtnNewRadioButton_3.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_3.setOpaque(false);
				
				JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("What are you doing?");
				rdbtnNewRadioButton_6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_2.add(rdbtnNewRadioButton_6);
				rdbtnNewRadioButton_6.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_6.setOpaque(false);
				
				//groups all the radiobuttons for the question category together
				ButtonGroup QM = new ButtonGroup();
				QM.add(rdbtnNewRadioButton_6);
				QM.add(rdbtnNewRadioButton_3);
				QM.add(rdbtnNewRadioButton_5);
				QM.add(rdbtnNewRadioButton_4);
		
		//creates an image jpanel so the insult category has an image background
		ImagePanel panel_3 = new ImagePanel(new ImageIcon("batmanrobin.png").getImage());
		//JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.aquaVariant"), "Insults", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setLayout(new GridLayout(2, 2, 0, 0));
				
				//creates radiobuttons, customizes them, and adds an actionlisetener so they can play sound; some for other radio buttons
				JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("I fart in your direction");
				rdbtnNewRadioButton_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_3.add(rdbtnNewRadioButton_7);
				rdbtnNewRadioButton_7.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_7.setOpaque(false);
								
				JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Idiot");
				rdbtnNewRadioButton_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_3.add(rdbtnNewRadioButton_8);
				rdbtnNewRadioButton_8.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_8.setOpaque(false);
				
				JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Mr.french");
				rdbtnNewRadioButton_9.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_3.add(rdbtnNewRadioButton_9);
				rdbtnNewRadioButton_9.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_9.setOpaque(false);
								
				JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("You \"insults\"");
				rdbtnNewRadioButton_10.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				panel_3.add(rdbtnNewRadioButton_10);
				rdbtnNewRadioButton_10.addActionListener(new ButtonListener());
				rdbtnNewRadioButton_10.setOpaque(false);
				
				//groups the radio buttons for the insult panel
				ButtonGroup insults = new ButtonGroup();
				insults.add(rdbtnNewRadioButton_10);
				insults.add(rdbtnNewRadioButton_9);
				insults.add(rdbtnNewRadioButton_8);
				insults.add(rdbtnNewRadioButton_7);
		
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
	}
	
	//class that creates an image panel, a jpanel that allows one to set an image as a background
	class ImagePanel extends JPanel 
	{

		  private Image img;
		  
		  //gets the image
		  public ImagePanel(String img) 
		  {
		    this(new ImageIcon(img).getImage());
		  }
		  
		  //sets the image 
		  public ImagePanel(Image img) 
		  {
		    this.img = img;
		    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		    setPreferredSize(size);
		    setMinimumSize(size);
		    setMaximumSize(size);
		    setSize(size);
		    setLayout(null);
		  }

		  //draws the image as background
		  public void paintComponent(Graphics g) 
		  {
			
		    g.drawImage(img, 0, 0, null);
		   
		    
		  }

		}
}
