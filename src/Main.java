public class Main
{
    public static void main(String[] args)
    {
        String party = "R"; //D,R,I

        if(party.equalsIgnoreCase("D"))
        {
            System.out.println("You get a democratic donkey!");
        }
        else if(party.equalsIgnoreCase("R"))
        {
            System.out.println("You get a republican elephant!");
        }
        else if (party.equalsIgnoreCase("I"))
        {
            System.out.println("You get an independant man!");
        }
        else
        {
            System.out.println("You chose other!");
        }

    }
}