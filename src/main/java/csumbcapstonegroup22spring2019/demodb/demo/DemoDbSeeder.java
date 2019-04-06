package csumbcapstonegroup22spring2019.demodb.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import csumbcapstonegroup22spring2019.demodb.entities.hero.AlterEgo;
import csumbcapstonegroup22spring2019.demodb.entities.hero.Hero;
import csumbcapstonegroup22spring2019.demodb.entities.hero.Powers;
import csumbcapstonegroup22spring2019.demodb.entities.hero.Identity;
import csumbcapstonegroup22spring2019.demodb.demo.IDemoRepository;

@Component
public class DemoDbSeeder implements CommandLineRunner{
    @Autowired
    IDemoRepository demoRepo;

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

        // String greenName = "Green";
        // Series[] greenSeries = new Series[4];
        // greenSeries[0] = new Series(5, 100);
        // greenSeries[1] = new Series(10, 250);
        // greenSeries[2] = new Series(15, 1500);
        // greenSeries[3] = new Series(20, 750);
        // greenSeries[4] = new Series(25, 500);
        
        // LineChart greenLineChart = new LineChart(greenName, greenSeries);

        // String redName = "Red";
        // Series[] redSeries = new Series[4];
        // redSeries[0] = new Series(5, 150);
        // redSeries[1] = new Series(10, 2500);
        // redSeries[2] = new Series(15, 150);
        // redSeries[3] = new Series(20, 650);
        // redSeries[4] = new Series(25, 50);

        // LineChart redLineChart = new LineChart(redName, redSeries);

        // delete db data
        // demoRepo.deleteAll();
        // // add db seeds
        // // List<LineChart> lineCharts = Arrays.asList(greenLineChart, redLineChart);
        // demoRepo.saveAll(lineCharts);
    

}