import java.util.HashMap;
import java.util.Map;

public class CountWord {

	public static void main(String[] args) {
		
		String para="This is the paraghraph and this is the sentence";
		String[] strPara=para.split(" ");
		
		Map<String,Integer> stringCount= new HashMap<>();
		
		for(String s:strPara) {
			
			if(stringCount.containsKey(s)) {
				stringCount.put(s, stringCount.get(s)+1);
			}
			else {
				stringCount.put(s, 1);
			}
		}
			System.out.println(stringCount);
	}

}
