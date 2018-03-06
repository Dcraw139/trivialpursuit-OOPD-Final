package Model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Models a deck of Trivial Pursuit Cards
 */
public class Deck extends ArrayList<Card> {

    /**
     * Shuffles this deck
     */
    public void shuffle() {
        Collections.shuffle(this);
    }
//thx sophie
    //card
    //deck name & question list
    //question, color, category, a1, a2, a3, a4, rA

    /**
     * Loads a deck from application
     */
    public void loadDeck() {
    ArrayList<Question> testQ = new ArrayList();

    Card card = new Card("test", testQ);
    ObjectMapper objmap = new ObjectMapper();
    objmap.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT , false);

        try {
            Card test = objmap.readValue(new File("target/test.json") , Card.class);
            System.out.println(test);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}



