package crackingTheCodingInterview.objectDesign;

import java.util.ArrayList;
import java.util.List;

public abstract class Deck {

  int size;
  List<Card> cardList = new ArrayList<Card>();
  public int getDeckSize() {
    return size;
  }


}
