package com.petclinic.sfgpetclinic.services;

import com.petclinic.sfgpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService
{
  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Owner save(Owner owner);

  Set<Owner> findAll();
}
