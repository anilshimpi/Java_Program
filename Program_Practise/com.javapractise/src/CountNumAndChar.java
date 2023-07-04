
public class CountNumAndChar {

	public static void main(String[] args) {
		
		String str="abc1238";
		
		char[] ch=str.toCharArray();
		
	
		int numCount=0, charCount=0, other=0;
		
//		for(int i=0;i<str.length();i++) {
//			
//			if(Character.isLetter(ch[i])) {
//				
//				charCount++;
//			}
//			else if(Character.isDigit(ch[i])) {
//				
//				numCount++;
//			}
//		}
		
		//using differnt senoirio
		
		for(int i=0;i<str.length();i++) {
			
			char ch1=str.charAt(i);
			
			if(ch1>='A' && ch1<='Z' || ch1>='a' && ch1<='z') {
				
				charCount++;
			}
			
			else if(ch1>='0' && ch1<='9') {
				
				numCount++;
			}
			else {
				other++;
			}
			
		}
		
		
		System.out.println("num Count: "+numCount+"charCount: "+charCount+"Other: "+other);
	}

}
