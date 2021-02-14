package com.nesho.bookstoreangular.repository;

import com.nesho.bookstoreangular.domain.UserShipping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserShippingRepository extends CrudRepository<UserShipping, Long> {
}
