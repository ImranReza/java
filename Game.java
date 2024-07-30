import java.util.Scanner;
import java.lang.Math;

public class Game {
    final String[] fruites = {"Apple","Strawberries","pineapple","Grape","Mango","Banana","Orange","Pomegranate","Watermelon","kiwi","papaya","Dragonrfruit","Litchi","Coconut","Guava","Black Berry","Lemon","pineapple","jackgruit"};
    final int lengthFruits = fruites.length;

    int index = (int)(Math.random()*20);
    
    String firstName, lastName;
    static int count = 1;



    Scanner inputScanner = new Scanner(System.in);

    public void WelcomeMessage(){
        System.out.println("Welcome To The Fruites Gussing Game");
    }

    public void PlayerInfo(){
        System.out.println("Enter Your First Name: ");
        this.firstName = inputScanner.nextLine();

        System.out.println("Enter Your Second Name: ");
        this.lastName = inputScanner.nextLine();
    }

    public void displayInfo(){
        String fullName = this.firstName + " " + this.lastName;
        String greeting = "Hi ";
        String message = greeting.concat(fullName);
        System.out.println(message);
    }

    public void Play(){
        
        System.out.println("Enter Your Guess: ");
        String guess = inputScanner.nextLine();

        // System.out.println(fruites[index]);

        if(fruites[index].toUpperCase().equals(guess.toUpperCase())){
            System.out.println("The Guess is Right : " + guess);
            System.out.println("The Guessing Attemps: " + count);
        }else{
            System.out.println("Wrong Guess Try Again");
            count++;
            Play();
        }
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.PlayerInfo();
        game.displayInfo();
        game.WelcomeMessage();
        game.Play();

    }
    
}
