import java.util.*;

public class MatchFinder {

	private List <Candidate> candidate_list;
	private Candidate[] list;
	private Candidate[] helper;
	
	public static void main(String[] args) {
					
		MatchFinder mt1 = new MatchFinder();
		mt1.rankCandidate(mt1.candidate_list);
		mt1.showOutput(mt1.candidate_list);

	}
	
	
	 MatchFinder()
	{
		
		Candidate c1 = new Candidate("Abhishek1",20,20,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.onsite);
		Candidate c2 = new Candidate("Abhishek2",20,25,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.onsite);
		Candidate c3 = new Candidate("Abhishek3",20,35,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.onsite);
		Candidate c4 = new Candidate("Abhishek4",20,20,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.remote);
		Candidate c5 = new Candidate("Abhishek5",20,30,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.remote);
		Candidate c6 = new Candidate("Abhishek6",20,40,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.remote);
		Candidate c7 = new Candidate("Abhishek7",20,40,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.onsite);
		Candidate c8 = new Candidate("Abhishek8",20,40,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.remote);
		Candidate c9 = new Candidate("Abhishek9",20,40,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.onsite);
		Candidate c10= new Candidate("Abhishek10",20,40,new ArrayList<Skills>(Arrays.asList(Skills.java,Skills.oracle)),Domains.finance,Locations.remote);
		
		this.candidate_list = new ArrayList<Candidate>();
		this.candidate_list.add(c1);
		this.candidate_list.add(c2);
		this.candidate_list.add(c3);
		this.candidate_list.add(c4);
		this.candidate_list.add(c5);
		this.candidate_list.add(c6);
		this.candidate_list.add(c7);
		this.candidate_list.add(c8);
		this.candidate_list.add(c9);
		this.candidate_list.add(c10);
		
	}
	 	
	 public void showOutput(List<Candidate> list)
		{
			for(int i=0;i<list.size();i++)
			{
				System.out.print("Name:"+this.list[i].name+" ");
				System.out.print("Hours Available:"+this.list[i].hours_available+" ");
				System.out.print("Salary Asked:"+this.list[i].salary_required+" ");
				System.out.print("Skills:"+this.list[i].skill+" ");
				System.out.print("Domain:"+this.list[i].domain+" ");
				System.out.println("Location:"+this.list[i].location+" ");
			}
		}
	public void rankCandidate(List<Candidate> CandidateList) {
		    
			list = CandidateList.toArray(new Candidate[CandidateList.size()]);
		    helper = new Candidate[list.length];
		    mergeSort(0, list.length - 1);
		    CandidateList = Arrays.asList(list);
		}

	private void mergeSort(int low, int high) {
		    if(low < high) {
		        int middle = low + (high - low) / 2;
		        mergeSort(low, middle); 
		        mergeSort(middle + 1, high); 
		        merge(low, middle, high); 
		    }
		}

	private void merge(int low, int middle, int high) {
		    
		    for(int i=low; i<= high; i++) {
		        helper[i] = list[i];
		    }

		    int helperLeft = low;
		    int helperRight = middle + 1;
		    int current = low;
		    
		    while(helperLeft <= middle && helperRight <= high) {
		        if(helper[helperLeft].isLessThan(helper[helperRight])) {
		            list[current] = helper[helperLeft];
		            helperLeft++;
		        } else {
		            list[current] = helper[helperRight];
		            helperRight++;
		        }
		        current++;
		    }

		    while (helperLeft <= middle) {
		        list[current] = helper[helperLeft];
		        current++;
		        helperLeft++;
		    }

		}

}
