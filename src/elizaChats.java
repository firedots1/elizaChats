import java.util.Scanner;

public class elizaChats {
        public static void main (String args[]) {
            Scanner ChatBot = new Scanner(System.in);
            System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name? ");
            String name = ChatBot.nextLine();
            System.out.println("How has your day been?");
            String feel = ChatBot.nextLine();
            System.out.println("Please wait for a response...");
            System.out.println("Nice to meet you " + name + ", " + "Why are you feeling " + feel + " today?");
            String res = ChatBot.nextLine();
            System.out.println("Please wait for a response...");
            System.out.println("Okay, Anything in particular that makes you feel that way?");
            String after = ChatBot.nextLine();
            System.out.println("Okay, Well it has been my pleasure to speak with you have a nice day!");
            System.out.println("Here are your responses: " + name + " " + feel + " " + res + " " + after);
        }

}
