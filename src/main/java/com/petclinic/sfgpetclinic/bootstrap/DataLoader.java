package com.petclinic.sfgpetclinic.bootstrap;

import com.petclinic.sfgpetclinic.models.Owner;
import com.petclinic.sfgpetclinic.models.PetType;
import com.petclinic.sfgpetclinic.models.Vet;
import com.petclinic.sfgpetclinic.services.OwnerService;
import com.petclinic.sfgpetclinic.services.PetTypeService;
import com.petclinic.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
  private final OwnerService   ownerService;
  private final VetService     vetService;
  private final PetTypeService petTypeService;

  public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService)
  {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
  }

  @Override
  public void run(String... args) throws Exception
  {
    PetType dog = new PetType();
    dog.setName("Dog");
    PetType savedDogPetType = petTypeService.save(dog);

    PetType cat = new PetType();
    cat.setName("Cat");
    PetType savedCatPetType = petTypeService.save(cat);

    System.out.println("Loaded Pet Types");

    Owner owner1 = new Owner();
    owner1.setFirstName("Momchil");
    owner1.setLastName("Asenov");
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Ivan");
    owner2.setLastName("Petrov");
    ownerService.save(owner2);

    System.out.println("Loaded Owners");

    Vet vet1 = new Vet();
    vet1.setFirstName("Georgi");
    vet1.setLastName("Ivanov");
    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Sam");
    vet2.setLastName("Hes");
    vetService.save(vet2);

    System.out.println("Loaded Vets");

  }
}
