package com.petclinic.sfgpetclinic.service.map;

import com.petclinic.sfgpetclinic.model.Visit;
import com.petclinic.sfgpetclinic.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService
{
  @Override
  public Set<Visit> findAll()
  {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id)
  {
    super.deleteById(id);
  }

  @Override
  public void delete(Visit object)
  {
    super.delete(object);
  }

  @Override
  public Visit save(Visit visit)
  {
    if (visit.getPet() == null || visit.getPet().getId() == null){
      throw new RuntimeException("Invalid Pet in Visit");
    }
    if(visit.getPet().getOwner() == null || visit.getPet().getOwner().getId() == null){
      throw new RuntimeException("Invalid Owner in Visit");
    }
    return super.save(visit);
  }

  @Override
  public Visit findById(Long id)
  {
    return super.findById(id);
  }
}
