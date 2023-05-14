package ma.getudiant.etudiant.repositories;

import ma.getudiant.etudiant.modeles.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class EtudiantRepositoryImpl implements IEtudiantRepository {

    List<Etudiant> data = new ArrayList<>();
    public boolean create (Etudiant e){
        System.out.println("Repository : Create : Etudiant"+e);
        data.add(e);
        System.out.println("DATA"+data);
        return true;

    }
    public boolean update (Etudiant e){
        System.out.println("Repository : update : Etudiant"+e);
        System.out.println("DATA"+data);
        return true;

    }
    public boolean delete (Long id){
        System.out.println("Repository : delete : Long"+id);
        System.out.println("DATA"+data);
        return true;

    }
    public List<Etudiant> select(){
        return null;
    }
}
