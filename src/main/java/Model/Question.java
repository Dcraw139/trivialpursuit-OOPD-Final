package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
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

    public Question() {
    }

    public Question(String question, Color color, String category, String answer1, String answer2, String rightAnswer) {
            this.setQuestion(question);
            this.setColor(color);
            this.setCategory(category);
            this.setAnswer1(answer1);
            this.setAnswer2(answer2);
            this.setRightAnswer(rightAnswer);
    }

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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        if (question.equals(null) || question.equals("")) {
            throw new IllegalArgumentException("Question must not be null or empty");
        }
        this.question = question;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Color must not be null!");
        }
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category.equals(null) || category.equals("")) {
            throw new IllegalArgumentException("Category must not be null or empty");
        }
        this.category = category;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        if (answer1.equals(null) || answer1.equals("")) {
            throw new IllegalArgumentException("answer 1 must not be null or empty");
        }
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        if (answer2.equals(null) || answer2.equals("")) {
            throw new IllegalArgumentException("answer 2 must not be null or empty");
        }
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
//        if(answer3.equals(null) || answer3.equals("")){
//            throw new IllegalArgumentException("answer 3 must not be null or empty");
//        }
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
//        if(answer4.equals(null) || answer4.equals("")){
//            throw new IllegalArgumentException("answer 4 must not be null or empty");
//        }
        this.answer4 = answer4;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

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
