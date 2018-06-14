package donderdag;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuessNumber {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessNumber window = new GuessNumber();
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
	public GuessNumber() {
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
		
		JLabel lblGuessMyNumber = new JLabel("GUESS MY NUMBER [1-10]");
		lblGuessMyNumber.setBounds(154, 10, 175, 23);
		frame.getContentPane().add(lblGuessMyNumber);
		
		textField = new JTextField();
		textField.setBounds(164, 45, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

				Random generator = new Random();
				int RandomInt;
				try {
					int UserNumber = Integer.parseInt(textField.getText());
					RandomInt = generator.nextInt(10);
					if(UserNumber < RandomInt) {
						textField_1.setText("LOW! try again");
					}else if(UserNumber > RandomInt) {
						textField_1.setText("HIGH Number! Try AGain!");
					}else if(UserNumber == RandomInt) {
						textField_1.setText("Good Job, you picked the number I was thinking of!");
					}else { 
						textField_1.setText("default");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					textField_1.setText("Hacking attempt!");
				}
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(161, 76, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblResult = new JLabel("result");
		lblResult.setBounds(12, 131, 70, 15);
		frame.getContentPane().add(lblResult);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(71, 129, 345, 90);
		frame.getContentPane().add(textField_1);
	}
}
