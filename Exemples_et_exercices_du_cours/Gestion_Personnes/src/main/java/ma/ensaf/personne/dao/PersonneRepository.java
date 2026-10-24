package ma.ensaf.personne.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ma.ensaf.personne.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
	
	// Recherche par nom et prénom
   List<Personne> findByNomAndPrenom(String nom, String prenom);
    
    // Recherche uniquement par nom
    List<Personne> findByNom(String nom);
    
    @Query("select p from Personne p where p.prenom = ?1")
    List<Personne> chercherSelonLePrenom(String prenom);
}
