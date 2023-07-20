import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter number of row - ");
        int row = sc.nextInt();
        System.out.println();
        System.out.print("please enter number of column - ");
        int column = sc.nextInt();
        System.out.println();

        Spreadsheet spreadsheet = new Spreadsheet(row,column);
        int elem = 0;
        for (int i = 0; i < spreadsheet.getRow(); i++) {
            for (int j = 0; j < spreadsheet.getColumn(); j++) {
                System.out.print("please enter the [" + i + "][" + j + "] = " );
                elem = sc.nextInt();
                System.out.println();
                spreadsheet.setValueAt(i, j, elem);
            }
        }
        for (int i = 0; i < spreadsheet.getRow(); i++) {
            for (int j = 0; j < spreadsheet.getColumn(); j++) {
                System.out.print("[" + spreadsheet.getValueAt(i, j) + "]");
            }
            System.out.println();
        }
        System.out.println("enter position");
        int position = sc.nextInt();
        spreadsheet.addColumn(position);

        System.out.println("enter target");
        int target = sc.nextInt();
        spreadsheet.addRow(target);

        for (int i = 0; i < spreadsheet.getRow(); i++) {
            for (int j = 0; j < spreadsheet.getColumn(); j++) {
                spreadsheet.setColorAt(row, column, Color.GREEN);
            }
        }
        for (int i = 0; i < spreadsheet.getRow(); i++) {
            for (int j = 0; j < spreadsheet.getColumn(); j++) {
                System.out.println("print color" + spreadsheet.getColorAt(row,column));
            }
        }

        System.out.println("begin reset() function");
        for (int i = 0; i < spreadsheet.getRow(); i++) {
            for (int j = 0; j < spreadsheet.getColumn(); j++) {
                spreadsheet.reset();
            }
        }

        spreadsheet.resetCellAt(row, column);
        System.out.println( "print spreadsheet"+ spreadsheet);

        System.out.print("print ColumnSum" + spreadsheet.getColumnSum(column));
        System.out.print("print RowSum" + spreadsheet.getRowSum(row));
        int i1 = 0;
        int j1 = 0;
        int i2 = 0;
        int j2 = 0;
        sc.nextInt();
        System.out.println("print AreaSum" + spreadsheet.getAreaSum(i1,j1, i2,j2));

        System.out.println("please enter ColumnAverage");
        int targetColumn1 = sc.nextInt();
        System.out.println("print ColumnAverage" + spreadsheet.getColumnAverage(targetColumn1));

        System.out.println("please enter targetRow1");
        int targetRow1 = sc.nextInt();
        System.out.println("print RowAverage" + spreadsheet.getRowAverage(targetRow1));

        System.out.println("enter ii1");
        int ii1 = sc.nextInt();
        System.out.println("enter jj1");
        int jj1 = sc.nextInt();
        System.out.println("enter ii2");
        int ii2 = sc.nextInt();
        System.out.println("enter jj2");
        int jj2 = sc.nextInt();
       System.out.println("print sum"+ spreadsheet.getAreaAverage(ii1, jj1,ii2,jj2));


    }

}