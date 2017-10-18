package DB.DAO;

import DB.ConnectionManagerMSSQL;
import DB.IConnectionManagerMSSQL;
import POJO.Language;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;


public class LanguageDAOImpl implements LanguageDAO{

    public static class LanguageDAOException extends Exception {

    }

    private static IConnectionManagerMSSQL manager;

    static {

        manager = ConnectionManagerMSSQL.getInstance();

    }
@Override
    public List<Language> getAll() throws LanguageDAOException {

        List<Language> languageList = new ArrayList<>();
        try {
            Statement statement = manager.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, language from languages");

            while (resultSet.next()) {
                Language language = new Language(resultSet.getInt("id"), resultSet.getString("language"));
                languageList.add(language);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new LanguageDAOException();
        }

        return languageList;
    }

}
