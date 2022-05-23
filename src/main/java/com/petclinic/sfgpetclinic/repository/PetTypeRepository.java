package com.petclinic.sfgpetclinic.repository;

import com.petclinic.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long>
{
}
