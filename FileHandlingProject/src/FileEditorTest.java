import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileEditorTest {
	public static void main(String[] args) {
		MyNotepad notepad = new MyNotepad();
		notepad.setVisible(true);
	}
}

class MyNotepad extends JFrame implements ActionListener
{
//	frame = new JFrame();
	Label label1 = new Label("Enter filename");
	JTextArea data = new JTextArea(5,25);
	
	
	Label label2 = new Label("Enter data");

	
	
	JTextField filename = new JTextField(20);
	JButton ok = new JButton("SAVE");
	
	JButton clear = new JButton("Clear");
	
	MyNotepad() {
		
		setSize(500,500);
		setLocation(100,100);
//	setLayout(null);
		setLayout(new FlowLayout());
//     	setLayout(new FlowLayout());
//		label1.setLocation(10,20);
		add(label1); 
		add(filename);
//		label2.setLocation(20, 50);
		label2.setBounds(100,100,100,100);
		add(label2);
		data.setBounds(150,100,100,100);
		add(data);
		
//		ok.setBounds(75, 400, 220, 40);
		ok.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		ok.setBounds(644, 220, 119, 43);
		ok.setFont(new Font("Myanmar Text", Font.ITALIC, 18));
		ok.setBackground(new Color(128, 128, 128));
		add(ok);
		clear.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		clear.setBounds(644, 220, 119, 43);
		clear.setFont(new Font("Myanmar Text", Font.ITALIC, 18));
		add(clear);
//		
		clear.setLocation(100,40);
		filename.setToolTipText("Enter valid filename here...");
		data.setToolTipText("Enter data for the file here");
		ok.setToolTipText("It saves the file");
		clear.setToolTipText("It would clear the frame....");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ok.addActionListener(this);
		clear.addActionListener(this); //this means the actionPerformed is in this class
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==ok) {
			System.out.println("SAVING THE FILE...");
			try {
				FileWriter out = new FileWriter(filename.getText());
				out.write(data.getText());
				out.close();
				JOptionPane.showMessageDialog(this, "File is SAVED");
							
			} catch (IOException e1) {
				System.out.println("Error : "+e1.getMessage());
				JOptionPane.showMessageDialog(this, e1.getMessage());
			}
			
		}
		else {
			System.out.println("CLEARING THE FRAME");
			data.setText("");
			filename.setText("");
		}
	}
}