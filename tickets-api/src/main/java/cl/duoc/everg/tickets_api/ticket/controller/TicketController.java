package cl.duoc.everg.tickets_api.ticket.controller;

import cl.duoc.everg.tickets_api.ticket.dto.*;
import cl.duoc.everg.tickets_api.ticket.service.TicketService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    @PostMapping
    public ResponseEntity<TicketResponse> createTicket(@Valid @RequestBody TicketCreateRequest request) {
        return
                ResponseEntity.status(HttpStatus.CREATED).body(ticketService.createTicket(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketResponse> getTicketById(@PathVariable Long id) {
        return ResponseEntity.ok(ticketService.getTicketById(id));
    }

    @GetMapping
    public ResponseEntity<List<TicketResponse>> getAllTickets() {
        return ResponseEntity.ok(ticketService.getAllTickets());
    }

    @PutMapping("/{id}")
    public ResponseEntity<TicketResponse> updateTicket(
            @PathVariable Long id,
            @Valid @RequestBody TicketUpdateRequest request) {
        return ResponseEntity.ok(ticketService.updateTicket(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
        return ResponseEntity.noContent().build();
    }

}
