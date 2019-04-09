class MyArrayDataExeption extends RuntimeException{
    int row, column;
    public MyArrayDataExeption (int row,int column){
        super(row + " " + column);
        this.row = row;
        this.column = column;
    }
}
