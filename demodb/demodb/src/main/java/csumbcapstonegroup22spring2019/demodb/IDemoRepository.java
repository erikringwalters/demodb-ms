package csumbcapstonegroup22spring2019.demodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import csumbcapstonegroup22spring2019.demodb.entities.Hero;

@Repository
public interface IDemoRepository extends MongoRepository<Hero, String>{
    

}
