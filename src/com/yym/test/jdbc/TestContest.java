package com.yym.test.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yaoyimin on 2017/7/9.
 */
public class TestContest {

	public static void main(String[] args){
		String url = "jdbc:mysql://127.0.0.1:3306/wms2_db?" +
				"useSSL=true&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
		String username = "root";
		String password = "123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection conn = null;
		Map<String, Object> map = new HashMap<>();
		try {
			conn = DriverManager.getConnection(url,username,password);
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM sys_dict_item");
			while (resultSet.next()){
				Long id = resultSet.getLong("id");
				String dictNo = resultSet.getString("dict_no");
				String dictItemNo = resultSet.getString("dict_item_no");
				String dictItemName =  resultSet.getString("dict_item_name");
				map.put("id",id);
				map.put("dictNo",dictNo);
				map.put("dictItemNo",dictItemNo);
				map.put("dictItemName",dictItemName);
			}
			conn.commit();
			System.out.println("-----");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
