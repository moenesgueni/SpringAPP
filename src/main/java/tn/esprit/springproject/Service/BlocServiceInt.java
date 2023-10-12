package tn.esprit.springproject.Service;

import tn.esprit.springproject.Model.Bloc;

import java.util.List;

public interface BlocServiceInt {
    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long  idBloc);

    void removeBloc (long idBloc);

}
