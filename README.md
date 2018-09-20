
usage:

```$xslt

?  test-agent java -javaagent:./callspy-agent/build/libs/callspy-agent-1.0-SNAPSHOT.jar -jar ./test/build/libs/test-1.0-SNAPSHOT.jar
 agent/demo/test/Test.main
main..
  agent/demo/test/Test.test1
test1..
   agent/demo/test/Test.test2
test2..
?  test-agent 

```