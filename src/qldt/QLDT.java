/**@author honor */

package qldt;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QLDT {
	
	public static boolean menuSelectionSwitch = true, rsb;
	public static String command = "", append = "";
	public static Connection connection;
	public static PreparedStatement ps;
	public static Statement stmt;
	public static ResultSet rs;
	public static boolean isAdmin;
	
	//Fixed length string, for displaying result columns
	static String fs(String s, int i) {return String.format("%1$-"+ i + "s", s);}	
	static String fs(String s, int i, char c) {return fs(s, i).replace(' ', c);}	
	static String tab(int i) {return fs("\n", i + 1, '\t');}	
	static int space(int[] length) {
		int s = 1 + 1 - 3;
		for (int i : length) s += (i + 3);
		return s;
	}
	
	static String displayResultSet(final ResultSet resultSet, String[] titles) throws SQLException {
		String display = "";
		int columnNumber = resultSet.getMetaData().getColumnCount();
        int[] columnSize = new int[columnNumber];
		for (int i = 0; i < columnNumber; i++) columnSize[i] = titles[i+1].length();
		ArrayList<ArrayList<String>> resultString = new ArrayList<>(columnNumber);
		
		for (int i = 0; i < columnNumber; i++) resultString.add(new ArrayList<>());int rowCount = 0;
		while (resultSet.next()) {
			for (int i = 0; i < columnNumber; i++) {
				String temp = resultSet.getString(i+1);
				if (resultSet.wasNull())
					temp = "";
				resultString.get(i).add(temp);
				if(temp.length() > columnSize[i]) columnSize[i] = temp.length();
			}
			rowCount++;
		}
		
		int space = space(columnSize), tab = (90 - space)/4;
		if (!"".equals(titles[0]))
			display += tab(tab) + fs("", (space - titles[0].length())/2 + 1) + titles[0];
		display += tab(tab) + "+" + fs("", space, '-') + "+";
		display += tab(tab);
		for (int i = 1; i <= columnNumber; i ++)
			display += "| " + fs(titles[i], columnSize[i-1]) + " ";
		display += "|" + tab(tab) + "|" + fs("", space, '-') + "|";				
		for (int r = 0; r < rowCount; r++) {
			display += tab(tab);
			for (int i = 0; i < columnNumber; i++)
				display += "| " + fs(resultString.get(i).get(r), columnSize[i]) + " ";
			display += "|";
		}
		display += tab(tab) + "+" + fs("", space, '-') + "+\n";
		
		return display;
	}
		
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QLDT?characterEncoding=utf-8&allowLoadLocalInfile=true","root","akaichi");
		stmt = connection.createStatement();
		new LoginUI().setVisible(true);
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			try {
				connection.close();
			} catch (SQLException ex) {
				Logger.getLogger(QLDT.class.getName()).log(Level.SEVERE, null, ex);
			}
		}));		
	}

}
