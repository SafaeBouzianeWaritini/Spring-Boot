package ma.ensaf.person.dao;

import ma.ensaf.person.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
    List<Personne> findByNom(String nom);
    List<Personne> findByNomAndPrenom(String nom, String prenom);

    @Query("select p from Personne p where p.prenom = ?1")
    List<Personne> chercherSelonLePrenom(String prenom);
}
