package ma.getudiant.etudiant.services;

import ma.getudiant.etudiant.modeles.Etudiant;
import ma.getudiant.etudiant.repositories.EtudiantRepositoryImpl;
import ma.getudiant.etudiant.repositories.IEtudiantRepository;


import java.util.List;

public class EtudiantServiceImpl implements IEtudiantRepository {
    IEtudiantRepository r=new EtudiantRepositoryImpl();
    public boolean create (Etudiant e){
        System.out.println("Service; Create; Etudiant"+e);
        n.create(e);
        return true;
    }
    public boolean update (Etudiant e){
        System.out.println("Service; update; Etudiant"+e);
        n.create(e);
        return true;
    }
    public boolean delete (Long id){
        System.out.println("Service; delete; Long"+id);
        return true;
    }
    public List<Etudiant> select(){
        return null;
    }

}
