/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grats.assignment02.repositories;

import com.grats.assignment02.entities.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gkalf
 */
@Repository
public interface TrainerRepo extends JpaRepository<Trainers, Integer>{
    
}
