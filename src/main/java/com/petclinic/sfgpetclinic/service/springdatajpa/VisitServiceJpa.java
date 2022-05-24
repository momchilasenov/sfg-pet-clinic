package com.petclinic.sfgpetclinic.service.springdatajpa;

import com.petclinic.sfgpetclinic.model.Visit;
import com.petclinic.sfgpetclinic.repository.VisitRepository;
import com.petclinic.sfgpetclinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitServiceJpa implements VisitService
{
  private final VisitRepository visitRepository;

  public VisitServiceJpa(VisitRepository visitRepository)
  {
    this.visitRepository = visitRepository;
  }

  @Override
  public Set<Visit> findAll()
  {
    Set<Visit> visits = new HashSet<>();
    visitRepository.findAll().forEach(visits::add);
    return visits;
  }

  @Override
  public Visit findById(Long aLong)
  {
    return visitRepository.findById(aLong).orElse(null);
  }

  @Override
  public Visit save(Visit visit)
  {
    return visitRepository.save(visit);
  }

  @Override
  public void delete(Visit visit)
  {
    visitRepository.delete(visit);
  }

  @Override
  public void deleteById(Long aLong)
  {
    visitRepository.deleteById(aLong);
  }
}
