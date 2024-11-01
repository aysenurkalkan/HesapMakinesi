package hesapmakinessi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Window.Type;
import javax.swing.JLabel;

public class hesaplama extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField input;
	private double answer , number;
	int operation ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hesaplama frame = new hesaplama();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
	public void addInput(String str) {
		input.setText(input.getText() + str);
		
		
	}
	public void calculate() {
		switch(operation) {
		case 1:
			answer =number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer =number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer =number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer =number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
			
		}
	}
	
	/**
	 * Create the frame.
	 */
	public hesaplama() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(172, 224, -350, 42);
		getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 6, 307, 42);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		input.setBounds(6, 16, 295, 26);
		panel.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(6, 0, 295, 10);
		panel.add(lbl);
		
		JPanel control = new JPanel();
		control.setBounds(6, 60, 301, 243);
		getContentPane().add(control);
		control.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton_1 = new JButton("7");
	   btnNewButton_1.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
	    btnNewButton_2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_2);
		
		JButton btnNewButton_9 = new JButton("9");
	   btnNewButton_9.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton_9.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_9);
		
		JButton btnNewButton_3 = new JButton("+");
	   btnNewButton_3.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				number = Double.parseDouble(input.getText());
				operation =1;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
				
				
			}
			
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("6");
	    btnNewButton_6.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("5");
	    btnNewButton_4.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				addInput(e.getActionCommand());
			}
			
		});
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("4");
	    btnNewButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				addInput(e.getActionCommand());
			}
			
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("-");
	    btnNewButton_5.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				number = Double.parseDouble(input.getText());
				operation =2;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
			
		});
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("3");
	    btnNewButton_7.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton_7.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("2");
	    btnNewButton_8.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton_8.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("1");
	   btnNewButton_12.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				addInput(e.getActionCommand());
			}
			
		});
		btnNewButton_12.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_12);
		
		JButton btnNewButton_10 = new JButton("*");
	    btnNewButton_10.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
			
		});
		btnNewButton_10.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				addInput(e.getActionCommand());
			}
			
		});
	
		btnNewButton_11.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("C");
       btnNewButton_13.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				input.setText(" ");
			}
			
		});
		btnNewButton_13.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_13);
		
		JButton btnC = new JButton("=");
        btnC.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				calculate();
				lbl.setText(" ");
			}
			
		});
		btnC.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnC);
		
		JButton btnNewButton_15 = new JButton("%");
        btnNewButton_15.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				number = Double.parseDouble(input.getText());
				operation =4;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
			
		});
		btnNewButton_15.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		control.add(btnNewButton_15);
	}

	private ActionListener ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}
}
