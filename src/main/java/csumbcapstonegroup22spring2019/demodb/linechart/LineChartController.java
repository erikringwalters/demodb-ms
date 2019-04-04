// package csumbcapstonegroup22spring2019.demodb.linechart;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;

// import csumbcapstonegroup22spring2019.demodb.entities.linechart.LineChart;


// @RestController
// public class LineChartController {
//     @Autowired
//     ILineChartRepository lineChartRepository;

//     @GetMapping (value = "/allLineChartData", produces="application/json")
//     public List<LineChart> getAll() {
//         List<LineChart> result = lineChartRepository.findAll();
//         return result;
//     }

//     // @GetMapping(value = "/id/{id}", produces="application/json")
//     // public Hero getHeroById (@PathVariable String id) {
//     //     Hero result = lineChartRepository.findByRepoId(id);
//     //     return result;
//     // }

//     // @GetMapping(value = "/power/{power}", produces="application/json")
//     // public List<Hero> getByPower (@PathVariable String power) {
//     //     List<Hero> result = lineChartRepository.findByPower(power);
//     //     return result;
//     // }
// }