package designPatterns.interpreter;

//<program> ::= program<command list>
public class ProgramNode {
  private Node commandListNode;
  public void parse(Context context) throws ParseException{
    context.skipToken("program");
    commandListNode = new CommandListNode();
    commandListNode.parse(context);
  }

  @Override
  public String toString() {
    return "[program " + commandListNode +"]";
  }

}
