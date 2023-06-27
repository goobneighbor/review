import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2745 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		
		char[] wrd = new char[N];
		
		for(int i=0; i<wrd.length; i++) {
			char[] wrd = N.charAt(i);
		}
		
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		while() {
			if(N.charAt(i)>=48 && N.charAt(i)<=57) {
				sb.append((N.charAt(i)-48) * Math.pow(B, B))
			}else if(N.charAt(i)>=65 && N.charAt(i)<=90) {
				
			}
		}
		
		int i=0;
		
		
		
		if((char)Integer.parseInt(wrd[i])>=48 && (char)Integer.parseInt(wrd[i])<=57) {
			sb.append(Integer.parseInt(wrd[i]) * Math.pow(B, wrd.length-1-i));
		}else if((char)Integer.parseInt(wrd[i])>=65 && (char)Integer.parseInt(wrd[i])<=90) {
			sb.append(wrd[i] * (byte)Math.pow(B, wrd.length-1-i));
		}
		
		int sum = 0;
		
		for(byte k : wrd) {
			sum+=k;
		}
		
		System.out.println(sum);
		
		
	}
}