package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcTest {

	private JFrame frame;
	private final JTextField txtResult = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
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
	public CalcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private int num1 = 0;
	private int num2 = 0;
	private int operator = 0;// 1:더하기,2:빼기,3:곱하기,4:나누기
	private boolean setbtn = false;

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn7 = new JButton("7");
		btn7.setBounds(39, 143, 82, 68);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBounds(133, 142, 78, 71);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBounds(223, 142, 76, 71);
		frame.getContentPane().add(btn9);

		JButton btnDiv = new JButton("/");
	
		btnDiv.setBounds(311, 143, 77, 68);
		frame.getContentPane().add(btnDiv);

		JButton btn4 = new JButton("4");

		btn4.setBounds(39, 224, 82, 68);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBounds(133, 223, 78, 71);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBounds(223, 223, 76, 71);
		frame.getContentPane().add(btn6);

		JButton btnMulti = new JButton("x");
	
		btnMulti.setBounds(311, 224, 77, 68);
		frame.getContentPane().add(btnMulti);

		JButton btn1 = new JButton("1");

		btn1.setBounds(39, 303, 82, 68);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");

		btn2.setBounds(133, 302, 78, 71);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");

		btn3.setBounds(223, 302, 76, 71);
		frame.getContentPane().add(btn3);

		JButton btnMius = new JButton("-");
	
		btnMius.setBounds(311, 303, 77, 68);
		frame.getContentPane().add(btnMius);

		JButton btnCancel = new JButton("c");
		btnCancel.setBounds(39, 382, 82, 68);
		frame.getContentPane().add(btnCancel);

		JButton btnNewButton_1_3 = new JButton("0");
		btnNewButton_1_3.setBounds(133, 381, 78, 71);
		frame.getContentPane().add(btnNewButton_1_3);

		JButton btnResult = new JButton("=");

		btnResult.setBounds(223, 381, 76, 71);
		frame.getContentPane().add(btnResult);

		JButton btnPlus = new JButton("+");

		btnPlus.setBounds(311, 382, 77, 68);
		frame.getContentPane().add(btnPlus);
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setFont(new Font("굴림", Font.PLAIN, 24));
		txtResult.setText("0");
		txtResult.setBackground(SystemColor.textHighlightText);
		txtResult.setBounds(195, 43, 194, 83);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("1");

				if (setbtn == true) {
					num2 = 1;
				} else {
					num1 = 1;
					setbtn=true;
				}

			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("2");
				if (setbtn == true) {
					num2 = 2;
				} else {
					num1 = 2;
					setbtn=true;
				}
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("3");
				if (setbtn == true) {
					num2 = 3;
				} else {
					num1 = 3;
					setbtn=true;
				}
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("4");
				if (setbtn == true) {
					num2 = 4;
				} else {
					num1 = 4;
					setbtn=true;
				}
			}
		});

		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;

			}
		});
		btnMius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 2;
			}
		});
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 3;
				System.out.println("num1:"+num1);
				System.out.println("num2:"+num2);

			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 4;
			}
		});

		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;

				if (operator == 1) {
					result = num1 + num2;
				} else if (operator == 2) {
					result = num1 - num2;
				} else if (operator == 3) {
					result = num1 * num2;
				} else if (operator == 4) {
					result = num1 / num2;
				}
				
				System.out.println("result: "+result);
				txtResult.setText(" " + result);
			}
		});
	}

}
