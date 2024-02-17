package arrayPractice;

public class FindDuplicateInAnArray {

	char[] ch = new char[] { 'a', 'b', 'a', 'c', 'b' };

	public static void main(String[] args) {
		FindDuplicateInAnArray Obj = new FindDuplicateInAnArray();
		Obj.findDuplicate();

	}

	public void findDuplicate() {

		int count = 0;

		System.out.println("Duplicate are ");
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					System.out.println(ch[i]);
//					System.out.println(count);
				}
//				System.out.println("Count Duplicate: " +count);
			}

			// System.out.println("Count Duplicate: " +count);
		}
		System.out.println("Count Duplicate: " + count);
	}
}
