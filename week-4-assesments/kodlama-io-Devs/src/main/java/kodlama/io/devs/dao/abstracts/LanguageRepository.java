package kodlama.io.devs.dao.abstracts;

import kodlama.io.devs.entity.Language;

import java.util.List;

public interface LanguageRepository {

    List<Language> getAll();
    Language getById(int id) throws Exception;
    void create(Language language) throws Exception;
    void update(Language language, int id) throws Exception;
    void delete(int id) throws Exception;
}
