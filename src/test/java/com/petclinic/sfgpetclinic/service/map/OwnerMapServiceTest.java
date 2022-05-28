package com.petclinic.sfgpetclinic.service.map;

import com.petclinic.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

class OwnerMapServiceTest
{
  private final long OWNER_ID = 1L;

  OwnerMapService ownerMapService;

  @BeforeEach
  void setUp()
  {
    ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
    ownerMapService.save(Owner.builder().id(1L).build());
  }

  @Test
  void findAll()
  {
    Set<Owner> owners = ownerMapService.findAll();
    assertEquals(1, owners.size());

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
    Owner owner = ownerMapService.findById(OWNER_ID);
    assertEquals(owner.getId(), OWNER_ID);
  }

  @Test
  void findByLastName()
  {
  }
}