package br.com.carreira.algorithm.thirtydays;

public class LetterIslandBoyerMoore {

	public static void main(String[] args) {
		String s = "abaab";
        int k = 2;
        letsPlay(s,k);
	}
	
	public static int letsPlay(String t, int k) {
		
		int indiceT=0;
		//int indiceP=0;
		int grow = 2;
		
		while (indiceT < t.length()) {
			String pattern = t.substring(indiceT, grow);
			boyerMoore(t,pattern);
			break;
		}
		
		return 0;
	}
	
	public static String boyerMoore(String t, String pattern) {
		
		while (true) {
			int indiceT = pattern.length() - 1;
			;
			boolean flag = false;
			for ( int m=pattern.length() -1 ; m >= 0 ; m--) {
				System.out.println(m);
				
				if (t.charAt(indiceT) == pattern.charAt(m)) {
					flag = true;
					System.out.println("bateu " + t.charAt(indiceT) + "==" + pattern.charAt(m) );
					
				} else { 
					flag = false;
					
				}
				--indiceT;
			}
			break;
			/*if (flag == false) {
				--m;
				--
				if (t.charAt(indiceT) == pattern.charAt(m)) {
					flag = true;
				} else { 
					flag = false;
					break;
				}
			}*/
		}
		
		return null;
	}

}
