import java.io.*;

//the WIP int version of Arraydump
public class MapIO {
	
	public void write(int[][] data, Writer baseWriter) throws java.io.IOException {
		int rows = data.length;
		if (rows==0) { return; }
		int cols = data[0].length;
		BufferedWriter writer = new BufferedWriter(baseWriter);
		writer.write("" + rows); writer.newLine();
		writer.write("" + cols); writer.newLine();
		for(int row=0; row<rows; row++) {
			for(int col=0; col<cols; col++) {
				writer.write("" + data[row][col]); writer.newLine();
			}
		}
		writer.flush();
	}

	public void write(int[][] data, String fileName) throws java.io.IOException {
		Writer writer = new FileWriter(fileName);
		write(data, writer);
		writer.close();
	}
	
	public void write(double[][] data) throws java.io.IOException {
		write(data, new OutputStreamWriter(System.out));
	}
	
	public int[][] getIntegerTwoDimArray(Reader baseReader) throws java.io.IOException {
		BufferedReader reader = new BufferedReader(baseReader);
		int rows = Integer.parseInt(reader.readLine());
		int cols = Integer.parseInt(reader.readLine());
		int [][] data = new double[rows][cols];
		for(int row=0; row<rows; row++) {
			for(int col=0; col<cols; col++) {
				data[row][col] = Integer.parseInt(reader.readLine());
			}
		}
		return data;
	}
	
	public int[][] getIntegerTwoDimArray(String fileName) throws java.io.IOException {
		Reader reader = new FileReader(fileName);
		int[][] data = IntegerTwoDimArray(reader);
		reader.close();
		return data;
	}
	
	
	public static void main (String[] args)  {
		int[][] data = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		MapIO dumper = new MapIO();
		try {
			System.out.println("write to console 1");
			dumper.write(data);
			
			System.out.println("write to file");
			dumper.write(data, "dump.dat");
			
			System.out.println("read from file");
			int[][] data2 = dumper.getIntegerTwoDimArray("dump.dat");
			
			System.out.println("write to console 2");
			dumper.write(data2);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		System.out.println("done.");
	}
}
