abstract class Ship {
    int size;
    // protected int count;
    protected int first_coordinate_x;
    protected int first_coordinate_y;
    protected int end_coordinate_x;
    protected int end_coordinate_y;

    public abstract void show_info(char[][] batle_area, int k);
    public abstract void show_info(char[][] batle_area, int x1, int y1, int x2, int y2);


    public abstract int getSize();
}
