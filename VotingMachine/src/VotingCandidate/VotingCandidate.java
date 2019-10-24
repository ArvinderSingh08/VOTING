package VotingCandidate;
import java.awt.*;
import javax.swing.*;

public class VotingCandidate {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		JRadioButton jRadioButton = new JRadioButton("BJP (Bharatiya Janata Party)");
		JRadioButton jRadioButton2 = new JRadioButton("AAP (Aam Aadmi Party)");
		JRadioButton jRadioButton3 = new JRadioButton("INC(Indian National Congress)");
		JRadioButton jRadioButton4 = new JRadioButton("OTHERS");
		JButton button = new JButton("SUBMIT ");
		JLabel label1 = new JLabel();

		frame1.setVisible(true);
		frame1.setTitle("VOTE FOR RIGHT CANDIDATE");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label1.setText("CHOOSE RIGHT CANDIDATE FOR INDIA");
		
		frame1.setBounds(580, 200, 950, 800);
		jRadioButton.setBounds(80,160,510,45);
		jRadioButton2.setBounds(80,240,420,45);
		jRadioButton3.setBounds(80,320,520,45);
		jRadioButton4.setBounds(80,400,200,45);
		button.setBounds(375,520,180,45);
		label1.setBounds(140,2,700,150);
		
		
		Font font1 = new Font("Arial", Font.BOLD, 35);
		Font font3 = new Font("Arial", Font.BOLD,25);
		Font font2 = new Font("Arial",Font.CENTER_BASELINE,35);
		
		Container container1 = frame1.getContentPane();
		container1.setLayout(null);
		container1.setBackground(Color.LIGHT_GRAY);
		
		jRadioButton.setForeground(Color.BLACK);
		jRadioButton.setBackground(Color.orange);
		
		jRadioButton2.setForeground(Color.BLACK);
		jRadioButton2.setBackground(Color.orange);
		
		jRadioButton3.setForeground(Color.BLACK);
		jRadioButton3.setBackground(Color.orange);
		
		jRadioButton4.setForeground(Color.BLACK);
		jRadioButton4.setBackground(Color.orange);

		
		button.setForeground(Color.white);
		button.setBackground(Color.black);
		
		
		container1.add(jRadioButton);
		container1.add(jRadioButton2);
		container1.add(jRadioButton3);
		container1.add(jRadioButton4);
		container1.add(label1);
		container1.add(button);
		jRadioButton.setFont(font1);
		jRadioButton2.setFont(font1);
		jRadioButton3.setFont(font1);
		jRadioButton4.setFont(font1);
		button.setFont(font3);
		label1.setFont(font2);
		frame1.setResizable(false);
		
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton);
		buttonGroup.add(jRadioButton2);
		buttonGroup.add(jRadioButton3);
		buttonGroup.add(jRadioButton4);
	}

}
