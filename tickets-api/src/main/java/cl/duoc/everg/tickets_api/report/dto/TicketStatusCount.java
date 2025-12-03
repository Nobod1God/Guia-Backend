package cl.duoc.everg.tickets_api.report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TicketStatusCount {
    private String status;
    private Long count;
}
