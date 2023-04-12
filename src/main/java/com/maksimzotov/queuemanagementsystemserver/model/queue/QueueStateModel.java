package com.maksimzotov.queuemanagementsystemserver.model.queue;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import java.util.List;

@Value
public class QueueStateModel {
    Long id;
    Long locationId;
    String name;
    String description;
    @JsonProperty("owner_email")
    String ownerEmail;
    Boolean enabled;
    List<Long> services;
}
