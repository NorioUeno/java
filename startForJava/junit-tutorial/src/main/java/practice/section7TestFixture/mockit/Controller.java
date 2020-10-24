package practice.section7TestFixture.mockit;

public class Controller {

  private Service service = new Service();

  public String getContent(Integer id) {
    String content = service.getContentById(id);
    return content;

  }

}
