public class Riddle {

    private String question = "What color is the sky?";
    private String answer = "blue";

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String givenAnswer) {
        return (answer.equalsIgnoreCase(givenAnswer));
    }

}
