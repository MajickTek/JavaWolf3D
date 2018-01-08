import java.io.*;

public class ArrayDump {
	
	public void write(double[][] data, Writer baseWriter) throws java.io.IOException {
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

	public void write(double[][] data, String fileName) throws java.io.IOException {
		Writer writer = new FileWriter(fileName);
		write(data, writer);
		writer.close();
	}
	
	public void write(double[][] data) throws java.io.IOException {
		write(data, new OutputStreamWriter(System.out));
	}
	
	public double[][] getDoubleTwoDimArray(Reader baseReader) throws java.io.IOException {
		BufferedReader reader = new BufferedReader(baseReader);
		int rows = Integer.parseInt(reader.readLine());
		int cols = Integer.parseInt(reader.readLine());
		double [][] data = new double[rows][cols];
		for(int row=0; row<rows; row++) {
			for(int col=0; col<cols; col++) {
				data[row][col] = Double.parseDouble(reader.readLine());
			}
		}
		return data;
	}
	
	public double[][] getDoubleTwoDimArray(String fileName) throws java.io.IOException {
		Reader reader = new FileReader(fileName);
		double[][] data = getDoubleTwoDimArray(reader);
		reader.close();
		return data;
	}
	
	
	public static void main (String[] args)  {
		double[][] data = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		ArrayDump dumper = new ArrayDump();
		try {
			System.out.println("write to console 1");
			dumper.write(data);
			
			System.out.println("write to file");
			dumper.write(data, "dump.dat");
			
			System.out.println("read from file");
			double[][] data2 = dumper.getDoubleTwoDimArray("dump.dat");
			
			System.out.println("write to console 2");
			dumper.write(data2);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		System.out.println("done.");
	}
}

