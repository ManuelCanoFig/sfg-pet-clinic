package mf.springframework.sfgpetclinic.services;

import mf.springframework.sfgpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long Id);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
