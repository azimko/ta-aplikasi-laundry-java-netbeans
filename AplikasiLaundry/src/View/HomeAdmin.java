package View;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import Controller.AdminHome;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class HomeAdmin extends javax.swing.JFrame {
    public static DefaultTableModel modeltab1, modeltab2;
    int xx,xy;
    private AdminHome AdminHome;
    public static String username;
    private Integer CBstatus = 0;
    private String cari = "";
    public HomeAdmin() {
        initComponents();
        setColor(btn_1,ind_1,show_1); 
        ind_1.setOpaque(true);
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(layar.width / 2  - this.getSize().width / 2, layar.height / 2 - this.getSize().height / 2);
        
        this.AdminHome = new AdminHome(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_pane = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        show_1 = new javax.swing.JPanel();
        pnlImg = new javax.swing.JPanel();
        imgHome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        show_2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button4 = new java.awt.Button();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        show_3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        button2 = new java.awt.Button();
        button5 = new java.awt.Button();
        jLabel33 = new javax.swing.JLabel();
        button3 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lyondry");
        setBackground(java.awt.SystemColor.controlShadow);
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_pane.setBackground(new java.awt.Color(23, 35, 51));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setBackground(new java.awt.Color(23, 35, 51));
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Home");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

        btn_2.setBackground(new java.awt.Color(23, 35, 51));
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_2MouseReleased(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pengguna");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

        btn_3.setBackground(new java.awt.Color(23, 35, 51));
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Laporan");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon.png"))); // NOI18N
        jLabel5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));
        side_pane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 100));

        getContentPane().add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 66, 66));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel1.setBackground(java.awt.SystemColor.controlDkShadow);
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXIT");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("[Username]");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(741, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 950, -1));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_1.setAutoscrolls(true);
        show_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlImg.setBackground(new java.awt.Color(255, 255, 255));
        pnlImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HomeImage.png"))); // NOI18N
        imgHome.setOpaque(true);
        pnlImg.add(imgHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 171));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(">\n");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlImg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        show_1.add(pnlImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Selamat datang di Lyondry adalah sebuah aplikasi yang mempermudah anda mencari Laundry Terdekat, Murah, dan Tanpa Ribet.");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Caranya cukup mudah yaitu:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("1. Temukan jasa Laundry yang kamu inginkan;");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("2. Isikan Form;");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("3. Tunggu karyawan sampai kerumah;");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("4. Tunggu Laundry-an Anda diantar oleh karayawan kembali; dan");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("5. Bayar;");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Mudahkan :)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(28, 28, 28)
                .addComponent(jLabel18)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        show_1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 920, 320));

        jLayeredPane1.add(show_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        show_2.setOpaque(false);
        show_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pengguna");
        show_2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 40));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTable1.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12/1/2018", "Expresso POS", "Kenya", null},
                {"12/1/2018", "ROM Gen", "US", null},
                {"12/1/2018", "Text Ed", "UK", null},
                {"12/1/2018", "Mola Con", "China", null}
            },
            new String [] {
                "Date", "Item", "Location", "Completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(28);
        jTable1.setRowMargin(2);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTable1);

        show_2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 940, 320));

        button4.setActionCommand("Pesan Jasa");
        button4.setBackground(new java.awt.Color(255, 51, 51));
        button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setLabel("Blockir Pengguna");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        show_2.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 140, 50));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Status", "Status Pengguna", "Status Penyedia", "Status Blocked" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        show_2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 110, 20));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        show_2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 130, 20));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("Cari");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        show_2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, -1, 20));

        jLabel34.setText("Refresh");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        show_2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLayeredPane1.add(show_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        show_3.setOpaque(false);
        show_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Laporan Oleh Pengguna");
        show_3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 40));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTable2.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12/1/2018", "Expresso POS", "Kenya", null},
                {"12/1/2018", "ROM Gen", "US", null},
                {"12/1/2018", "Text Ed", "UK", null},
                {"12/1/2018", "Mola Con", "China", null}
            },
            new String [] {
                "Date", "Item", "Location", "Completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(28);
        jTable2.setRowMargin(2);
        jTable2.setUpdateSelectionOnSort(false);
        jTable2.setVerifyInputWhenFocusTarget(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        show_3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 940, 380));

        button2.setActionCommand("Detail Penyedia");
        button2.setBackground(new java.awt.Color(71, 120, 197));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("Detail Penyedia");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        show_3.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 140, 50));

        button5.setActionCommand("Pesan Jasa");
        button5.setBackground(new java.awt.Color(255, 112, 112));
        button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setLabel("Block Penyedia");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        show_3.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 130, 50));

        jLabel33.setText("Refresh");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        show_3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, -1));

        button3.setActionCommand("Detail Penyedia");
        button3.setBackground(new java.awt.Color(71, 120, 197));
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setLabel("Detail Pelapor");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        show_3.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 140, 50));

        jLayeredPane1.add(show_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 58, -1, 503));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        setColor(btn_1,ind_1,show_1);
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseReleased
        setColor(btn_2,ind_2,show_2);
    }//GEN-LAST:event_btn_2MouseReleased

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        setColor(btn_3,ind_3,show_3);
    }//GEN-LAST:event_btn_3MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        for (double i = 1.0; i >=0.0;i = i - 0.2)
        {
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }
            catch(Exception e){}
        }
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0;i = i + 0.2)
        {
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }
            catch(Exception e){}
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        previousImage();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new Color(71,120,197));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(255,66,66));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jPanel4.setBackground(new Color(71,120,197));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jPanel4.setBackground(new Color(255,66,66));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        jLabel32.setText("Logout");
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        jLabel32.setText(username);
    }//GEN-LAST:event_jLabel32MouseExited

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        new View.LoginSignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel32MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Thread p = new Thread(){
            public void run(){
                for(;;){
                    try{
                        if(jTable1.getSelectedRow() > -1 && jTable1.getValueAt(jTable1.getSelectedRow(), 5) != "'Blocked'"){
                            button4.setVisible(true);
                        }else{
                            button4.setVisible(false);
                        }
                        if(jTable2.getSelectedRow() > -1){
                            button2.setVisible(true);
                            button3.setVisible(true);
                            button5.setVisible(true);
                        }else{
                            button2.setVisible(false);
                            button3.setVisible(false);
                            button5.setVisible(false);
                        }
                        sleep(100);
                    }catch(InterruptedException ex){
                        Logger.getLogger(View.HomeAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }   
        };
        p.start();
        jLabel32.setText(username);
    }//GEN-LAST:event_formWindowActivated

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        cari = jTextField1.getText();
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                CBstatus = 0;
                break;
            case 1:
                CBstatus = 1;
                break;
            case 2:
                CBstatus = 2;
                break;
            case 3:
                CBstatus = 3;
                break;
            default:
                break;
        }
        AdminHome.setTabelPengguna(CBstatus, cari);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
        cari = jTextField1.getText();
    }//GEN-LAST:event_jTextField1InputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cari = jTextField1.getText();
        AdminHome.setTabelPengguna(CBstatus, cari);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        AdminHome.setTabelLaporan();
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        cari = jTextField1.getText();
        AdminHome.setTabelPengguna(CBstatus, cari);
        
    }//GEN-LAST:event_jLabel34MouseClicked

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        AdminHome.setStatus(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), "-1");
        AdminHome.setTabelPengguna(CBstatus, cari);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        AdminHome.setStatus(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString(), "-1");
        AdminHome.deleteLaporan(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
        AdminHome.setTabelLaporan();
    }//GEN-LAST:event_button5ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        AdminHome.getDataUserViaJOptionPane(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        AdminHome.getDataUserViaJOptionPane(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_button3ActionPerformed

    private void setColor(JPanel pane, JPanel indicator, JPanel showing)
    {
        pane.setBackground(new Color(41,57,80));
        indicator.setOpaque(true);
        showing.setEnabled(true);
        showing.setVisible(true);
        showing.setOpaque(true);
        
        JPanel[] panels = {btn_1,btn_2,btn_3};
        JPanel[] indicators = {ind_1,ind_2,ind_3};
        JPanel[] shows = {show_1,show_2,show_3};
        for(int i=0;i<panels.length;i++){
            if(panels[i] != pane){
                panels[i].setBackground(new Color(23,35,51));
            }
           
        }
        for(int i=0;i<indicators.length;i++){
            if(indicators[i] != indicator){
                indicators[i].setOpaque(false);
            }
        }
        for(int i=0;i<shows.length;i++){
            if(shows[i] != showing){
                shows[i].setEnabled(false);
                shows[i].setVisible(false);
                shows[i].setOpaque(false);
            }
        }
    }
    int potition = -1;
    private void previousImage(){
        try{
            AnimationClass anim = new AnimationClass();
            if(imgHome.getY() == 0 && potition == -1){
                anim.jLabelYUp(imgHome.getY(), -200, 2, 1, imgHome);
                potition = 1;
            }else if(potition == 1){
                anim.jLabelYDown(imgHome.getY(), 0, 2, 1, imgHome);
                potition = -2;
            }else if(potition == -2){
                anim.jLabelYDown(imgHome.getY(), 200, 2, 1, imgHome);
                potition = -1;
            }else{
                anim.jLabelYUp(imgHome.getY(), 0, 2, 1, imgHome);
            }
            anim.wait(10,1);
        }catch(Exception e){}
    }
    public JLabel setUser(){
        return jLabel32;
    }
    public JTable tabelPengguna(){
        return jTable1;
    }
    public JTable tabelLaporan(){
        return jTable2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private javax.swing.JLabel imgHome;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlImg;
    private javax.swing.JPanel show_1;
    private javax.swing.JPanel show_2;
    private javax.swing.JPanel show_3;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables
}
