##Java Pair Programming - Second chance

### Requirements:
The candidate should have installed the following items for a great pair experience:

- **An IDE** or his best tool where he can program.
- **Share Desktop**, he needs to be able to share entire desktop.
- **Gradle**, all this projects are gradle projects, it can be installed with sdkman http://sdkman.io/

### Instructions:
Normally we send each test in order within the 30 minutes range, 2 or 3 complete exercises are the expected 

The goal for the candidate is to pass the 3 tests using TDD:

- ChatObservableTest.java
- CharacterTest.java
- Visitor.java

#### Time:
- **30 minutes** per exercise, **1:30** total time.

In all the exercises the ideal candidate would:

- compile the test
- see that the test is not working and not compiling
- create the class needed
- pass the test

This is a really simple pair programming scenario, it is not important if the candidate looks up for any algorithm in the web, we just want the candidate to be able to detect the problem, attack it and resolve it.

#### FAQ:

***Q:*** What if I haven't implemented before the patterns used in this exercise?
***A:*** The test are designed to implement all the required parts of the pattern, you can search about the pattern intent in internet

***Q:*** What if I haven't Hamcrest Matchers? 
***A:*** Hamcrest Matchers are used to increment readability in assertion parts of the tests, they are self-explained. *is* is looking for equality, *not* is negating the expresion, etc. 

***Q:*** What if I haven't used @WebSocket? 
***A:*** You don't need to modify the class that uses @WebSocket, if you implement the Observable using its tests you can later use ChatWebSocketHandler to run a jetty server and live test your code.