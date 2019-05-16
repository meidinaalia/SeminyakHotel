
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class main extends javax.swing.JFrame {

    Connection conn=null;
   PreparedStatement pst= null;
   ResultSet rs=null;
    public main() {
        initComponents();
        
        showTable();
        showTable2();
    }
   
    private void filter(String sql){
        DefaultTableModel model=(DefaultTableModel)checkoutTable.getModel();
        TableRowSorter<DefaultTableModel>tr=new TableRowSorter
                <DefaultTableModel>(model);
                checkoutTable.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(sql));
    }
    
    private void filter2(String sql){
        DefaultTableModel model=(DefaultTableModel)maintable.getModel();
        TableRowSorter<DefaultTableModel>tr=new TableRowSorter
                <DefaultTableModel>(model);
                maintable.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(sql));
    }



    public ArrayList<ClassCheckIn> dataList()
   {
       ArrayList<ClassCheckIn> dataList = new ArrayList<ClassCheckIn>();
       conn=mySqlConnection.ConnectDB();
       String sql="select * from checkin";
       try{
           Statement st = conn.createStatement();
           rs=st.executeQuery(sql);

           ClassCheckIn Data;
           while(rs.next()){
              Data = new ClassCheckIn(rs.getInt("id"),rs.getString("cus_name"),rs.getString("address"),rs.getLong("cus_nic"),rs.getString("cus_date"),rs.getLong("phone"),rs.getString("cus_country"),rs.getString("cus_city"),rs.getString("room_type"),rs.getInt("room_no"),rs.getFloat("room_cost"),rs.getFloat("taxes"),rs.getFloat("total"));

               dataList.add(Data);
           }

       }
       catch(Exception ex){
           ex.printStackTrace();
       }
       return dataList;
   }

   
    public void showTable(){
        ArrayList<ClassCheckIn> list = dataList();
       DefaultTableModel model = (DefaultTableModel)maintable.getModel();
       while(maintable.getRowCount()>0)
       {
           ((DefaultTableModel)maintable.getModel()).removeRow(0);
       }
       Object[]row = new Object[10];
       
       for (int i = 0; i <list.size(); i++) {
           row[0]=list.get(i).getid();
           row[1]=list.get(i).getname();
           row[2]=list.get(i).getnic();
           row[3]=list.get(i).getaddress();
           row[4]=list.get(i).getdate();
           row[5]=list.get(i).getphone();
           row[6]=list.get(i).getcountry();
           row[7]=list.get(i).getcity();
           row[8]=list.get(i).getroomtype();
           row[9]=list.get(i).getroomno();
           
          
           model.addRow(row);
       }
    
    }
     
    public ArrayList<ClassCheckOut> dataList2()
   {
       ArrayList<ClassCheckOut> dataList = new ArrayList<ClassCheckOut>(); 
       conn=mySqlConnection.ConnectDB();
       String sql="select * from checkout";
       try{
           Statement st = conn.createStatement();
           rs=st.executeQuery(sql);
           
           ClassCheckOut Data;
           while(rs.next()){
               Data = new ClassCheckOut(rs.getInt("id"),rs.getString("cus_name"),rs.getString("address"),rs.getLong("cus_nic"),rs.getString("cus_date"),rs.getString("out_date"),rs.getLong("phone"),rs.getString("cus_country"),rs.getString("cus_city"),rs.getString("room_type"),rs.getInt("room_no"),rs.getFloat("room_cost"),rs.getFloat("taxes"),rs.getFloat("total"));
               
               dataList.add(Data);
           }
           
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
       return dataList;
   }

    
    public void showTable2(){
        ArrayList<ClassCheckOut> list = dataList2();
       DefaultTableModel model = (DefaultTableModel)checkoutTable.getModel();
       while(checkoutTable.getRowCount()>0)
       {
           ((DefaultTableModel)checkoutTable.getModel()).removeRow(0);
       }
       Object[]row = new Object[11];
       
       for (int i = 0; i <list.size(); i++) {
           row[0]=list.get(i).getid();
           row[1]=list.get(i).getname();
           row[2]=list.get(i).getnic();
           row[3]=list.get(i).getaddress();
           row[4]=list.get(i).getdate();
           row[5]=list.get(i).getodate();
           row[6]=list.get(i).getphone();
           row[7]=list.get(i).getcountry();
           row[8]=list.get(i).getcity();
           row[9]=list.get(i).getroomtype();
           row[10]=list.get(i).getroomno();
           
          
           model.addRow(row);
       }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        btnReservation = new javax.swing.JButton();
        btnCheckIN = new javax.swing.JButton();
        btnCheckOUT = new javax.swing.JButton();
        btnExpens = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        top = new javax.swing.JPanel();
        btnExpenses = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        refreshAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintable = new javax.swing.JTable();
        btn_backward = new javax.swing.JButton();
        btn_forward = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkoutTable = new javax.swing.JTable();
        searchBox1 = new javax.swing.JTextField();
        btn_print1 = new javax.swing.JButton();
        btn_refresh1 = new javax.swing.JButton();
        btn_forward1 = new javax.swing.JButton();
        btn_backward1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 153, 153));

        sidebar.setBackground(new java.awt.Color(0, 153, 153));
        sidebar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnReservation.setBackground(new java.awt.Color(0, 153, 153));
        btnReservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReservation.setForeground(new java.awt.Color(204, 255, 255));
        btnReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-3d-house-48.png"))); // NOI18N
        btnReservation.setText("Reservation ");
        btnReservation.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });

        btnCheckIN.setBackground(new java.awt.Color(0, 153, 153));
        btnCheckIN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckIN.setForeground(new java.awt.Color(204, 255, 255));
        btnCheckIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vacant.jpg"))); // NOI18N
        btnCheckIN.setText("  Check IN");
        btnCheckIN.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCheckIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckINActionPerformed(evt);
            }
        });

        btnCheckOUT.setBackground(new java.awt.Color(0, 153, 153));
        btnCheckOUT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckOUT.setForeground(new java.awt.Color(204, 255, 255));
        btnCheckOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/occupied.jpg"))); // NOI18N
        btnCheckOUT.setText("  Check OUT");
        btnCheckOUT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCheckOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOUTActionPerformed(evt);
            }
        });

        btnExpens.setBackground(new java.awt.Color(0, 153, 153));
        btnExpens.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExpens.setForeground(new java.awt.Color(204, 255, 255));
        btnExpens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/if_Money-Increase_379473.png"))); // NOI18N
        btnExpens.setText("Expenses");
        btnExpens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExpens.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExpens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpensActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 153, 153));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(204, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/employee.png"))); // NOI18N
        jButton14.setText("Employee ");
        jButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReservation, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
            .addComponent(btnCheckIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCheckOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExpens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addComponent(btnReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckIN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExpens, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 372, Short.MAX_VALUE))
        );

        top.setBackground(new java.awt.Color(0, 153, 153));

        btnExpenses.setBackground(new java.awt.Color(33, 55, 116));
        btnExpenses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExpenses.setForeground(new java.awt.Color(204, 255, 255));
        btnExpenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/out.jpg"))); // NOI18N
        btnExpenses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpensesActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(33, 55, 116));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guest.jpg"))); // NOI18N
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(33, 55, 116));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/room.jpg"))); // NOI18N
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        refreshAll.setBackground(new java.awt.Color(33, 55, 116));
        refreshAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshAll.setForeground(new java.awt.Color(204, 255, 255));
        refreshAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/change.jpg"))); // NOI18N
        refreshAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshAllActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coollogo_com-3125731.png"))); // NOI18N

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshAll, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnExpenses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 5, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        maintable.setBackground(new java.awt.Color(0, 153, 153));
        maintable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maintable.setForeground(new java.awt.Color(153, 255, 255));
        maintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "NIC/Passport", "Address", "Date", "Phone", "Country", "City", "Room Type", "Room No"
            }
        ));
        maintable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(maintable);

        btn_backward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-go-back-35.png"))); // NOI18N
        btn_backward.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-circled-right-35.png"))); // NOI18N
        btn_forward.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-refresh-35.png"))); // NOI18N
        btn_refresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/printer (1).png"))); // NOI18N
        btn_print.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        searchBox.setBackground(new java.awt.Color(0, 153, 153));
        searchBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBox.setForeground(new java.awt.Color(153, 255, 255));
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBoxKeyReleased(evt);
            }
        });

        checkoutTable.setBackground(new java.awt.Color(0, 153, 153));
        checkoutTable.setForeground(new java.awt.Color(153, 255, 255));
        checkoutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "NIC/Passport", "Address", "IN Date", "OUT Date", "Phone", "Country", "City", "Room Type", "Room No"
            }
        ));
        checkoutTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkoutTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(checkoutTable);

        searchBox1.setBackground(new java.awt.Color(0, 153, 153));
        searchBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBox1.setForeground(new java.awt.Color(153, 255, 255));
        searchBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBox1KeyReleased(evt);
            }
        });

        btn_print1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/printer (1).png"))); // NOI18N
        btn_print1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_print1ActionPerformed(evt);
            }
        });

        btn_refresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-refresh-35.png"))); // NOI18N
        btn_refresh1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh1ActionPerformed(evt);
            }
        });

        btn_forward1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-circled-right-35.png"))); // NOI18N
        btn_forward1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_backward1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-go-back-35.png"))); // NOI18N
        btn_backward1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Check IN Records");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Check OUT Records");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(btn_backward, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_forward, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel2))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(btn_backward1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_forward1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_print1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(searchBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103)
                                        .addComponent(jLabel3)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_backward, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_forward, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBox)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_backward1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_forward1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_print1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExpensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpensActionPerformed
        
        expenses exp= new expenses();
        exp.setVisible(true);
        
    }//GEN-LAST:event_btnExpensActionPerformed

    private void btnExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpensesActionPerformed
        
        expenses exp= new expenses();
        exp.setVisible(true);
        
    }//GEN-LAST:event_btnExpensesActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        checkin cin = new checkin();
        cin.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        employee emp = new employee();
        emp.setVisible(true);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void refreshAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshAllActionPerformed
        showTable();
        showTable2();
    }//GEN-LAST:event_refreshAllActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        
        employee emp = new employee();
        emp.setVisible(true);
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        // TODO add your handling code here:
        reservation reserv = new reservation();
        reserv.setVisible(true);
        
    }//GEN-LAST:event_btnReservationActionPerformed

    private void btnCheckINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckINActionPerformed
        // TODO add your handling code here:
        checkin cin=new checkin();
        cin.setVisible(true);
    }//GEN-LAST:event_btnCheckINActionPerformed

    private void btnCheckOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOUTActionPerformed
        
        checkout co = new checkout();
        co.setVisible(true);
        
    }//GEN-LAST:event_btnCheckOUTActionPerformed

    private void checkoutTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutTableMouseClicked

        
    }//GEN-LAST:event_checkoutTableMouseClicked

    private void btn_refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh1ActionPerformed
        showTable2();
    }//GEN-LAST:event_btn_refresh1ActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        showTable();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        
        MessageFormat header = new MessageFormat("Seminyak Hotel CheckIN Records ");
        MessageFormat footer = new MessageFormat("Seminyak Hotel Software Generated Record");
        try{
            maintable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"Cannot be Print !"+e.getMessage());
        }
        
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_print1ActionPerformed
        
        MessageFormat header = new MessageFormat("Seminyak Hotel CheckOUT Records ");
        MessageFormat footer = new MessageFormat("Seminyak Hotel Software Generated Record");
        try{
            checkoutTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"Cannot be Print !"+e.getMessage());
        }
        
    }//GEN-LAST:event_btn_print1ActionPerformed

    private void searchBox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBox1KeyReleased
        
         String txt=searchBox1.getText();
        filter(txt);
        
    }//GEN-LAST:event_searchBox1KeyReleased

    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        
        String txt=searchBox.getText();
        filter2(txt);
        
    }//GEN-LAST:event_searchBoxKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCheckIN;
    private javax.swing.JButton btnCheckOUT;
    private javax.swing.JButton btnExpens;
    private javax.swing.JButton btnExpenses;
    private javax.swing.JButton btnReservation;
    private javax.swing.JButton btn_backward;
    private javax.swing.JButton btn_backward1;
    private javax.swing.JButton btn_forward;
    private javax.swing.JButton btn_forward1;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_print1;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_refresh1;
    private javax.swing.JTable checkoutTable;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable maintable;
    private javax.swing.JButton refreshAll;
    private javax.swing.JTextField searchBox;
    private javax.swing.JTextField searchBox1;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
