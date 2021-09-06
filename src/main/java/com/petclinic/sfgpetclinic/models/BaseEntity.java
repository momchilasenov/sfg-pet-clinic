package com.petclinic.sfgpetclinic.models;

import java.io.Serializable;

public class BaseEntity implements Serializable
{
  private Long id;

  public Long getId()
  {
    return id;
  }

  public BaseEntity setId(Long id)
  {
    this.id = id;
    return this;
  }
}
