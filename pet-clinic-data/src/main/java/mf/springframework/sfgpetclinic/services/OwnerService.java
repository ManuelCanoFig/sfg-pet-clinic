package mf.springframework.sfgpetclinic.services;

import mf.springframework.sfgpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
