package com.bhawana.development.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhawana.development.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
