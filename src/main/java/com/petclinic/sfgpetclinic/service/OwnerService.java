package com.petclinic.sfgpetclinic.service;

import com.petclinic.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>
{
  Owner findByLastName(String lastName);
}

