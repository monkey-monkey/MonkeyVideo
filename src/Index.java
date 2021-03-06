/**
Copyright [2016] [Chutipon]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class Index extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static final String DB_LOCATION = "\\\\192.168.1.150\\vdo\\";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * Label for the textField
		 */
		JLabel lblEnterStudentId = new JLabel("Enter Student ID");
		lblEnterStudentId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterStudentId.setFont(new Font("Dialog", Font.PLAIN, 44));
		lblEnterStudentId.setBounds(146, 231, 441, 79);
		contentPane.add(lblEnterStudentId);
		
		
		/**
		 * TextField to enter the student id
		 * contain checking for the enter key expected bar code scanner
		 * calling method run()
		 */
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyChar() == '\n') {
					String id = textField.getText();
					textField.setText("");
					run(id);
				}
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Dialog", Font.PLAIN, 70));
		textField.setBounds(50, 414, 633, 130);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/**
		 * Button show number 1 and add character '1' to the current String contained in the textField
		 */
		JButton button = new JButton("1");
		button.setBackground(Color.WHITE);
		button.setForeground(Color.BLACK);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				textField.setText(textField.getText() + "1");
			}
		});
		button.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button.setBounds(727, 52, 150, 150);
		contentPane.add(button);
		
		/**
		 * Button show number 2 and add character '2' to the current String contained in the textField
		 */
		JButton button_1 = new JButton("2");
		button_1.setBackground(Color.WHITE);
		button_1.setForeground(Color.BLACK);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button_1.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_1.setBounds(902, 52, 150, 150);
		contentPane.add(button_1);
		
		/**
		 * Button show number 3 and add character '3' to the current String contained in the textField
		 */
		JButton button_2 = new JButton("3");
		button_2.setBackground(Color.WHITE);
		button_2.setForeground(Color.BLACK);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_2.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_2.setBounds(1074, 52, 150, 150);
		contentPane.add(button_2);
		
		/**
		 * Button show number 4 and add character '4' to the current String contained in the textField
		 */
		JButton button_3 = new JButton("4");
		button_3.setBackground(Color.WHITE);
		button_3.setForeground(Color.BLACK);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_3.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_3.setBounds(727, 240, 150, 150);
		contentPane.add(button_3);
		
		/**
		 * Button show number 5 and add character '5' to the current String contained in the textField
		 */
		JButton button_4 = new JButton("5");
		button_4.setBackground(Color.WHITE);
		button_4.setForeground(Color.BLACK);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_4.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_4.setBounds(902, 240, 150, 150);
		contentPane.add(button_4);
		
		/**
		 * Button show number 6 and add character '6' to the current String contained in the textField
		 */
		JButton button_5 = new JButton("6");
		button_5.setBackground(Color.WHITE);
		button_5.setForeground(Color.BLACK);
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_5.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_5.setBounds(1074, 238, 150, 150);
		contentPane.add(button_5);
		
		/**
		 * Button show number 7 and add character '7' to the current String contained in the textField
		 */
		JButton button_6 = new JButton("7");
		button_6.setBackground(Color.WHITE);
		button_6.setForeground(Color.BLACK);
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		button_6.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_6.setBounds(727, 413, 150, 150);
		contentPane.add(button_6);
		
		/**
		 * Button show number 8 and add character '8' to the current String contained in the textField
		 */
		JButton button_7 = new JButton("8");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setForeground(Color.BLACK);
		button_7.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_7.setBounds(902, 413, 150, 150);
		contentPane.add(button_7);
		
		/**
		 * Button show number 9 and add character '9' to the current String contained in the textField
		 */
		JButton button_8 = new JButton("9");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setForeground(Color.BLACK);
		button_8.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_8.setBounds(1074, 411, 150, 150);
		contentPane.add(button_8);
		
		/**
		 * Button show "D" stand for delete (expected to be change to be a graphic picture) and delete one most right character from the current String contained in the textField
		 */
		JButton button_9 = new JButton("");
		button_9.setIcon(new ImageIcon("ic_backspace_black_36dp.png"));
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
				} catch (Exception e1) {
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		button_9.setBackground(Color.WHITE);
		button_9.setForeground(Color.BLACK);
		button_9.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_9.setBounds(727, 576, 150, 150);
		contentPane.add(button_9);
		
		/**
		 * Button show number 0 and add character '0' to the current String contained in the textField
		 */
		JButton button_10 = new JButton("0");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setForeground(Color.BLACK);
		button_10.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_10.setBounds(902, 576, 150, 150);
		contentPane.add(button_10);
		
		/**
		 * Button show "E" stand for enter (expected to be change to be a graphic picture) and call run()
		 */
		JButton button_11 = new JButton("");
		button_11.setIcon(new ImageIcon("ic_send_black_36dp.png"));
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String id = textField.getText();
				textField.setText("");
				run(id);
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_11.setBounds(1074, 574, 150, 150);
		contentPane.add(button_11);
	}
	
	/**
	 * Method which run the Menu class that contain the select VDO page
	 * @param id Student id referred to the folder of that student
	 */
	public void run(String id) {
		if (!isValid(id)) {
			JOptionPane.showMessageDialog(null, "Wrong student ID", "Error: ID input not found", JOptionPane.INFORMATION_MESSAGE);
			textField.setText("");
			return;
		}
		this.setVisible(false);
		String[] input = {id};
		Menu.main(input);
		this.setVisible(true);
	}
	
	/**
	 * Check if the id is in the correct pattern by checking length, the last character of the id and whether that student id is in the database
	 * @param id Student id want to check if the pattern is correct
	 * @return Boolean indicate the student id is in the correct pattern
	 */
	public boolean isValid(String id) {
		if (id.length() == 6 && (id.charAt(id.length() - 1) == '1' || id.charAt(id.length() - 1) == '2') && checkInDB(id)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Verify that input student id is in the database of VDO in MOKEYCLOUD
	 * @param id Student id referred to the folder in the VDO folder ion the database
	 * @return Boolean whether student id is in the database
	 */
	public boolean checkInDB(String id) {
		try {
			File folder = new File(DB_LOCATION + id);
			File[] listOfFiles = folder.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
				} else if (listOfFiles[i].isDirectory()) {
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
