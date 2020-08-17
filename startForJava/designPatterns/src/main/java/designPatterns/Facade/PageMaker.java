package designPatterns.Facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {

  private PageMaker() {
  }

  public static void makeWelcomePage(String mailaddr, String filename) {
    try {
      Properties mailprop = Database.getProperties("/Users/aa572057/Documents/GitHub/testJavaFirst/startForJava/designPatterns/src/main/java/designPatterns/Facade/maildata");
      String username = mailprop.getProperty(mailaddr);
      HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
      writer.title("Welcome to " + username + "'s page!");
      writer.paragraph(username + "のページへようこそ!");
      writer.paragraph("メールまっています");
      writer.mailto(mailaddr, username);
      writer.close();
      System.out.println(filename + "is created for " + mailaddr + "(" + username + ")");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
