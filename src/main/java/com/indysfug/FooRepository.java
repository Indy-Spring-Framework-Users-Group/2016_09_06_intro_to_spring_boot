package com.indysfug;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author matt.rasband
 */
@Repository
public interface FooRepository extends CrudRepository<FooEntity, Long> {
}
