package com.example.servingwebcontent.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.servingwebcontent.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Long> {
List<Message> findByTag(String tag);
}
