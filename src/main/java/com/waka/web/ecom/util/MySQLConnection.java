//package com.waka.web.ecom.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class MySQLConnection {
//    private static final String URL = "jdbc:mysql://localhost:3306/";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD="Kusal_Adi/196572";
//    private static final String DATABASE = "ecom_db";
//
//    private static Connection c;
//
//    private static Statement createConnection() throws Exception {
//        if (c == null) {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            c = (Connection) DriverManager.getConnection(URL + DATABASE, USERNAME, PASSWORD);
//        }
//
//        return c.createStatement();
//
//    }
//
//    public static void iud(String query) {
//        try {
//            createConnection().executeUpdate(query);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static ResultSet search(String query) throws Exception {
//        return createConnection().executeQuery(query);
//    }
//
//}
