package com.example.passin.dto.event;

public record EventDetailDTO(
        String id,
        String title,
        String datails,
        String slug,
        Integer maximumAttendees,
        Integer attendeesAmount
) {
}
