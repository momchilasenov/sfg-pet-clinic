package com.petclinic.sfgpetclinic.bootstrap;

import com.petclinic.sfgpetclinic.models.Owner;
import com.petclinic.sfgpetclinic.models.Pet;
import com.petclinic.sfgpetclinic.models.PetType;
import com.petclinic.sfgpetclinic.models.Vet;
import com.petclinic.sfgpetclinic.services.OwnerService;
import com.petclinic.sfgpetclinic.services.PetTypeService;
import com.petclinic.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
    owner1.setAddress("213 William str.");
    owner1.setCity("Moscow");
    owner1.setTelephone("32423423423");

    Pet momchilsPet = new Pet();
    momchilsPet.setPetType(savedDogPetType);
    momchilsPet.setOwner(owner1);
    momchilsPet.setBirthDate(LocalDate.now());
    momchilsPet.setName("Kira");
    owner1.getPets().add(momchilsPet);

    Owner owner2 = new Owner();
    owner2.setFirstName("Ivan");
    owner2.setLastName("Petrov");
    owner1.setAddress("213 William str.");
    owner1.setCity("Moscow");
    owner1.setTelephone("32423423423");

    Pet ivansPet = new Pet();
    ivansPet.setPetType(savedDogPetType);
    ivansPet.setOwner(owner2);
    ivansPet.setBirthDate(LocalDate.now());
    ivansPet.setName("Sharo");
    owner2.getPets().add(ivansPet);

    ownerService.save(owner1);
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
