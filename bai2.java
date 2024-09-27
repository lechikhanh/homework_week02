package week_02;

public class bai2 {

	public static void main(String[] args) {
		// 1 append
		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.append("Viet Nam");
		System.out.println(sb1);
		// 2 insert
		StringBuffer sb2 = new StringBuffer("Hello ");
		sb2.insert(3, "Viet Nam");
		System.out.println(sb2);
		// 3 replace
		StringBuffer sb3 = new StringBuffer("Hello ");
		sb3.replace(2, 3, "Viet Nam");
		System.out.println(sb3);
		// 4 delete
		StringBuffer sb4 = new StringBuffer("Hello ");
		sb4.delete(2, 5);
		System.out.println(sb4);
		// 5 reverse
		StringBuffer sb5 = new StringBuffer("Hello ");
		sb5.reverse();
		System.out.println(sb5);
		// 6 length
		StringBuffer sb6 = new StringBuffer("Hello ");
		int l = sb6.length();
		System.out.println(l);
		// 7 setlength
		StringBuffer sb7 = new StringBuffer("Hello ");
		sb7.setLength(3);
		System.out.println(sb7);
		// 8 charAt
		StringBuffer sb8 = new StringBuffer("Hello ");
		char c = sb8.charAt(4);
		System.out.println(c);
		// 9 setCharAt
		StringBuffer sb9 = new StringBuffer("Hello ");
		sb9.setCharAt(4, 'f');
		System.out.println(sb9);
		// 10 deleteCharAt
		StringBuffer sb10 = new StringBuffer("Hello ");
		sb10.deleteCharAt(1);
		System.out.println(sb10);
	}

}
