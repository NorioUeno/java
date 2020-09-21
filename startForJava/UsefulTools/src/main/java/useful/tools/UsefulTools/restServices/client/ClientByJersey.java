package useful.tools.UsefulTools.restServices.client;

import org.slf4j.Logger;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class ClientByJersey {


  private Client client = ClientBuilder.newClient();
  private Logger logger;

  public void getMethod(String url) {



  //https://api.example.com/oauth/access_token?token=shortAccessToken にリクエストを投げない
    WebTarget target = client.target(url)
//        .path("/oauth/access_token")
//        .queryParam("token", "shortAccessToken")
        ;

    Response r = target.request().get();


    try {
      target.request();
        String result = target.request().get(String.class);
    } catch (BadRequestException e) {
        logger.error("response=" + e.getResponse().readEntity(String.class), e);
        throw e;
    }

  }

}
