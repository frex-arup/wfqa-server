package com.wfqa.dat.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wfqa.dat.entity.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {

    Optional<Site> findByIdAndTypeAndStatus(Long id, String type, String status);
    List<Site> findByTypeAndStatus(String type, String status);
}
