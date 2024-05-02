package ArraysDome;

public class SumAndCount {

	int sum;
	int count;

	public static void main(String[] args) {
//		System.out.println(sum);
//		System.out.println(count);
		int amount = 4567;
		int[] notes = { 2000, 500, 200, 100, 50, 20, 10,5,2,1 };
		int count = 0;
		for (int i = 0; i < notes.length; i++) {
			count = amount / notes[i];
			
			if (count != 0) {
				System.out.println(notes[i]+ "*" + notes[i] * count);
			}
			amount = amount % notes[i];
			System.out.println(amount);

		}System.out.println();

	}

}
