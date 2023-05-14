package ma.getudiant.etudiant.repositories;

import ma.getudiant.etudiant.modeles.Etudiant;

import java.util.List;

public interface IEtudiantRepository {
    public interface IEtudiant {
        boolean create (Etudiant e);
        boolean update (Etudiant e);
        boolean delete (Etudiant e);
        List<Etudiant> select ();
    }

}
