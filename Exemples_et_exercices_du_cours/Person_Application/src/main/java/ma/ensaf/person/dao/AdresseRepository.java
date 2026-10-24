package ma.ensaf.person.dao;

import ma.ensaf.person.model.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
}
