package com.petclinic.sfgpetclinic.bootstrap;

import com.petclinic.sfgpetclinic.model.*;
import com.petclinic.sfgpetclinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner
{
  private final OwnerService     ownerService;
  private final VetService       vetService;
  private final PetTypeService   petTypeService;
  private final SpecialtyService specialtyService;
  private final VisitService     visitService;

  public DataLoader(OwnerService ownerService,
                    VetService vetService,
                    PetTypeService petTypeService,
                    SpecialtyService specialtyService,
                    VisitService visitService)
  {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
    this.specialtyService = specialtyService;
    this.visitService = visitService;
  }

  @Override
  public void run(String... args) throws Exception
  {
    int count = petTypeService.findAll().size();

    if (count == 0) {
      loadData();
    }
  }

  private void loadData()
  {
    PetType dog = new PetType();
    dog.setName("Dog");
    PetType savedDogPetType = petTypeService.save(dog);

    PetType cat = new PetType();
    cat.setName("Cat");
    PetType savedCatPetType = petTypeService.save(cat);

    Specialty radiology = new Specialty();
    radiology.setDescription("Radiology");
    Specialty savedRadiology = specialtyService.save(radiology);

    Specialty surgery = new Specialty();
    radiology.setDescription("Surgery");
    Specialty savedSurgery = specialtyService.save(surgery);

    Specialty dentistry = new Specialty();
    radiology.setDescription("Dentistry");
    Specialty savedDentistry = specialtyService.save(dentistry);

    System.out.println("Loaded Pet Types...");

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
    System.out.println("Loaded Owners...");

    Visit catVisit = new Visit();
    catVisit.setPet(ivansPet);
    catVisit.setDate(LocalDate.now());
    catVisit.setDescription("Cat Visit");

    Vet vet1 = new Vet();
    vet1.setFirstName("Georgi");
    vet1.setLastName("Ivanov");
    vet1.getSpecialties().add(savedRadiology);
    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Sam");
    vet2.setLastName("Hes");
    vet2.getSpecialties().add(savedSurgery);
    vetService.save(vet2);

    System.out.println("Loaded Vets...");
  }
}
