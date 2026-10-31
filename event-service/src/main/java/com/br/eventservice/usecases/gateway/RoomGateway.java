package com.br.eventservice.usecases.gateway;

import com.br.eventservice.usecases.model.RoomModel;

import java.time.LocalDateTime;

public interface RoomGateway {
    RoomModel findBy(Integer id, LocalDateTime requestUseDateTime);

    boolean allocate(Integer roomId, LocalDateTime startDateTime, LocalDateTime endDateTime);


}
