package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SystemOptionRepository extends JpaRepository<SystemOption, Integer> {

=======
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
public interface SystemOptionRepository extends JpaRepository<SystemOption, Integer> {
    Page<SystemOption> findAll(Pageable pageable);

    Page<SystemOption> findSystemOptionsByOptionCodeEquals(String optionCode,Pageable pageable);

    Page<SystemOption> findSystemOptionsByOptionValueContains(String optionValue,Pageable pageable);

    Page<SystemOption> findSystemOptionsByOptionValueContainsAndOptionCodeEquals(String optionValue,String optionCode,Pageable pageable);
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2

}
