import java.util.*;

public class VoteProcessor {
	
	public String calculateElectionWinner(ArrayList<String> votes) {
		int saveJ = 0;
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		for(int i = 0; i<votes.size(); i++) {
			for(int j = 0; j<names.size();j++) {
				if(names.get(j).equalsIgnoreCase(votes.get(i))) {
					saveJ = j;
				}
				else {
					names.add(votes.get(i).toLowerCase());
					count.add(1);
					break;
				}
				count.add(saveJ, 1);
			}
		}
		int max = 0;
		int maxK = 0;
		for(int k = 0; k<count.size(); k++) {
			if(count.get(k)>max) {
				max = count.get(k);
				maxK = k;
			}
		}
		System.out.println(names.get(maxK));
		return names.get(maxK);
	}
}
