package com.wfqa.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wfqa.common.entity.DAT_User;

@Repository
public interface UserRepository extends JpaRepository<DAT_User, String> {
	
	List<DAT_User> findByStatus(String status);

}
