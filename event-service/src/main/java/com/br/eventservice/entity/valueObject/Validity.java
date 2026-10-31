package com.br.eventservice.entity.valueObject;

import java.time.LocalDateTime;

public record Validity(LocalDateTime startDate, LocalDateTime endDate) {
}
