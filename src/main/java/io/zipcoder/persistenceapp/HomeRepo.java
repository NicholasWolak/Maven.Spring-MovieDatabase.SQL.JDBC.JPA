package io.zipcoder.persistenceapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepo extends CrudRepository<Home, Long> {

}