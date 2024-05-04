import java.util.Random;

public interface MathQuestionable {
    Random RANDOM = new Random(5); //DO NOT CHANGE THIS LINE
    int MAX_SMALL = 25;
    int MAX_LARGE = 50;
    int MAX_MULTIPLE = 12;
    int MAX_BASE = 12;
    int MAX_EXPONENT = 4;
    public String getQuestion();
    public int getCorrectAnswer();
}
