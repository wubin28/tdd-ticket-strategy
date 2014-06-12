package ticket;

/**
 * Created by yanhua on 14-6-12.
 */
public class TurnNumberSequence implements ITurnNumberSequence {

    protected static int turnNumber = 0;

    //TODO 考虑同步
    @Override
    public int getNextTurnNumber() {
        return ++turnNumber;
    }
}
