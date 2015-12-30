public class Calculate {
    public static void main (String[] arg){
        System.out.println ("Calculate");
        int first = Integer.valueOf (arg[0]);
        int second = Integer.valueOf (arg[1]);
        int summ = first + second;
        int multiply = first * second;
        int division = first / second;
        int subtraction = first - second;
        System.out.println ("Summ " + summ);
        System.out.println ("Multiply " + multiply);
        System.out.println ("Division " + division);
        System.out.println ("Subtraction " + subtraction);
    }
}