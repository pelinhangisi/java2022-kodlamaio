package kodlama.io.devs.webApi;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public Language getById(@PathVariable() int id) throws Exception{
        return languageService.getById(id);
    }

    @PostMapping("/add")
    public void create(@RequestBody Language language) throws Exception {
        languageService.create(language);
    }

    @PutMapping("/update")
    public void update(@RequestBody Language language,@PathVariable int id) throws Exception {
        languageService.update(language,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") int id) throws Exception {
        languageService.delete(id);
    }
}
