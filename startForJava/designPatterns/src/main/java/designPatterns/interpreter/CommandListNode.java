package designPatterns.interpreter;

import java.util.ArrayList;

//<ccommand list> ::= <command>* end
public class CommandListNode extends Node {

  private ArrayList list = new ArrayList();

  @Override
  public void parse(Context context) throws ParseException {
    while(true) {
      if(context)
    }

  }

}
