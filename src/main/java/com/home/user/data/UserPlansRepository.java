package com.home.user.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.user.beans.UserPlans;

@Repository
public interface UserPlansRepository extends JpaRepository<UserPlans, Integer>{

}
