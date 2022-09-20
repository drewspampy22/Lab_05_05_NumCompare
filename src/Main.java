public class Main

{
    public static void main(String[] args)
    {
        int NumberA = 2;
        int NumberB = 2;

        if (NumberB==NumberA)
        {
            System.out.println(NumberB + " and " + NumberA + " are equal");
        }
        else if (NumberB > NumberA)
        {
            System.out.println(NumberA+ " is less than " + NumberB);
        }
        else if (NumberA > NumberB)
        {
            System.out.println(NumberB+ " is less than " + NumberA);
        }
        else
        {
            System.out.println("Invalid Input please try again");
        }




    }
}