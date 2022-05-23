package com.petclinic.sfgpetclinic.repository;

import com.petclinic.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>
{
}
