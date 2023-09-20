package GUI;

import Classes.TienLuong;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static Classes.MyConnection.getConnection;
import javax.swing.GroupLayout.Alignment;



public class LuongNV extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public LuongNV(String date1, String date2) {
		setTitle("L\u01B0\u01A1ng nh\u00E2n vi\u00EAn");
        initComponents(date1,date2);
        setLocationRelativeTo(null);
        hienthiDanhSachTien(date1,date2);
    }
    Connection con=null;
    Statement st=null;

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(String date1, String date2) {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        String a = String.valueOf(date1);
        String b = String.valueOf(date2);
     
        jLabel1.setText(a);
        jLabel1.setText("L\u01B0\u01A1ng th\u00E1ng "+ b + " n\u0103m "+ a);
        jLabel1.setFont( jLabel1.getFont().deriveFont(18f));
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(24, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)
        			.addGap(26))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setFont(new Font("Serif", Font.PLAIN, 20));
        jTable1.setRowHeight(40);
        jTable1.getTableHeader().setPreferredSize(new Dimension(40,40));
        jTable1.getTableHeader().setFont(new Font("Serif", Font.PLAIN, 20));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 980, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(378, Short.MAX_VALUE)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(207))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>

    public ArrayList<TienLuong> layDanhSachTienThang(String date1, String date2){
        ArrayList<TienLuong> dstien = new ArrayList<TienLuong>();
        Connection con = getConnection();
        String date11 = String.valueOf(date1);
        String date12 = String.valueOf(date2);
        
        int date13 = Integer.parseInt(date12);
        date13++;
        String date23 = Integer.toString(date13);
        
        try{
        	TienLuong tienThang;
            st =(Statement) con.createStatement();
            String sql = "SELECT maNV,hoTen, loaiNhanVien,soNgayNghi, ((TIMESTAMPDIFF(day,"+date11+date12+"01,'"+date11+"0"+(date23)+"01') - soNgayNghi) *200000) as tien from chamcong"+date11+date12+" where loaiNhanVien = 'Nh\u00E2n vi\u00EAn b\u00E0n'" ;

            ResultSet rs =st.executeQuery(sql);
   
            while (rs.next()){
                tienThang = new TienLuong(rs.getString("maNV"),rs.getString("hoTen"),rs.getString("loaiNhanVien"),rs.getInt("soNgayNghi"),rs.getInt(5));
                dstien.add(tienThang);  
            }
            
    		sql = "SELECT maNV, hoTen, loaiNhanVien, soNgayNghi,(TIMESTAMPDIFF(month,"+date11+date12+"01,'"+date11+"0"+date23+"01')*3000000 + heSoLuong*750000 - soNgayNghi*10000) as tien from chamcong"+date11+date12+" where loaiNhanVien = 'Nh\u00E2n vi\u00EAn b\u1EBFp'";
            rs =st.executeQuery(sql);
            while (rs.next()){
                tienThang = new TienLuong(rs.getString("maNV"),rs.getString("hoTen"),rs.getString("loaiNhanVien"),rs.getInt("soNgayNghi"),rs.getInt(5));
                dstien.add(tienThang);  
            }
            
        }
        catch (Exception ex) {
        	JOptionPane.showMessageDialog(null, "Kh\u00F4ng l\u1EA5y \u0111\u01B0\u1EE3c danh s\u00E1ch l\u01B0\u01A1ng");
            ex.printStackTrace();

        }
    
        return dstien;
    }

    public void hienthiDanhSachTien(String date1, String date2){
        String colTieuDe[] = new String[]{"M\u00E3 nh\u00E2n vi\u00EAn","T\u00EAn nh\u00E2n vi\u00EAn","Lo\u1EA1i nh\u00E2n vi\u00EAn","S\u1ED1 ng\u00E0y ngh\u1EC9","L\u01B0\u01A1ng (VND)"};
        ArrayList<TienLuong> dstien = layDanhSachTienThang(date1,date2);

        DefaultTableModel model = new DefaultTableModel(colTieuDe, 0);

        Object[] row;
        for (int i = 0; i < dstien.size(); i++) {

            row = new Object[5];

            row[0] = dstien.get(i).getMaNV();
            row[1] = dstien.get(i).getHoTen(); 
            row[2] = dstien.get(i).getLoaiNhanVien();
            row[3] = dstien.get(i).getSoNgayNghi();
            row[4] = dstien.get(i).getTien();
            

            model.addRow(row);
        }
        jTable1.setModel(model);

    }



    // Variables declaration - do not modify
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    // End of variables declaration
}

