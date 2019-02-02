import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Color;

public class mainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
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
	public mainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 613);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChooseYourUniverse = new JLabel("Choose your universe!");
		lblChooseYourUniverse.setFont(new Font("DINPro-Bold", Font.PLAIN, 48));
		lblChooseYourUniverse.setBounds(251, 13, 498, 168);
		contentPane.add(lblChooseYourUniverse);
		
		JButton btnNewButton = new JButton("Marvel");
		btnNewButton.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marvelWindow mvW = new marvelWindow();
				mvW.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(121, 279, 207, 90);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DC");
		btnNewButton_1.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dcWindow dcW = new dcWindow();
				dcW.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(696, 279, 207, 90);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(mainWindow.class.getResource("/images/VS-Icon.png")));
		label.setBounds(340, 127, 541, 426);
		contentPane.add(label);
	}
}
