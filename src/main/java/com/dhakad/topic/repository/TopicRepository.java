package com.dhakad.topic.repository;

import com.dhakad.topic.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,Long> {

}
