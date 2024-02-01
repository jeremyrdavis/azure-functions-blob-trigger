package io.arrogantprogrammer;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.OutputBinding;
import com.microsoft.azure.functions.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlobTriggerFunction {
    static final Logger LOGGER = LoggerFactory.getLogger(BlobTriggerFunction.class);
    @FunctionName("BlobTriggerFunction")
    @StorageAccount("AzureWebJobsStorage")
    public BlobTrigger run(
            @BlobTrigger(name = "triggerBlob", path = "test-triggerinput-java/{name}", dataType = "binary") byte[] triggerBlob,
            @BindingName("name") String fileName,
            @BlobInput(name = "inputBlob", path = "test-input-java/{name}", dataType = "binary") byte[] inputBlob,
            @BlobOutput(name = "outputBlob", path = "test-output-java/{name}", dataType = "binary") OutputBinding<byte[]> outputBlob,
            final ExecutionContext context) {
        LOGGER.debug("Java Blob trigger function processed a request.");
        context.getLogger().info("Java Blob trigger function BlobTriggerToBlobTest processed a blob.\n Name: " + fileName + "\n Size: " + triggerBlob.length + " Bytes");
        outputBlob.setValue(inputBlob);
        return null;
    }

//    @FunctionName("BlobTriggerFunction")
//    public BlobTrigger run() {
//        LOGGER.debug("Java Blob trigger function processed a request.");
//        return null;
//    }
}
