package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
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
}
