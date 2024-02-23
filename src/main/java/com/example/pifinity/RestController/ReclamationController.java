package com.example.pifinity.RestController;

import com.example.pifinity.Entity.Reclamation;
import com.example.pifinity.Services.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reclamations")


public class ReclamationController {
@Autowired
    private ReclamationService reclamationService;


    @PostMapping("/AddR")
    public Reclamation createReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.add(reclamation);
    }


    @GetMapping("/{id}")
    public Reclamation getReclamationById(@PathVariable int id) {
        return reclamationService.findById(id);
    }

    @GetMapping
    public List<Reclamation> getAllReclamations() {
        return reclamationService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteReclamation(@PathVariable int id) {
        reclamationService.deleteById(id);
    }
    @PutMapping("/{id}")
    public Reclamation updateReclamation(@PathVariable int id, @RequestBody Reclamation updatedReclamation) {
        return reclamationService.updateReclamation(id, updatedReclamation);
    }
}

