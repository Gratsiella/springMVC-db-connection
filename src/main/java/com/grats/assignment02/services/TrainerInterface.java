/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grats.assignment02.services;

import com.grats.assignment02.entities.Trainers;
import java.util.List;

/**
 *
 * @author gkalf
 */
public interface TrainerInterface {
    
    void insertTrainer(Trainers t);
    void updateTrainer(Trainers t);
    void deleteTrainer(Integer id);
    List<Trainers> getAllTrainers();
    Trainers getTrainerById(Integer id);
    
    
}
