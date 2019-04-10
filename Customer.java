
import java.sql.*;
public class Customer
{
	private DBSQL db;
	public Customer(String c1, String d1)
	{
		DBSQL=new DBSQL(c1,d1);
	}
	public CustomerInfo getCustomer(String custID) throws SQLException
	{
		Statement stmt=db.getStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM Customer where CustomerID='"+custID+"'");
		CustomerInfo info=new CustomerInfo();
		info.CustomerID=rs.getString(1);
		info.FirstName=rs.getString(2);
		info.MiddleName=rs.getString(3);
		info.LastName=rs.getString(4);
		info.Address=rs.getString(5);
		info.City=rs.getString(6);
		info.State=rs.getString(7);
		info.Zip=rs.getString(8);
		info.HomePhone=rs.getString(9);
		info.WorkPhone=rs.getString(10);
		info.Notes=rs.getString(11);
		return (info);
	}
	public CustomerInfo[] getCustomers(String sql) throws SQLException
	{
		Statement stmt=db.getStatement();
		ResultSet=stmt.excuteQuery(sql);
		CustomerInfo[] info=new CustomerInfo[10];
		int i=0;
		while (rs.next())
		{
			info[i].CustomerID=rs.getString(1);
			info[i].FirstName=rs.getString(2);
			info[i].MiddleName=rs.getString(3);
			info[i].LastName=rs.getString(4);
			info[i].Address=rs.getString(5);
			info[i].City=rs.getString(6);
			info[i].State=rs.getString(7);
			info[i].Zip=rs.getString(8);
			info[i].HomePhone=rs.getString(9);
			info[i].WorkPhone=rs.getString(10);
			info[i].Notes=rs.getString(11);
			i++;
		}
		return (info);

	}
	public String insertCustomer(CustomerInfo cinfo)
	{
		String v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11;
		v1=cinfo.CustomerID;
		v2=cinfo.FirstName;
		v3=cinfo.MiddleName;
		v4=cinfo.LastName;
		v5=cinfo.Address;
		v6=cinfo.City;
		v7=cinfo.State;
		v8=cinfo.Zip;
		v9=cinfo.HomePhone;
		v10=cinfo.WorkPhone;
		v11=cinfo.Notes;
		Statement stmt=db.getStatement();
		stmt.updateQuery("INSERT INTO Customer values('"+v1+"','"+v2+"','"+v4+"','"+v5+"','"+v6+"','"+v7
		+"','"+v8+"','"+v9+"','"+v10+"','"+v11+"'");
		return v1;
	}


}