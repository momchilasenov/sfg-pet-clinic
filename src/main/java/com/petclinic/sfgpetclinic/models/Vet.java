package com.petclinic.sfgpetclinic.models;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person
{
  private Set<Speciality> specialties = new HashSet<>();

  public Set<Speciality> getSpecialties()
  {
    return specialties;
  }

  public Vet setSpecialties(Set<Speciality> specialties)
  {
    this.specialties = specialties;
    return this;
  }
}
