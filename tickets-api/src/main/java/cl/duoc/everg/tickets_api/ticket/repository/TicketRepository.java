package cl.duoc.everg.tickets_api.ticket.repository;

import cl.duoc.everg.tickets_api.ticket.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}