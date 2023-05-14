package ma.getudiant.etudiant.controllers;

import ma.getudiant.etudiant.modeles.Etudiant;
import ma.getudiant.etudiant.services.EtudiantServiceImpl;
import ma.getudiant.etudiant.services.IEtudiantService;

public class EtudiantController {
    IEtudiantService e = (IEtudiantService) new EtudiantServiceImpl();

    public boolean create (Etudiant O){
        System.out.println("Controller: create: Etudiant"+O);
        return  e.create(O);

    }
    public boolean update (Etudiant O){
        System.out.println("Controller: update: Etudiant"+O);
        return  e.update(O);

    }

    public boolean delete (Long id){
        System.out.println("Controller: delete: Long"+id);
        return  e.delete(id);

    }

}
