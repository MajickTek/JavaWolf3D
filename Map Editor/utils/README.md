UTILS
===

Cleanup.java takes the CSV file specified in the first argument and removes all instances of "-1"; replacing them with "0".

This is because Tiled uses -1 as the ID for "air" but this engine uses "0".
