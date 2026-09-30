package com.functionhall.dao;
import com.functionhall.model.User; import com.functionhall.util.DBConnection; import org.mindrot.jbcrypt.BCrypt; import java.sql.*;
public class UserDAO {
 public boolean register(User u)throws SQLException{
  String s="INSERT INTO users(name,email,phone,password,role) VALUES(?,?,?,?, 'CUSTOMER')";
  try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement(s)){
   p.setString(1,u.getName());p.setString(2,u.getEmail());p.setString(3,u.getPhone());p.setString(4,BCrypt.hashpw(u.getPassword(),BCrypt.gensalt()));return p.executeUpdate()==1;
  }
 }
 public User login(String e,String pass)throws SQLException{
  try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement("SELECT * FROM users WHERE email=?")){
   p.setString(1,e);try(ResultSet r=p.executeQuery()){if(r.next()&&BCrypt.checkpw(pass,r.getString("password"))){
    User u=new User();u.setUserId(r.getInt("user_id"));u.setName(r.getString("name"));u.setEmail(r.getString("email"));u.setRole(r.getString("role"));return u;}}
  }return null;
 }
}
