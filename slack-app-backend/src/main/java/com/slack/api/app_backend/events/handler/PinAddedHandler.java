package com.slack.api.app_backend.events.handler;

import com.slack.api.app_backend.events.EventHandler;
import com.slack.api.app_backend.events.payload.PinAddedPayload;
import com.slack.api.model.event.PinAddedEvent;

public abstract class PinAddedHandler extends EventHandler<PinAddedPayload> {

    @Override
    public String getEventType() {
        return PinAddedEvent.TYPE_NAME;
    }
}
