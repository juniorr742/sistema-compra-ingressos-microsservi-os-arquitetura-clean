package com.br.eventservice.usecases.gateway;

import com.br.eventservice.entity.Event;
import com.br.eventservice.usecases.model.EventCreatedResponseModel;

import java.util.List;

public interface EventGatway {

    Integer create(Event toCreate);

    boolean exists(String name);

    List<EventCreatedResponseModel> getAll();

    EventCreatedResponseModel findById(Integer eventid);
}
