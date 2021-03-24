//개미수열
public class P14 {

	public static void main(String[] args) {
		String val = "1";
		String res = "";
		int pos = 0;
		System.out.println(val);
		
		for(int i = 0 ; i < 9 ; i++) {
			res = "";
			pos = 0;
			
			for(int j = 1 ; j < val.length() ; j++) {
				if(val.charAt(pos) != val.charAt(j)) {
					res = res + val.charAt(pos) + (j - pos);
					pos = j;
				}				
			}
			res = res + val.charAt(pos) + (val.length() - pos);
			val = res;
			System.out.println(res);
		}
	}
}
