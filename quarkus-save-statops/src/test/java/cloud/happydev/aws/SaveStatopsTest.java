package cloud.happydev.aws;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SaveStatopsTest {

    @Test
    void testHandlerRequestWithNullInputs() {
        SaveStatops lambdaHandler = new SaveStatops();

        OutputObject result = lambdaHandler.handleRequest(null, null);

        Assertions.assertEquals("Hello from quarkus", result.message);
    }
}
