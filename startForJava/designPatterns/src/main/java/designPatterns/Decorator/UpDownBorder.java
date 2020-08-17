package designPatterns.Decorator;

public class UpDownBorder extends Border{


  public UpDownBorder(Display display) {
    super(display);
  }

  @Override
  public int getColumns() {
    return display.getColumns();
  }

  @Override
  public int getRows() {
    return 1 + display.getRows() + 1;
  }

  @Override
  public String getRowText(int row) {
    if (row == 0) {
      return  makeLine('-', display.getColumns());
    } else if (row == display.getRows() + 1) {
      return makeLine('-', display.getColumns());
    } else {
      return display.getRowText(row - 1);
    }
  }

}
