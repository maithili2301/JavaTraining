import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class homepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setBounds(100, 100, 809, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(85, 107, 47));
		panel.setBounds(10, 11, 773, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		btnNewButton.setBounds(27, 11, 97, 28);
		panel.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign In");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				useradminClass ua1=new useradminClass();
//      			ua1.UserAdminScreen();
			}
		});
		btnSignUp.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		btnSignUp.setBounds(505, 11, 118, 43);
		panel.add(btnSignUp);
		
		JButton btnSignUp_1 = new JButton("Sign Up");
		btnSignUp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				signuppage su2=new signuppage();
//				su2.SignUpPage();
			}
		});
		btnSignUp_1.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		btnSignUp_1.setBounds(644, 11, 119, 43);
		panel.add(btnSignUp_1);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome to Online Exam ");
		lblNewLabel_3.setForeground(new Color(250, 250, 210));
		lblNewLabel_3.setFont(new Font("Palatino Linotype", Font.BOLD, 52));
		lblNewLabel_3.setBounds(26, 175, 646, 90);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("System");
		lblNewLabel_4.setFont(new Font("Palatino Linotype", Font.BOLD, 52));
		lblNewLabel_4.setForeground(new Color(250, 250, 210));
		lblNewLabel_4.setBounds(242, 251, 238, 65);
		frame.getContentPane().add(lblNewLabel_4);
	}
}