all:
	javac *.java
	java Game
build:
	javac *.java
jar:
	rm *.jar
	jar cvfe 3DEngine.jar Game *.class
	rm *.class
clean:
	rm *.class
	rm *.jar

