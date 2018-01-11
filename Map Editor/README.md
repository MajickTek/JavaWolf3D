Map Editor
===

# Info
MapIO.java takes a 2D array of integers and dumps it into a file.

However, this is not a really great way of making maps. It is simple, but not user-friendly. So this is what i am thinking:

Use Tiled as the map editor and export the maps as CSV (comma-separated values), and load that.

An example of how to do this is here:
http://discourse.mapeditor.org/t/any-chance-of-an-option-to-export-the-map-as-a-csv-where-each-cell-is-the-tile-image-name/59/14

Explanation of CSV (in Java): https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
Also exporting map arrays to csv may be done with this: http://www.mkyong.com/java/how-to-export-data-to-csv-file-java/

Finally, Wikipedia: https://en.wikipedia.org/wiki/Comma-separated_values

I will include tilesets for Tiled (and a basic map) if i get this working.
