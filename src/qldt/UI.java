/** @author honor */
package qldt;

import java.awt.event.KeyEvent;
import java.sql.SQLException;

public class UI extends javax.swing.JFrame {
	
	//<editor-fold defaultstate="collapsed" desc="Initialize">
	public UI() {
		initComponents();
	}
	
	protected static String st = "", st2 = "", st3 = "", st4 = "", st5 = "", st6 = "";
	private static int currentMenu, n;
	// </editor-fold>

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí đào tạo");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(44);
        jTextArea1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextArea1.setRows(10);
        jTextArea1.setTabSize(4);
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setEnabled(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(92);
        jTextArea2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextArea2.setRows(27);
        jTextArea2.setTabSize(2);
        jScrollPane2.setViewportView(jTextArea2);

        jTextField2.setEnabled(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setFocusable(false);

        jTextField3.setEnabled(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setFocusable(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setFocusable(false);

        jTextField4.setEnabled(false);

        jTextField5.setEnabled(false);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setFocusable(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setFocusable(false);

        jTextField6.setEnabled(false);

        jButton1.setText("Nhập");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Xoá màn hình");
        jButton2.setEnabled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("1");
        jButton3.setEnabled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("2");
        jButton4.setEnabled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("3");
        jButton5.setEnabled(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("4");
        jButton6.setEnabled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("5");
        jButton7.setEnabled(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("6");
        jButton8.setEnabled(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("7");
        jButton9.setEnabled(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setText("0");
        jButton10.setEnabled(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jTextField6)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
	
	//<editor-fold defaultstate="collapsed" desc="Menu Initials">
	void mainMenu() {
		currentMenu = 7;
		toggleButton(8);
		jButton8.setEnabled(QLDT.isAdmin);
		jTextArea1.setText(Menu.MAIN_MENU);
		jTextArea2.setText("");
		jLabel1.setText("Lựa chọn menu");
		jLabel2.setText("");
		jLabel3.setText("");
		jLabel4.setText("");
		jLabel5.setText("");
		jLabel6.setText("");
		jTextField2.setEnabled(false);
		jTextField3.setEnabled(false);
		jTextField4.setEnabled(false);
		jTextField5.setEnabled(false);
		jTextField6.setEnabled(false);
		jButton1.setEnabled(false);
		jButton2.setEnabled(false);
	}
	
	private void QLMonHoc() {
		currentMenu = 1;
		toggleButton(4);
		jTextArea1.setText(Menu.QL_MON_HOC);
		jTextArea2.setText("");
		jLabel4.setText("Mã môn học");
		jLabel5.setText("Tên môn học");
		jLabel6.setText("Số tín chỉ");
	}
	
	private void QLGiaoVien() {
		currentMenu = 2;
		toggleButton(5);
		jTextArea1.setText(Menu.QL_GIAO_VIEN);
		jTextArea2.setText("");
		jLabel3.setText("Mã giáo viên");
		jLabel4.setText("Họ");
		jLabel5.setText("Tên");
		jLabel6.setText("Đơn vị");
	}
	
	private void QLSinhVien() {
		currentMenu = 3;
		toggleButton(4);
		jTextArea1.setText(Menu.QL_SINH_VIEN);
		jTextArea2.setText("");
		jLabel2.setText("Mã sinh viên");
		jLabel3.setText("Họ");
		jLabel4.setText("Tên");
		jLabel5.setText("Ngày sinh (DD/MM/YYYY)");
		jLabel6.setText("Nơi sinh");
	}
	
	private void QLLop() {
		currentMenu = 4;
		toggleButton(7);
		jTextArea1.setText(Menu.QL_LOP);
		jTextArea2.setText("");
		jLabel2.setText("Mã lớp");
		jLabel3.setText("Mã môn học");
		jLabel4.setText("Năm học");
		jLabel5.setText("Học kì");
		jLabel6.setText("Mã giáo viên");
	}
	
	private void QLDiem() {
		currentMenu = 5;
		toggleButton(5);
		jTextArea1.setText(Menu.QL_DIEM);
		jTextArea2.setText("");
		jLabel4.setText("Mã sinh viên");
		jLabel5.setText("Mã lớp học");
		jLabel6.setText("Điểm");
	}
	
	private void QTHeThong() {
		currentMenu = 6;
		toggleButton(4);
		jTextArea1.setText(Menu.QT_HE_THONG);
		jTextArea2.setText("");
	}
	//</editor-fold>

	// <editor-fold defaultstate="collapsed" desc="----------IMPORTANT SWITCHES----------">
	private void nonMenuSwitch(int menu, int i) {
		switch (menu) {
			case 6:
				switch (i) {
					case 1:
						QTHeThong.backup();
						jTextArea2.append(QLDT.append);
						QLDT.append = "";
					break;
					case 2:
						st6 = jTextField6.getText();
						QTHeThong.restore();
						jTextArea2.append(QLDT.append);
						QLDT.append = "";
					break;
				}
			break;
			case 7:
				freeQuery();
			break;
		}
		toggleButton2();
	}
	
	private void mainMenuSwitch(int i) {
		jTextField1.setEnabled(false);
		switch (i) {
			case 0:
				freeQuerySet();
			break;
			case 1:
				QLMonHoc();
			break;
			case 2:
				QLGiaoVien();
			break;
			case 3:
				QLSinhVien();
			break;
			case 4:
				QLLop();
			break;
			case 5:
				QLDiem();
			break;
			case 6:
				QTHeThong();
			break;
			case 7:
				LoginUI frame = new LoginUI();
				frame.setVisible(true);
				this.dispose();
			break;
		}
	}
	
	private void menuSwitch(int menu, int i) {
		switch (menu) {
			case 0:
				freeQuery();
			break;
			case 1:
				QLMHMenuSwitch(i);
			break;
			case 2:
				QLGVMenuSwitch(i);
			break;
			case 3:
				QLSVMenuSwitch(i);
			break;
			case 4:
				QLLopMenuSwitch(i);
			break;
			case 5:
				QLDiemMenuSwitch(i);
			break;
			case 6:
				QTHeThongMenuSwitch(i);
			break;
			case 7:
				mainMenuSwitch(i);
			break;
		}
		toggleButton2();
	}
	
	private void functionSwitch(int menu, int i) throws SQLException {
		//<editor-fold defaultstate="collapsed" desc="Clear Fields">	
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
		jTextField5.setText("");
		jTextField6.setText(""); //</editor-fold>
		switch (menu) {
			case 1:
				switch (i) {
					case 1:
						QLMonHoc.addMonHoc();
					break;
					case 2:
						QLMonHoc.editMonHoc();
					break;
				}
			break;
			case 2:
				switch (i) {
					case 1:
						QLGiaoVien.addGiaoVien();
					break;
					case 2:
						if (QLGiaoVien.findGiaoVien()) {
							n = -2;
							QLGVMenuSwitch(n);
						}
					break;
					case -2:
						if (QLGiaoVien.editGiaoVien()) {
							n = 2;
							QLGVMenuSwitch(n);
						}
					break;
					case 4:
						QLGiaoVien.searchGiaoVien();
					break;
				}
			break;
			case 3:
				switch (i) {
					case 1:
						QLSinhVien.addSinhVien();
					break;
					case 2:
						if (QLSinhVien.findSinhVien()) {
							n = -2;
							QLSVMenuSwitch(n);
						}
					break;
					case -2:
						if (QLSinhVien.editSinhVien()) {
							n = 2;
							QLSVMenuSwitch(n);
						} else 
							retrieveFields();
					break;
					case 3:
						QLSinhVien.searchSinhVien();
					break;
				}
			break;
			case 4:
				switch (i) {
					case 1:
						QLLop.addLop();
					break;
					case 2:
						if (QLLop.findLop()) {
							n = -2;
							QLLopMenuSwitch(n);
						}
					break;
					case -2:
						if (QLLop.editLop()) {
							n = 2;
							QLLopMenuSwitch(n);
						} else 
							retrieveFields();
					break;
					case 3:
						QLLop.addSinhVien();
					break;
					case 4:
						QLLop.removeSinhVien();
					break;
					case 5:
						QLLop.removeLop();
					break;
					case 6:
						QLLop.printDSLop();
					break;
				}
			break;
			case 5:
				switch (i) {
					case 1:
						QLDiem.editDiem();
					break;
					case 2:
						QLDiem.printDiemLop();
					break;
					case 3:
						QLDiem.printDiemSV();
					break;
					case 4:
						QLDiem.top();
					break;
				}
			break;				
		}
	} // </editor-fold>
	
	// <editor-fold defaultstate="collapsed" desc="Menu Switches">
	private void QLMHMenuSwitch(int i) {
		switch (i) {
			case 1:
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jLabel1.setText("Thêm môn học");
			break;
			case 2:
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jLabel1.setText("Sửa môn học");
			break;
			case 3:
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(false);
				jLabel1.setText("Danh sách");
				QLMonHoc.printMonHoc();
				jTextArea2.append(QLDT.append);
				QLDT.append = "";
			break;
			case 4:
				mainMenu();
			break;
		}
	}
	
	private void QLGVMenuSwitch(int i) {
		switch (i) {
			case 1:
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
				jLabel1.setText("Thêm hồ sơ");
			break;
			case 2:
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jButton1.setText("Tìm");
				jLabel1.setText("Sửa hồ sơ");
			break;
			case -2:
				jTextField4.setText(QLGiaoVien.getHoGV);
				jTextField5.setText(QLGiaoVien.getTenGV);
				jTextField6.setText(QLGiaoVien.getDonVi);
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setText("Nhập");
			break;
			case 3:
				jTextField3.setEnabled(false);
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(false);
				QLGiaoVien.printGiaoVien();
				jTextArea2.append(QLDT.append);
				QLDT.append = "";
				jButton1.setText("Nhập");
				jLabel1.setText("Danh sách");
			break;
			case 4:
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
				jLabel1.setText("Tìm kiếm");
			break;
			case 5:
				jButton1.setText("Nhập");
				mainMenu();
			break;
		}
	}
	
	private void QLSVMenuSwitch(int i) {
		switch (i) {
			case 1:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
				jLabel1.setText("Thêm hồ sơ");
			break;
			case 2:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(false);
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(true);
				jButton1.setText("Tìm");
				jLabel1.setText("Sửa hồ sơ");
			break;
			case -2:
				jTextField2.setText(QLSinhVien.getMaSV);
				jTextField3.setText(QLSinhVien.getHoSV);
				jTextField4.setText(QLSinhVien.getTenSV);
				jTextField5.setText(QLSinhVien.getNgaySinh);
				jTextField6.setText(QLSinhVien.getNoiSinh);
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setText("Nhập");
			break;
			case 3:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
				jLabel1.setText("Tìm kiếm");
			break;
			case 4:
				jButton1.setText("Nhập");
				mainMenu();
			break;
		}
	}
	
	private void QLLopMenuSwitch(int i) {
		switch (i) {
			case 1:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
				jLabel1.setText("Thêm lớp");
				jLabel3.setText("Mã môn học");
				jLabel4.setText("Năm học");
				jLabel5.setText("Học kì");
				jLabel6.setText("Mã giáo viên");
			break;
			case 2:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(false);
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(true);
				jButton1.setText("Tìm");
				jLabel1.setText("Sửa lớp");
				jLabel3.setText("Mã môn học");
				jLabel4.setText("Năm học");
				jLabel5.setText("Học kì");
				jLabel6.setText("Mã giáo viên");
			break;
			case -2:
				jTextField2.setText(QLLop.getMaLop);
				jTextField3.setText(QLLop.getMaMH);
				jTextField4.setText(QLLop.getNamHoc);
				jTextField5.setText(QLLop.getHocKi);
				jTextField6.setText(QLLop.getMaGV);
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
			break;
			case 3:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
				jLabel1.setText("Thêm sinh viên");
				jLabel3.setText("Mã sinh viên");
				jLabel4.setText("");
				jLabel5.setText("");
				jLabel6.setText("");
			break;
			case 4:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
				jLabel1.setText("Bỏ sinh viên");
				jLabel3.setText("Mã sinh viên");
				jLabel4.setText("");
				jLabel5.setText("");
				jLabel6.setText("");
			break;
			case 5:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(false);
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
				jLabel1.setText("Huỷ lớp");
			break;
			case 6:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(false);
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(true);
				jButton1.setText("Nhập");
				jLabel1.setText("Danh sách lớp");
			break;
			case 7:
				jButton1.setText("Nhập");
				mainMenu();
			break;
		}
	}
	
	private void QLDiemMenuSwitch(int i) {
		switch (i) {
			case 1:
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(true);
				jButton1.setEnabled(true);
				jLabel1.setText("Cập nhật điểm");
			break;
			case 2:
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(true);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(true);
				jLabel1.setText("Bảng điểm lớp");
			break;
			case 3:
				jTextField4.setEnabled(true);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(true);
				jLabel1.setText("Bảng điểm sinh viên");
			break;
			case 4:
				jTextField2.setEnabled(true);
				jTextField3.setEnabled(true);
				jTextField4.setEnabled(false);
				jTextField5.setEnabled(false);
				jTextField6.setEnabled(false);
				jButton1.setEnabled(true);
				jLabel1.setText("Bảng điểm cao nhất");
				jLabel2.setText("Năm học");
				jLabel3.setText("Học kì");
			break;
			case 5:
				mainMenu();
			break;
		}
	}
	
	private void QTHeThongMenuSwitch(int i) {
		switch (i) {
			case 1:
				jLabel1.setText("Sao lưu dữ liệu");
				jTextField1.setEnabled(true);
			break;
			case 2:
				jLabel1.setText("Phục hồi dữ liệu");
				jLabel6.setText("Loại");
				jTextArea2.append(Menu.PHUC_HOI);
				jTextField1.setEnabled(true);
				jTextField6.setEnabled(true);
			break;
			case 3:
				jLabel1.setText("Xoá dữ liệu");
				jTextField1.setEnabled(false);
				QTHeThong.truncate();
				jTextArea2.append(QLDT.append);
				QLDT.append = "";
			break;
			case 4:
				mainMenu();
		}
	}
	//</editor-fold>

	// <editor-fold defaultstate="collapsed" desc="Additional Methods">
	private void freeQuerySet() {
		jTextField1.setEnabled(true);
		jLabel1.setText("MySQL");
		st = "";
	}
	
	private void freeQuery() {
		if (!st.matches(".*;$")) st += ";";
		String ust = st.toUpperCase();
		if (!ust.contains("EXIT") && !ust.contains("QUIT") && !ust.matches("^USE .*")) {
			try {
				if (QLDT.stmt.execute(st)) {
					QLDT.append = QLDT.tab(2) + st;
					QLDT.rs = QLDT.stmt.getResultSet();
					int columnNumber = QLDT.rs.getMetaData().getColumnCount();
					String[] titles = new String[columnNumber+1];
					titles[0] = "";
					for (int i = 1; i <= columnNumber; i++)
						titles[i] = QLDT.rs.getMetaData().getColumnName(i);
					QLDT.append += QLDT.displayResultSet(QLDT.rs, titles);
				} else {
					int count = QLDT.stmt.getUpdateCount();
					QLDT.append = QLDT.tab(2) + "Thực hiện thành công. Ảnh hưởng " + count + " hàng.";
				}
			} catch (SQLException ex) {
				QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			}			
		} else {
			QLDT.append = QLDT.tab(2) + "Không thực hiện được lệnh này.";
		}
		jTextArea2.append(QLDT.append);
		QLDT.append = "";
	}
	
	private void retrieveFields() {
		jTextField2.setText(st2);
		jTextField3.setText(st3);
		jTextField4.setText(st4);
		jTextField5.setText(st5);
		jTextField6.setText(st6);
	}
	
	private void toggleButton(int i) {
		if (i >= 1) jButton3.setEnabled(true); else jButton3.setEnabled(false);
		if (i >= 2) jButton4.setEnabled(true); else jButton4.setEnabled(false);
		if (i >= 3) jButton5.setEnabled(true); else jButton5.setEnabled(false);
		if (i >= 4) jButton6.setEnabled(true); else jButton6.setEnabled(false);
		if (i >= 5) jButton7.setEnabled(true); else jButton7.setEnabled(false);
		if (i >= 6) jButton8.setEnabled(true); else jButton8.setEnabled(false);
		if (i >= 7) jButton9.setEnabled(true); else jButton9.setEnabled(false);
		if (i >= 8) jButton10.setEnabled(true); else jButton10.setEnabled(false);
	}
	
	private void toggleButton2() {
		if ("".equals(jTextArea2.getText()))
			jButton2.setEnabled(false);
		else jButton2.setEnabled(true);
	} // </editor-fold>
	
	//<editor-fold defaultstate="collapsed" desc="Events">
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			jTextField1.selectAll();
            st = jTextField1.getText();
			nonMenuSwitch(currentMenu, n);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
		st2 = jTextField2.getText();
		st3 = jTextField3.getText();
		st4 = jTextField4.getText();
		st5 = jTextField5.getText();
		st6 = jTextField6.getText();
		
		try {
			functionSwitch(currentMenu, n);
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
		jTextArea2.append(QLDT.append);
		QLDT.append = "";	
		toggleButton2();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jTextArea2.setText("");
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
		n = 1;
		menuSwitch(currentMenu, n);
		toggleButton2();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
		n = 2;
		menuSwitch(currentMenu, n);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
		n = 3;
		menuSwitch(currentMenu, n);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
		n = 4;
		menuSwitch(currentMenu, n);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
		n = 5;
		menuSwitch(currentMenu, n);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
		n = 6;
		menuSwitch(currentMenu, n);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
		n = 7;
		menuSwitch(currentMenu, n);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
		n = 0;
		menuSwitch(currentMenu, n);
    }//GEN-LAST:event_jButton10MouseClicked
	// </editor-fold>
	
	// <editor-fold defaultstate="collapsed" desc="Main & Variables declaration">
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
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new UI().setVisible(true);
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
	// </editor-fold>
}
