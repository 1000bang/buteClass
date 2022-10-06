package wraper;

public class MainTest3 {

	public static void main(String[] args) {

		String str = "10";
		String str1 = "20.5";
		String str2 = "true";

		int i = Integer.parseInt(str);
		System.out.println(i);

		double d = Double.parseDouble(str1);
		System.out.println("D : " + (d + 0.5));

		boolean b = Boolean.parseBoolean(str2);
		System.out.println(!b);

	}
}
