import java.util.*;

enum Skills {
	java,oracle,cpp,python
}
enum Domains {
	finance,developer,tester,management
}
enum Locations{
	remote,onsite
}

public class Candidate {
	String name;
	int hours_available;
	int salary_required;
	List<Skills> skill = new ArrayList<Skills>() ;
	Domains domain;
	Locations location;
	
	Candidate(String name,int hours_available,int salary_required,ArrayList<Skills> skill,Domains domain, Locations location)
	{
		this.name = name;
		this.hours_available = hours_available;
		this.salary_required = salary_required; 
		this.skill = skill; 
		this.domain = domain; 
		this.location = location; 
	}
	
	public boolean isLessThan(Candidate obj) {
        boolean is_less = false;
         if(this.location==obj.location) {
        	 if(this.salary_required<obj.salary_required)
        	 {
        		 is_less = true;
        	 }
        	 else
        	 {
        		 is_less = false;
        	 }
             
         }
         else if(this.location == Locations.remote)
         {
        	 is_less = true;
         }
         else
         {
        	 is_less = false;
         }
         return is_less;
    }
	
		
	
}
