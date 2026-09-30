package com.functionhall.dao;
import com.functionhall.model.FunctionHall; import com.functionhall.util.DBConnection; import java.sql.*; import java.util.*;
public class HallDAO {
 private FunctionHall map(ResultSet r)throws SQLException{FunctionHall h=new FunctionHall();h.setHallId(r.getInt("hall_id"));h.setHallName(r.getString("hall_name"));h.setLocation(r.getString("location"));h.setDescription(r.getString("description"));h.setCapacity(r.getInt("capacity"));h.setPricePerDay(r.getDouble("price_per_day"));h.setFacilities(r.getString("facilities"));h.setImage(r.getString("image"));return h;}
 public List<FunctionHall> findAll()throws SQLException{List<FunctionHall> x=new ArrayList<>();try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement("SELECT * FROM function_halls ORDER BY hall_id DESC");ResultSet r=p.executeQuery()){while(r.next())x.add(map(r));}return x;}
 public FunctionHall findById(int id)throws SQLException{try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement("SELECT * FROM function_halls WHERE hall_id=?")){p.setInt(1,id);try(ResultSet r=p.executeQuery()){return r.next()?map(r):null;}}}
}
