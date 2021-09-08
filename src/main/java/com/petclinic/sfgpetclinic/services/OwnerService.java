package com.petclinic.sfgpetclinic.services;

import com.petclinic.sfgpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>
{
  Owner findByLastName(String lastName);

  //methods inherited from CrudService
//  Owner findById(Long id);
//
//  Owner save(Owner owner);
//
//  Set<Owner> findAll();
}
