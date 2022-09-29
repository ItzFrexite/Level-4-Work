package com.walsallcollege.expressatm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

public class GUI extends JFrame implements ActionListener {

	private ExpressATM expressATM;
	private JTextArea txtAccountNum;
	private JPasswordField txtPinCode;
	private JSpinner spnWithdrawalAmount;

	public GUI() {
		expressATM = new ExpressATM();
		
		//Create JLabel for the account num
		JLabel lblAccountNum = new JLabel("Account No.");
		lblAccountNum.setSize(150, 30);
		lblAccountNum.setFont(new Font("Arial", Font.BOLD, 25));
		lblAccountNum.setLocation(new Point(20, 20));
		
		//Create JTextArea for the account num
		txtAccountNum = new JTextArea();
		Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
		txtAccountNum.setBorder(border);
		txtAccountNum.setSize(120, 30);
		txtAccountNum.setFont(new Font("Arial", Font.BOLD, 25));
		txtAccountNum.setLocation(new Point(185, 20));
		
		//Create JLabel for the pin code
		JLabel lblPinCode = new JLabel("Pin Code");
		lblPinCode.setSize(150, 30);
		lblPinCode.setFont(new Font("Arial", Font.BOLD, 25));
		lblPinCode.setLocation(new Point(20, 65));
		
		//Create JPasswordField for the pin code
		txtPinCode = new JPasswordField();
		txtPinCode.setSize(120, 30);
		txtPinCode.setFont(new Font("Arial", Font.BOLD, 25));
		txtPinCode.setLocation(new Point(185, 65));
		
		//Create JLabel for the withdrawal amount
		JLabel lblWithdrawalAmount = new JLabel("Amount (£)");
		lblWithdrawalAmount.setSize(150, 30);
		lblWithdrawalAmount.setFont(new Font("Arial", Font.BOLD, 25));
		lblWithdrawalAmount.setLocation(new Point(20, 110));
			
		//Create the JSPinner for the withdrawal amount
		SpinnerModel model = new SpinnerNumberModel(5, 5, 300, 5);
		spnWithdrawalAmount = new JSpinner(model);
		spnWithdrawalAmount.setSize(120,30);
		spnWithdrawalAmount.setFont(new Font("Arial", Font.BOLD, 25));
		JSpinner.DefaultEditor editor = ( JSpinner.DefaultEditor ) spnWithdrawalAmount.getEditor();
		editor.getTextField().setEditable( false );
		spnWithdrawalAmount.setLocation(new Point(185,110));
		
		//Create JButton
		JButton btnSubmit;
		btnSubmit = new JButton("Submit");
		btnSubmit.setSize(75, 40);
		btnSubmit.setLocation(new Point(230,160));
		//Setup the class to listen for actions on the button
		btnSubmit.addActionListener(this);
		
		//Create JPanel 
		JPanel contents = new JPanel();
		contents.setLayout(null);
		//Add the controls to the JPanel
		contents.add(lblAccountNum);
		contents.add(txtAccountNum);
		contents.add(lblPinCode);
		contents.add(txtPinCode);
		contents.add(btnSubmit);
		contents.add(lblWithdrawalAmount);
		contents.add(spnWithdrawalAmount);
		
		this.setTitle("Express ATM");
		//Add the JPanel to the JFrame
		this.setContentPane(contents);
		this.setSize(340, 255);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		int amount = (int)spnWithdrawalAmount.getValue();
		boolean result = expressATM.withdraw(txtAccountNum.getText(), new String(txtPinCode.getPassword()), amount);
			
		if(result) {
			double balance = expressATM.getAccountBalance();
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			String balanceAsCurrency = formatter.format(balance);
			JOptionPane.showMessageDialog(this, "Please take your cash. Your account balance is now " + balanceAsCurrency + ". You have been logged out.");
		}else {
			JOptionPane.showMessageDialog(this, "Request denied. You are not logged in and no transaction has been processed.");
		}

		expressATM.logout();
		txtAccountNum.setText("");
		txtPinCode.setText("");
		spnWithdrawalAmount.setValue(5);
		 
	}

	public static void main(String[] args) {
		new GUI();
	}

}
