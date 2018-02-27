package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends ArrayList<Card> {

    public void shuffle() {
        Collections.shuffle(this);
    }
}


