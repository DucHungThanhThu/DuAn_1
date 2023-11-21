/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.BanChiTietDAO;
import Dao.BanDao;
import Dao.HoaDonDAO;
import Dao.*;
import Dao.SanPhamDao;
import Model.Ban;
import Model.BanChiTiet;
import Model.Hoadon;
import Model.HoaDonChiTiet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ChucNangTachDonJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ChucNangTachDonJDialog
     */
    public ChucNangTachDonJDialog(java.awt.Frame parent, boolean modal, int hd, int ban) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        idhd = hd;
        idban = ban;
        filltoTABLEhiendau();
        lblDonHienTai.setText(hd + "");
        mnTachdon.setEnabled(false);
//        if (!tt()) {
//            Hoadon hdgoc = DAOHD.selectById(idhd);
//            Hoadon hdtach = new Hoadon();
//            hdtach.setIdNhanVien("NV1");
//            hdtach.setNgayTao(hdgoc.getNgayTao());
//            hdtach.setTrangThai(true);
//            hdtach.setTrangThaiTT(false);      
//            DAOHD.insert(hdtach);
//            List<Hoadon> list = DAOHD.selectAll();
//            lblDontach.setText(list.get(list.size() -1).getIdHoaDon()+"");
//        }//else{
//            JOptionPane.showMessageDialog(this, "Số lượng đơn chỉ còn 1 không được tách");
//            this.dispose();
//        }
    }
    static int idhd;
    static int idban;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnTachdon = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDonHienTai = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDontach = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHDchitiet = new javax.swing.JTable();
        btnTachDon = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHDchitiet1 = new javax.swing.JTable();
        btnXedon = new javax.swing.JButton();
        btnhuy = new javax.swing.JButton();

        mnTachdon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnTachdon.setText("Tách đơn");
        mnTachdon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTachdonActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnTachdon);

        jMenuItem1.setText("jMenuItem1");
        jPopupMenu2.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(116, 169, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Đơn hiện tại:");

        lblDonHienTai.setBackground(new java.awt.Color(255, 255, 255));
        lblDonHienTai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDonHienTai.setForeground(new java.awt.Color(255, 255, 255));
        lblDonHienTai.setText("......");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đơn tách:");

        lblDontach.setBackground(new java.awt.Color(255, 255, 255));
        lblDontach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDontach.setForeground(new java.awt.Color(255, 255, 255));
        lblDontach.setText("......");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        tblHDchitiet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblHDchitiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá ", "Tổng giá", "Ghi chú"
            }
        ));
        tblHDchitiet.setRowHeight(20);
        tblHDchitiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblHDchitietMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblHDchitiet);

        btnTachDon.setBackground(new java.awt.Color(255, 255, 255));
        btnTachDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTachDon.setText("Tách đơn");
        btnTachDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachDonActionPerformed(evt);
            }
        });

        tblHDchitiet1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblHDchitiet1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá ", "Tổng giá", "Ghi chú"
            }
        ));
        tblHDchitiet1.setRowHeight(20);
        jScrollPane2.setViewportView(tblHDchitiet1);

        btnXedon.setBackground(new java.awt.Color(255, 255, 255));
        btnXedon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXedon.setText("Xé đơn");
        btnXedon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXedonActionPerformed(evt);
            }
        });

        btnhuy.setBackground(new java.awt.Color(255, 255, 255));
        btnhuy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhuy.setText("Hủy");
        btnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDonHienTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTachDon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDontach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnXedon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDonHienTai)
                    .addComponent(jLabel3)
                    .addComponent(btnTachDon))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblDontach)
                    .addComponent(btnXedon)
                    .addComponent(btnhuy))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (tblHDchitiet1.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "Đang thực hiện dở xé đơn! Chắc chắn muốn thoát?") == JOptionPane.YES_OPTION) {
                dispose();
            }
        } else {
            dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnTachDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachDonActionPerformed
//        // TODO add your handling code here:
//          //Hoadon hdtach = DAOHD.selectById(Integer.parseInt(lblDontach.getText()));
////        Hoadon hdtach = new Hoadon();
////        hdtach.setIdHoaDon(Integer.parseInt(lblDontach.getText()));
////        hdtach.setIdNhanVien("NV1");
////        hdtach.setNgayTao(hdgoc.getNgayTao());
////        hdtach.setTrangThai(true);
////        hdtach.setTrangThaiTT(false);
//        //DAOHD.insert(hdtach);
//        if (tblHDchitiet.getSelectedRows().length < 1) {
//            JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm tách!");
//            return;
//        }
//        Hoadon hdgoc = DAOHD.selectById(idhd);
//        Hoadon hdtach = new Hoadon();
//        hdtach.setIdNhanVien("NV1");
//        hdtach.setNgayTao(hdgoc.getNgayTao());
//        hdtach.setTrangThai(true);
//        hdtach.setTrangThaiTT(false);      
//        DAOHD.insert(hdtach);
//        List<Hoadon> list = DAOHD.selectAll();
//        lblDontach.setText(list.get(list.size() -1).getIdHoaDon()+"");
//        BanChitiet bct = DAObanct.selectById(idban, idhd);
//        BanChitiet banct = new BanChitiet();
//        banct.setID_Ban(idban);
//        banct.setID_HoaDon(Integer.parseInt(lblDontach.getText()));
//        banct.setThoidiemCoNguoi(bct.getThoidiemCoNguoi());
//        banct.setBanChinh(true);
//        DAObanct.insert(banct);
//        int tiendonmoi = 0;
//        int row = tblHDchitiet.getSelectedRow();
////        int tongsoluongdon = 0;
////            for (int i = 0; i < tblHDchitiet.getRowCount(); i++) {
////                tongsoluongdon = Integer.parseInt(tblHDchitiet.getValueAt(i, 2).toString());
////            }
//        if ((int) tblHDchitiet.getValueAt(row, 2) > 1) {
//            ChucNangTachSLSPJDialog cnsl = new ChucNangTachSLSPJDialog(null, true, idhd, tblHDchitiet.getValueAt(row, 0).toString(),Integer.parseInt(lblDontach.getText()), tblHDchitiet.getRowCount());
//            cnsl.setVisible(true);
//            tiendonmoi += cnsl.tiencong;
//            filltoTABLE();
//        }else{
//            Hoadonchitiet hdchitietcu = DAOhdct.selectById(idhd, tblHDchitiet.getValueAt(row, 0).toString());
//            hdchitietcu.setGhiChu("Tách từ đơn: "+hdchitietcu.getID_Hoadon()+", SL: "+hdchitietcu.getSoluong());
//            DAOhdct.update_ghichu(hdchitietcu);
//            DAOhdct.updateIDHOADON( Integer.parseInt(lblDonHienTai.getText()),Integer.parseInt(lblDontach.getText()),tblHDchitiet.getValueAt(row, 0).toString());
//            tiendonmoi += (int) tblHDchitiet.getValueAt(row, 4);
//            filltoTABLE();
//        }
//        
//        Hoadon hdtachmoi = DAOHD.selectById(Integer.parseInt(lblDontach.getText()));
//        hdtachmoi.setThanhTien(tiendonmoi);
//        DAOHD.updateThanhtien(hdtachmoi);
//        filltoTABLE();
//        int tiendoncu = 0;
//        for (int j = 0; j < tblHDchitiet.getRowCount(); j++) {
//            tiendoncu += (int) tblHDchitiet.getValueAt(j, 4);
//        }
//        Hoadon hoadoncu = DAOHD.selectById(idhd);
//        hoadoncu.setThanhTien(tiendoncu);
//        DAOHD.updateThanhtien(hoadoncu);
//        tt();
//        filltoTABLEDonTach();
//        mnTachdon.setEnabled(true);
//        btnTachDon.setEnabled(false);
        if (tblHDchitiet.getSelectedRows().length < 1) {
            JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm tách!");
            return;
        }
        int row = tblHDchitiet.getSelectedRow();
        if (tblHDchitiet.getRowCount() == 1 && Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 1) {
            JOptionPane.showMessageDialog(this, "Không tách thêm nữa!");
            return;
        }
        if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) > 1) {
            ChucNangTachSLSPJDialog cnsl = new ChucNangTachSLSPJDialog(null, true, idhd, tblHDchitiet.getValueAt(row, 0).toString(), Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()), tblHDchitiet.getRowCount());
            cnsl.setVisible(true);
            listbctgoc.set(row, cnsl.hdctsua());
            filltoTABLEsua();
            if (listbctduocXe.size() == 0) {
                listbctduocXe.add(cnsl.hdcttach());
                filltoTABLEDonTach(listbctduocXe);
                if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 0) {
                    listbctgoc.remove(row);
                    filltoTABLEsua();
                }
                return;
            }
            for (int i = 0; i < tblHDchitiet1.getRowCount(); i++) {
                if (cnsl.hdcttach().getID_SanPHam().equalsIgnoreCase(tblHDchitiet1.getValueAt(row, 0).toString())) {
                    int soluong = Integer.parseInt(tblHDchitiet1.getValueAt(i, 2).toString());
                    HoaDonChiTiet hdon = cnsl.hdcttach();
                    hdon.setSoluong(soluong + hdon.getSoluong());
                    hdon.setTongGia(hdon.getSoluong() * hdon.getGia());
                    listbctduocXe.set(i, hdon);
                    filltoTABLEDonTach(listbctduocXe);
                    if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 0) {
                        listbctgoc.remove(row);
                        filltoTABLEsua();
                    }
                    return;
                } else {
                    listbctduocXe.add(cnsl.hdcttach());
                    filltoTABLEDonTach(listbctduocXe);
                    if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 0) {
                        listbctgoc.remove(row);
                        filltoTABLEsua();
                    }
                    return;
                }
            }

        } else {
            for (int i = 0; i < tblHDchitiet1.getRowCount(); i++) {
                if (tblHDchitiet.getValueAt(row, 0).toString().equalsIgnoreCase(tblHDchitiet1.getValueAt(i, 0).toString())) {
                    HoaDonChiTiet hdct = findToHDCT(tblHDchitiet.getValueAt(row, 0).toString());
                    hdct.setSoluong(hdct.getSoluong() + Integer.parseInt(tblHDchitiet1.getValueAt(i, 2).toString()));
                    System.out.println(hdct.getSoluong());
                    hdct.setTongGia(hdct.getSoluong() * hdct.getGia());
                    hdct.setGhiChu("Tách từ đơn: " + hdct.getID_Hoadon() + ", SL: " + hdct.getSoluong());
                    listbctduocXe.set(i, hdct);
                    listbctgoc.remove(row);
                    filltoTABLEsua();
                    filltoTABLEDonTach(listbctduocXe);
                    return;
                }
            }
            HoaDonChiTiet hdct = findToHDCT(tblHDchitiet.getValueAt(row, 0).toString());
            hdct.setGhiChu("Tách từ đơn: " + hdct.getID_Hoadon() + ", SL: " + hdct.getSoluong());
            listbctduocXe.add(hdct);
            listbctgoc.remove(row);
            filltoTABLEsua();
            filltoTABLEDonTach(listbctduocXe);
        }
    }//GEN-LAST:event_btnTachDonActionPerformed
    public HoaDonChiTiet findToHDCT(String masp) {
        for (int i = 0; i < listbctgoc.size(); i++) {
            if (listbctgoc.get(i).getID_SanPHam().equalsIgnoreCase(masp)) {
                return listbctgoc.get(i);
            }
        }
        return null;
    }
    private void mnTachdonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTachdonActionPerformed
        // TODO add your handling code here:
