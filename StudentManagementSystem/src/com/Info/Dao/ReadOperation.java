package com.Info.Dao;

import java.sql.*;

public class ReadOperation {
	public ResultSet getAllDetail(String tableName) throws SQLException{
		String query = "SELECT * FROM "+tableName;
		return Database.database().getConnection().prepareStatement(query).executeQuery();
	}
}
