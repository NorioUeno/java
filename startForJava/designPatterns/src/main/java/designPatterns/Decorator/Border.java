package designPatterns.Decorator;

public abstract class Border extends Display {

  protected Display display;

  public Border(Display display) {
    this.display = display;
  }

  protected String makeLine(char ch, int count) {
    StringBuffer buf = new StringBuffer();
    for (int i = 0; i < count; i++) {
      buf.append(ch);
    }

    return buf.toString();
  }


}
