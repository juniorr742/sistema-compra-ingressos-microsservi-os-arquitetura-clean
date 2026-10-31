package com.br.eventservice.usecases.input;

import com.br.eventservice.entity.Event;
import com.br.eventservice.usecases.model.EventCreatedResponseModel;

public interface CreateEventInputBoundary {

   EventCreatedResponseModel execute(Event toCreate);

}
