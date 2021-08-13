package com.home.user.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.user.beans.Plans;

@Repository
public interface PlansRepository extends JpaRepository<Plans, Integer>{

}
