package visitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import location.JDBCConn;

public class VisitorDAO {

	public List<VisitorDTO> view()
	{
		List<VisitorDTO> l=new ArrayList<VisitorDTO>();
		try {
			Connection con = JDBCConn.getConnn();
			PreparedStatement ps = con.prepareStatement("select * from regg");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			VisitorDTO vdto = new VisitorDTO();
			vdto.setRid(rs.getInt(1));
			vdto.setDistCode(rs.getString("dist_code"));
			vdto.setStCode(rs.getString("st_code"));
			vdto.setvAdd(rs.getString("add"));
			vdto.setvName(rs.getString("name"));
			vdto.setvEmail(rs.getString("email"));
			vdto.setvPhone(rs.getString("phone"));
			l.add(vdto);
			
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	
	
	public List<VisitorDTO> view(int rid)
	{
		List<VisitorDTO> l=new ArrayList<VisitorDTO>();
		try {
			Connection con = JDBCConn.getConnn();
			PreparedStatement ps = con.prepareStatement("select * from regg");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			VisitorDTO vdto = new VisitorDTO();
			vdto.setRid(rs.getInt(1));
			vdto.setDistCode(rs.getString("dist_code"));
			vdto.setStCode(rs.getString("st_code"));
			vdto.setvAdd(rs.getString("add"));
			vdto.setvName(rs.getString("name"));
			vdto.setvEmail(rs.getString("email"));
			vdto.setvPhone(rs.getString("phone"));
			l.add(vdto);
			
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	
}
