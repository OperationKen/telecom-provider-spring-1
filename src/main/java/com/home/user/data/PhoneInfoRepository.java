package com.home.user.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.home.user.beans.PhoneInfo;
import com.home.user.beans.User;


@Repository
public interface PhoneInfoRepository extends JpaRepository<PhoneInfo, Integer> {


}
