package com.yym.aha.algorithms.sql;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Properties;

/**
 * Created by yaoyimin on 2017/10/11
 */
public class TestSql {

	public static void main(String[] args)throws SQLException,ClassNotFoundException{
		Connection connection = getConnection();

//		Statement statement = connection.createStatement();
//
//		ResultSet result = statement.executeQuery("SELECT * FROM asn_result");

		String sql = "select * from asn_result";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet result = preparedStatement.executeQuery();

		System.out.println("success");

		while (result.next()){
			int id = result.getInt("id");
			String warehouseNo = result.getString("warehouse_no");
			String qcNo = result.getString("qc_no");
			String asnNo = result.getString("asn_no");
			String poNo = result.getString("po_no");
			System.out.println(id+" "+warehouseNo+" "+qcNo+" "+asnNo+" "+poNo);
		}

		connection.close();



	}

	private static Connection getConnection() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/qc?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&useSSL=true&serverTimezone=GMT%2B8";
		String userName = "root";
		String pass = "123456";
		Properties properties = new Properties();
		properties.setProperty("user",userName);
		properties.setProperty("password",pass);
		Connection conn = new Driver().connect(url,properties);
//		Connection conn = DriverManager.getConnection(url,userName,pass);
		conn.setAutoCommit(true);
		return conn;
	}
}
