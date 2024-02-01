# azure-functions-blob-trigger

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Azure Functions Blob Trigger

This is a Quarkus implementation of this Java example https://github.com/azure-samples/azure-functions-samples-java/blob/master/triggers-bindings/src/main/java/com/functions/BlobTriggerFunction.java

At the moment compilation fails with:

```
 ERROR [io.qua.dep.dev.IsolatedDevModeMain] (main) Failed to start quarkus: java.lang.RuntimeException: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
Press [e[error]: Build step io.quarkus.azure.functions.deployment.AzureFunctionsProcessor#findFunctions threw an exception: jakarta.enterprise.inject.spi.DeploymentException: java.lang.ClassNotFoundException: [B
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.lambda$findFunctions$1(AzureFunctionsProcessor.java:218)
        at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1708)
        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
        at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
        at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.lambda$findFunctions$3(AzureFunctionsProcessor.java:220)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.findFunctions(AzureFunctionsProcessor.java:208)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:849)
        at io.quarkus.builder.BuildContext.run(BuildContext.java:256)
        at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
        at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads.JBossThread.run(JBossThread.java:501)
Caused by: java.lang.ClassNotFoundException: [B
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:518)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:468)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:518)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:468)
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.lambda$findFunctions$1(AzureFunctionsProcessor.java:216)
        ... 20 more

        at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment(AugmentActionImpl.java:334)
        at io.quarkus.runner.bootstrap.AugmentActionImpl.createInitialRuntimeApplication(AugmentActionImpl.java:251)
        at io.quarkus.runner.bootstrap.AugmentActionImpl.createInitialRuntimeApplication(AugmentActionImpl.java:60)
        at io.quarkus.deployment.dev.IsolatedDevModeMain.firstStart(IsolatedDevModeMain.java:112)
        at io.quarkus.deployment.dev.IsolatedDevModeMain.accept(IsolatedDevModeMain.java:433)
        at io.quarkus.deployment.dev.IsolatedDevModeMain.accept(IsolatedDevModeMain.java:55)
        at io.quarkus.bootstrap.app.CuratedApplication.runInCl(CuratedApplication.java:138)
        at io.quarkus.bootstrap.app.CuratedApplication.runInAugmentClassLoader(CuratedApplication.java:93)
        at io.quarkus.deployment.dev.DevModeMain.start(DevModeMain.java:131)
        at io.quarkus.deployment.dev.DevModeMain.main(DevModeMain.java:62)
Caused by: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
        [error]: Build step io.quarkus.azure.functions.deployment.AzureFunctionsProcessor#findFunctions threw an exception: jakarta.enterprise.inject.spi.DeploymentException: java.lang.ClassNotFoundException: [B
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.lambda$findFunctions$1(AzureFunctionsProcessor.java:218)
        at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1708)
        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
        at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
        at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.lambda$findFunctions$3(AzureFunctionsProcessor.java:220)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.findFunctions(AzureFunctionsProcessor.java:208)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:849)
        at io.quarkus.builder.BuildContext.run(BuildContext.java:256)
        at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
        at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads.JBossThread.run(JBossThread.java:501)
Caused by: java.lang.ClassNotFoundException: [B
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:518)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:468)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:518)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:468)
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.lambda$findFunctions$1(AzureFunctionsProcessor.java:216)
        ... 20 more

        at io.quarkus.builder.Execution.run(Execution.java:123)
        at io.quarkus.builder.BuildExecutionBuilder.execute(BuildExecutionBuilder.java:79)
        at io.quarkus.deployment.QuarkusAugmentor.run(QuarkusAugmentor.java:160)
        at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment(AugmentActionImpl.java:330)
        ... 9 more
Caused by: jakarta.enterprise.inject.spi.DeploymentException: java.lang.ClassNotFoundException: [B
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.lambda$findFunctions$1(AzureFunctionsProcessor.java:218)
        at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1708)
        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
        at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
        at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
        at io.quarkus.azurions.deployment.AzureFunctionsProcessor.lambda$findFunctions$3(AzureFunctionsProcessor.java:220)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
Press [eat io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.findFunctions(AzureFunctionsProcessor.java:208)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:849)
        at io.quarkus.builder.BuildContext.run(BuildContext.java:256)
        at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
        at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads.JBossThread.run(JBossThread.java:501)
Caused by: java.lang.ClassNotFoundException: [B
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:518)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:468)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:518)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:468)
        at io.quarkus.azure.functions.deployment.AzureFunctionsProcessor.lambda$findFunctions$1(AzureFunctionsProcessor.java:216)
        ... 20 more
```shell script

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Related Guides

- Azure Functions ([guide](https://quarkus.io/guides/azure-functions)): Write Microsoft Azure functions

## Provided Code
