package chat.rocket.persistence.realm.models.ddp;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

import chat.rocket.core.models.SpotlightUser;

public class RealmSpotlightUser extends RealmObject {

  public interface Columns {
    String ID = "_id";
    String USERNAME = "username";
    String STATUS = "status";
  }

  @PrimaryKey private String _id;
  private String username;
  private String status;

  public String getId() {
    return _id;
  }

  public void setId(String _id) {
    this._id = _id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SpotlightUser asSpotlightUser() {
    return SpotlightUser.builder()
        .setId(_id)
        .setUsername(username)
        .setStatus(status)
        .build();
  }
}