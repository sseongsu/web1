
public class le7 {
	public static void main(String[] args) {
		String S = "aaAbbbb";
		String J = "aA";
		int count = 0;
		for(int i=0;i<J.length();i++) {
			for(int j=0;j<S.length();j++) {
				if(J.charAt(i) == S.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println("count: " + count);
	}	
}
