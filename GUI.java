package abc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JFileChooser;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class GUI {

	private JFrame frame;
	private Barcode barcode_1;
	private JTextField textField;
	private JLabel lblNewLabel;
	
	String s;
	Barcode barcode;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField jTextField_path;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1201, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(385, 542, 340, 58);
		frame.getContentPane().add(panel);
		
		
		textField  = new JTextField();
		textField.setBounds(211, 418, 160, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Save & Generate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  s = textField.getText();
				  try {
					  frame.revalidate();
					  frame.repaint();
					  barcode = BarcodeFactory.createCode128B(s);
					} catch (BarcodeException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					panel.add(barcode);
			}
		});
		btnNewButton.setBounds(484, 660, 160, 37);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		
		lblNewLabel = new JLabel("Vehicle Registration No:");
		lblNewLabel.setBounds(34, 425, 133, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name of Registerd Owner:");
		lblNewLabel_1.setBounds(34, 63, 167, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(211, 56, 160, 37);
		frame.getContentPane().add(textField_1);
		
		JLabel lblAgeOfPerson = new JLabel("Age of Person:");
		lblAgeOfPerson.setBounds(34, 111, 86, 22);
		frame.getContentPane().add(lblAgeOfPerson);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(211, 104, 160, 37);
		frame.getContentPane().add(textField_2);
		
		JLabel lblPermenantAddress = new JLabel("Permenant Address:");
		lblPermenantAddress.setBounds(34, 162, 103, 22);
		frame.getContentPane().add(lblPermenantAddress);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(211, 152, 160, 37);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(211, 200, 160, 37);
		frame.getContentPane().add(textField_4);
		
		JLabel lblOfficalAddress = new JLabel("Pan Number:");
		lblOfficalAddress.setBounds(34, 211, 103, 22);
		frame.getContentPane().add(lblOfficalAddress);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(211, 248, 160, 37);
		frame.getContentPane().add(textField_5);
		
		JLabel lblDob = new JLabel("Date Of Birth:");
		lblDob.setBounds(34, 259, 103, 22);
		frame.getContentPane().add(lblDob);
		
		JLabel lblTypeOfVehicke = new JLabel("Type of Vehicle");
		lblTypeOfVehicke.setBounds(34, 339, 103, 22);
		frame.getContentPane().add(lblTypeOfVehicke);
		
		JRadioButton rdbtnMotorcycle = new JRadioButton("Motorcycle(Geared)");
		rdbtnMotorcycle.setBounds(211, 339, 133, 23);
		frame.getContentPane().add(rdbtnMotorcycle);
		
		JRadioButton rdbtnWheeler = new JRadioButton("4 Wheeler");
		rdbtnWheeler.setBounds(513, 339, 109, 23);
		frame.getContentPane().add(rdbtnWheeler);
		
		JRadioButton rdbtnMotorcyclenonGeared = new JRadioButton("Motorcycle(Non - Geared)");
		rdbtnMotorcyclenonGeared.setBounds(346, 339, 157, 23);
		frame.getContentPane().add(rdbtnMotorcyclenonGeared);
		
		JLabel lblAadharNumber = new JLabel("Aadhar Number:");
		lblAadharNumber.setBounds(513, 63, 86, 22);
		frame.getContentPane().add(lblAadharNumber);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(608, 56, 160, 37);
		frame.getContentPane().add(textField_6);
		
		String str;
		
		jTextField_path = new JTextField();
		jTextField_path.setBounds(530, 163, 318, 20);
		frame.getContentPane().add(jTextField_path);
		jTextField_path.setColumns(10);
		
		JButton btnAttachImage = new JButton("Attach Image");
		btnAttachImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				//str=filename;
				jTextField_path.setText(filename);
			}
		});
		btnAttachImage.setBounds(896, 162, 133, 23);
		frame.getContentPane().add(btnAttachImage);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(530, 208, 318, 20);
		frame.getContentPane().add(textField_7);
		
		JButton btnDocuments = new JButton("Documents");
		btnDocuments.setBounds(896, 207, 133, 23);
		frame.getContentPane().add(btnDocuments);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(530, 256, 318, 20);
		frame.getContentPane().add(textField_8);
		
		JButton btnProof = new JButton("Proof");
		btnProof.setBounds(896, 255, 133, 23);
		frame.getContentPane().add(btnProof);
		
		
      
		

		
		
		
	}
}
