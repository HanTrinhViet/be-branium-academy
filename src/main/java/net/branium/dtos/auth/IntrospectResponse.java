package net.branium.dtos.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IntrospectResponse {
    @JsonProperty(value = "valid")
    private boolean valid;
}
