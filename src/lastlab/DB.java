/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastlab;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eng. Arwa Ahmed
 */
public class DB {
    private final String url = "jdbc:postgresql://localhost/Javadb";
    private final String user = "postgres";
    private final String password = "arwa1234";
    
    Connection connection = null;  
     ResultSet rs = null;  
     Statement statement = null; 
    Vector<ContactPerson> columnNames = new Vector<ContactPerson>();
    ContactPerson contact;
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public ResultSet connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String queryString=new String("select * from contact");
            rs=stmt.executeQuery(queryString);
          /*  while(rs.next()){
                System.out.println(rs.getString(1));
            }*/
           /* rs.first();
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));*/
            
         //   stmt.close();
          //  conn.close();
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return rs;
    }
    
   /* public  Vector<ContactPerson> getcontacts() {
        try {
            //return vector of records
            while(rs.next()) // loop on the result set
            {
                ContactPerson P=new ContactPerson(rs);
                 columnNames.add(P);
                
               /* columnNames.add(Integer.toString(rs.getInt("id")));
                columnNames.add(rs.getString("name"));
                columnNames.add(rs.getString("nick_name"));
                columnNames.add(rs.getString("address"));
                columnNames.add(Integer.toString(rs.getInt("home_phone")));
                columnNames.add(Integer.toString(rs.getInt("work_phone")));
                columnNames.add(Integer.toString(rs.getInt("cell_phone")));
                columnNames.add(rs.getString("email"));
                columnNames.add(rs.getString("birthday"));
                columnNames.add(rs.getString("web_site"));
                columnNames.add(rs.getString("profession"));*/
            
                
    
    // save each record in the vector 
    //return vector
        
        
  //body//  vector.add ()    }
   /***************each button leh on action h3ml function hena*************************/
    /****Button NEW*****/
}
