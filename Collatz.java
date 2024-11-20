// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String isVerbos = args[1];
		int count, current = 0;
		for(int i = 1; i <= seed; i++)
		{
			count = 1;
			current = i;
			while(current != 1 || count == 1)
			{
				if(isVerbos.equals("v")) {
					System.out.print(current + " ");
				}
				if(current % 2 == 0) {
					current /= 2;
				}
				else
				{
					current = 3 * current + 1;
				}
				count++;
			}
			if(isVerbos.equals("v")) {
				System.out.println("1 (" + count + ")");
			}
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
