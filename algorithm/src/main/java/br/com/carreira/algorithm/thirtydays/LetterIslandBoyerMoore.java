package br.com.carreira.algorithm.thirtydays;

public class LetterIslandBoyerMoore {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abcdef");
        int k = 2;
        letsPlay(s,k);
	}
	
	public static int letsPlay(StringBuilder t, int k) {
		
		int indiceT=0;
		//int indiceP=0;
		int grow = 2;
		
		while (indiceT < t.length()) {
			//String pattern = t.substring(indiceT, grow);
			String pattern = "xtq";
			boyerMoore(t,pattern);
			break;
		}
		
		return 0;
	}
	
	public static String boyerMoore(StringBuilder t, String pattern) {
		int indiceT = pattern.length() - 1;
		int startT = pattern.length();
		int count = 0;
		int countPatternWalking = 1;
		while (true) {
			boolean flag = false;
			int walkPattern = 0;
			int walkT= 0;
			for ( int m=pattern.length() -1 ; m >= 0 ; m--) {
				System.out.println(m);
				walkPattern = m;
				System.out.println(m + " " +   t.charAt(indiceT)+ " ==  " + pattern.charAt(m));
				if (t.charAt(indiceT) == pattern.charAt(m)) {
					flag = true;
					System.out.println("bateu " + t.charAt(indiceT) + "==" + pattern.charAt(m) );
					
				} else {
					flag = false;
					
					int ind = findNextMove(t, pattern, indiceT, walkPattern-1, walkT, m);
					indiceT+= ind;
					break;
					
					
				}
				
				walkT++;
				--indiceT;
			}
			countPatternWalking++;
			if (flag == true) {
				t.replace(startT - pattern.length(), startT,
						String.format("%0" + (pattern.length()) + "d", 0));
				indiceT = (walkT * countPatternWalking) -1;
			}
			
			if (indiceT > t.length()) {
				break;
			}
			
		}
		
		return null;
	}

	private static int findNextMove(StringBuilder t, String pattern, int indiceT,
			int walkPattern, int walkT, int m) {
		boolean f = false;
		if (walkPattern == -1) {
			//throw new Exception("No one letter match");
			return indiceT + 1;
		}
		int qtdeCasasVoltou = 0;
		for(int x=walkPattern; x >= 0; x--) {
			if (t.charAt(indiceT - walkT) == pattern.charAt(x)) {
				System.out.println(x + " " +   t.charAt(indiceT)+ " ==  " + pattern.charAt(x));
				f = true;
				qtdeCasasVoltou++;
				return walkPattern;
			}
			System.out.println(x + " " +   t.charAt(indiceT)+ " ==  " + pattern.charAt(x));
		}
		if (f == false) {
			++walkT;
			return findNextMove(t, pattern, indiceT, walkPattern-1, walkT, m);
		}
		return -1;
	}

}
