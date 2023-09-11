import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Riddle riddle = new Riddle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to set the question and answer? (true/false)");
        boolean setup = scanner.nextBoolean();
        if (setup) {
            System.out.println("Please type the question.");
            riddle.setQuestion(scanner.next());
            System.out.println("Now type the answer.");
            riddle.setAnswer(scanner.next());
        }
        System.out.println(riddle.getQuestion());
        if (riddle.checkAnswer(scanner.next())) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
        scanner.close();
    }
}