package Model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
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
//    String json = "{\"deckName\" : \"testDeck\" , \"questionList\" : \" "
//            + "[{\"question\" : \"does this work\", \"color\" : \"blue\", \"category\" : \"history\" , "
//            + "\"answer1\" : \"true\" , \"answer2\" : \"false\", \"rightAnswer\" : \"true\"} , "
//            + "{\"question\" : \"does this work\", \"color\" : \"blue\", \"category\" : \"history\" , "
//            + "\"answer1\" : \"true\" , \"answer2\" : \"false\", \"rightAnswer\" : \"true\"} , "
//            + "{\"question\" : \"does this work\", \"color\" : \"blue\", \"category\" : \"history\" , "
//            + "\"answer1\" : \"true\" , \"answer2\" : \"false\", \"rightAnswer\" : \"true\"}]}";
    ArrayList<Question> testQ = new ArrayList();
    testQ.add(new Question("does this work?" , Color.BLUE, "history", "true" , "true", "true"));
    testQ.add(new Question("does this work?" , Color.ORANGE, "history", "true" , "true", "true"));
    testQ.add(new Question("does this work?" , Color.PINK, "history", "true" , "true", "true"));
    testQ.add(new Question("does this work?" , Color.PURPLE, "history", "true" , "true", "true"));
    testQ.add(new Question("does this work?" , Color.GREEN, "history", "true" , "true", "true"));
    testQ.add(new Question("does this work?" , Color.YELLOW, "history", "true" , "true", "true"));

    Card card = new Card("test", testQ);
    ObjectMapper objmap = new ObjectMapper();
    objmap.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT , false);
        try {
            objmap.writeValue(new File("target/test.json"), card);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        try {
            Card test = objmap.readValue(new File("target/test.json") , Card.class);
            System.out.println(test);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}



