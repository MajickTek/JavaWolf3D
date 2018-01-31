# JavaWolf3D
Simple Wolfenstein 3D-style engine in Java

# Instructions
Use the makefile to build and run the program.

make all is to build and run it.

Make jar is to build an executable jar file.

make clean is to remove the class files and the jar.

Keep in mind that the res folder MUST be in the same place as the jar (it is not put inside the jar during build).
## Credits
http://www.instructables.com/id/Making-a-Basic-3D-Engine-in-Java/

The textures in the res folder were downloaded from that site as well; all credits to the person who made them.

The code has references to Wolfenstein3D textures (which are in the res/Wolf3D folder). All of these textures are Copyright(C) ID Software. All rights reserved.

## TODO
* Add sound
* add entities (enemies, weapons, pickups)
* add objects/obstacles (berrels, pillars, ceiling lights).
* Load maps from text files/binary files - almost done, just need to integrate it into the engine
* ^ needs way of loadng maps from an actual level editor such as Tiled ^
* make better comments
* floor and ceiling
* spritesheet support for textures
* fps (frames per second) counter
* actual Wolf3D compatibility
* BIG ONE: adding advance raycasting techniques such as from http://lodev.org/cgtutor/ and http://archive.gamedev.net/archive/reference/articles/article872.html
