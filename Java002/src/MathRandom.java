
public class MathRandom {

	public static void main(String[] args) {

		for(int i=1; i<=100; i++) {
			double ran =Math.random();
			
			
			int ranInt = (int)(ran*(50-1+1)+1);
			System.out.print(ranInt+"\t");
			
			if(i%10==0) System.out.println();
		}

	}

}
