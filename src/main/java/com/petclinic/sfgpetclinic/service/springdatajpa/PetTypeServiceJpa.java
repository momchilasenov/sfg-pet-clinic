package com.petclinic.sfgpetclinic.service.springdatajpa;

import com.petclinic.sfgpetclinic.model.PetType;
import com.petclinic.sfgpetclinic.repository.PetTypeRepository;
import com.petclinic.sfgpetclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeServiceJpa implements PetTypeService
{
  private final PetTypeRepository petTypeRepository;

  public PetTypeServiceJpa(PetTypeRepository petTypeRepository)
  {
    this.petTypeRepository = petTypeRepository;
  }

  @Override
  public Set<PetType> findAll()
  {
    Set<PetType> petTypes = new HashSet<>();
    petTypeRepository.findAll().forEach(petTypes::add);
    return petTypes;
  }

  @Override
  public PetType findById(Long aLong)
  {
    return petTypeRepository.findById(aLong).orElse(null);
  }

  @Override
  public PetType save(PetType petType)
  {
    return petTypeRepository.save(petType);
  }

  @Override
  public void delete(PetType petType)
  {
    petTypeRepository.delete(petType);
  }

  @Override
  public void deleteById(Long aLong)
  {
    petTypeRepository.deleteById(aLong);
  }
}
