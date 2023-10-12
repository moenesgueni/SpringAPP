package tn.esprit.springproject.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Model.Foyer;
import tn.esprit.springproject.Repository.FoyerRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FoyerService implements FoyerServiceInt{
    @Autowired
    private final FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        foyerRepository.save(f);
        return f;
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        if (foyerRepository.findById(f.getIdFoyer()).isPresent()){
            foyerRepository.save(f);
        }
        return f;
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        if (foyerRepository.findById(idFoyer).isPresent()){
            foyerRepository.deleteById(idFoyer);
        }


    }
}
