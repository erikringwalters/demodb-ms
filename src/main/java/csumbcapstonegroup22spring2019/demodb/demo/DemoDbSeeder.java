package csumbcapstonegroup22spring2019.demodb.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import csumbcapstonegroup22spring2019.demodb.entities.hero.AlterEgo;
import csumbcapstonegroup22spring2019.demodb.entities.hero.Hero;
import csumbcapstonegroup22spring2019.demodb.entities.hero.Powers;
import csumbcapstonegroup22spring2019.demodb.entities.linechart.LineChart;
import csumbcapstonegroup22spring2019.demodb.entities.linechart.Series;
import csumbcapstonegroup22spring2019.demodb.linechart.ILineChartRepository;
import csumbcapstonegroup22spring2019.demodb.entities.hero.Identity;
import csumbcapstonegroup22spring2019.demodb.demo.IDemoRepository;

@Component
public class DemoDbSeeder implements CommandLineRunner{
    @Autowired
    IDemoRepository demoRepo;
    @Autowired
    ILineChartRepository lineChartRepo;

    @Override
    public void run(String... args) throws Exception {
        Hero ironMan = new Hero(new Identity("Tony Stark"), new AlterEgo("Iron Man"), new Powers(Arrays.asList("energy beams","flight")));
        Hero hulk = new Hero(new Identity("Bruce Banner"), new AlterEgo("The Hulk"), new Powers(Arrays.asList("super strength")));
        Hero spiderMan = new Hero(new Identity("Peter Parker"), new AlterEgo("Spider Man"), new Powers(Arrays.asList("super strength","webs","danger sense")));
        //delete db data
        demoRepo.deleteAll();
        //add db seeds
        List<Hero> heroes = Arrays.asList(ironMan, hulk, spiderMan);
        demoRepo.saveAll(heroes);
    }
}