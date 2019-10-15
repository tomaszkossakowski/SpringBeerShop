package com.springbeershop.springbeershop.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum CapacityEnum {
    LITER(1),
    HALF_A_LITRE(0.5),
    QUARTER_OF_A_LITRE(0.25),
    THREE_QUARTERS(0.75);

    @Getter
    @JsonValue
    private final double value;

    CapacityEnum(final double value) {
        this.value = value;
    }
}
