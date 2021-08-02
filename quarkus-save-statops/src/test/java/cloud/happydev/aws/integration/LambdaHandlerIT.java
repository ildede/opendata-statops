package cloud.happydev.aws.integration;

import cloud.happydev.aws.InputObject;
import cloud.happydev.aws.OutputObject;
import io.quarkus.amazon.lambda.test.LambdaClient;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class LambdaHandlerIT {

    @Test
    void testLambdaSuccess() throws Exception {

        OutputObject result = LambdaClient.invoke(OutputObject.class, new InputObject("in"));

        assertEquals("Hello from quarkus", result.message);
    }
}
