package _35_register.service;

import _35_register.model.MemberBean;
import _35_ShoppingCart.model.OrderBean;

public interface MemberService {
	boolean idExists(String id);
	int saveMember(MemberBean mb);
	void updateUnpaidOrderAmount(OrderBean ob);
	MemberBean queryMember(String id);
	public MemberBean checkIDPassword(String userId, String password) ;
}
