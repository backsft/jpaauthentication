package dev.danvega.jpasecurity.repository;

import org.springframework.data.repository.CrudRepository;

import dev.danvega.jpasecurity.model.Post;

public interface PostRepository extends CrudRepository<Post,Long> {

}
