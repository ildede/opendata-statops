package cloud.happydev.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import javax.inject.Named;

@Named("save-statops")
public class SaveStatops implements RequestHandler<InputObject, OutputObject> {

    @Override
    public OutputObject handleRequest(InputObject inputObject, Context context) {
        return new OutputObject("Hello from quarkus");
    }

}
