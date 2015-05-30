package io.pranav.gitrello.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("gitrello/trello/webhook")
public class TrelloWebHookResource {

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void receiveTrelloWebHook() {

  }

}
