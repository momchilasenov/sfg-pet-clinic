package com.petclinic.sfgpetclinic.service.springdatajpa;

import com.petclinic.sfgpetclinic.model.Owner;
import com.petclinic.sfgpetclinic.repository.OwnerRepository;
import com.petclinic.sfgpetclinic.repository.PetRepository;
import com.petclinic.sfgpetclinic.repository.PetTypeRepository;
import com.petclinic.sfgpetclinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerServiceJpa implements OwnerService
{
  private final OwnerRepository   ownerRepository;
  private final PetRepository     petRepository;
  private final PetTypeRepository petTypeRepository;

  public OwnerServiceJpa(OwnerRepository ownerRepository,
                         PetRepository petRepository,
                         PetTypeRepository petTypeRepository)
  {
    this.ownerRepository = ownerRepository;
    this.petRepository = petRepository;
    this.petTypeRepository = petTypeRepository;
  }

  @Override
  public Set<Owner> findAll()
  {
    Set<Owner> owners = new HashSet<>();
    ownerRepository.findAll().forEach(owners::add);
    return owners;
  }

  @Override
  public Owner findById(Long aLong)
  {
    return ownerRepository.findById(aLong).orElse(null);
  }

  @Override
  public Owner save(Owner object)
  {
    return ownerRepository.save(object);
  }

  @Override
  public void delete(Owner object)
  {
    ownerRepository.delete(object);
  }

  @Override
  public void deleteById(Long aLong)
  {
    ownerRepository.deleteById(aLong);
  }

  @Override
  public Owner findByLastName(String lastName)
  {
    return ownerRepository.findByLastName(lastName);
  }
}
