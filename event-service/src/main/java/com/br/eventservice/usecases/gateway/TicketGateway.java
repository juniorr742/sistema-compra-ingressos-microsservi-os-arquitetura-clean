package com.br.eventservice.usecases.gateway;

import com.br.eventservice.usecases.model.TicketModel;

public interface TicketGateway {

    TicketModel findBy(Integer id);
}
