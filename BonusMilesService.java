import java.util.concurrent.atomic.AtomicInteger;

public class BonusMilesService {
    public int calculate(int ticket) {
        int a = 20;
        int miles = ticket / a;
        return miles;
    }
}

