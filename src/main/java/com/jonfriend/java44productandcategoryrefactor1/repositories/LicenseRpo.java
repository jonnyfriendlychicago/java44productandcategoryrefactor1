package com.jonfriend.java44productandcategoryrefactor1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java44productandcategoryrefactor1.models.LicenseMdl;

@Repository
public interface LicenseRpo extends CrudRepository<LicenseMdl, Long> {
	List<LicenseMdl> findAll(); 
}