////        if (lblDontach.getText().equals(".....")) {
////            mnTachdon.setEnabled(false);
////        }else{
////            mnTachdon.setEnabled(true);
////        }
//        Hoadon hdtachmoitien = DAOHD.selectById(Integer.parseInt(lblDontach.getText()));
//        int tiendonmoi = hdtachmoitien.getThanhTien();
//        int row = tblHDchitiet.getSelectedRow();
//        if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 1 && tblHDchitiet.getRowCount() == 1) {
//            JOptionPane.showMessageDialog(this, "hóa đơn không được phép tách hết sản phẩm");
//            return;
//        }
//        if ((int) tblHDchitiet.getValueAt(row, 2) > 1) {
//            ChucNangTachSLSPJDialog cnsl = new ChucNangTachSLSPJDialog(null, true, idhd, tblHDchitiet.getValueAt(row, 0).toString(),Integer.parseInt(lblDontach.getText()), tblHDchitiet.getRowCount());
//            cnsl.setVisible(true);
//            tiendonmoi += cnsl.tiencong;
//            filltoTABLE();
//        }else{
//            Hoadonchitiet hdchitietcu = DAOhdct.selectById(idhd, tblHDchitiet.getValueAt(row, 0).toString());
//            hdchitietcu.setGhiChu("Tách từ đơn: "+hdchitietcu.getID_Hoadon()+", SL: "+hdchitietcu.getSoluong());
//            DAOhdct.update_ghichu(hdchitietcu);
//            DAOhdct.updateIDHOADON( Integer.parseInt(lblDonHienTai.getText()),Integer.parseInt(lblDontach.getText()),tblHDchitiet.getValueAt(row, 0).toString());
//            tiendonmoi += (int) tblHDchitiet.getValueAt(row, 4);
//            filltoTABLE();
//        }
//        
//        Hoadon hdtachmoi = DAOHD.selectById(Integer.parseInt(lblDontach.getText()));
//        hdtachmoi.setThanhTien(tiendonmoi);
//        DAOHD.updateThanhtien(hdtachmoi);
//        filltoTABLE();
//        int tiendoncu = 0;
//        for (int j = 0; j < tblHDchitiet.getRowCount(); j++) {
//            tiendoncu += (int) tblHDchitiet.getValueAt(j, 4);
//        }
//        Hoadon hoadoncu = DAOHD.selectById(idhd);
//        hoadoncu.setThanhTien(tiendoncu);
//        DAOHD.updateThanhtien(hoadoncu);
//        filltoTABLEDonTach();
    }//GEN-LAST:event_mnTachdonActionPerformed

    private void tblHDchitietMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDchitietMouseReleased
        // TODO add your handling code here:
        int r = tblHDchitiet.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tblHDchitiet.getRowCount()) {
            tblHDchitiet.setRowSelectionInterval(r, r);
        } else {
            tblHDchitiet.clearSelection();
        }

        int rowindex = tblHDchitiet.getSelectedRow();
        if (rowindex < 0) {
            return;
        }
        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
