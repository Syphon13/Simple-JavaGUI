import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class dcWindow extends JFrame {

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
					dcWindow frame = new dcWindow();
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
	public dcWindow() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 613);;
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDc = new JLabel("DC");
		lblDc.setBounds(213, 13, 567, 170);
		lblDc.setFont(new Font("DINPro-Bold", Font.PLAIN, 48));
		lblDc.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDc);
		
		JButton btnSuperman = new JButton("Superman");
		btnSuperman.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnSuperman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				superman sW = new superman();
				sW.setVisible(true);
				dispose();
				//JOptionPane.showMessageDialog(null, "Superman is a fictional superhero appearing in American comic books published by DC Comics. "
						//+ "\nThe character was created by writer Jerry Siegel and artist Joe Shuster, high school students living in Cleveland, Ohio, in 1933. "
						//+ "\nThey sold Superman to Detective Comics, the future DC Comics, in 1938. ");
			}
		});
		btnSuperman.setBounds(83, 242, 207, 90);
		contentPane.add(btnSuperman);
		
		JButton btnBatman = new JButton("Batman");
		btnBatman.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnBatman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				batman bmW = new batman();
				bmW.setVisible(true);
				dispose();
				//JOptionPane.showMessageDialog(null, "Batman is a fictional superhero appearing in American comic books published by DC Comics. "
						//+ "\nThe character was created by artist Bob Kane and writer Bill Finger, and first appeared in Detective Comics #27 (1939)."
						//+ "\nOriginally named the Bat-Man, the character is also referred to by such epithets as the Caped Crusader, the Dark Knight, and the World's Greatest Detective.");
			}
		});
		btnBatman.setBounds(406, 242, 207, 90);
		contentPane.add(btnBatman);
		
		JButton btnFlash = new JButton("Flash");
		btnFlash.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnFlash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flash fW = new flash();
				fW.setVisible(true);
				dispose();
				//JOptionPane.showMessageDialog(null, "");
			}
		});
		btnFlash.setBounds(725, 242, 207, 90);
		contentPane.add(btnFlash);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainWindow mW = new mainWindow();
				mW.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(406, 431, 207, 90);
		contentPane.add(btnBack);
	}

}