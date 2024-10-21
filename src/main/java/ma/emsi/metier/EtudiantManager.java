package ma.emsi.metier;

import ma.emsi.dao.Etudiant;
import ma.emsi.dao.EtudiantDAO;
import ma.emsi.dao.EtudiantDAODictionary;
import ma.emsi.dao.IEtudiantDAO;

import java.util.List;

public class EtudiantManager {
   private EtudiantDAO etudiantDAO = new EtudiantDAO();

    public EtudiantManager(IEtudiantDAO etudiantDAO) {
        this.etudiantDAO = (EtudiantDAO) etudiantDAO;
    }





    public EtudiantManager(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    // Méthode pour ajouter un étudiant avec vérification de l'email
    public Etudiant addEtudiant(Etudiant etudiant) {
        for (Etudiant e : etudiantDAO.getAllEtudiants()) {
            if (e.getEmail().equals(etudiant.getEmail())) {
                System.out.println("Email déjà utilisé !");
                return null;
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }

    // Méthode pour récupérer tous les étudiants
    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
}
