package GUI;

import static Classes.MyConnection.getConnection;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Classes.NhanVien;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;

public class QuanLyNhanVien extends javax.swing.JFrame {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public QuanLyNhanVien() {
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        initComponents();
        hienThiDanhSachNhanVIen();
        setLocationRelativeTo(null);
    }
    Statement st=null;
    NhanVien customer =new NhanVien();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() {
    	

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelHoTen = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelLuong = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jTextFieldHoTen = new javax.swing.JTextField();
        jTextFieldCmnd = new javax.swing.JTextField();
        them = 	new javax.swing.JButton();
        them.setFont(new Font("Tahoma", Font.BOLD, 11));
        sua = new javax.swing.JButton();
        sua.setFont(new Font("Tahoma", Font.BOLD, 11));
        xoa = new javax.swing.JButton();
        xoa.setFont(new Font("Tahoma", Font.BOLD, 11));
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        clear = new JButton();
        clear.setFont(new Font("Tahoma", Font.BOLD, 11));

        setTitle("Qu\u1EA3n l\u00FD nh\u00E2n vi\u00EAn");
        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabelHoTen.setText("T\u00EAn nh\u00E2n vi\u00EAn");

        jLabelDate.setText("Ng\u00E0y \u0111i l\u00E0m");

        jLabelLuong.setText("H\u1EC7 s\u1ED1 l\u01B0\u01A1ng");


        them.setText("Th\u00EAm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                them2ActionPerformed(evt);
            }
        });

        sua.setText("S\u1EEDa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sua1ActionPerformed(evt);
            }
        });

        xoa.setText("Xo\u00E1");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoa1ActionPerformed(evt);
            }
        });

        clear.setText("L\u00E0m m\u1EDBi");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
     
        btnTimNV = new JButton("T\u00ECm nh\u00E2n vi\u00EAn");
        btnTimNV.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnTimNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                timTenActionPerformed(evt);
            }
        });
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        overall = new JMenu("TU\u1EF2 CH\u1ECCN");
        overall.setForeground(Color.BLUE);
        menuBar.add(overall);
        
        back = new JMenuItem("QUAY V\u1EC0 TRANG CH\u1EE6");
        overall.add(back);
        back.setForeground(Color.BLUE);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            	new TrangChu().setVisible(true);
               	dispose();
            }
        });
        
        exit = new JMenuItem("THO\u00C1T H\u1EC6 TH\u1ED0NG");
        overall.add(exit);
        exit.setForeground(Color.RED);
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               	System.exit(0);
            }
        });
        
        lblChungMinhThu = new JLabel("Ch\u1EE9ng minh nh\u00E2n d\u00E2n");
        
        String[] choiceNV = {"", "Nh\u00E2n vi\u00EAn b\u00E0n", "Nh\u00E2n vi\u00EAn b\u1EBFp"};
        comboBoxLoaiNhanVien = new JComboBox(choiceNV);
        

        
        lblNewLabel = new JLabel("Lo\u1EA1i nh\u00E2n vi\u00EAn");
        
        String[] choiceLuong = {"", "0.0","1.0", "2.0", "3.0"};
        comboBoxLuong = new JComboBox(choiceLuong);
        
        
        jLabelSDT = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
        
        jTextFieldSdt = new JTextField();
        jTextFieldSdt.setColumns(10);
        
        lblNewLabel_1 = new JLabel("M\u00E3 nh\u00E2n vi\u00EAn");
        
        jTextFieldMaNV = new JTextField();
        jTextFieldMaNV.setColumns(10);
        
        //Set Loai nhan vien
        comboBoxLoaiNhanVien.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Object selected = comboBoxLoaiNhanVien.getSelectedItem();
        		if(selected.toString().equals("Nh\u00E2n vi\u00EAn b\u00E0n")) {
        			comboBoxLuong.setSelectedItem("0.0");
        			comboBoxLuong.setEnabled(false);
        		}
        		else
        			comboBoxLuong.setEnabled(true);
        		
        	}
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(them, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        					.addGap(99)
        					.addComponent(sua, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        					.addGap(109)
        					.addComponent(xoa, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabelHoTen, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblChungMinhThu, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabelSDT, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabelDate, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabelLuong, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
        					.addGap(319)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jTextFieldDate, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        						.addComponent(jTextFieldSdt, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        						.addComponent(comboBoxLoaiNhanVien, 0, 146, Short.MAX_VALUE)
        						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jTextFieldMaNV)
        							.addComponent(jTextFieldHoTen, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        						.addComponent(jTextFieldCmnd, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        						.addComponent(comboBoxLuong, 0, 146, Short.MAX_VALUE)))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(btnTimNV, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
        					.addComponent(clear, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(59)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldMaNV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabelHoTen, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextFieldHoTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        				.addComponent(comboBoxLoaiNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblChungMinhThu, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextFieldCmnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabelSDT, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextFieldSdt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelDate, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextFieldDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelLuong, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        				.addComponent(comboBoxLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(them, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(xoa, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(sua, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addGap(40)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnTimNV, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(clear, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        
        
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Th\u00F4ng tin nh\u00E2n vi\u00EAn");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap(35, Short.MAX_VALUE)
        			.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
        			.addGap(29))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel4.setLayout(jPanel4Layout);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(41)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(40)
        					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(186)
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jScrollPane1, Alignment.LEADING)
        				.addComponent(jPanel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(61))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        setVisible(true);
        pack();
    }// </editor-fold>

    private void clearActionPerformed(ActionEvent evt) {
        emptyField();
    }

    private void timTenActionPerformed(java.awt.event.ActionEvent evt) {
	
    	 Connection con = getConnection();
       	 try {
                st =  con.createStatement();
                
                String query = "select * from nhanvien where maNV = '"+ jTextFieldMaNV.getText() + "'";
                ResultSet rs = st.executeQuery(query);
                NhanVien nv;
                if(rs.next() == false) {
                	JOptionPane.showMessageDialog(null, "Kh\u00F4ng t\u00ECm th\u1EA5y nh\u00E2n vi\u00EAn");
                }
                
                while (rs.next()) {
                    nv = new NhanVien (rs.getString("maNV"),rs.getString("hoTen"), rs.getString("loaiNhanVien"), rs.getString("cmnd"), rs.getString("sdt"),rs.getDate("ngayDiLam"), rs.getDouble("heSoLuong"));
                    jTextFieldMaNV.setText(nv.getMaNV());
                    jTextFieldHoTen.setText(nv.getHoTen());
                    comboBoxLoaiNhanVien.setSelectedItem(nv.getLoaiNhanVien());
                    jTextFieldCmnd.setText(nv.getCmnd());
                    jTextFieldSdt.setText(nv.getSdt());
                    jTextFieldDate.setText(nv.getNgayDiLam().toString());
                    String str = Double.toString(nv.getHeSoLuong());
                    comboBoxLuong.setSelectedItem(str);
                   
                    JOptionPane.showMessageDialog(null, "T\u00ECm ki\u1EBFm ho\u00E0n t\u1EA5t");
                }
                
               
            } catch (Exception ex) {
              	JOptionPane.showMessageDialog(null, "Kh\u00F4ng t\u00ECm \u0111\u01B0\u1EE3c nh\u00E2n vi\u00EAn");

                ex.printStackTrace();
            }

    }
    
    private void them2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        Connection con = getConnection();       
        
        try {
        	
            String dateCheck = jTextFieldDate.getText();
            int dateCheckInt = Integer.parseInt(dateCheck);
            String cmndCheck = jTextFieldCmnd.getText();
            String sdtCheck  = jTextFieldSdt.getText();
            
            if ((dateCheckInt < dateInt) && (cmndCheck.matches("[0-9]{12}") && sdtCheck.matches("[0-9]{10}"))) {
            	
                st = (Statement) con.createStatement();
                String query = "INSERT into NhanVien(maNV,hoTen, loaiNhanVien, cmnd, sdt,ngayDiLam, heSoLuong) VALUES ('"+ 
                		jTextFieldMaNV.getText()				+"','"	+
                		jTextFieldHoTen.getText()				+"','"	+ 
                		comboBoxLoaiNhanVien.getSelectedItem()	+"','"	+
                		jTextFieldCmnd.getText()				+"','" 	+ 
                		jTextFieldSdt.getText()					+"','" 	+ 
                		jTextFieldDate.getText()				+"','"	+	 
                		comboBoxLuong.getSelectedItem()			+"')"	;
                
                st.execute(query);
                hienThiDanhSachNhanVIen();
                
                JOptionPane.showMessageDialog(null, "Th\u00EAm nh\u00E2n vi\u00EAn ho\u00E0n t\u1EA5t");
            }
            

            else if (dateCheckInt > dateInt) {
            	JOptionPane.showMessageDialog(null, "Ng\u00E0y kh\u00F4ng kh\u1EA3 d\u1EE5ng. Vui l\u00F2ng nh\u1EADp l\u1EA1i");
            }
            
            else {            	
            	JOptionPane.showMessageDialog(null, "Sai th\u00F4ng tin v\u1EEBa nh\u1EADp. Vui l\u00F2ng ki\u1EBFm tra l\u1EA1i");
            }


        } catch (Exception ex) {
        	JOptionPane.showMessageDialog(null, "Kh\u00F4ng th\u00EAm \u0111\u01B0\u1EE3c nh\u00E2n vi\u00EAn");
            ex.printStackTrace();
        }

    }

    private void sua1ActionPerformed(java.awt.event.ActionEvent evt) {
        Connection con = getConnection();
        try {
        	
            String dateCheck = jTextFieldDate.getText();
            int dateCheckInt = Integer.parseInt(dateCheck);
            String cmndCheck = jTextFieldCmnd.getText();
            String sdtCheck  = jTextFieldSdt.getText();
           
            
            if ((dateCheckInt < dateInt) && (cmndCheck.matches("[0-9]{12}") && sdtCheck.matches("[0-9]{10}"))) {
                st = con.createStatement();
                String updateQuery = "update NhanVien set maNV = '" +
                jTextFieldMaNV.getText()				+"',"	 +" hoTen = '" 			+
                jTextFieldHoTen.getText()				+"',"	 +" loaiNhanVien = '" 	+
                comboBoxLoaiNhanVien.getSelectedItem()	+"',"	 +" cmnd = '" 			+	
                jTextFieldCmnd.getText()  				+"',"	 +" sdt = '"			+
                jTextFieldSdt.getText() 				+"',"	 +" ngayDiLam = '" 		+
                jTextFieldDate.getText() 				+"',"	 +" heSoLuong = '" 		+
                comboBoxLuong.getSelectedItem()			+"' where maNV= '" 				+ 
                jTextFieldMaNV.getText()				+ "'"	;
                
                st.execute(updateQuery);
                hienThiDanhSachNhanVIen();
                
                JOptionPane.showMessageDialog(null, "S\u1EEDa th\u00F4ng tin ho\u00E0n t\u1EA5t");
            }
            

            
            else if (dateCheckInt > dateInt) {
            	JOptionPane.showMessageDialog(null, "Ng\u00E0y kh\u00F4ng kh\u1EA3 d\u1EE5ng. Vui l\u00F2ng nh\u1EADp l\u1EA1i");
            }
            
            else {
            	JOptionPane.showMessageDialog(null, "Sai th\u00F4ng tin v\u1EEBa nh\u1EADp. Vui l\u00F2ng ki\u1EBFm tra l\u1EA1i");
            }

        } catch (Exception ex) {
        	JOptionPane.showMessageDialog(null, "Kh\u00F4ng s\u1EEDa \u0111\u01B0\u1EE3c th\u00F4ng tin nh\u00E2n vi\u00EAn");
            ex.printStackTrace();
        }
    }

    private void xoa1ActionPerformed(java.awt.event.ActionEvent evt) {

        Connection con = getConnection();
        try {
            st = con.createStatement();
            String query = "DELETE FROM nhanvien WHERE maNV = '" + jTextFieldMaNV.getText() + "'";
            st.executeUpdate(query);
            hienThiDanhSachNhanVIen();
            emptyField();
            
            JOptionPane.showMessageDialog(null, "Xo\u00E1 nh\u00E2n vi\u00EAn ho\u00E0n t\u1EA5t");

        } catch (Exception ex) {
        	JOptionPane.showMessageDialog(null, "Kh\u00F4ng xo\u00E1 \u0111\u01B0\u1EE3c nh\u00E2n vi\u00EAn");
            ex.printStackTrace();
        }

    }
    

    //CSDL
    public ArrayList<NhanVien> layDanhSachNhanVien() {
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        Connection con = getConnection();
        try {
            st = con.createStatement();
            String sql = "SELECT * FROM nhanvien";
            ResultSet rs = st.executeQuery(sql);

            NhanVien nv;
            while (rs.next()) {
                nv = new NhanVien(rs.getString("maNV"),rs.getString("hoTen"), rs.getString("loaiNhanVien"), rs.getString("cmnd"), rs.getString("sdt"),rs.getDate("ngayDiLam"), rs.getDouble("heSoLuong"));

                dsnv.add(nv);

            }
        } catch (Exception ex) {
        	JOptionPane.showMessageDialog(null, "Kh\u00F4ng l\u1EA5y \u0111\u01B0\u1EE3c danh s\u00E1ch nh\u00E2n vi\u00EAn");
            ex.printStackTrace();

        }
        return dsnv;
    }
    //Hien thi CSDL
    public void hienThiDanhSachNhanVIen() {
        String colTieuDe1[] = new String[]{"M\u00E3 nh\u00E2n vi\u00EAn","T\u00EAn nh\u00E2n vi\u00EAn","Lo\u1EA1i nh\u00E2n vi\u00EAn", "Ch\u1EE9ng minh nh\u00E2n d\u00E2n", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Ng\u00E0y \u0111i l\u00E0m", "H\u1EC7 s\u1ED1 l\u01B0\u01A1ng"};
        ArrayList<NhanVien> dnnv = layDanhSachNhanVien();

        DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

        Object[] row;

        for (int i = 0; i < dnnv.size(); i++) {

            row = new Object[7];
            row[0] = dnnv.get(i).getMaNV();
            row[1] = dnnv.get(i).getHoTen();
            row[2] = dnnv.get(i).getLoaiNhanVien();
            row[3] = dnnv.get(i).getCmnd();
            row[4] = dnnv.get(i).getSdt();
            row[5] = dnnv.get(i).getNgayDiLam();
            row[6] = dnnv.get(i).getHeSoLuong();

            model.addRow(row);
        }
        jTable.setModel(model);
//        jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
//        jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
//        jTable.getColumnModel().getColumn(3).setPreferredWidth(150);
//        jTable.getColumnModel().getColumn(4).setPreferredWidth(60);
//        jTable.getColumnModel().getColumn(5).setPreferredWidth(120);


    }


    private void jTableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {
        int i = jTable.getSelectedRow();
        TableModel model = jTable.getModel();
        jTextFieldMaNV.setText(model.getValueAt(i, 0).toString());
        jTextFieldHoTen.setText(model.getValueAt(i, 1).toString());
        comboBoxLoaiNhanVien.setSelectedItem(model.getValueAt(i, 2).toString());
        jTextFieldCmnd.setText(model.getValueAt(i, 3).toString());
        jTextFieldSdt.setText(model.getValueAt(i, 4).toString());
        jTextFieldDate.setText(model.getValueAt(i, 5).toString());
        comboBoxLuong.setSelectedItem(model.getValueAt(i, 6).toString());
        
        them.setEnabled(false);
        sua.setEnabled(true);
        xoa.setEnabled(true);
    }

    private void emptyField()
    {
        them.setEnabled(true);
        sua.setEnabled(false);
        xoa.setEnabled(false);
        
        jTextFieldMaNV.setText("");
        jTextFieldHoTen.setText("");
        comboBoxLoaiNhanVien.setSelectedItem("");
        jTextFieldCmnd.setText("");
        jTextFieldSdt.setText("");
        jTextFieldDate.setText("");
        comboBoxLuong.setSelectedItem("");
        jTable.clearSelection();
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new QuanLyNhanVien().setVisible(true);
//            }
//        });
//    }
    
	SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd");
	Date date = new Date(System.currentTimeMillis());
	String dateString = formatter.format(date);
	int dateInt = Integer.parseInt(dateString);
    
    private JLabel jLabelHoTen;
    private JLabel jLabelDate;
    private JLabel jLabelLuong;
    private JLabel lblNewLabel;
    
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel4;
    
    static JTextField jTextFieldMaNV;
    static JTextField jTextFieldSdt;
    static JTextField jTextFieldDate;
    static JTextField jTextFieldHoTen;
    static JTextField jTextFieldCmnd;
    
    private JButton clear;
    private JButton sua;
    private JButton them;
    private JButton xoa;
    private JButton btnTimNV;
    
    private JLabel lblChungMinhThu;
    @SuppressWarnings("rawtypes")
    static JComboBox comboBoxLoaiNhanVien;
    
    @SuppressWarnings("rawtypes")
    static JComboBox comboBoxLuong;
    
    private JLabel jLabelSDT;
    private JLabel lblNewLabel_1;
    private JTable jTable;
    private JScrollPane jScrollPane1;
    
    private JMenuBar menuBar;
    private JMenu overall;
    private JMenuItem back;
    private JMenuItem exit;
}
