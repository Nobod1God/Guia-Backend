package cl.duoc.everg.tickets_api.ticket.dto;

import cl.duoc.everg.tickets_api.ticket.model.TicketPriority;
import cl.duoc.everg.tickets_api.ticket.model.TicketStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TicketResponse {
    private Long id;
    private String title;
    private String description;
    private TicketStatus status;
    private TicketPriority priority;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
}
