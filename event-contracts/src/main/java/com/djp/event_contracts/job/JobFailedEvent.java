package com.djp.event_contracts.job;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobFailedEvent {

    private UUID jobId;
    private String errorMessage;
    private int retryCount;
    private Instant failedAt;

}
