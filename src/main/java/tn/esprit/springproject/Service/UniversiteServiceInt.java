package tn.esprit.springproject.Service;

import tn.esprit.springproject.Model.Universite;

import java.util.List;

public interface UniversiteServiceInt {

    List<Universite> retrieveAllUniversities();

    Universite addUniversity (Universite u);

    Universite updateUniversity (Universite u);

    Universite retrieveUniversity (long idUniversity);

}
