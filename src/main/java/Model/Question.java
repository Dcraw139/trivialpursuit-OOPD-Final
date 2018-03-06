package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)

/**
 * Models a List of Questions on a Trivial Pursuit Card
 */
public class Question implements Serializable {

    private String question;
    private Color color;
    private String category;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String rightAnswer;
//    private boolean t;
//    private boolean f;
//    private boolean isTrueOrFalse;

    /**
     * Default constructor
     */
    public Question() {
    }

    /**
     * Overloaded Constructor of a Question List
     * @param question the question
     * @param color the color of the question
     * @param category the catergory this question exists in
     * @param answer1 the First possible answer
     * @param answer2 the second possible answer
     * @param rightAnswer the correct answer
     */
    public Question(String question, Color color, String category, String answer1, String answer2, String rightAnswer) {
            this.setQuestion(question);
            this.setColor(color);
            this.setCategory(category);
            this.setAnswer1(answer1);
            this.setAnswer2(answer2);
            this.setRightAnswer(rightAnswer);
    }

    /**
     * Overloaded constructor of a question
     * @param question the question
     * @param color the color
     * @param category the category
     * @param answer1 the first possible answer
     * @param answer2 the second possible answer
     * @param answer3 the third possible answer
     * @param answer4 the fourth possible answer
     * @param rightAnswer the right answer
     */
    public Question(String question, Color color, String category, String answer1, String answer2, String answer3, String answer4, String rightAnswer) {
        this.setQuestion(question);
        this.setColor(color);
        this.setCategory(category);
        this.setAnswer1(answer1);
        this.setAnswer2(answer2);
        this.setAnswer3(answer3);
        this.setAnswer4(answer4);
        this.setRightAnswer(rightAnswer);
    }

    /**
     * gets this question
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the Question
     * @param question the question
     */
    public void setQuestion(String question) {
        if (question.equals(null) || question.equals("")) {
            throw new IllegalArgumentException("Question must not be null or empty");
        }
        this.question = question;
    }

    /**
     * gets the Color
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the color
     * @param color color
     */
    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Color must not be null!");
        }
        this.color = color;
    }

    /**
     * Gets the Category
     * @return the category of this question
     */
    public String getCategory() {
        return category;
    }

    /**
     *Sets the category
     * @param category the category of this question
     */
    public void setCategory(String category) {
        if (category.equals(null) || category.equals("")) {
            throw new IllegalArgumentException("Category must not be null or empty");
        }
        this.category = category;
    }

    /**
     * Get the first answer
     * @return the first answer
     */
    public String getAnswer1() {
        return answer1;
    }

    /**
     * sets the first answer
     * @param answer1 the first answer
     */
    public void setAnswer1(String answer1) {
        if (answer1.equals(null) || answer1.equals("")) {
            throw new IllegalArgumentException("answer 1 must not be null or empty");
        }
        this.answer1 = answer1;
    }

    /**
     * gets the second answer
     * @return the second answer
     */
    public String getAnswer2() {
        return answer2;
    }

    /**
     * sets the second answer
     * @param answer2 the second answer
     */
    public void setAnswer2(String answer2) {
        if (answer2.equals(null) || answer2.equals("")) {
            throw new IllegalArgumentException("answer 2 must not be null or empty");
        }
        this.answer2 = answer2;
    }

    /**
     * gets the third answer
     * @return the third answer
     */
    public String getAnswer3() {
        return answer3;
    }

    /**
     * sers the third answer
     * @param answer3 the third answer
     */
    public void setAnswer3(String answer3) {
//        if(answer3.equals(null) || answer3.equals("")){
//            throw new IllegalArgumentException("answer 3 must not be null or empty");
//        }
        this.answer3 = answer3;
    }

    /**
     * gets the fourth answer
     * @return the fourth answer
     */
    public String getAnswer4() {
        return answer4;
    }

    /**
     * sets the fourth answer
     * @param answer4 the fourth answer
     */
    public void setAnswer4(String answer4) {
//        if(answer4.equals(null) || answer4.equals("")){
//            throw new IllegalArgumentException("answer 4 must not be null or empty");
//        }
        this.answer4 = answer4;
    }

    /**
     * gets the right answer
     * @return the right answer
     */
    public String getRightAnswer() {
        return rightAnswer;
    }

    /**
     * sets the right answer
     * @param rightAnswer the right answer
     */
    public void setRightAnswer(String rightAnswer) {
        if (rightAnswer.equals(null) || rightAnswer.equals("")) {
            throw new IllegalArgumentException("rightAnswer must not be null or empty");
        }
        this.rightAnswer = rightAnswer;
    }

    @Override
    public boolean equals(Object obj) {
        Question other = (Question) obj;
        return this.getQuestion() == other.getQuestion();
    }

    @Override
    public String toString() {
        return  "Color : " + this.getColor() + '\n' +
                "Category : " + this.getCategory() + '\n' +
                "Question : " + this.getQuestion() + '\n' +
                "Answer 1 : " + this.getAnswer1() + '\n' +
                "Answer 2 : " + this.getAnswer2() + '\n' +
                "Answer 3 : " + this.getAnswer3() + '\n' +
                "Answer 4 : " + this.getAnswer4() + '\n';
    }
}
