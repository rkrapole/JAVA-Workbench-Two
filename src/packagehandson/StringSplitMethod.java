package packagehandson;

public class StringSplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ram@rapole@karimnagar@tg@india";

		String[] array1Ofstr = str.split("@");
		System.out.println("o/p with only regex --> ");
		for (String s1 : array1Ofstr) {
			System.out.println(s1);
		}

		String[] array2Ofstr = str.split("@", 4);//pattern will be applied limit-1 times
		System.out.println("o/p with only regex & limit --> ");
		for (String s2 : array2Ofstr) {
			System.out.println(s2);
		}
		
		String abc = "text1, test2 test3@test4?test5.test6-test7";
		System.out.println("o/p with multiple in regex --> ");//use []followed by +
		String[] arrayOfabc = abc.split("[, @?.-]+");
		for (String a1 : arrayOfabc) {
			System.out.println(a1);
			
		}

	}

}
