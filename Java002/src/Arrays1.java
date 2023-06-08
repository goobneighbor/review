import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		int data[] = {23, 86, 7, 47, 862, 90, 2};
		
		int copy1[] = Arrays.copyOf(data, 4);
		
		String copy1String = Arrays.toString(copy1);
		System.out.println("copy1String->"+copy1String);
		
		//System.out.println(Arrays.sort(data));
		System.out.println("정렬후->"+ Arrays.toString(data));
		
	}
}
