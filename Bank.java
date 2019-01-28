package model;

import java.util.ArrayList;

public class Bank 
{
	protected String name;
	private HeadOffice headOffice;
	private ArrayList<Branch> branches = new ArrayList<Branch>();
	
	
	protected Bank(String name)
	{
		this.name = name;
		
	}//
	
	void createHeadOffice()
	{
		this.headOffice = new HeadOffice();
	}
	
	public ArrayList<Branch> getBranches() {
		return branches;
	}
	public void setBranches(Branch branch) {
		this.branches.add(branch);
	}

	HeadOffice getHeadOffice() {
		return headOffice;
	}

	void setHeadOffice(HeadOffice headOffice) {
		this.headOffice = headOffice;
	}
	
}
