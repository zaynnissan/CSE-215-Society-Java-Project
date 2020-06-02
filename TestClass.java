package Society;

//Author S M Gazzali Arafat Nishan
//Date :24 - 05 -2020

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class TestClass {
    public static void main(String[] args) {
        
        Society society = new Society("Bangladesh Society");
        
        society.addMember("Orin", "Rangpur");
        society.addMember("Shehab", "Feni");
        society.addMember("Sifat", "Dhaka");
        society.addSeniorMember("Gazzali", "Sylhet", 3005643);
        society.addSeniorMember("Arafat", "Chittagong", 404243);
        society.addSeniorMember("Zayn", "Dhaka", 523243);
        SeniorMember societyMember1 = new SeniorMember("Zayn", "Dhaka", 523243);
        SeniorMember societyMember2 = new SeniorMember("Nishan", "Barisal", 2504450);
        society.addCtteeMember(societyMember1);
        society.addCtteeMember(societyMember1);
        society.addCtteeMember(societyMember2);

        Vector<Member> ManagementCommittee = society.getManagementCttee().getMembers();
       
        System.out.println("ManagementCttee Members:");
        for (Iterator<Member> i = ManagementCommittee.iterator(); i.hasNext();) {
            Member tempMember = (Member) i.next();
            System.out.println(tempMember.getName() + "_" + tempMember.getAddress() +
                    "_" + String.valueOf( tempMember.getFee() ));
        }

       
        ArrayList<Member> societyMembers = society.getMembers();
        System.out.println("*************************");

        
        System.out.println("All Society Members:");
        for (Iterator<Member> i = societyMembers.iterator(); i.hasNext();) {
            Member tmp = (Member) i.next();
            System.out.println(tmp.getName() + "_" + tmp.getAddress() +
                    "_" + String.valueOf( tmp.getFee() ));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        
        System.out.println("Total Fee : "+society.getFeeTotal());
    }
}
