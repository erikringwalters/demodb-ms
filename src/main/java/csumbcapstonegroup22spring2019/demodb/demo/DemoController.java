package csumbcapstonegroup22spring2019.demodb.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import csumbcapstonegroup22spring2019.demodb.entities.hero.Hero;
import csumbcapstonegroup22spring2019.demodb.entities.linechart.LineChart;
import csumbcapstonegroup22spring2019.demodb.linechart.ILineChartRepository;


@RestController
public class DemoController {
    @Autowired
    IDemoRepository demoRepository;
    // @Autowired
    // ILineChartRepository lineChartRepository;

    // @GetMapping (value="/allLineChartData", produces="application/json")
    // public List<LineChart> getAllLines() {
    //     List<LineChart> result = lineChartRepository.findAll();
    //     return result;
    // }
    
    @GetMapping (value = "/allHeroes", produces="application/json")
    public List<Hero> getAllHeroes() {
        List<Hero> result = demoRepository.findAll();
        return result;
    }

    @GetMapping(value = "/id/{id}", produces="application/json")
    public Hero getHeroById (@PathVariable String id) {
        Hero result = demoRepository.findByRepoId(id);
        return result;
    }

    @GetMapping(value = "/power/{power}", produces="application/json")
    public List<Hero> getByPower (@PathVariable String power) {
        List<Hero> result = demoRepository.findByPower(power);
        return result;
    }
}