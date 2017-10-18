package Services;

import DB.DAO.UserDAO;
import DB.DAO.UserDAOImpl;


import static Services.PasswordEncoder.encode;

public class RegistratiomServiceImpl implements RegistrationService {

    private static UserDAO userDAO = new UserDAOImpl();

    @Override
    public String regUser(String firstname, String lastName, String bDay, String sex, String nativeLanguage, String login, String password) {

        if (firstname == null || lastName==null || bDay== null || sex==null || nativeLanguage == null || login == null || password == null) {
            return "Incorrect data";
        }

        if (userDAO.findUserByLogin(login)){
            return "User exists";
        }

        try {
            userDAO.createUser(firstname, lastName, bDay, sex, Integer.parseInt(nativeLanguage), login, encode(password));
        } catch (UserDAOImpl.UserDAOException e) {
            e.printStackTrace();
        }

        return "Ok";
    }

}
