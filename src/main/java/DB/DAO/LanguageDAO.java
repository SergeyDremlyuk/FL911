package DB.DAO;

import POJO.Language;

import java.util.List;

public interface LanguageDAO {
    List<Language> getAll() throws LanguageDAOImpl.LanguageDAOException;

}