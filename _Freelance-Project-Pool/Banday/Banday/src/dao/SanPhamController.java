/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SanPhamController {
    
    public SanPhamController() {
    }
    
//    public List<SanPham> getAllSanPham() throws SQLException{
//        Connection mc = new Connection();
//        java.sql.Connection conn = mc.ConnectDB();
//        List<SanPham> lst = new ArrayList<SanPham>();
//        String query = "SELECT * FROM SanPham";
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery(query);
//        while(rs.next()){
//            SanPham sp = new SanPham();
//            sp.setMaSP(rs.getString(1));
//            sp.setTenSP(rs.getString(2));
//            lst.add(sp);
//        }
//        return lst;
//    }
}
