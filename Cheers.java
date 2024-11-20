// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String input = args[0].toUpperCase();
            int times = Integer.parseInt(args[1]);
            String an = "AEFHILMNOR";
            for(int i = 0; i< input.length() ; i++)
            {
                char current = input.charAt(i);
                System.out.print("Give me ");
                if(an.indexOf(current) != -1) {
                    System.out.print("an ");
                }
                else
                {
                    System.out.print("a  ");
                }
                System.out.println(current + ": " + current + "!");

            }
            System.out.println("What does that spell?");
            for(int i = 0; i < times; i++)
            {
                System.out.println(input +"!!!");
            }
            
            }
}
