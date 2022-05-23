package com.petclinic.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialty")
public class Specialty extends BaseEntity
{
  private String description;

  public String getDescription()
  {
    return description;
  }

  public Specialty setDescription(String description)
  {
    this.description = description;
    return this;
  }
}
