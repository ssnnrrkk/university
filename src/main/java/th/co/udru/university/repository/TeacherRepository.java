/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.udru.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.udru.university.model.entity.Teachers;



/**
 *
 * @author SNRKK
 */
public interface TeacherRepository extends JpaRepository<Teachers, Integer> {
    
}
