import java.util.ArrayList;

public class VoteProcessor {
int ed;
int fran;
	public static void main(String[] args) {
		VoteProcessor vote = new VoteProcessor();
		ArrayList<String> votes = new ArrayList<String>();
		vote.calculateElectionWinner(votes);
		vote.testATie(votes);
		
	}

String testATie(ArrayList<String> votes){
	int e = 0;
	int f = 0;
	for (String v : votes) {

		if (v.contains("EDWARD SNOWDEN")) {
			e++;
		} else if (v.contains("Edward Snowden")) {
			e++;
		} else if (v.contains("Edward snowden")) {
			e++;
		} else if (v.contains("edward Snowden")) {
			e++;
		}

		if (v.contains("pope Francis")) {
			f++;
		} else if (v.contains("POPE FRANCIS")) {
			f++;
		} else if (v.contains("Pope Francis")) {
			f++;
		} else if (v.contains("Pope francis")) {
			f++;
		} else if (v.contains("pope francis")) {
			f++;
		}
	}
	

	if (e == f) {
		return "TIE";
	} 
	return "";
	
}
		
	

	String calculateElectionWinner(ArrayList<String> votes) {
		 ed = 0;
		fran = 0;
		for (String v : votes) {

			if (v.contains("EDWARD SNOWDEN")) {
				ed++;
			} else if (v.contains("Edward Snowden")) {
				ed++;
			} else if (v.contains("Edward snowden")) {
				ed++;
			} else if (v.contains("edward Snowden")) {
				ed++;
			}

			if (v.contains("pope Francis")) {
				fran++;
			} else if (v.contains("POPE FRANCIS")) {
				fran++;
			} else if (v.contains("Pope Francis")) {
				fran++;
			} else if (v.contains("Pope francis")) {
				fran++;
			} else if (v.contains("pope francis")) {
				fran++;
			}
		}
		System.out.print(ed + ", " + fran);

		if (ed > fran) {
			return "edward Snowden";
		} else if (fran > ed) {
			return "pope francis";
		} 
		
		return "";
	}

	
	
	
}
