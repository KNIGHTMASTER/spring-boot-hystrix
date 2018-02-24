package com.zisal.springboothystrix.service;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2/23/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface EmployeeRepo extends JpaRepository<EmployeeData, Long> {
}
