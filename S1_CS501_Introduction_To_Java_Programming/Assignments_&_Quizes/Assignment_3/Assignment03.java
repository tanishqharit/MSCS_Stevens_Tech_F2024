package Assignments.Assignment_3;

/*
* Assignment03
* Name: Tanishq Harit
* CWID: 20031876 
*/
public class Assignment03 {

// Searching in a 1D array
public static int search(int[] arr, int target) {
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
      return i;
    }
  }
  return -1;
}

// Searching for target in 2D array and returning the position
public static int[] search(int[][] matrix, int target) {
  for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
      if (matrix[i][j] == target) {
        return new int[] {i, j};
      }
    }
  }
  return new int[] {-1, -1};
}

// Sum of each column in 2D array
public static int[] sumColumn(int[][] matrix) {
  int columns = matrix[0].length;
  int[] colSums = new int[columns];
  for (int i = 0; i < columns; i++) {
    for (int j = 0; j < matrix.length; j++) {
      colSums[i] += matrix[j][i];
    }
  }
  return colSums;
}

// Sum of each row in 2D array
public static int[] sumRow(int[][] matrix) {
  int rows = matrix.length;
  int[] rowSums = new int[rows];
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
      rowSums[i] += matrix[i][j];
    }
  }
  return rowSums;
}

// Main method 
public static void main(String[] args) {
  int[] arr = {1, 2, 3, 4, 5};
  int target = 3;
  System.out.println("Index of target in 1D array: " + search(arr, target));

  int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
  };
  int target2D = 5;
  int[] pos = search(matrix, target2D);
  System.out.println("Position of target in 2D array: (" + pos[0] + ", " + pos[1] + ")");
  
  int[] colSums = sumColumn(matrix);
  System.out.print("Sum of each column: ");
  for (int sum : colSums) {
    System.out.print(sum + " ");
  }
  
  System.out.println();

  int[] rowSums = sumRow(matrix);
  System.out.print("Sum of each row: ");
  for (int sum : rowSums) {
    System.out.print(sum + " ");
  }
}
}