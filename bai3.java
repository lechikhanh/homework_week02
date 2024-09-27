package week_02;
import java.util.Random;
import java.util.Arrays;
public class bai3 {
	public static void main(String[] args) {
		// 1 nextInt
		Random r1 = new Random();
		int rI = r1.nextInt();
		System.out.println(rI);
		// 2 nextLong
		Random r2 = new Random();
		long rL = r2.nextLong();
		System.out.println(rL);
		// 3 nextDouble
		Random r3 = new Random();
		double rD = r3.nextDouble();
		System.out.println(rD);
		// 4 nextFloat
		Random r4 = new Random();
		float rF = r4.nextFloat();
		System.out.println(rF);
		// 5 nextBooLean
		Random r5 = new Random();
		boolean rBL= r5.nextBoolean();
		System.out.println(rBL);
		// 6 nextInt(int bound)
		Random r6 = new Random();
		int rIB = r6.nextInt(100);
		System.out.println(rIB);
		//7 nextGaussian
		Random r7 = new Random();
		double rG = r7.nextGaussian();
		System.out.println(rG);
		// 8 nextBytes
		Random r8 = new Random();
		byte[] rB = new byte[5];
		r8.nextBytes(rB);
		System.out.println(Arrays.toString(rB));
		// 9 ints(long)
		Random r9 = new Random();
		r9.ints(2).forEach(System.out::println);
		// 10 ints()
		Random r10 = new Random();
		r10.ints().limit(3).forEach(System.out::println);
		}
}
