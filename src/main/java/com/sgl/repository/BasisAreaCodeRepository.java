package com.sgl.repository;

import com.sgl.model.BasisAreaCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: john
 * @version: 1.0 2014-05-29 13:38
 */
@Repository
public interface BasisAreaCodeRepository extends CrudRepository<BasisAreaCode, String>, PagingAndSortingRepository<BasisAreaCode, String> {

}
