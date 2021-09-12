package com.petclinic.sfgpetclinic.bootstrap;

import com.petclinic.sfgpetclinic.models.Owner;
import com.petclinic.sfgpetclinic.models.Vet;
import com.petclinic.sfgpetclinic.services.OwnerService;
import com.petclinic.sfgpetclinic.services.VetService;
import com.petclinic.sfgpetclinic.services.map.OwnerServiceMap;
import com.petclinic.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService)
  {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) throws Exception
  {
    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Momchil");
    owner1.setLastName("Asenov");
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setId(2L);
    owner2.setFirstName("Ivan");
    owner2.setLastName("Petrov");
    ownerService.save(owner2);

    System.out.println("Loaded Owners");

    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Georgi");
    vet1.setLastName("Ivanov");
    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setId(2L);
    vet2.setFirstName("Sam");
    vet2.setLastName("Hes");
    vetService.save(vet2);

    System.out.println("Loaded Vets");

  }
}
