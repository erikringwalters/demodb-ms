package csumbcapstonegroup22spring2019.demodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import csumbcapstonegroup22spring2019.demodb.entities.hero.Hero;
import csumbcapstonegroup22spring2019.demodb.entities.linechart.LineChart;


@RestController
public class DemoController {
    @Autowired
    IDemoRepository demoRepository;

    @GetMapping (value = "/allLines", produces="application/json")
    public List<Hero> getAll() {
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

    @GetMapping (value = "/line-chart1/{id}", produces="application/json")
    public LineChart getLineChartData (@PathVariable String id) {
        LineChart result = demoRepository.findByLineChartId(id);
        return result;
    }
}