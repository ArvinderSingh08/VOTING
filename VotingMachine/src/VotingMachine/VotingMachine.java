package VotingMachine;
import javax.swing.*;
import java.awt.*;

public class VotingMachine {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label=new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		
		
		
		Font font = new Font("Arial",Font.BOLD,30);
		Font font1 = new Font("Arial", Font.BOLD, 25);
		Font font2 = new Font("Arial",Font.BOLD, 25);
		Font font3 = new Font("Arial", Font.BOLD, 25);
		Font font4 = new Font("Arial",Font.BOLD,25);
		Font font5 = new Font("Arial",Font.BOLD,25);
		Font font6 = new Font("Arial",Font.BOLD,25);
		Font font7 = new Font("Arial",Font.CENTER_BASELINE,25);
		
		
		
		
		
		frame.setTitle("Voting Machine");
		frame.setVisible(true);
		
		
		
		ImageIcon icon = new ImageIcon("LOGO.png");
		ImageIcon icon1 = new ImageIcon("vote.jpg");
		
		label2 = new JLabel(icon1);
		frame.setIconImage(icon.getImage());
		
		
		Container container = frame.getContentPane();
		container.setBackground(Color.LIGHT_GRAY);
		
		JTextField electorName = new JTextField();
		JTextField voterNumber = new JTextField();
		JTextField age = new JTextField();
		
		
		
		
		label.setText("WELCOME TO VOTING STATION");
		label3.setText("ELECTOR'S NAME ");
		label4.setText("VOTER ID NUMBER ");
		label5.setText("AGE ");
		JButton button = new JButton("NEXT ");
		
	
		button.setForeground(Color.white);
		button.setBackground(Color.black);
		
		container.add(label);
		container.add(label2);
		container.add(label3);
		container.add(label4);
		container.add(label5);
		container.add(electorName);
		container.add(voterNumber);
		container.add(age);
		container.add(button);
		container.setLayout(null);
		
		
		frame.setBounds(580, 200, 950, 800);
		label.setBounds(220,5,500,150);
		label2.setBounds(8, 180,400,400);
		label3.setBounds(350,150,300,200);
		label4.setBounds(350,220,300,200);
		label5.setBounds(350,290,300,200);
		electorName.setBounds(600,235,300,30);
		voterNumber.setBounds(600,305,300,30);
		age.setBounds(600,375,100,30);
		button.setBounds(490,550,150,40);
		
		
		
		
		label.setFont(font);
		label3.setFont(font1);
		label4.setFont(font2);
		label5.setFont(font3);
		electorName.setFont(font4);
		voterNumber.setFont(font5);
		age.setFont(font6);
		button.setFont(font7);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	}

}
