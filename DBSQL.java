

import java.sql.*;
import java.io.*;

public class DBSQL
{
	private Connection conn; //connection variable
	private Statement stmt;  // statement variable
	private PreparedStatement pstmt;
	private String connStr="jdbc:odbc:project.mdb";
	private String driver="sun.jdbc.odbc.JdbcOdbcDriver";
	//constructor with connection parameter
	public DBSQL(Connection c)
	{
		try{
		conn=c;
		//stmt=conn.createStatement();
		}catch (SQLException sqle){}
	}


	//default parameter
	public DBSQL(String conn, String dr)
	{
		Class.forName(st.getDriver()).newInstance();
		Connection conn=DriverManager.getConnection(st.getConnectionString());
	}

	public PreparedStatement getPreStatement()
	{
		return pstmt;
	}

	public void setPreStatement()
	{
		try {
			pstmt=conn.prepareStatement();
		}catch (SQLException e){System.err.println("Cannot create prestatements");}
	}

	public Statement getStatement()
	{
		retun stmt;
	}
	public void setStatement()
	{
		try {
					stmt=conn.createStatement();
		}catch (SQLException e){System.err.println("Cannot create statement");}
	}

	public void setDriver(String dStr)
	{
		driver=dStr;
	}
	public void setConnectionString(String cStr)
	{
			connStr=cStr
	}
}

