package _35_listActs.service;

import java.util.List;

import _35_listActs.model.CompanyBean;

public interface CompanyService {

	List<CompanyBean> getCompany() ;

	CompanyBean getCompanyById() ;

	int getId();
	
	int getSelected();
	
	String getSelectTag();

	String getTagName();
	
	void setId(int id);

	void setSelected(int selected);

	void setTagName(String tagName);
	
}