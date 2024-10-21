package ma.emsi.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary implements IEtudiantDAO{
    private Map<String, Etudiant> etudiantsMap = new HashMap<>();

    // Méthode pour ajouter un étudiant
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }

    // Méthode pour récupérer tous les étudiants
    public List<Etudiant> getAllEtudiants() {
        return new ArrayList<>(etudiantsMap.values());
    }

    @Override
    public Etudiant updateEtudiant(String id, Etudiant etudiant) {
        Etudiant existingEtudiant = etudiantsMap.get(id);
        if (existingEtudiant != null) {
            etudiantsMap.put(id, etudiant);
        }
        return etudiant;
    }
}
