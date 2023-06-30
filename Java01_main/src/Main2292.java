import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2292 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int i = 0;
		int sum = 0;
		int result = 0;
		
		while(true) {
			sum += 6 * i;
			if(N<=1+sum) {
				result = i+1;
				break;
			}
			i++;
		}
		System.out.println(result);
	}
}