package springfox.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springfox.poc.hibernate.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonRepository extends CrudRepository<Person, Long> {


}
