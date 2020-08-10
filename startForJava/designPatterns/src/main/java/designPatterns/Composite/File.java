package designPatterns.Composite;

public class File extends Entry {

  private String name;
  private int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override
  public String getName() {
    // TODO 自動生成されたメソッド・スタブ
    return name;
  }

  @Override
  public int getSize() {
    // TODO 自動生成されたメソッド・スタブ
    return size;
  }

  @Override
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
  }

}
