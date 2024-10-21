package ma.emsi.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EtudiantDAO implements IEtudiantDAO{
    private List<Etudiant> etudiants = new ArrayList<>();


    // Méthode pour ajouter un nouvel étudiant
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    // Méthode pour récupérer tous les étudiants
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    @Override
    public Etudiant updateEtudiant(String id, Etudiant etudiant) {
        return null;
    }


}
