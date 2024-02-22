import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class regestration {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regestration window = new regestration();
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
	public regestration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Regestration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(137, 11, 201, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(16, 54, 88, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("branch");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(16, 92, 69, 43);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(16, 146, 81, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("programming language");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(16, 181, 217, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(128, 255, 128));
		textArea.setBounds(104, 59, 136, 22);
		frame.getContentPane().add(textArea);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("male");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(96, 147, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(104, 106, 89, 22);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("female");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox_1.setBounds(212, 147, 126, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("java");
		chckbxNewCheckBox_2.setBounds(243, 186, 47, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("c");
		chckbxNewCheckBox_3.setBounds(298, 186, 40, 23);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("python");
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_4.setBounds(349, 184, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_4);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(171, 227, 116, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
