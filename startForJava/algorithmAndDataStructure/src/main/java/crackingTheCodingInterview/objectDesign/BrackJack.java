package crackingTheCodingInterview.objectDesign;

public class BrackJack extends Deck{

  @Override
  public int getDeckSize() {
    size++;
    return size;
  }

}
