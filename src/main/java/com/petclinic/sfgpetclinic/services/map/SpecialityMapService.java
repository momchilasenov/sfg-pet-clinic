package com.petclinic.sfgpetclinic.services.map;

import com.petclinic.sfgpetclinic.models.Speciality;
import com.petclinic.sfgpetclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService
{
  @Override
  public Set<Speciality> findAll()
  {
    return super.findAll();
  }

  @Override
  public Speciality findById(Long id)
  {
    return super.findById(id);
  }

  @Override
  public Speciality save(Speciality object)
  {
    return super.save(object);
  }

  @Override
  public void delete(Speciality object)
  {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id)
  {
    super.deleteById(id);
  }
}
