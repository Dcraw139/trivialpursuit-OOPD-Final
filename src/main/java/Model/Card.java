package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Card implements Serializable{
    private String deckName;
    private ArrayList<Question> questionList;

    public Card() {
    }

    public Card(String deckName, ArrayList<Question> questionList) {
        this.setDeckName(deckName);
        this.setQuestionList(questionList);
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        if (deckName.equals("") || deckName.equals(null)) {
            throw new IllegalArgumentException("deckName cannot be null or empty");
        }
        this.deckName = deckName;
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        if (questionList.isEmpty()) {
            throw new IllegalArgumentException("questionList cannot be empty");
        }
        this.questionList = questionList;
    }


}
