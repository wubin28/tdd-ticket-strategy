package ticket;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by yanhua on 14-6-12.
 */
public class TurnNumberSequenceTest {

    @Test
    public void a_new_turn_number_should_subsequent_to_the_previous_ticket() {
        ITurnNumberSequence sequence = new TurnNumberSequence();

        int num1 = sequence.getNextTurnNumber();
        int num2 = sequence.getNextTurnNumber();

        assertThat((num2 - num1), is(1));
    }


    @Test
    public void a_new_turn_number_subsequent_to_the_previous_turn_number_from_another_dispenser() {

        ITurnNumberSequence sequence1 = new TurnNumberSequence();
        ITurnNumberSequence sequence2 = new TurnNumberSequence();

        int num1 = sequence1.getNextTurnNumber();
        int num2 = sequence2.getNextTurnNumber();
        assertThat((num2 - num1), is(1));
    }
}