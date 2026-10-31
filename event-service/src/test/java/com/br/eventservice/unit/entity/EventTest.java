package com.br.eventservice.unit.entity;

import com.br.eventservice.entity.Event;
import com.br.eventservice.entity.Session;
import com.br.eventservice.entity.valueObject.Validity;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static com.br.eventservice.unit.Utils.createEvent;
import static com.br.eventservice.unit.Utils.createSession;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventTest {

    @Test
    public void given_Even_whenSessionsAreInEventDateRange_should_return_true() {

        //Given

        LocalDateTime sessionOneStartLocalDateTime = LocalDateTime.of(2024, 2, 3, 0, 0, 0, 0);
        LocalDateTime sessionOneEndtLocalDateTime = LocalDateTime.of(2024, 2, 3, 2, 0, 0, 0);
        LocalDateTime sessionTwoStartLocalDateTime = LocalDateTime.of(2024, 2, 7, 0, 0, 0, 0);
        LocalDateTime sessionTwoEndLocalDateTime = LocalDateTime.of(2024, 2, 7, 2, 0, 0, 0);


        Session sessionOne = createSession("Sessao 1", sessionOneStartLocalDateTime, sessionOneEndtLocalDateTime, 1, Map.of(1, 10));
        Session sessionTwo = createSession("Sessao 2", sessionTwoStartLocalDateTime, sessionTwoEndLocalDateTime, 2, Map.of(2, 5));

        Event toCreate = createEvent(List.of(sessionOne, sessionTwo), new Validity(
                LocalDateTime.of(2024, 1, 1, 0, 0, 0),
                LocalDateTime.of(2024, 3, 1, 0, 0, 0)
        ));

        //When

        boolean areValidSessions = toCreate.areValidSessionsDateRange();

        //Then

        assertTrue(areValidSessions);
    }

    @Test
    public void given_Event_whenSessionAreNotInEventDateRange_should_return_false() {

        //Given


        LocalDateTime sessionOneStartLocalDateTime = LocalDateTime.of(2024, 2, 3, 0, 0, 0, 0);
        LocalDateTime sessionOneEndtLocalDateTime = LocalDateTime.of(2024, 2, 3, 2, 0, 0, 0);
        LocalDateTime sessionTwoStartLocalDateTime = LocalDateTime.of(2024, 2, 7, 0, 0, 0, 0);
        LocalDateTime sessionTwoEndLocalDateTime = LocalDateTime.of(2024, 2, 7, 2, 0, 0, 0);


        Session sessionOne = createSession("Sessao 1", sessionOneStartLocalDateTime, sessionOneEndtLocalDateTime, 1, Map.of(1, 10));
        Session sessionTwo = createSession("Sessao 2", sessionTwoStartLocalDateTime, sessionTwoEndLocalDateTime, 2, Map.of(2, 5));

        Event toCreate = createEvent(List.of(sessionOne, sessionTwo), new Validity(
                LocalDateTime.of(2024, 4, 1, 0, 0, 0),
                LocalDateTime.of(2024, 5, 1, 0, 0, 0)
        ));

        //When

        boolean areValidSessions = toCreate.areValidSessionsDateRange();

        //Then

        assertFalse(areValidSessions);
    }

    @Test
    public void given_Event_whenEventIsValidity_should_return_true() {

        //Given


        LocalDateTime sessionOneStartLocalDateTime = LocalDateTime.of(2024, 4, 3, 0, 0, 0, 0);
        LocalDateTime sessionOneEndtLocalDateTime = LocalDateTime.of(2024, 4, 3, 2, 0, 0, 0);
        LocalDateTime sessionTwoStartLocalDateTime = LocalDateTime.of(2024, 4, 7, 0, 0, 0, 0);
        LocalDateTime sessionTwoEndLocalDateTime = LocalDateTime.of(2024, 4, 7, 2, 0, 0, 0);


        Session sessionOne = createSession("Sessao 1", sessionOneStartLocalDateTime, sessionOneEndtLocalDateTime, 1, Map.of(1, 10));
        Session sessionTwo = createSession("Sessao 2", sessionTwoStartLocalDateTime, sessionTwoEndLocalDateTime, 2, Map.of(2, 5));

        Event toCreate = createEvent(List.of(sessionOne, sessionTwo), new Validity(
                LocalDateTime.of(2024, 4, 1, 0, 0, 0),
                LocalDateTime.of(2024, 5, 1, 0, 0, 0)
        ));

        //When

        boolean areValidition = toCreate.isValid();

        //Then

        assertTrue(areValidition);
    }

    @Test
    public void given_Event_whenEventIsValilidity_should_return_false() {

        //Given


        LocalDateTime sessionOneStartLocalDateTime = LocalDateTime.of(2024, 4, 3, 0, 0, 0, 0);
        LocalDateTime sessionOneEndtLocalDateTime = LocalDateTime.of(2024, 4, 3, 2, 0, 0, 0);
        LocalDateTime sessionTwoStartLocalDateTime = LocalDateTime.of(2024, 4, 7, 0, 0, 0, 0);
        LocalDateTime sessionTwoEndLocalDateTime = LocalDateTime.of(2024, 4, 7, 2, 0, 0, 0);


        Session sessionOne = createSession("", sessionOneStartLocalDateTime, sessionOneEndtLocalDateTime, 1, Map.of(1, 10));
        Session sessionTwo = createSession("", sessionTwoStartLocalDateTime, sessionTwoEndLocalDateTime, 2, Map.of(2, 5));

        Event toCreate = createEvent(List.of(sessionOne, sessionTwo), new Validity(
                LocalDateTime.of(2024, 4, 1, 0, 0, 0),
                LocalDateTime.of(2024, 5, 1, 0, 0, 0)
        ));

        //When

        boolean areValidition = toCreate.isValid();

        //Then

        assertFalse(areValidition);
    }
    }

