package com.petclinic.sfgpetclinic.service.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OwnerServiceMapTest
{
  OwnerMapService ownerMapService;

  @BeforeEach
  void setUp()
  {
    ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

  }

  @Test
  void findAll()
  {
  }

  @Test
  void deleteById()
  {
  }

  @Test
  void delete()
  {
  }

  @Test
  void save()
  {
  }

  @Test
  void findById()
  {
  }

  @Test
  void findByLastName()
  {
  }
}