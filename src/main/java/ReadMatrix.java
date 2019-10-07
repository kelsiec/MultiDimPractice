import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadMatrix {
    public static List<List<Integer>> readMatrix(String filePath) throws FileNotFoundException {
        List<List<Integer>> returnMatrix = new ArrayList<>();

        Scanner scan = new Scanner(new File(filePath));
        int maxColumns = 0;

        while (scan.hasNextLine()) {
            List<Integer> line = new ArrayList<>();
            String[] data = scan.nextLine().split("\\s+");

            if (data.length > maxColumns) {
                maxColumns = data.length;
            }

            for (String element : data) {
                try {
                    line.add(Integer.valueOf(element));
                } catch (NumberFormatException e) {
                    System.out.println(element + " is not a valid integer!");
                }
            }

            returnMatrix.add(line);
        }

        for (List<Integer> row : returnMatrix) {
            int size = row.size();
            for (int i = size; i < maxColumns; i++) {
                row.add(0);
            }
        }

        return returnMatrix;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(readMatrix("src/main/resources/matrix.txt"));
        System.out.println(readMatrix("src/main/resources/badMatrix.txt"));
    }
}
