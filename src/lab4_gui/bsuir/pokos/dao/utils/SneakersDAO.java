/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_gui.bsuir.pokos.dao.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lab4_gui.bsuir.pokos.dao.entity.Sneakers;
import lab4_gui.bsuir.pokos.utils.Connector;

/**
 *
 * @author Vladislav
 */
public class SneakersDAO {
    
    private final String SQL_ADD_SNEAKERS="INSERT INTO sneakers.goods (id,manufacturer,country,model,size,colors) VALUES (?,?,?,?,?,?);";
    private final String SQL_GET_ALL_SNEAKERS="SELECT * FROM sneakers.goods";
    private final String SQL_DELETE_SNEAKERS="DELETE FROM sneakers.goods WHERE id=?;";
    private final String SQL_GET_ID="SELECT * FROM sneakers.goods WHERE manufacturer=? AND country=? AND model=? AND size=? AND colors=?;";
    
    public int getID(Sneakers data) {
        int id;
        try {
            Connection cn = Connector.getConnection();
            PreparedStatement st = cn.prepareStatement(SQL_GET_ID);
            
            st.setString(1, data.getManufacture());
            st.setString(2, data.getCountry());
            st.setString(3, data.getModel());
            st.setInt(4, data.getSize());
            st.setString(5, data.getColors());
            
            ResultSet rs = st.executeQuery();
            rs.next();
            id=rs.getInt(1);
            return id;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         return -1;
    }
    
    public boolean add(Sneakers data) {
        
         try {
            Connection cn = Connector.getConnection();
            PreparedStatement st = cn.prepareStatement(SQL_ADD_SNEAKERS);
            
            st.setInt(1,data.getID());
            st.setString(2, data.getManufacture());
            st.setString(3, data.getCountry());
            st.setString(4, data.getModel());
            st.setInt(5, data.getSize());
            st.setString(6, data.getColors());
            st.executeUpdate();
            
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         return false;
    }
    
    public ArrayList getALL() {
         
        ArrayList<Sneakers> result = new ArrayList<>();
        
        try {
            Connection cn = Connector.getConnection();
            PreparedStatement st = cn.prepareStatement(SQL_GET_ALL_SNEAKERS);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                result.add(new Sneakers(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6)
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }

    public boolean delete(int sneakersID) {
        
         try {
            
            Connection cn = Connector.getConnection();
            PreparedStatement st = cn.prepareStatement(SQL_DELETE_SNEAKERS);
            st.setInt(1,sneakersID);
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        
        return true;
        
    }
}
