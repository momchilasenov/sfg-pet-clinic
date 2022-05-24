package com.petclinic.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person
{
  @Builder
  public Owner(Long id, String firstName, String lastName,
               String address, String city, String telephone, Set<Pet> pets)
  {
    super(id, firstName, lastName);
    this.address = address;
    this.city = city;
    this.telephone = telephone;
    this.pets = pets;
  }

  @Column(name = "address")
  private String   address;

  @Column(name = "city")
  private String   city;

  @Column(name = "telephone")
  private String   telephone;

  //1 owner can have many pets. If an owner is deleted, changes are cascaded and all pets are deleted
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
  private Set<Pet> pets = new HashSet<>();
}
