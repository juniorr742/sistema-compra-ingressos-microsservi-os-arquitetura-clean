package com.br.eventservice.usecases.input.Impl;

import com.br.eventservice.entity.Event;
import com.br.eventservice.usecases.gateway.RoomGateway;
import com.br.eventservice.usecases.gateway.TicketGateway;
import com.br.eventservice.usecases.input.CreateEventInputBoundary;
import com.br.eventservice.usecases.model.EventCreatedResponseModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateEventInteractor implements CreateEventInputBoundary {

    private final RoomGateway roomGateway;
    private final TicketGateway ticketGateway;

    @Override
    public EventCreatedResponseModel execute(Event toCreate) {
        return null;
    }
}
