package co.develhope.demo2.repositories;

import co.develhope.demo2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("questa è la descrizione"))
public interface ProgrammingRepo extends JpaRepository<ProgrammingLanguage, Long> {

}
