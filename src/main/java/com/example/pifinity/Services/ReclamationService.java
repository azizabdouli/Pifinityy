package com.example.pifinity.Services;

import com.example.pifinity.Entity.Reclamation;
import com.example.pifinity.Repository.ReclamationRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
//injection par constructeur
@Service
public class ReclamationService implements IReclamationService {

@Autowired
    private ReclamationRepository reclamationRepository;

    @Override
    public Reclamation add(Reclamation reclamation) {
        return reclamationRepository.save(reclamation);
    }


    public Reclamation findById(int id) {
        return reclamationRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Reclamation not found"));
    }

    public List<Reclamation> findAll() {
        return reclamationRepository.findAll();
    }
    public Reclamation updateReclamation(int id, Reclamation newReclamationData) {
        if (reclamationRepository.existsById(id)) {
            newReclamationData.setId(id); // Assurez-vous que l'ID de la nouvelle réclamation est correct
            return reclamationRepository.save(newReclamationData);
        } else {
            return null; // Ou lancez une exception selon votre cas d'utilisation
        }
    }

    public void deleteById(int id) {
        reclamationRepository.deleteById(id);
    }
}