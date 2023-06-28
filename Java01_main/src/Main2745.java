import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2745 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		
		int result=0;
		int sum=0;
		
		for(int i=0; i<N.length(); i++) {
			char c = N.charAt(i);
			
			if('0'<=c && c<='9') {
				result=c-48;
			}else if('A'<=c && c<='Z'){
				result=c-55;
			}
			
			sum+= result * Math.pow(B, N.length()-1-i);
		}
		System.out.println(sum);
	}
}