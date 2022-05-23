package com.petclinic.sfgpetclinic.service;

import com.petclinic.sfgpetclinic.model.Owner;

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
