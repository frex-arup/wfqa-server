package com.wfqa.dat.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wfqa.dat.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	List<User> findByStatus(String status);
	
	Optional<User> findByLoginUserIdAndStatus(String loginUserId, String status);

}
