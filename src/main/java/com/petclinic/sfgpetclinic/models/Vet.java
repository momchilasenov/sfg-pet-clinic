package com.petclinic.sfgpetclinic.models;

import java.util.Set;

public class Vet extends Person
{
  private Set<Specialty> specialties;

  public Set<Specialty> getSpecialties()
  {
    return specialties;
  }

  public Vet setSpecialties(Set<Specialty> specialties)
  {
    this.specialties = specialties;
    return this;
  }
}
