package _35_register.service.impl;

import _35_register.dao.MemberDao;
import _35_register.dao.impl.MemberDaoImpl_Jdbc;
import _35_register.model.MemberBean;
import _35_register.service.MemberService;
import _35_ShoppingCart.model.OrderBean;

public class MemberServiceImpl implements MemberService {

	MemberDao  dao ;
	public MemberServiceImpl() {
		this.dao = new MemberDaoImpl_Jdbc();
	}

	@Override
	public int saveMember(MemberBean mb) {
		return dao.saveMember(mb);
	}

	@Override
	public boolean idExists(String id) {
		return dao.idExists(id);
	}

	@Override
	public MemberBean queryMember(String id) {
		return dao.queryMember(id);
	}

	@Override
	public void updateUnpaidOrderAmount(OrderBean ob) {
		dao.updateUnpaidOrderAmount(ob);
	}
	public MemberBean checkIDPassword(String userId, String password) {
		MemberBean mb = dao.checkIDPassword(userId, password);
		return mb;
	}
}
