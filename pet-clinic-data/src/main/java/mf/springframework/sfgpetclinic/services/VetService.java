package mf.springframework.sfgpetclinic.services;

import mf.springframework.sfgpetclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long Id);

    Vet save (Vet vet);

    Set<Vet> findAll();

}
