package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dao.abstracts.LanguageRepository;
import kodlama.io.devs.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getById(int id) throws Exception {
        return languageRepository.getById(id);
    }

    @Override
    public void create(Language language) throws Exception {
        if (language.getName().isEmpty()){
            throw new Exception("Programlama dili ismi boş bırakılamaz");
        }
        for(Language language1: getAll()){
            if(language1.getId() == language.getId()){
                throw new Exception("Programlama isimleri tekrar edemez");
            }
        }
        languageRepository.create(language);
    }

    @Override
    public void update(Language language, int id) throws Exception {
        if(languageRepository.getById(id) == null){
            throw new Exception("Bu programlama dili sistemde kayıtlı değil.");
        }
        languageRepository.update(language, id);
    }

    @Override
    public void delete(int id) throws Exception {
        languageRepository.delete(id);
    }
}
