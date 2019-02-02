import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class marvelWindow extends JFrame {

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
					marvelWindow frame = new marvelWindow();
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
	public marvelWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 613);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIronman = new JButton("Iron-Man");
		btnIronman.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnIronman.setBounds(83, 242, 207, 90);
		contentPane.add(btnIronman);
		
		JButton btnSpiderman = new JButton("Spider-Man");
		btnSpiderman.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnSpiderman.setBounds(406, 242, 207, 90);
		contentPane.add(btnSpiderman);
		
		JButton btnThor = new JButton("Thor");
		btnThor.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnThor.setBounds(725, 242, 207, 90);
		contentPane.add(btnThor);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("DINPro-Bold", Font.PLAIN, 28));
		btnBack.setBounds(406, 431, 207, 90);
		contentPane.add(btnBack);
		
		JLabel lblMarvel = new JLabel("Marvel");
		lblMarvel.setBounds(213, 13, 567, 170);
		contentPane.add(lblMarvel);
		lblMarvel.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarvel.setFont(new Font("DINPro-Bold", Font.PLAIN, 48));
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainWindow mW = new mainWindow();
				mW.setVisible(true);
				dispose();
			}
		});
		btnThor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Thor tW = new Thor();
				tW.setVisible(true);
				dispose();
			}
		});
		btnSpiderman.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SpiderMan sMW = new SpiderMan();
				sMW.setVisible(true);
				dispose();
			}
		});
		btnIronman.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IronMan iMW = new IronMan();
				iMW.setVisible(true);
				dispose();
			}
		});
	}
}
