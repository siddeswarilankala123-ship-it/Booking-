package com.functionhall.dao;
import com.functionhall.model.Payment; import com.functionhall.util.DBConnection; import java.sql.*;
public class PaymentDAO {
 public boolean save(Payment p)throws SQLException{String s="INSERT INTO payments(booking_id,amount,payment_method,transaction_id,payment_status) VALUES(?,?,?,?,?)";try(Connection c=DBConnection.getConnection();PreparedStatement q=c.prepareStatement(s)){q.setInt(1,p.getBookingId());q.setDouble(2,p.getAmount());q.setString(3,p.getPaymentMethod());q.setString(4,p.getTransactionId());q.setString(5,p.getPaymentStatus());return q.executeUpdate()==1;}}
}
