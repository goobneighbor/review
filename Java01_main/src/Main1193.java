import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1193 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int i = 1;
		int sum = 0;
		int sum2 = 0;
		int fr = 0; //분수
		int den = 0; //분모		
		
		while(true) {
			sum += i;
			sum2 += i-1;
			if(X<=sum) {
				if(i%2!=0) {
					fr = i - (X-(sum2+1));
					den = 1 + (X-(sum2+1));
					break;
				}else {
					fr = 1 + (X-(sum2+1));
					den = i - (X-(sum2+1));
					break;
				}
			}
			i++;
		}
		System.out.println(fr+"/"+den);
	}
}