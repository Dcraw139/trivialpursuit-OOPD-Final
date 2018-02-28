package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends ArrayList<Card> {

    public void shuffle() {
        Collections.shuffle(this);
    }

    //card
    //deck name & question list
    //question, color, category, a1, a2, a3, a4, rA

    public void testJson() {
    String json = "{\"deckName\" : \"testDeck\" , \"questionList\" : \" "
            + "[{\"question\" : \"does this work\", \"color\" : \"blue\", \"category\" : \"history\" , "
            + "\"answer1\" : \"true\" , \"answer2\" : \"false\", \"rightAnswer\" : \"true\"} , "
            + "{\"question\" : \"does this work\", \"color\" : \"blue\", \"category\" : \"history\" , "
            + "\"answer1\" : \"true\" , \"answer2\" : \"false\", \"rightAnswer\" : \"true\"} , "
            + "{\"question\" : \"does this work\", \"color\" : \"blue\", \"category\" : \"history\" , "
            + "\"answer1\" : \"true\" , \"answer2\" : \"false\", \"rightAnswer\" : \"true\"}]}";
    }
    //plz stop doing this
}



