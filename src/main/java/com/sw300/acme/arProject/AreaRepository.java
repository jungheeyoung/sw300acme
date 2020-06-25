package com.sw300.acme.arProject;

import com.sw300.acme.clazz.ClassDay;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "area", path = "areas")
public interface AreaRepository extends PagingAndSortingRepository<Area, Long> {
}