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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class superman extends JFrame {

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
					superman frame = new superman();
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
	public superman() {
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
		txt.setText("Superman is a fictional superhero appearing in American comic books published by DC Comics. The character was created by writer Jerry Siegel and artist Joe Shuster, high school students living in Cleveland, Ohio, in 1933. They sold Superman to Detective Comics, the future DC Comics, in 1938. Superman debuted in Action Comics #1 (cover-dated June 1938) and subsequently appeared in various radio serials, newspaper strips, television programs, films, and video games. With this success, Superman helped to create the superhero archetype and establish its primacy within the American comic book. The character is also referred to by such epithets as the Man of Steel, the Man of Tomorrow, and The Last Son of Krypton.");
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
