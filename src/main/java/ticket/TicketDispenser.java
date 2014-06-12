package ticket;

/**
 * Created by yanhua on 14-6-12.
 */
public class TicketDispenser {
    private ITurnNumberSequence turnNumberSequence;


    public TicketDispenser(ITurnNumberSequence turnNumberSequence) {
        this.turnNumberSequence = turnNumberSequence;
    }


    public TicketDispenser() {
        turnNumberSequence = new TurnNumberSequence();
    }


    public TurnTicket getTurnTicket()
    {
        int newTurnNumber = turnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);
        return newTurnTicket;
    }
}