//            if (lblDontach.getText().equals(".....")) {
//            mnTachdon.setEnabled(false);
//            }else{
//                mnTachdon.setEnabled(true);
//            }
        }
    }//GEN-LAST:event_tblHDchitietMouseReleased

    private void btnXedonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXedonActionPerformed
        // TODO add your handling code here:
        Hoadon hdgoc = DAOHD.selectById(idhd);
        Hoadon hdtach = new Hoadon();
        hdtach.setIdNhanVien("NV1");
        hdtach.setNgayTao(hdgoc.getNgayTao());
        hdtach.setTrangThai(true);
        hdtach.setTrangThaiTT(false);
        DAOHD.insert(hdtach);
        List<Hoadon> list = DAOHD.selectAll();
        lblDontach.setText(list.get(list.size() - 1).getIdHoaDon() + "");
        BanChiTiet bct = DAObanct.selectById(idban, idhd);
        BanChiTiet banct = new BanChiTiet();
        banct.setID_Ban(idban);
        banct.setID_HoaDon(Integer.parseInt(lblDontach.getText()));
        banct.setThoidiemCoNguoi(bct.getThoidiemCoNguoi());
        banct.setBanChinh(true);
        DAObanct.insert(banct);
        List<HoaDonChiTiet> listhdct = DAOhdct.selectByIdHD(idhd);
        for (HoaDonChiTiet hdctgoc : listhdct) {
            for (int i = 0; i < listbctduocXe.size(); i++) {
                if (listbctduocXe.get(i).getID_SanPHam().equalsIgnoreCase(hdctgoc.getID_SanPHam())) {
                    System.out.println("a+ " + listbctduocXe.get(i).getID_SanPHam());
                    if (hdctgoc.getSoluong() > 1) {
                        System.out.println("a1+" + hdctgoc.getSoluong());
                        int soluong = hdctgoc.getSoluong() - listbctduocXe.get(i).getSoluong();
                        if (soluong == 0) {
                            hdctgoc.setGhiChu(listbctduocXe.get(i).getGhiChu());
                            DAOhdct.update_ghichu(hdctgoc);
                            DAOhdct.updateIDHOADON(Integer.parseInt(lblDonHienTai.getText()), Integer.parseInt(lblDontach.getText()), listbctduocXe.get(i).getID_SanPHam());
                        } else {
                            hdctgoc.setSoluong(soluong);
                            hdctgoc.setTongGia(soluong * hdctgoc.getGia());
                            DAOhdct.update_SL(hdctgoc);
                            HoaDonChiTiet hdcttach = listbctduocXe.get(i);
                            hdcttach.setID_Hoadon(Integer.parseInt(lblDontach.getText()));
                            DAOhdct.insert(hdcttach);
                        }
                    } else {
                        HoaDonChiTiet hdchitietcu = DAOhdct.selectById(idhd, hdctgoc.getID_SanPHam());
                        hdchitietcu.setGhiChu(listbctduocXe.get(i).getGhiChu());
                        DAOhdct.update_ghichu(hdchitietcu);
                        DAOhdct.updateIDHOADON(Integer.parseInt(lblDonHienTai.getText()), Integer.parseInt(lblDontach.getText()), listbctduocXe.get(i).getID_SanPHam());
                        System.out.println("a2");
                    }
                }
            }
        }
        List<HoaDonChiTiet> listupdatetiendoncu = DAOhdct.selectByIdHD(idhd);
        int tiendoncu = 0;
        int tiendonmoi = 0;
        for (HoaDonChiTiet hoadonchitiet : listupdatetiendoncu) {
            tiendoncu += hoadonchitiet.getTongGia();
        }
        Hoadon hoadoncu = DAOHD.selectById(idhd);
        hoadoncu.setThanhTien(tiendoncu);
        DAOHD.updateThanhtien(hoadoncu);
        for (int i = 0; i < listbctduocXe.size(); i++) {
            HoaDonChiTiet hd = listbctduocXe.get(i);
            tiendonmoi += hd.getTongGia();
        }
        Hoadon hoadonmoi = DAOHD.selectById(Integer.parseInt(lblDontach.getText()));
        hoadonmoi.setThanhTien(tiendonmoi);
        DAOHD.updateThanhtien(hoadonmoi);
        List<BanChiTiet> listbct = DAObanct.selectByIdHD(idhd);
        if (listbct.size() > 1) {
            for (BanChiTiet banChitiet : listbct) {
                if (banChitiet.isBanChinh() == true) {
                    continue;
                }
                BanChiTiet bcte = DAObanct.selectById(idban, idhd);
                BanChiTiet banchitiet = new BanChiTiet();
                Ban bane = DAOban.selectById(banChitiet.getID_Ban());
                banchitiet.setID_Ban(bane.getIdBan());
                int mabangop = bane.getIdBan();
                banchitiet.setID_HoaDon(hoadonmoi.getIdHoaDon());
                banchitiet.setThoidiemCoNguoi(bcte.getThoidiemCoNguoi());
                banchitiet.setBanChinh(false);
                DAOban.updateHoatDong(mabangop);
                DAObanct.insert(banchitiet);
            }
        }
        dispose();
    }//GEN-LAST:event_btnXedonActionPerformed
    BanDao DAOban = new BanDao();
    private void btnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyActionPerformed
        // TODO add your handling code here:
        filltoTABLEhiendau();
        listbctduocXe.removeAll(listbctduocXe);
        filltoTABLEDonTach(listbctduocXe);
    }//GEN-LAST:event_btnhuyActionPerformed

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
            java.util.logging.Logger.getLogger(ChucNangTachDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChucNangTachDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChucNangTachDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChucNangTachDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChucNangTachDonJDialog dialog = new ChucNangTachDonJDialog(new javax.swing.JFrame(), true, idhd, idban);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTachDon;
    private javax.swing.JButton btnXedon;
    private javax.swing.JButton btnhuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDonHienTai;
    private javax.swing.JLabel lblDontach;
    private javax.swing.JMenuItem mnTachdon;
    private javax.swing.JTable tblHDchitiet;
    private javax.swing.JTable tblHDchitiet1;
    // End of variables declaration//GEN-END:variables
    
    HoadonchitietDAO DAOhdct = new HoadonchitietDAO();
    HoaDonDAO DAOHD = new HoaDonDAO();
    SanPhamDao DAPSP = new SanPhamDao();
    BanChiTietDAO DAObanct = new BanChiTietDAO();
    List<HoaDonChiTiet> listbctduocXe = new ArrayList<>();
    List<HoaDonChiTiet> listbctgoc;

    public void filltoTABLEhiendau() {
        DefaultTableModel model = (DefaultTableModel) tblHDchitiet.getModel();
        model.setRowCount(0);
        List<HoaDonChiTiet> listbct = DAOhdct.selectByIdHD(idhd);
        listbctgoc = DAOhdct.selectByIdHD(idhd);
        for (HoaDonChiTiet hdct : listbct) {
            model.addRow(new Object[]{hdct.getID_SanPHam(),
                DAPSP.selectID(hdct.getID_SanPHam()).getTen_sp(),
                hdct.getSoluong(),
                hdct.getGia(),
                hdct.getTongGia(),
                hdct.getGhiChu()
            });
        }
    }

    public void filltoTABLEsua() {
        DefaultTableModel model = (DefaultTableModel) tblHDchitiet.getModel();
        model.setRowCount(0);
        List<HoaDonChiTiet> listbct = listbctgoc;
        for (HoaDonChiTiet hdct : listbct) {
            model.addRow(new Object[]{hdct.getID_SanPHam(),
                DAPSP.selectID(hdct.getID_SanPHam()).getTen_sp(),
                hdct.getSoluong(),
                hdct.getGia(),
                hdct.getTongGia(),
                hdct.getGhiChu()
            });
        }
    }

    public void filltoTABLEDonTach(List<HoaDonChiTiet> list) {
        DefaultTableModel model = (DefaultTableModel) tblHDchitiet1.getModel();
        model.setRowCount(0);
        //List<Hoadonchitiet> listbct = DAOhdct.selectByIdHD(Integer.parseInt(lblDontach.getText()));
        List<HoaDonChiTiet> listbct = list;
        for (HoaDonChiTiet hdct : listbct) {
            model.addRow(new Object[]{hdct.getID_SanPHam(),
                DAPSP.selectID(hdct.getID_SanPHam()).getTen_sp(),
                hdct.getSoluong(),
                hdct.getGia(),
                hdct.getTongGia(),
                hdct.getGhiChu()
            });
        }
    }

    public boolean tt() {
        for (int i = 0; i < tblHDchitiet.getRowCount(); i++) {
            int sl = Integer.parseInt(tblHDchitiet.getValueAt(i, 2).toString());
            if (tblHDchitiet.getRowCount() == 1 && sl == 1) {
                btnTachDon.setEnabled(false);
                return true;
            } else {
                btnTachDon.setEnabled(true);
            }
        }
        return false;
    }
}
