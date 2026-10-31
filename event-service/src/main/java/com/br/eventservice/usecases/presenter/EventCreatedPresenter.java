package com.br.eventservice.usecases.presenter;

import com.br.eventservice.entity.Event;
import com.br.eventservice.usecases.model.EventCreatedResponseModel;

public interface EventCreatedPresenter {

    EventCreatedResponseModel prepareSucessView(Event event);

    void prepareFailView(String error);
}
