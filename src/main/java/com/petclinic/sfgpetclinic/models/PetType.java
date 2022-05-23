package com.petclinic.sfgpetclinic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity
{
  @Column(name = "name")
  private String name;

  public String getName()
  {
    return name;
  }

  public PetType setName(String name)
  {
    this.name = name;
    return this;
  }
}
