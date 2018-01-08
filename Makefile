all:
	javac *.java
	java Game
jar:
	jar cvfe Engine.jar Game *.class
clean:
	rm *.class
	rm *.jar

