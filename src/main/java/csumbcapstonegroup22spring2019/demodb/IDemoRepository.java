package csumbcapstonegroup22spring2019.demodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import csumbcapstonegroup22spring2019.demodb.entities.hero.Hero;
// import csumbcapstonegroup22spring2019.demodb.entities.linechart.LineChart;

@Repository
public interface IDemoRepository extends MongoRepository<Hero, String>{
    @Query (value = "{'id':?0}")
    Hero findByRepoId(String id);

    @Query (value = "{'powers.powers':?0}")
    List<Hero> findByPower(String name);

    // @Query (value = "{'chart.id':?0}")
    // LineChart findByLineChartId(String id);

}
