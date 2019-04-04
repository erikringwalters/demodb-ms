package csumbcapstonegroup22spring2019.demodb.linechart;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import csumbcapstonegroup22spring2019.demodb.entities.linechart.LineChart;

@Repository
public interface ILineChartRepository extends MongoRepository<LineChart, String>{
    @Query (value = "{'id':?0}")
    LineChart findByRepoId(String id);

}