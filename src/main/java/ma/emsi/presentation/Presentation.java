package ma.emsi.presentation;

import ma.emsi.dao.Etudiant;
import ma.emsi.dao.EtudiantDAO;
import ma.emsi.metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args) {
        EtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        // Ajouter 4 étudiants
        etudiantManager.addEtudiant(new Etudiant("1", "Nom1", "Prenom1", "email1@example.com"));
        etudiantManager.addEtudiant(new Etudiant("2", "Nom2", "Prenom2", "email2@example.com"));
        etudiantManager.addEtudiant(new Etudiant("3", "Nom3", "Prenom3", "email3@example.com"));
        etudiantManager.addEtudiant(new Etudiant("4", "Nom4", "Prenom4", "email4@example.com"));

        // Afficher tous les étudiants
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }
    }
}
