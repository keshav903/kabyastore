package com.kabya.store.repository;

import com.kabya.store.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByUserName(String name);
}
