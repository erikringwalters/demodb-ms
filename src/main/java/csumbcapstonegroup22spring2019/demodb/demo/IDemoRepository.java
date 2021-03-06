package csumbcapstonegroup22spring2019.demodb.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import csumbcapstonegroup22spring2019.demodb.entities.hero.*;

@Repository
public interface IDemoRepository extends MongoRepository<Hero, String> {
    @Query (value = "{'id':?0}")
    Hero findByRepoId(String id);

    @Query (value = "{'powers.powers':?0}")
    List<Hero> findByPower(String name);

}