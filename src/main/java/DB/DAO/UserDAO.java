package DB.DAO;

public interface UserDAO {

    boolean getUserByLoginAndPassword(String login, String password);

    boolean createUser(String firstname, String lastName, String bDay, String sex, int nativeLanguage, String login, String password) throws UserDAOImpl.UserDAOException;

    boolean findUserByLogin(String login);
}
