package location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import visitor.VisitorDTO;

public class RegistDAO {
	
	public int getRID()
	{   String n="";
		for(int i=0; i<=9;i++)
		{
			n=n+new Random().nextInt(9);
		}
		return Integer.parseInt(n.substring(3, 8));
	}
	public int saveDetail(VisitorDTO visitorDTO)
	{
		try {
			Connection con = JDBCConn.getConnn();
 PreparedStatement ps = con.prepareStatement("insert into regg values (?,?,?,?,?,?,?)");
		 ps.setInt(1, getRID());
		  ps.setString(2, visitorDTO.getStCode());
		  ps.setString(3, visitorDTO.getDistCode());
		  ps.setString(4, visitorDTO.getvName());
		  ps.setString(5, visitorDTO.getvPhone());
		  ps.setString(6, visitorDTO.getvEmail());
		  ps.setString(7, visitorDTO.getvAdd());
		 return  ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
		
	}
	
	
	
	
	
	public static List<State>  getStateList()
	{
		 List<State> l=new ArrayList<State>();
		try {
			Connection con = JDBCConn.getConnn();
			PreparedStatement ps = con.prepareStatement("select * from mst_state");
		 ResultSet q = ps.executeQuery();
		 System.out.println("query "+ps.toString());
		  while(q.next())
		  {
			  State ss = new State();
			  int stCode = q.getInt(1);
			    ss.setStCode(stCode);
			   String stName = q.getString(2);
			    ss.setStName(stName);
			    ss.setShortName(q.getString(3));
			    l.add(ss);
		  }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	
	
	public static  List<DistBean>  getDistList(String stCode)
	{
		 List<DistBean> l=new ArrayList<DistBean>();
		try {
			Connection con = JDBCConn.getConnn();
			PreparedStatement ps = con.prepareStatement("select * from mst_district where state_code=?");
		ps.setString(1, stCode);
			ResultSet q = ps.executeQuery();
		 System.out.println("query "+ps.toString());
		  while(q.next())
		  {
			  DistBean d = new DistBean();
			  d.setDistCode(q.getString(1));
			  d.setDistName(q.getString(2));
			  d.setStCode(q.getString(3));
			    l.add(d);
		  }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	
	
	
}
