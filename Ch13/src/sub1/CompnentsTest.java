package sub1;

import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CompnentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JTextField txtnum3;
	private JTextField txtnum4;
	private JTextField txtnum5;
	private JTextField txtnum6;
	private JTextField txtnum7;
	private JTextField txtnum8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompnentsTest window = new CompnentsTest();
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
	public CompnentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 159, 33);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 42, 81, 26);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인1 클릭~");

			}
		});
		btn1.setBounds(12, 78, 97, 23);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "버튼2 클릭!");
			}
		});
		btn2.setBounds(137, 78, 97, 23);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭!", "확인대화상자", JOptionPane.YES_NO_CANCEL_OPTION);

				if (answer == 0) {
					System.out.println("Yes 클릭");
				} else {
					System.out.println("no 클릭");
				}

			}
		});
		btn3.setBounds(273, 78, 97, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트필드");
		lblNewLabel_2.setBounds(12, 111, 97, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(12, 144, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtUid = new JTextField();
		txtUid.setBounds(56, 141, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JButton btnUid = new JButton("확인");
		
		btnUid.setBounds(184, 140, 66, 23);
		frame.getContentPane().add(btnUid);
		
		JLabel lbResultUid = new JLabel("결과:");
		lbResultUid.setBounds(262, 144, 146, 15);
		frame.getContentPane().add(lbResultUid);
		
		JLabel lblNewLabel_3_1 = new JLabel("이름");
		lblNewLabel_3_1.setBounds(12, 169, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(55, 169, 116, 21);
		frame.getContentPane().add(txtName);
		
		JButton btnName = new JButton("확인");
		
		btnName.setBounds(184, 165, 66, 23);
		frame.getContentPane().add(btnName);
		
		JLabel lbResultName = new JLabel("결과:");
		lbResultName.setBounds(262, 169, 146, 15);
		frame.getContentPane().add(lbResultName);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(56, 194, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("휴대폰");
		lblNewLabel_3_1_1.setBounds(12, 194, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JButton btnHp = new JButton("확인");
		
		btnHp.setBounds(184, 193, 66, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbResultHp = new JLabel("결과:");
		lbResultHp.setBounds(262, 197, 146, 15);
		frame.getContentPane().add(lbResultHp);
		
		JLabel lblNewLabel_4 = new JLabel("덧셈");
		lblNewLabel_4.setBounds(12, 234, 35, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(56, 231, 48, 21);
		frame.getContentPane().add(txtnum1);
		txtnum1.setColumns(10);
		
		txtnum2 = new JTextField();
		txtnum2.setBounds(118, 231, 48, 21);
		frame.getContentPane().add(txtnum2);
		txtnum2.setColumns(10);
		
		JButton btnPlus = new JButton("확인");
		
		btnPlus.setBounds(184, 230, 66, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lbResultPlus = new JLabel("결과:");
		lbResultPlus.setBounds(262, 234, 116, 15);
		frame.getContentPane().add(lbResultPlus);
		
		JLabel lblNewLabel_6 = new JLabel("뺄셈");
		lblNewLabel_6.setBounds(12, 276, 57, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("곱셈");
		lblNewLabel_7.setBounds(12, 318, 57, 15);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("나눗셈");
		lblNewLabel_8.setBounds(12, 355, 57, 15);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnMinus = new JButton("확인");
		
		btnMinus.setBounds(184, 272, 66, 23);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMult = new JButton("확인");
		
		btnMult.setBounds(184, 314, 66, 23);
		frame.getContentPane().add(btnMult);
		
		JButton btnDiv = new JButton("확인");
		
		btnDiv.setBounds(184, 351, 66, 23);
		frame.getContentPane().add(btnDiv);
		
		txtnum3 = new JTextField();
		txtnum3.setBounds(55, 273, 48, 21);
		frame.getContentPane().add(txtnum3);
		txtnum3.setColumns(10);
		
		txtnum4 = new JTextField();
		txtnum4.setBounds(118, 273, 48, 21);
		frame.getContentPane().add(txtnum4);
		txtnum4.setColumns(10);
		
		txtnum5 = new JTextField();
		txtnum5.setBounds(55, 315, 48, 21);
		frame.getContentPane().add(txtnum5);
		txtnum5.setColumns(10);
		
		txtnum6 = new JTextField();
		txtnum6.setBounds(118, 315, 48, 21);
		frame.getContentPane().add(txtnum6);
		txtnum6.setColumns(10);
		
		txtnum7 = new JTextField();
		txtnum7.setBounds(56, 352, 48, 21);
		frame.getContentPane().add(txtnum7);
		txtnum7.setColumns(10);
		
		txtnum8 = new JTextField();
		txtnum8.setBounds(118, 352, 48, 21);
		frame.getContentPane().add(txtnum8);
		txtnum8.setColumns(10);
		
		JLabel lbResultMinus = new JLabel("결과:");
		lbResultMinus.setBounds(263, 280, 57, 15);
		frame.getContentPane().add(lbResultMinus);
		
		JLabel lbResultMulti = new JLabel("결과:");
		lbResultMulti.setBounds(263, 318, 57, 15);
		frame.getContentPane().add(lbResultMulti);
		
		JLabel lbResultDiv = new JLabel("결과:");
		lbResultDiv.setBounds(262, 355, 57, 15);
		frame.getContentPane().add(lbResultDiv);
		
		JLabel lblNewLabel_5 = new JLabel("+");
		lblNewLabel_5.setBounds(107, 234, 13, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_9 = new JLabel("-");
		lblNewLabel_9.setBounds(107, 276, 13, 15);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setBounds(107, 318, 13, 15);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("/");
		lblNewLabel_11.setBounds(107, 355, 13, 15);
		frame.getContentPane().add(lblNewLabel_11);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 425, 57, 23);
		frame.getContentPane().add(chk1);
		
		JLabel lblNewLabel_12 = new JLabel("체크박스 실습");
		lblNewLabel_12.setBounds(12, 404, 121, 15);
		frame.getContentPane().add(lblNewLabel_12);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(76, 425, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(137, 425, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(198, 425, 57, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(262, 425, 57, 23);
		frame.getContentPane().add(chk5);
		
		JButton btnCheck = new JButton("확인");
		
		btnCheck.setBounds(325, 425, 66, 23);
		frame.getContentPane().add(btnCheck);
		
		JLabel lbCheckResult = new JLabel("결과 :");
		lbCheckResult.setBounds(12, 460, 182, 15);
		frame.getContentPane().add(lbCheckResult);
		
		//이벤트 리스너
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//텍스트필드에 입력된 문자열 가져오기
				String uid=txtUid.getText();
				
				//결과 라벨에 가져온 문자열 입력하기
				lbResultUid.setText("결과 : "+uid);
				
			}
		});
		
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				
				lbResultName.setText("결과 : "+name);
				
			}
		});
		
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbResultHp.setText("결과 : "+hp);

				
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtnum1.getText());
				int num2 = Integer.parseInt(txtnum2.getText());
				int result= num1+num2;
							
				
				lbResultPlus.setText("결과 : "+Integer.toString(result));
				
			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtnum3.getText());
				int num2 = Integer.parseInt(txtnum4.getText());
				int result= num1-num2;
							
				
				lbResultMinus.setText("결과 : "+Integer.toString(result));
				
			}
		});
		
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtnum5.getText());
				int num2 = Integer.parseInt(txtnum6.getText());
				int result= num1*num2;
							
				
				lbResultMulti.setText("결과 : "+Integer.toString(result));
				
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtnum7.getText());
				int num2 = Integer.parseInt(txtnum8.getText());
				int result= num1/num2;
							
				
				lbResultDiv.setText("결과 : "+Integer.toString(result));
				
			}
		});
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbCheckResult.setText(cities.toString());
			}
		});
	}
}
