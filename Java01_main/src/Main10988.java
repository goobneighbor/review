import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10988 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] strA = str.split("");
		
		int i=0;
		int j=strA.length-1;
			
		while(i<j) {
			String temp=strA[i];
			strA[i++]=strA[j];
			strA[j--]=temp;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(String k : strA) {
			sb.append(k);
		}
		
		if(str.equals(sb.toString())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}