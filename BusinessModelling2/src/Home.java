import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

import javax.swing.*;

public class Home extends JFrame {
	
ArrayList<items> items = new ArrayList<>();
private ListIterator<items> listIterator;
private int size;
public Home(){
	super("Home");
	JFrame frame = this;
	setTitle("Home");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JMenuBar menuBar= new JMenuBar();
	frame.setJMenuBar(menuBar);
	JButton addItems=new JButton("Add Items");
	JButton viewItems=new JButton("View Items");
	menuBar.add(addItems);
	menuBar.add(viewItems);
	
	JPanel panel= new JPanel();
	JPanel panel2= new JPanel();
	JPanel panel3= new JPanel();
	JPanel panel4=new JPanel();
	JPanel panel5=new JPanel();
	JPanel panel6=new JPanel();
	JPanel panel7 = new JPanel();
	JPanel panel8=new JPanel();
	JPanel panel9 = new JPanel();
	JPanel panel10 = new JPanel();
	
	addItems.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        String text = JOptionPane.showInputDialog((Component) e.getSource(), "Item Name?");
	        String text2 = JOptionPane.showInputDialog((Component) e.getSource(), "Item Type?");
	        String text3 = JOptionPane.showInputDialog((Component) e.getSource(), "Expiration Date?");


	        if (text != null && !text.equals("")) {
	          JOptionPane.showMessageDialog((Component) e.getSource(), "Hello "+ "" + text + "" + "has been added " +"" + "Expiry Date" + text3 + "Item Type" + text2);
	          items i = null;
	          String itemName = text;
	          String itemType = text2;
	          String expiryDate = text3;
	          Random rand = new Random();
	          int random=rand.nextInt(100000);
	          int random1=rand.nextInt(10);
	          i = new items(itemName , itemType , expiryDate, random, random1);
	          items.add(i);
	        
	          System.out.print(items);
	          System.out.println(text);
	          System.out.println(text2);
	          System.out.println(text3);
	          System.out.println(random);


	        }
	      }
	    });
	
	viewItems.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 	panel.setVisible(true);
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(true);
			 panel.setPreferredSize(new Dimension(100,100));
				panel.setLayout(new FlowLayout());
				frame.getContentPane().add(panel, BorderLayout.NORTH);
				
				panel2.setPreferredSize(new Dimension(100,100));
				panel2.setLayout(new FlowLayout());
				frame.getContentPane().add(panel2, BorderLayout.CENTER);
				
				panel3.setPreferredSize(new Dimension(100,100));
				panel3.setLayout(new FlowLayout());
				frame.getContentPane().add(panel3, BorderLayout.SOUTH);
				
				JTextArea area = new JTextArea();
				area.setEditable(false);
				area.setVisible(true);
				panel3.add(area);
				
				JLabel label= new JLabel("Item Name");
				JLabel label2= new JLabel("Item Type");
				JLabel label3= new JLabel("Expiry Date");
				JLabel label4= new JLabel("Unique ID");
				
				JTextField txt = new JTextField();
				txt.setPreferredSize( new Dimension( 200, 24 ) ); 
				JTextField txt2 = new JTextField();
				txt2.setPreferredSize( new Dimension( 200, 24 ) ); 
				JTextField txt3 = new JTextField();
				txt3.setPreferredSize( new Dimension( 200, 24 )); 
				JTextField txt4 = new JTextField();
				txt4.setPreferredSize( new Dimension( 200, 24 ) );
				
				JButton button = new JButton("First");
				JButton button2 = new JButton("Next");
				JButton button3 = new JButton("Previous");
				JButton button4 = new JButton("Last");
				JButton button7 = new JButton("Delete");
				
				panel.add(label);
				panel.add(txt);
				panel.add(label2);
				panel.add(txt2);
				panel.add(label3);
				panel.add(txt3);
				panel.add(label4);
				panel.add(txt4);
				panel2.add(button);
				panel2.add(button2);
				panel2.add(button3);
				panel2.add(button4);
				panel2.add(button7);
				for(items i:items) {
				area.append("The items name is: " + i.getItemName() + ". Type: " + i.getItemType() +
						". Expiry date: " + i.getExpiryDate() + ". ID is: " + i.getRandom() + "\n");
				}
				
				button.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						e.getSource();
						size=items.size();
						listIterator=items.listIterator();
						items i;
						i=listIterator.next();
						txt.setText(i.getItemName());
						txt2.setText(i.getItemType());
						txt3.setText(i.getExpiryDate());
						//txt4.setText(i.getRandom());
					}
					});
				
				button2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						e.getSource();
						if(listIterator.hasNext()){
							items i;
							i=listIterator.next();
							txt.setText(i.getItemName());
							txt2.setText(i.getItemType());
							txt3.setText(i.getExpiryDate());
							//txt4.setText(i.getRandom());
						}
						else {
							JOptionPane.showMessageDialog(null, "You have reached the last item");
						}
					}
				});
				
				button3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						e.getSource();
						if(listIterator.hasPrevious()){
							items i;
							i=listIterator.next();
							txt.setText(i.getItemName());
							txt2.setText(i.getItemType());
							txt3.setText(i.getExpiryDate());
							//txt4.setText(i.getRandom());
						}
						else {
							JOptionPane.showMessageDialog(null, "You have reached the first customer");
						}
					}
				});
				
				button4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						e.getSource();
						size=items.size();
						listIterator=items.listIterator(items.size());
						if(listIterator.hasPrevious()){
							items i;
							i=listIterator.next();
							txt.setText(i.getItemName());
							txt2.setText(i.getItemType());
							txt3.setText(i.getExpiryDate());
							//txt4.setText(i.getRandom());
						}
					}
				});
				
				button7.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						e.getSource();
						String itemName=txt.getText();
						 String itemType=txt2.getText();
						 String expiryDate=txt3.getText();
						 String dob=txt4.getText();
						 for(items i:items) {
							 if(itemName.equals(i.getItemName())) {
						items.remove(i);
						listIterator=items.listIterator();
						txt.setText("");
						 txt2.setText("");
						 txt3.setText("");
						 txt4.setText("");
						JOptionPane.showMessageDialog(null, "Customer Deleted.");
						break;
							 }
					}
			}
					});
	}
	});
}


public static void main(String[] args){
	Home act= new Home();
	act.pack();
	act.setVisible(true);
}
}