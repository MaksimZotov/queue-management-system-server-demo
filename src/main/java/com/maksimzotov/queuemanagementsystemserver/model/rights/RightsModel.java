package com.maksimzotov.queuemanagementsystemserver.model.rights;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.maksimzotov.queuemanagementsystemserver.entity.RightsEntity;
import lombok.Value;

@Value
public class RightsModel {
    @JsonProperty("location_id")
    Long locationId;
    String email;
    String status;

    public static RightsModel toModel(RightsEntity entity) {
        return new RightsModel(
                entity.getPrimaryKey().getLocationId(),
                entity.getPrimaryKey().getEmail(),
                entity.getStatus()
        );
    }
}
