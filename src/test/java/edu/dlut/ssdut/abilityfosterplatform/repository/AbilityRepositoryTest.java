package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Ability;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AbilityRepositoryTest {

    @Autowired
    private AbilityRepository abilityRepository;

    @Test
    public void findAbilitiesBySubjectId() {
        PageRequest request = PageRequest.of(0, 5);
        Page<Ability> page = abilityRepository.findAbilitiesBySubjectId(3, request);
        System.out.println("总数据条数 " + page.getTotalElements());
        System.out.println("总页数 " + page.getTotalPages());
        for (Ability ability : page.getContent()) {
            System.out.println(ability);
        }
    }
}