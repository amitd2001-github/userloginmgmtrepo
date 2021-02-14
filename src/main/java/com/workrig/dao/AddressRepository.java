package com.workrig.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workrig.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
