package com.lab.service;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lab.model.User;

/**
 * author: elumalair
 * date: 05/16/2018
 * upload user:
 *      curl -i -X POST -H "Content-Type:application/json" -d "{ \"name\":\"shilong\"}" http://localhost:8080/rest/user
 * get user with id
 *      curl http://localhost:8080/rest/user/1
 * search user with findByName
 *      curl http://localhost:8080/rest/user/search/findByName?name=shilong
 * the RESTful base url is set in application.properties
 *      spring.data.rest.base-path=/rest
 *
 * HATEOAS, Hypermedia As The Engine Of Application State
 * Alternatives: @RestController, @RepositoryRestController
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRestRepository extends PagingAndSortingRepository<User, Long> {
	List<User> findByName(@Param("name") String name);
}
