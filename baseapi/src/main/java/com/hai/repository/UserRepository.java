package com.hai.repository;

import com.hai.entity.BaseUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by haipv on 3/26/2018.
 *
 * @version 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<BaseUser, Long> {
//    @Query("SELECT DISTINCT BaseUser FROM BaseUser user " +
//            "INNER JOIN FETCH user.roles AS authorities " +
//            "WHERE user.userName = :username")
//    BaseUser findByUsername(@Param("username") String username);
    BaseUser findByUserName(String userName);
}
