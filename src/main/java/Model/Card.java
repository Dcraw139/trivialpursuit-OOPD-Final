package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
    *Models a trivial pursuit card
 */
public class Card implements Serializable{
    private String deckName;
    private ArrayList<Question> questionList;

    /**
    default constructor for Card
     */
    public Card() {
    }

    /**
    Overloaded constructor for a Card
    @param questionList list of questions
    @param deckName the name of the deck to which the card belongs
     */
    public Card(String deckName, ArrayList<Question> questionList) {
        this.setDeckName(deckName);
        this.setQuestionList(questionList);
    }

    /**
     * Gets the deck name of this card
     * @return deckName
     */
    public String getDeckName() {
        return deckName;
    }

    /**
     * Sets the deck name of this card
     * @param deckName the name of the deck
     */
    public void setDeckName(String deckName) {
        if (deckName.equals("") || deckName.equals(null)) {
            throw new IllegalArgumentException("deckName cannot be null or empty");
        }
        this.deckName = deckName;
    }

    /**
     * Gets the questionList of this card
     * @return QuestionList
     */
    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    /**
     * Sets the questionList
     * @param questionList the List of questions on this card
     */
    public void setQuestionList(ArrayList<Question> questionList) {
        if (questionList.isEmpty()) {
            throw new IllegalArgumentException("questionList cannot be empty");
        }
        this.questionList = questionList;
    }


}
