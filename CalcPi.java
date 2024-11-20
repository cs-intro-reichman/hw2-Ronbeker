// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int times = Integer.parseInt(args[0]);
	    double result = 0;
	    double element = 1;
	    for(int i = 0; i < times; i++)
	    {
	        if(i%2 == 0)
	        {
	            result += 1 / element;
	        }
	        else
	        {
	            result -= 1 / element;
	        }
	        element += 2;
	    }
	    System.out.println("pi according to Java: " + Math.PI);
	    System.out.println("pi, approximated: " + result * 4);
	}
}
