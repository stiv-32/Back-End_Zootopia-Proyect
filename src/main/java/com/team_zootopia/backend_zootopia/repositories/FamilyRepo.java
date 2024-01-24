package com.team_zootopia.backend_zootopia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.team_zootopia.backend_zootopia.models.ModelFamily;

public interface FamilyRepo extends JpaRepository<ModelFamily, Long>{
    
}
