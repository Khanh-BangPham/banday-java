/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class Connection {
    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Banday;encrypt=true;trustServerCertificate=true";
    String user = "sa";
    String pass = "1234$";

    public Connection() {
    }
    
    public java.sql.Connection ConnectDB() throws SQLException{
        return DriverManager.getConnection(dbURL, user, pass);
    }
}
