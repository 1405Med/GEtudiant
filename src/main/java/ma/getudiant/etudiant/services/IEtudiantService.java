package ma.getudiant.etudiant.services;

import ma.getudiant.etudiant.modeles.Etudiant;

import java.util.List;

public interface IEtudiantService  {
    boolean create (Etudiant e);
    boolean update (Etudiant e);
    boolean delete (Long id);
    List<Etudiant> select ();

}
