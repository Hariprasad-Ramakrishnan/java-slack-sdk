package com.slack.api.webhook;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WebhookResponse {
    private Integer code;
    private String message;
    private String body;
}
