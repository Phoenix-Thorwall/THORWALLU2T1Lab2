import java.util.Scanner;

public class ChatBotRunner
{
    public static void main(String[]args)
    {
        //Prep!
        Scanner scan = new Scanner(System.in);

        ChatBot Gus = new ChatBot("Gus", 27);

        int question1 = 0;

        //Getting Down to Business

        //First Method: Greeting
        System.out.println("Excuse my forwardness, but I don't think I've met you before. Could you tell me your name?");
        String userName = scan.nextLine();

        Gus.greeting(userName);

        //Second Method: Weather
        System.out.println("");
        System.out.println("");
        System.out.println("Other than poorly imitating the human condition, Chat Bots are capable of performing many impressive feats, Even predicting the future!");
        System.out.println("Would you like a weather forecast for today? (1 = yes & -1 = no)");


        question1 = scan.nextInt();

        if (question1 >= 1)
        {
            Gus.weather();
        }
            else if (question1 <= -1)
            {
                System.out.println("Well... I guess all I have to say is that you're missing out on a demonstration of the next generation of digital assistance...");
            }

        //Third Method: Feet 2 Meter Converter
        System.out.println("");
        System.out.println("");

        System.out.println("Anyways, Chat Bots are also great with feet!");
        System.out.print("Give me a value in feet and I'll convert it to meters: ");
        int footVal = scan.nextInt();
        double meters = Gus.convertFeetToMeters(footVal);
        System.out.println("");
        System.out.println(footVal + " feet is equal to " + meters + " meters");

        //Fourth Method: Favorite Numbers
        System.out.println("");
        System.out.println("");

        System.out.println("Do you have a favorite number? Lets see if we like the same one!");
        System.out.print("What's your favorite number?: ");
        int urFavNum = scan.nextInt();
        Gus.favoriteNumber(urFavNum);

        //Fifth Method: Math
        System.out.println("");
        System.out.println("");

        System.out.println("I can do math with other kinds of numbers too, even the ones you HATE");
        System.out.println("Give me 3 numbers to add together");
        System.out.print("Number 1: ");
        int num1 = scan.nextInt();
        System.out.println("");
        System.out.print("Number 2: ");
        int num2 = scan.nextInt();
        System.out.println("");
        System.out.print("Number 3: ");
        int num3 = scan.nextInt();
        System.out.println("");
        System.out.println("");
        int sum = Gus.addNumbers(num1, num2, num3);
        System.out.print("The sum of those numbers is " + sum + "!");

        //Personal Method 2: Even More Math
        System.out.println("");
        System.out.println("");
        System.out.println("You'll be amazed by the other advanced mathematics I can do!");
        int squareSum = Gus.squareNumber(sum);
        System.out.print("Your sum squared is " + squareSum);

        //Sixth Method: Farewell
        System.out.println("");
        System.out.println("");
        System.out.print(Gus.goodbye());

        //Personal Method 1: Farewell +
        System.out.println("");
        System.out.println("");
        Gus.finalMessage(userName);





    }
}
