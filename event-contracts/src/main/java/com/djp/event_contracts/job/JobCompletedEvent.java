package com.djp.event_contracts.job;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobCompletedEvent {

    private UUID jobId;
    private Map<String, Object> result;
    private Instant completedAt;

}
