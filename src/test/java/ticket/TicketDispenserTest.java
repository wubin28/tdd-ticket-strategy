package ticket;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by yanhua on 14-6-12.
 */
@RunWith(MockitoJUnitRunner.class)
public class TicketDispenserTest {

    @Mock
    ITurnNumberSequence turnNumberSequence;
    private TicketDispenser ticketDispenser;

    @Before
    public void setUp() throws Exception {
        this.ticketDispenser = new TicketDispenser(turnNumberSequence);
    }

    @Test
    public void get_turn_ticket_correctly() throws Exception {
        when(turnNumberSequence.getNextTurnNumber()).thenReturn(10);
        assertThat(ticketDispenser.getTurnTicket().getTurnNumber(), is(10));
        verify(turnNumberSequence,times(1)).getNextTurnNumber();
    }
}
