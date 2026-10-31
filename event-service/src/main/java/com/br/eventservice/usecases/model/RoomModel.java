package com.br.eventservice.usecases.model;

public record RoomModel(String name, Integer totalSeats, Boolean exists, Boolean isAvailable) {

}
