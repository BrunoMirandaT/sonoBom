package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColchaoRepository extends JpaRepository<entities.Colchao , Long> {

}
