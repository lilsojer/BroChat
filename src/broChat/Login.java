package broChat;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtIPAddress;
	private JLabel lblIpAddress;
	private JLabel lblPort;
	private JTextField txtPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(64, 55, 165, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(124, 30, 46, 14);
		contentPane.add(lblName);
		
		txtIPAddress = new JTextField();
		txtIPAddress.setBounds(64, 125, 165, 20);
		contentPane.add(txtIPAddress);
		txtIPAddress.setColumns(10);
		
		lblIpAddress = new JLabel("IP Address:");
		lblIpAddress.setBounds(115, 100, 63, 14);
		contentPane.add(lblIpAddress);
		
		lblPort = new JLabel("Port:");
		lblPort.setBounds(132, 170, 29, 14);
		contentPane.add(lblPort);
		
		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(64, 195, 165, 20);
		contentPane.add(txtPort);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
				String address = txtIPAddress.getText();
				int port = Integer.parseInt(txtPort.getText());
				login(name, address, port);
				
			}

		});
		btnLogin.setBounds(102, 255, 89, 23);
		contentPane.add(btnLogin);
	}
	
	private void login(String name, String address, int port) {
		// Login code. Close window and print the input
		dispose();
		new ClientWindow(name, address, port);
		
		
	}
}
