package com.br.eventservice.unit;

import com.br.eventservice.entity.Event;
import com.br.eventservice.entity.Session;
import com.br.eventservice.entity.valueObject.Validity;
import com.br.eventservice.usecases.model.RoomModel;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Utils {

    public static RoomModel createRoomModel(String name, Integer totalSeats, Boolean exists, Boolean isAvailable) {
        return new RoomModel(name, totalSeats, exists, isAvailable);
    }

    public static Session createSession(String name, LocalDateTime startLocalDate, LocalDateTime endLocalDate, Integer roomId, Map<Integer, Integer> ticketTypesByQtd){
        Session session = new Session();
        session.setName(name);
        session.setStartDateTime(startLocalDate);
        session.setEndDateTime(endLocalDate);
        session.setRoomId(roomId);
        session.setTicketTypeIdsByQtd(ticketTypesByQtd);
        return session;
    }

    public static Event createEvent(List<Session> sessions, Validity validity) {
        return new Event(1, "Evento", validity, sessions);
    }
}
