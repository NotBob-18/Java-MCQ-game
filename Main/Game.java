package Main;

// Main class to run the quiz game
public class Game {

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of QuestionsService
        QuestionsService service = new QuestionsService();
       
        // Call the playQuiz method to start the quiz
        service.playQuiz();

        // Call the printScore method to display the user's score
        service.printScore();
    }
}
