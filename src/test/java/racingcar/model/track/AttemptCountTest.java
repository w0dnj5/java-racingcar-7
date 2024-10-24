package racingcar.model.track;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.model.AttemptCount;

public class AttemptCountTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, 0, -99, -84})
    void throwExceptionIfAttemptCountIsOutOfRange(int attemptCount) {
        Assertions.assertThatThrownBy(() -> new AttemptCount(attemptCount))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
