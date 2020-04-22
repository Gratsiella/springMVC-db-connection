
package com.grats.assignment02.services;

import com.grats.assignment02.entities.Trainers;
import com.grats.assignment02.repositories.TrainerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TrainerInterfaceImplementation implements TrainerInterface{
    
    @Autowired
    TrainerRepo trRepo;

    @Override
    public void insertTrainer(Trainers t) {
        trRepo.save(t);
    }

    @Override
    public void updateTrainer(Trainers t) {
        trRepo.save(t);
    }

    @Override
    public void deleteTrainer(Integer id) {
        trRepo.deleteById(id);
    }

    @Override
    public List<Trainers> getAllTrainers() {
        return trRepo.findAll();
    }

    @Override
    public Trainers getTrainerById(Integer id) {
        return trRepo.getOne(id);
    }
    
}
