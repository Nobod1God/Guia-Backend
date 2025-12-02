package cl.duoc.everg.tickets_api.ticket.dto;

import cl.duoc.everg.tickets_api.ticket.model.TicketPriority;
import cl.duoc.everg.tickets_api.ticket.model.TicketStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TicketCreateRequest {
    @NotBlank
    private String title;

    private String description;

    @NotNull
    private TicketStatus status;

    @NotNull
    private TicketPriority priority;

    @NotBlank
    private String category;

    @NotBlank
    private String createdBy;
}
