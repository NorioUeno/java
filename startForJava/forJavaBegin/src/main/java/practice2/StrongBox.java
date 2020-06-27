package practice2;

public class StrongBox<E> {
  private E data;
  private KeyEnumTest kindOfKey;
  private int callCount = 0;
  private int RequiredCallCount;

  public StrongBox(KeyEnumTest kindOfKey, int RequiredCallCount) {
    this.kindOfKey = kindOfKey;
    this.RequiredCallCount = RequiredCallCount;
  }

  public void put(E d) {
    this.data = d;
  }

  public E get() {
    callCount += 1;
    switch (this.kindOfKey) {
      case PADLOCK:
        if (!(callCount < 1024)) {
          return null;
        }
        break;
      case BUTTON:
        break;
      case DIAL:
        break;
      case FINGER:
        break;
      default:
        break;
    }
    callCount = 0;
    return this.data;
  }

}
