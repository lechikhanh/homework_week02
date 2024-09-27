package week_02;

public class bai1 {

	public static void main(String[] args) {
		// 1 isLetter
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('2'));
		// 2 isDigit
		System.out.println(Character.isDigit('2'));
		System.out.println(Character.isDigit('A'));
		// 3 isWhitespace
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('B'));
		// 4 isUpperCase
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase(20));
		// 5 isWhitespace
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('A'));
		// 6 toUpperCase
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase('A'));
		// 7 toLowerCase
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toLowerCase('a'));
		// 8 toString
		System.out.println(Character.toString('a'));
		System.out.println(Character.toString('b'));
		// 9 isAlphabetic
		System.out.println(Character.isAlphabetic(56));
		System.out.println(Character.isAlphabetic(90));
		// 10 equals
		Character a = Character.valueOf('2');
		Character b = Character.valueOf('2');
		Character c = Character.valueOf('5');
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}
}
