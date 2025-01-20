package com.Repository;

import com.Entity.MovieEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity,Long> {

}
