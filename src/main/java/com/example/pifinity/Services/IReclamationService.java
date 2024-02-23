package com.example.pifinity.Services;

import com.example.pifinity.Entity.Reclamation;
import com.example.pifinity.Services.ReclamationService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Set;

public interface IReclamationService {
    Reclamation add(Reclamation reclamation);
    Reclamation findById(int id);
    List<Reclamation> findAll();
    Reclamation updateReclamation(int id, Reclamation newReclamationData);
    void deleteById(int id);
}