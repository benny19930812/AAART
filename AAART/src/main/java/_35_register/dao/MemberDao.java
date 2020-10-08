package _35_register.dao;

import java.sql.Connection;

import _35_register.model.MemberBean;
import _35_ShoppingCart.model.OrderBean;

public interface MemberDao {
	
	public boolean idExists(String id);

	public int saveMember(MemberBean mb) ;
	
	public MemberBean queryMember(String id);
	
	public MemberBean checkIDPassword(String userId, String password);	
	
	void updateUnpaidOrderAmount(OrderBean ob);

	public void setConnection(Connection con);
}