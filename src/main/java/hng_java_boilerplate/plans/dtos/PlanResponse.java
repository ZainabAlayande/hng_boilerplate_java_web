package hng_java_boilerplate.plans.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import hng_java_boilerplate.plans.entity.Plan;

public record PlanResponse(
        @JsonProperty("status")
        int statusCode,
        String message,

        Plan data
) {
}
