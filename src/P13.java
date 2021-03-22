//카멜표기법
public class P13 {

	public static void main(String[] args) {
		String[] n = {"JAVA", "save", "BUTTON"};
		String name = "";
		String a = "" ;
		
		for(int i = 0 ;i < n.length; i++) {
			n[i]=n[i].toLowerCase();
			if(i > 0) {
		//1)	n[i] = n[i].substring(0,1).toUpperCase()+n[i].substring(1); //첫글자만 대문자
		//2)	n[i] = n[i].replaceFirst(n[i].substring(0,1), n[i].substring(0,1).toUpperCase());
				n[i] = (char)(n[i].charAt(0)-32) + n[i].substring(1);
			}
			name+=n[i];
		}
		
		System.out.println(name); //결과: javaSaveButton

	}

}

