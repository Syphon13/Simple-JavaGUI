import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class flash extends JFrame {

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
					flash frame = new flash();
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
	public flash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txt = new JTextArea();
		txt.setEditable(false);
		txt.setWrapStyleWord(true);
		txt.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txt.setLineWrap(true);
		txt.setText("The Flash is the name of several fictional characters appearing in comic books published by DC Comics. Created by writer Gardner Fox and artist Harry Lampert, the original Flash first appeared in Flash Comics #1 (cover date January 1940/release month November 1939). Nicknamed the 'Scarlet Speedster', all incarnations of the Flash possess 'super speed', which includes the ability to run and move extremely fast, use superhuman reflexes, and seemingly violate certain laws of physics.");
		txt.setBounds(29, 13, 675, 322);
		contentPane.add(txt);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dcWindow dcW = new dcWindow();
				dcW.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(29, 362, 134, 60);
		contentPane.add(btnBack);
	}
}
