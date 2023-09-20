package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TrangChu extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	public static void main(String[] args) {
//        new TrangChu().setVisible(true);
//    }
	
	public TrangChu() {
		initComponents();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}
	
	private void initComponents() {
        setSize(1200,728);
        getContentPane().setLayout(null);
        setTitle("QU\u1EA2N L\u00DD NH\u00C2N VI\u00CAN NH\u00C0 H\u00C0NG");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ImageIcon i1List = new ImageIcon(ClassLoader.getSystemResource("icons/list.png"));
        Image i2List = i1List.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        
        ImageIcon i1Man = new ImageIcon(ClassLoader.getSystemResource("icons/man.png"));
        Image i2Man = i1Man.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        
        ImageIcon i1Money = new ImageIcon(ClassLoader.getSystemResource("icons/money.png"));
        Image i2Money = i1Money.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        
        ImageIcon i1Off = new ImageIcon(ClassLoader.getSystemResource("icons/off.png"));
        Image i2Off = i1Off.getImage().getScaledInstance(32, 32,Image.SCALE_DEFAULT);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hehe.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 728,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel NewLabel = new JLabel(new ImageIcon(TrangChu.class.getResource("/icons/hehe.jpg")));
        NewLabel.setBounds(0, 0, 1186, 667);
        
        
        
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        
        
        JMenu overall = new JMenu("TU\u1EF2 CH\u1ECCN");
        overall.setForeground(Color.BLUE);
        menuBar.add(overall);
        
        JMenu about = new JMenu("GI\u1EDAI THI\u1EC6U");
        about.setForeground(Color.BLUE);
        menuBar.add(about);
        
        JMenuItem gioiThieu = new JMenuItem("PHI\u00CAN B\u1EA2N 1.0");
        about.add(gioiThieu);
        gioiThieu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
            	gioiThieu(evt);
            }
        });
        
        JMenuItem quanLyNhanVien = new JMenuItem("QU\u1EA2N L\u00DD NH\u00C2N VI\u00CAN");
        overall.add(quanLyNhanVien);
        quanLyNhanVien.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                quanLyNhanVien(ae);
            }
        });
        
        
        JMenuItem quanLyChamCong = new JMenuItem("QU\u1EA2N L\u00DD CH\u1EA4M C\u00D4NG");
        overall.add(quanLyChamCong);
        quanLyChamCong.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                quanLyChamCong(ae);
                
            }
        });
        
        
        
        JMenuItem tinhLuong = new JMenuItem("TH\u1ED0NG K\u00CA TI\u1EC0N L\u01AF\u01A0NG");
        overall.add(tinhLuong);
        tinhLuong.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                quanLyLuong(ae);
            }
        });
        
        
        JMenuItem exit = new JMenuItem("THO\u00C1T");
        overall.add(exit);
        exit.setForeground(Color.RED);

        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               	System.exit(0);
            }
        });
        

        
        JButton btnQLNV = new JButton("QU\u1EA2N L\u00DD NH\u00C2N VI\u00CAN");
        btnQLNV.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnQLNV.setBounds(363, 461, 300, 50);
        btnQLNV.setIcon(new ImageIcon(TrangChu.class.getResource("/icons/man.png")));
        getContentPane().add(btnQLNV);
        btnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	quanLyNhanVien(evt);
            }
        });
        
        JButton btnQLCC = new JButton("QU\u1EA2N L\u00DD CH\u1EA4M C\u00D4NG");
        btnQLCC.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnQLCC.setBounds(363, 557, 300, 50);
        btnQLCC.setIcon(new ImageIcon(TrangChu.class.getResource("/icons/list.png")));
        getContentPane().add(btnQLCC);
        btnQLCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               quanLyChamCong(evt);
            }
        });
        
        JButton btnTKTL = new JButton("TH\u1ED0NG K\u00CA TI\u1EC0N L\u01AF\u01A0NG");
        btnTKTL.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnTKTL.setBounds(782, 461, 300, 50);
        btnTKTL.setIcon(new ImageIcon(TrangChu.class.getResource("/icons/money.png")));
        getContentPane().add(btnTKTL);
        btnTKTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyLuong(evt);
            }
        });
        
        JButton btnEXIT = new JButton("THO\u00C1T H\u1EC6 TH\u1ED0NG");
        btnEXIT.setForeground(Color.RED);
        btnEXIT.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnEXIT.setBounds(782, 557, 300, 50);
        btnEXIT.setIcon(new ImageIcon(TrangChu.class.getResource("/icons/off.png")));
        getContentPane().add(btnEXIT);
        
        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(new Color(0, 153, 204));
        jPanel3.setBounds(0, 0, 1186, 102);
        getContentPane().add(jPanel3);
        
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("H\u1EC6 TH\u1ED0NG QU\u1EA2N L\u00DD NH\u00C2N VI\u00CAN NH\u00C0 H\u00C0NG");
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 36));
        
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Cre: D\u01B0\u01A1ng Minh Ch\u00E2u");
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 12));
        GroupLayout gl_jPanel3 = new GroupLayout(jPanel3);
        gl_jPanel3.setHorizontalGroup(
        	gl_jPanel3.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_jPanel3.createSequentialGroup()
        			.addGap(167)
        			.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 813, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(206, Short.MAX_VALUE))
        		.addGroup(gl_jPanel3.createSequentialGroup()
        			.addContainerGap(1032, Short.MAX_VALUE)
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        gl_jPanel3.setVerticalGroup(
        	gl_jPanel3.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanel3.createSequentialGroup()
        			.addGap(27)
        			.addComponent(jLabel3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel4)
        			.addContainerGap())
        );
        jPanel3.setLayout(gl_jPanel3);
        btnEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	System.exit(0);
            }
        });
        
        getContentPane().add(NewLabel);
        setVisible(true);
       
	}
	private void gioiThieu(ActionEvent evt) {
    	JOptionPane.showMessageDialog(null, "\u0110\u00E2y l\u00E0 s\u1EA3n ph\u1EA9m c\u1EE7a m\u00F4n h\u1ECDc project 1 - m\u1ED9t ph\u1EA7n m\u1EC1m qu\u1EA3n l\u00FD nh\u00E2n vi\u00EAn c\u1EE7a nh\u00E0 h\u00E0ng. Tuy nhi\u00EAn v\u1EABn c\u00F2n r\u1EA5t nhi\u1EC1u h\u1EA1n ch\u1EBF v\u00E0 ch\u01B0a ho\u00E0n thi\u1EC7n n\u00EAn huhu");
	}
	
	private void quanLyNhanVien(ActionEvent evt) {
		QuanLyNhanVien qlnv = new QuanLyNhanVien();
        qlnv.setVisible(true);
        qlnv.pack();
        qlnv.setLocationRelativeTo(null);
        qlnv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
	}
	
	private void quanLyChamCong(ActionEvent evt) {
		ChamCong qlcc = new ChamCong();
        qlcc.setVisible(true);
        qlcc.pack();
        qlcc.setLocationRelativeTo(null);
        qlcc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
	}	
	
	private void quanLyLuong(ActionEvent evt) {
		Luong qll = new Luong();
        qll.setVisible(true);
        qll.pack();
        qll.setLocationRelativeTo(null);
        qll.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
	}
	
}
//