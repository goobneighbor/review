import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int q = 25;
		int d = 10;
		int n = 5;
		int p =1;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			int c = Integer.parseInt(br.readLine());
			
			int qCnt = c/q;
			sb.append(qCnt).append(" ");
			
			c %= q; 
			
			int dCnt = c/d;
			sb.append(dCnt).append(" ");
			
			c %= d;
			
			int nCnt = c/n;
			sb.append(nCnt).append(" ");
			
			c %= n;
			
			int pCnt = c/p;
			sb.append(pCnt).append("\n");
			
		}
		System.out.println(sb);
	}
}