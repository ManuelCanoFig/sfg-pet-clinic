package mf.springframework.sfgpetclinic.services;

import mf.springframework.sfgpetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
