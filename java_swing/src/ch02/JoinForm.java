package ch02;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JoinForm extends JFrame {

	
	private JButton buttonNaver;
	private JButton buttonPhone;
	private JButton buttonJoin;
	private JLabel idLabel;
	private JLabel pwLabel;
	private JLabel pwLabel2;
	private JLabel nameLabel;
	private JLabel birthLabel;
	private JLabel sexLabel;
	private JLabel phoneNumLabel;
	
	private JTextField textFieldId; 
	private JTextField textFieldName; 
	private JTextField textFieldYear; 
	private JTextField textFieldMonth; 
	private JTextField textFieldDay; 
	private JTextField textFieldSex; 
	private JTextField textFieldPhoneNum; 
	private JTextField textFieldCountryCode; 
	
	private JPasswordField passwordField; 
	private JPasswordField passwordField2; 
	

	
	public JoinForm() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("회원가입");
		setSize(800, 1100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonNaver = new JButton(new ImageIcon("C:\\naver.png"));
		buttonPhone = new JButton(new ImageIcon("C:\\num.png"));
		buttonJoin = new JButton(new ImageIcon("C:\\join.png"));
		idLabel = new JLabel("아이디");
		pwLabel = new JLabel("비밀번호");
		pwLabel2 = new JLabel("비밀번호 재확인");
		nameLabel = new JLabel("이름");
		birthLabel = new JLabel("생년월일");
		sexLabel = new JLabel("성별");
		phoneNumLabel = new JLabel("휴대전화");
		textFieldId = new JTextField("@naver.com  ", 20);
		textFieldName = new JTextField(" ", 20);
		textFieldYear = new JTextField("년 (4자) ", 20);
		textFieldMonth = new JTextField("월  ", 20);
		textFieldDay = new JTextField("일  ", 20);
		textFieldSex = new JTextField("성별  ", 20);
		textFieldCountryCode = new JTextField("대한민국 +82  ", 20);
		textFieldPhoneNum = new JTextField("전화번호 입력  ", 20);
		passwordField = new JPasswordField("", 20);
		passwordField2 = new JPasswordField("", 20);

		
	}
	public void inputId(String getId) {
		this.textFieldId.setText(getId);
	}
	public void inputpw(String getpw) {
		this.passwordField.setText(getpw);
	}
	public void inputpw2(String getpw2) {
		this.passwordField2.setText(getpw2);
	}
	public void inputName(String getName) {
		this.textFieldName.setText(getName);
	}
	public void inputMonth(String getMonth) {
		this.textFieldMonth.setText(getMonth);
	}
	public void inputDay(String getDay) {
		this.textFieldDay.setText(getDay);
	}
	public void inputPhoneNum (String getNum) {
		this.textFieldPhoneNum.setText(getNum);
	}
	
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		
		//selectbox 년 성별 국가코드
		//어려움 패스
		
		
		//setSize
		
		buttonNaver.setSize(280, 70);
		buttonJoin.setSize(280, 50);
		buttonPhone.setSize(110, 50);
		
		idLabel.setSize(100, 40);
		pwLabel.setSize(100, 40);
		pwLabel2.setSize(100, 40);
		nameLabel.setSize(100, 40);
		birthLabel.setSize(100, 40);
		sexLabel.setSize(100, 40);
		phoneNumLabel.setSize(100, 40);
		
		textFieldId.setSize(400, 50);
		passwordField.setSize(400, 50);
		passwordField2.setSize(400, 50);
		textFieldName.setSize(400, 50);
		textFieldYear.setSize(120, 50);
		textFieldMonth.setSize(120, 50);
		textFieldDay.setSize(120, 50);
		textFieldSex.setSize(400, 50);
		textFieldCountryCode.setSize(400, 50);
		textFieldPhoneNum.setSize(280, 50);
		
		
		//setLocation
		
		buttonNaver.setLocation(250, 50);
		buttonJoin.setLocation(250, 950);
		buttonPhone.setLocation(460, 840);
		
		idLabel.setLocation(170, 150);
		pwLabel.setLocation(170, 250);
		pwLabel2.setLocation(170, 350);
		nameLabel.setLocation(170, 450);
		birthLabel.setLocation(170, 550);
		sexLabel.setLocation(170, 650);
		phoneNumLabel.setLocation(170, 750);
		
		textFieldId.setLocation(170, 190);
		passwordField.setLocation(170, 290);
		passwordField2.setLocation(170, 390);
		textFieldName.setLocation(170, 490);
		textFieldYear.setLocation(170, 590);
		textFieldMonth.setLocation(300, 590);
		textFieldDay.setLocation(430, 590);
		textFieldSex.setLocation(170, 690);
		textFieldCountryCode.setLocation(170, 790);
		textFieldPhoneNum.setLocation(170, 840);
		
		//foreground
		//해야할거 아이디 년일전화번호
		
		textFieldId.setForeground(Color.GRAY);
		textFieldYear.setForeground(Color.GRAY);
		textFieldDay.setForeground(Color.GRAY);
		textFieldPhoneNum.setForeground(Color.GRAY);
		
		
		add(buttonNaver);
		add(buttonJoin);
		add(buttonPhone);
		
		add(idLabel);
		add(pwLabel);
		add(pwLabel2);
		add(nameLabel);
		add(birthLabel);
		add(sexLabel);
		add(phoneNumLabel);
		
		add(textFieldId);
		add(passwordField);
		add(passwordField2);
		add(textFieldName);
		add(textFieldYear);
		add(textFieldMonth);
		add(textFieldDay);
		add(textFieldSex);
		add(textFieldCountryCode);
		add(textFieldPhoneNum);
		
	}

	public static void main(String[] args) {
		new JoinForm();
		JoinForm joinForm = new JoinForm();

		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력해주세요");
		String userInputId = scanner.nextLine();
		System.out.println("ID : " + userInputId);
		joinForm.inputId(userInputId);
		System.out.println("비밀 번호를 입력해주세요");
		String userInputPw = scanner.nextLine();
		System.out.println("pw : " + userInputPw);
		joinForm.inputpw(userInputPw);
		System.out.println("비밀 번호를 재입력해주세요");
		String userInputPw2 = scanner.nextLine();
		System.out.println("pw check : " + userInputPw2);
		joinForm.inputpw2(userInputPw2);
		System.out.println("이름을 입력해주세요");
		String userInputName = scanner.nextLine();
		System.out.println("Name : " + userInputName);
		joinForm.inputName(userInputName);
		System.out.println("월 (月) 을 입력해주세요");
		String userInputMonth = scanner.nextLine();
		System.out.println("Month : " + userInputMonth);
		joinForm.inputMonth(userInputMonth);
		System.out.println("일 (日) 을입력해주세요");
		String userInputDay = scanner.nextLine();
		System.out.println("Day : " + userInputDay);
		joinForm.inputDay(userInputDay);
		System.out.println("전화번호를 입력해주세요");
		String userInputPhoneNum = scanner.nextLine();
		System.out.println("PhoneNum : " + userInputPhoneNum);
		joinForm.inputPhoneNum(userInputPhoneNum);
	}

}
