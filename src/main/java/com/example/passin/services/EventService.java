package com.example.passin.services;

import com.example.passin.domain.event.Event;
import com.example.passin.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    public void getEventDetail(String eventId){
      Event event =  this.eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found with ID: " + eventId));
        return;
    }

}
