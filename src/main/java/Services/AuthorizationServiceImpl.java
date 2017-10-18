package Services;

import DB.DAO.UserDAO;
import DB.DAO.UserDAOImpl;

import static Services.PasswordEncoder.encode;

public class AuthorizationServiceImpl implements AuthorizationService {

    private static UserDAO userDAO = new UserDAOImpl();

    @Override
    public boolean auth(String login, String password) {

        if(login==null || password==null){
            return false;
        }

        if (userDAO.getUserByLoginAndPassword(login, encode(password))){
            return true;
        }
        return false;
    }
}
