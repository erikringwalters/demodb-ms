package csumbcapstonegroup22spring2019.demodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import csumbcapstonegroup22spring2019.demodb.entities.Hero;

@RestController
public class DemoController {
    @Autowired
    IDemoRepository demoRepository;

    @GetMapping ("/allHeroes")
    public List<Hero> getAll() {
        List<Hero> result = demoRepository.findAll();
        return result;
    }

    @GetMapping("/id/{id}")
    public Hero getHeroById (@PathVariable String id) {
        Hero result = demoRepository.findByRepoId(id);
        return result;
    }

    @GetMapping("/power/{power}")
    public List<Hero> getByPower (@PathVariable String power) {
        List<Hero> result = demoRepository.findByPower(power);
        return result;
    }
}