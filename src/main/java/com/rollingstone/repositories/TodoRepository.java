package com.rollingstone.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.rollingstone.domain.Todo;

public interface TodoRepository extends PagingAndSortingRepository<Todo, Long>{

}
