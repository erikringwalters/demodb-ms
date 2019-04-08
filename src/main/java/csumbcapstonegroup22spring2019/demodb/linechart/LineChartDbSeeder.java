package csumbcapstonegroup22spring2019.demodb.linechart;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import csumbcapstonegroup22spring2019.demodb.entities.linechart.LineChart;
import csumbcapstonegroup22spring2019.demodb.entities.linechart.Series;

@Component
public class LineChartDbSeeder implements CommandLineRunner {
    @Autowired
    ILineChartRepository lineChartRepo;

    @Override
    public void run(String... args) throws Exception {
        String greenName = "Green";
        Series[] greenSeries = new Series[4];
        greenSeries[0] = new Series(5, 100);
        greenSeries[1] = new Series(10, 250);
        greenSeries[2] = new Series(15, 1500);
        greenSeries[3] = new Series(20, 750);
        greenSeries[4] = new Series(25, 500);
        
        LineChart greenLineChart = new LineChart(greenName, greenSeries);

        String redName = "Red";
        Series[] redSeries = new Series[4];
        redSeries[0] = new Series(5, 150);
        redSeries[1] = new Series(10, 2500);
        redSeries[2] = new Series(15, 150);
        redSeries[3] = new Series(20, 650);
        redSeries[4] = new Series(25, 50);

        LineChart redLineChart = new LineChart(redName, redSeries);

         // delete db data
         lineChartRepo.deleteAll();
         // add db seeds
        List<LineChart> lineCharts = Arrays.asList(greenLineChart, redLineChart);
        lineChartRepo.saveAll(lineCharts);
    }

}