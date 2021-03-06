package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.test.bean.USerBean;

public class UserDAO {
public static Connection getConnection() {        
	Connection con = null;

	String url = "jdbc:mysql:// localhost:3306/test";
    String user = "root";
    String pass = "root123";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println(e);
        }         return con;     
        }

    public static int save(USerBean u) {
        int status = 0;
        try {
Connection con = getConnection();
PreparedStatement ps = con.prepareStatement("insert into student(id,name,password,email,gender) values(?,?,?,?,?)");

	ps.setInt(1, u.getId());
	ps.setString(2, u.getName());
	ps.setString(3, u.getPassword());
	ps.setString(4, u.getEmail());
	ps.setString(5, u.getGender());
	
	status = ps.executeUpdate();
        } 
        catch (Exception e) {
        	System.out.println(e);
        }
        return status;
    }

public static int update(USerBean u) {
int status = 0;
try {
Connection con = getConnection();
PreparedStatement ps = con.prepareStatement("update student set id=?, name=?,password=?,email=?,gender=? where id=?");
ps.setInt(1, u.getId());
ps.setString(2, u.getName());
ps.setString(3, u.getPassword());
ps.setString(4, u.getEmail());
ps.setString(5, u.getGender());
status = ps.executeUpdate();
} catch (Exception e) {
System.out.println(e);
}
return status;
}

public static int delete(USerBean u) {
    int status = 0;
    try {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("delete from student where id=?");
        ps.setInt(1, u.getId());
        status = ps.executeUpdate();
    } catch (Exception e) {
        System.out.println(e);
    }
    return status;
}
public static List<USerBean> getAllRecords() {
    List<USerBean> list = new ArrayList<USerBean>();
    try {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("select * from student");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            USerBean u = new USerBean();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setPassword(rs.getString("password"));
            u.setEmail(rs.getString("email"));
            u.setGender(rs.getString("gender"));
           
            list.add(u);
        }
    } catch (Exception e) {
        System.out.println(e);   
        }
    return list;
}


public static USerBean getRecordById(int id) {
    USerBean u = null;
    try {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("select * from student where id=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            u = new USerBean();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setPassword(rs.getString("password"));
            u.setEmail(rs.getString("email"));
            u.setGender(rs.getString("gender"));
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return u;
}
public static List<USerBean> getRecords(int start, int total) {
    List<USerBean> list = new ArrayList<USerBean>();
    try {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(
                "select * from student limit " + (start - 1) + "," + total);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            USerBean e = new USerBean();
            e.setId(rs.getInt(1));
            e.setName(rs.getString(2));
            list.add(e);
        }
        con.close();
    } catch (Exception e) {
        System.out.println(e);
    }
    return list;
}
}





