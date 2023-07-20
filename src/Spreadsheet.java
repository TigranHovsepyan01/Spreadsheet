public class Spreadsheet {
    private Cell[][] cells;

    public Spreadsheet(int row, int column) {
        this.cells = new Cell[row][column];
        this.row = row;
        this.column = column;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void addColumn(int position) {
        Cell[][] tmp = new Cell[row][column + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j > position) {
                    tmp[i][j + 1] = cells[i][j];
                } else if (j == position) {
                    tmp[i][j] = new Cell();
                } else {
                    tmp[i][j] = cells[i][j];
                }
            }

        }
        cells = tmp;
    }

    public void addRow(int target) {
        Cell[][] tmp = new Cell[row + 1][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i > target) {
                    tmp[row + 1][column] = cells[i][j];
                } else if (i == target) {
                    tmp[i][j] = new Cell();
                } else {
                    tmp[i][j] = cells[i][j];
                }

            }

        }
        cells = tmp;
    }

    public void setValueAt(int row, int column, Object value) {
        cells[row][column].setValue(value);
    }

    public Object getValueAt(int row, int column) {
        return cells[row][column].getValue();
    }

    public void setColorAt(int row, int column, Color color) {
        cells[row][column].setColor(color);
    }

    public Color getColorAt(int row, int column) {
        return cells[row][column].getColor();
    }

    public void reset() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[row][column] = null;
            }
        }
    }

    public void resetCellAt(int row, int column) {
        cells[row][column] = null;
    }

    public double getColumnSum(int column) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum = 0;
            if (cells[i][column].getType() == Type.NUMBER) {
                sum += (Integer) cells[i][column].getValue();
            } else {
                throw new TypeMissException("not number");
            }
        }
        return sum;
    }

    public double getRowSum(int row) {
        int sum = 0;
        for (int i = 0; i < column; i++) {
            sum = 0;
            if (cells[row][i].getType() == Type.NUMBER) {
                sum += (Integer) cells[row][column].getValue();
            } else {
                throw new TypeMissException("not number");
            }

        }
        return sum;
    }

    public double getAreaSum(int i1, int j1, int i2, int j2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
                if (cells[i][j].getValue() == Type.NUMBER) {
                    sum += (Integer) cells[i][j].getValue();
                } else {
                    throw new TypeMissException("not number");
                }
            }
        }
        return sum;

    }
    public double getColumnAverage (int targetColumn1) {
        int sum = 0;
        for(int i = 0; i < row; i++) {
            sum = 0;
            if (cells[i][column].getType() == Type.NUMBER) {
                sum += (Integer) cells[i][column].getValue();
            } else {
                throw new TypeMissException("not number");
            }
        }
        return sum / row;
    }
    public double getRowAverage (int targetRow1) {
        int sum = 0;
         for(int i = 0; i < column; i++) {
             sum = 0;
             if (cells[row][i].getType() == Type.NUMBER) {
                 sum += (Integer) cells[row][i].getValue();
             }else {
                 throw new TypeMissException("not number");
             }
         }
         return sum / column;
    }
    public double getAreaAverage (int ii1, int jj1, int ii2,int jj2) {
        int sum = 0;
        int count = 0;

        for(int i = ii1; i <= ii2; i++) {
            for(int j = jj1; j <= jj2; j++) {
                if (cells[i][j].getValue() == Type.NUMBER ) {
                    sum += (Integer) cells[i][j].getValue();
                } else {
                    throw new TypeMissException();
                }
                count++;
            }
        }
        return sum / count;
    }
}
