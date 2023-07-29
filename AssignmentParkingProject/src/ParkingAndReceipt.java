
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ParkingAndReceipt {
	public static void main(String[] args) {
		Parking parking = new Parking();
		parking.setVisible(true);
	}
}

interface p1 extends ActionListener {

}

class P2 extends Exception {

}

class Parking extends JFrame implements ActionListener {

	JFrame parkingFrame = new JFrame();
	Label label1 = new Label("Enter Vehicle Type");
	JTextField data = new JTextField(20);

	Label label2 = new Label("Enter Vehicle Number");
	JTextField filename = new JTextField(20);

	Label label3 = new Label("Charges Paid :");
	final ButtonGroup group = new ButtonGroup();

	JCheckBox checkBox1 = new JCheckBox("Yes");
	JCheckBox checkBox2 = new JCheckBox("No");

	JRadioButton rb1 = new JRadioButton("Yes");

	JRadioButton rb2 = new JRadioButton("No");

	JButton ok = new JButton("ENTRY");

	JButton clear = new JButton("Clear");
	boolean ans;

	Parking() {

		parkingFrame.getContentPane().setBackground(new Color(154, 205, 50));
		parkingFrame.setBounds(100, 100, 809, 464);
		parkingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		parkingFrame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(85, 107, 47));
		panel.setBounds(10, 11, 773, 65);
		parkingFrame.getContentPane().add(panel);
		panel.setLayout(null);

//		setLocation(100, 100);

		setLayout(new FlowLayout());

//	 	
		label1.setLocation(20, 50);
		label1.setBounds(100, 100, 100, 100);

		add(label1);
		filename.setBounds(150, 100, 100, 100);
		add(filename);
		String str = filename.getText();
		label2.setLocation(20, 80);
		label2.setBounds(100, 150, 100, 100);
		add(label2);
		data.setBounds(150, 150, 100, 100);
		add(data);
		String str2 = data.getText();
		label3.setBounds(100, 150, 100, 100);
		add(label3);
		add(rb1);

		add(rb2);
		group.add(rb1);
		group.add(rb2);

		ok.setBounds(75, 400, 220, 40);
//		ok.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		ok.setBounds(644, 220, 119, 43);
		ok.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		ok.setBackground(new Color(128, 128, 128));
		add(ok);
		clear.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		clear.setBounds(644, 220, 119, 43);
		clear.setFont(new Font("Myanmar Text", Font.ITALIC, 18));
		add(clear);
		//
		clear.setLocation(100, 40);
		filename.setToolTipText("Enter Vehicle Type...");
		data.setToolTipText("Enter data for the file here");
		ok.setToolTipText("It saves the file");
		clear.setToolTipText("It would clear the frame....");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ok.addActionListener(this);
		clear.addActionListener(this); // this means the actionPerformed is in this class
		parkingFrame.setSize(700, 700);
	}

	private String vehicleType;
	private String vehicleNumber;
	private boolean chargesPaid;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType() {
		this.vehicleType = filename.getText();

	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber() {
		this.vehicleNumber = data.getText();
	}

	public boolean isChargesPaid() {
		return chargesPaid;
	}

	public void setChargesPaid(boolean ans) {
		this.chargesPaid = ans;
	}

//
//
	public void welcome() {
		System.out.println("Welcome to parking of grand mall...");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ok) {
			System.out.println("SAVING THE FILE...");
			try {
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
				Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
				String sqlQuery = "insert into PARKING values(?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sqlQuery);
				pst.setString(1, filename.getText());
				pst.setString(2, data.getText());
				String hint = data.getText();

				if (rb1.isSelected()) {

					ans = true;
					pst.setBoolean(3, ans);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(this, "Data is SAVED");
//					MyReceipt myReceiptObj=new MyReceipt();
					MyReceipt.MyReceiptShow(hint);
				} else if (rb2.isSelected()) {
					JOptionPane.showMessageDialog(this, "Please Pay Charges to Avail the Parking Facility.");
				}

			} catch (SQLException e1) {
				System.out.println("Error : " + e1.getMessage());
				JOptionPane.showMessageDialog(this, e1.getMessage());
			}

		} else if (e.getSource() == clear) {
			data.setText("");
			filename.setText("");

		}

	}
}

class MyReceipt extends JFrame implements ActionListener {
	static JFrame receiptFrame = new JFrame();
	static Label label1 = new Label("Your Vehicle : ");
	
	static JTextField data1 = new JTextField(20);
	static JFrame parkingFrame = new JFrame();
	static JTextField data2 = new JTextField(20);
	static Label label2 = new Label("Enter Vehicle Type");
	
	
	static void MyReceiptShow(String hint){
		
		
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
			Statement statement = conn.createStatement();
			String sqlQuery = "Select  * from Parking where VEHICLE_NO=" + hint;
			ResultSet result1 = statement.executeQuery("Select * from PARKING where VEHICLE_NO='" + hint + "'");
			while (result1.next()) {
				data1.setText(result1.getString(1));
				data2.setText(result1.getString(2));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label1.setBounds(100, 100, 100, 100);
		receiptFrame.add(label1);
		data1.setBounds(150, 100, 100, 100);
		receiptFrame.add(data1);
		label2.setBounds(100, 150, 100, 100);
		receiptFrame.add(label2);
		data2.setBounds(150, 150, 100, 100);
		receiptFrame.add(data2);
     
		receiptFrame.setVisible(true);
	}
	



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}