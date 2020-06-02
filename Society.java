package Society;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
//Author S M Gazzali Arafat Nishan
//Date :24 - 05 -2020

public class Society {
	private String name;
	private ManagementCttee managementCttee;
	private ArrayList<Member> members;

	// constructor for society
	public Society(String name) {
		this.name = name;
		managementCttee = new ManagementCttee();
		members = new ArrayList<Member>();
	}

	// method to add the members to the society
	public void addMember(String name, String address) {
		boolean flag = false;
		for (Iterator<Member> i = members.iterator(); i.hasNext();) {
			Member tmp = (Member) i.next();
			if (tmp.getName().equals(name)) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			Member tmp = new StandardMember(name, address);
			members.add(tmp);
		}
	}

	// method to add senior memner to the society
	public void addSeniorMember(String name, String address, int fee) {
		boolean flag = false;
		for (Iterator<Member> i = members.iterator(); i.hasNext();) {
			Member tmp = (Member) i.next();
			if (tmp.getName().equals(name)) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			Member tmp = new SeniorMember(name, address, fee);
			members.add(tmp);
		}
	}

	// method to add cttee members to the society
	public void addCtteeMember(SeniorMember member) {
		boolean flag = false;
		for (Iterator<Member> i = members.iterator(); i.hasNext();) {
			Member tmp = (Member) i.next();
			if (tmp.getName().equals(member.getName())) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			members.add(member);
			managementCttee.addCtteeMember(member);
		} else {
			managementCttee.addCtteeMember(member);
		}
	}

	// get total fee
	public int getFeeTotal() {
		int total = 0;
		for (int i = 0; i < members.size(); i++) {
			total += members.get(i).getFee();
		}
		return total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ManagementCttee getManagementCttee() {
		return managementCttee;
	}

	public void setManagementCttee(ManagementCttee managementCttee) {
		this.managementCttee = managementCttee;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}
}