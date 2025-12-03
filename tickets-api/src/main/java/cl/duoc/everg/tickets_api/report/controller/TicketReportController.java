package cl.duoc.everg.tickets_api.report.controller;

import cl.duoc.everg.tickets_api.report.dto.TicketStatusCount;
import cl.duoc.everg.tickets_api.report.repository.TicketReportJdbcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
public class TicketReportController {

    private final TicketReportJdbcRepository repository;

    @GetMapping("/tickets-by-status")
    public List<TicketStatusCount> getTicketsByStatus() {
        return repository.getCountByStatus();
    }
}
