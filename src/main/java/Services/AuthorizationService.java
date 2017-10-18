package Services;

import POJO.User;

public interface AuthorizationService {

    boolean auth(String login, String password);
}
