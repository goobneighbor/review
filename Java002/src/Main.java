import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max=1;
		int cnt=0;
		
		for(int i=0; i<9; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num>max) {
				max=num;
				cnt=i+1;
			}
			
		}
		
		System.out.println(max+"\n"+cnt);
	}
}
