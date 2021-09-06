package com.petclinic.sfgpetclinic.services;

import com.petclinic.sfgpetclinic.models.Vet;

import java.util.Set;

public interface VetService
{
  Vet findById(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();
}
