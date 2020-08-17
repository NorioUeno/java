package designPatterns.proxy;

import java.lang.reflect.InvocationTargetException;

public interface Printable {

  public abstract void setPrinterName(String name);

  public abstract String getPrinterName();

  public abstract void print(String string) throws IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException;

}
