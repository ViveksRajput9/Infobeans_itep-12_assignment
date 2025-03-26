package com.Info.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperation {
	public UpdateOperation() {
		
	}
	public boolean updateData(String query,int id,String data){
		    try {
				PreparedStatement pst = Database.getConnection().prepareStatement(query);
				pst.setString(1, data);
				pst.setInt(2, id);
				return true;
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				return false;
			}
	}
	public boolean updateData(String query,int id,int data){
	    try {
			PreparedStatement pst = Database.getConnection().prepareStatement(query);
			pst.setInt(1, data);
			pst.setInt(2, id);
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return false;
		}
    }
	public boolean updateData(String query,int id,double data){
	    try {
			PreparedStatement pst = Database.getConnection().prepareStatement(query);
			pst.setDouble(1, data);
			pst.setInt(2, id);
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return false;
		}
    }
	public boolean updateFirstNameById(int id ,String firstName) {
		    String query = "UPDATE "+Database.getTableName()+" SET FirstName =  ? WHERE ID = ?";
            return updateData(query, id, firstName);
	}
	
	public boolean updateLastNameById(int id , String lastName) {
	     	String query = "UPDATE "+Database.getTableName()+" SET LastName = ? WHERE ID = ?";
	     	return updateData(query, id, lastName);
	     	
	}
	
	public boolean updateAgeById(int id , int Age) {
		String query = "UPDATE "+Database.getTableName()+" SET Age = ? WHERE ID = ?";
     	return updateData(query, id, Age);

	}

	public boolean updateMobileNumberById(int id,String MobileNumber) {
		String query = "UPDATE "+Database.getTableName()+" SET MobileNumber = ? WHERE ID = ?";
	     	return updateData(query, id, MobileNumber);

	}
	public boolean updateAttendenceById(int id , String attendance) {
		 String query = "UPDATE "+Database.getTableName()+" SET Attendence = ? WHERE ID = ?";
		   
	     return updateData(query, id, attendance);

	}
	public boolean UpdateMarksById(int id,double marks) {
		 String query = "UPDATE "+Database.getTableName()+" SET Marks = ? WHERE ID = ?";
	     return updateData(query, id, marks);

	}
	public boolean UpdateLeaveById(int id,String leave) {
		String query = "UPDATE "+ Database.getTableName()+"SET Leave = ? WHERE ID = ?";
	     return updateData(query, id, leave);
		  
	}
	public boolean UpdateAssignmentStatusById(int id , String status) {
		    String query = "UPDATE "+Database.getTableName()+" SET Assignment = ? WHERE ID = ?";
		     return updateData(query, id, status);
	}
	public boolean UpdatePlacementStatusById(int id , String status) {
		  String query = "UPDATE "+Database.getTableName()+" SET PlacementStatus = ? WHERE ID = ?";
		  return updateData(query, id, status);
	}
}