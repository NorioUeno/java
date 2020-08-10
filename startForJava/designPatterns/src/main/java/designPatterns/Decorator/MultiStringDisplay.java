package designPatterns.Decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display{

  List<String> arryString = new ArrayList<String>();

  public MultiStringDisplay() {
    // TODO 自動生成されたコンストラクター・スタブ
  }

  public void add (String text) {
    arryString.add(text);
  }

  @Override
  public int getColumns() {
    return 1;
  }

  @Override
  public int getRows() {
    // TODO 自動生成されたメソッド・スタブ
    return arryString.size();
  }

  @Override
  public String getRowText(int row) {
    return arryString.get(row);
  }

}
