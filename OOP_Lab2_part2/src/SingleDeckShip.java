import java.net.SocketPermission;

public class SingleDeckShip extends Ship {
    private  int size = 1;
    private int first_coordinate_x = 0;
    private int first_coordinate_y = 0;
    private int end_coordinate_x= 0;
    private int end_coordinate_y= 0;


    public SingleDeckShip(){
        this.size = 1;
    }



    @Override
    public void show_info(char[][] batle_area, int k) {
        batle_area[first_coordinate_x ][end_coordinate_y + k] = '*';
    }

    public void show_info(char[][] batle_area, int x1, int y1, int x2, int y2) {
        if(batle_area[x1][y1] != '*' && batle_area[x1][y1] != '#') {
            batle_area[x1][y1] = '*';
            for(int i = x1 - 1; i < 2 + x1; i++){
                for(int j = y1 -1; j < 2 + y1; j ++){
                    if(i >= 0 && j >= 0 && batle_area[i][j] != '*' && batle_area[i][j] != '#'){
                        batle_area[i][j] = '#';
                    }
                }
            }
        }
        else{
            System.out.println("The squard is full");
        }
    }



    @Override
    public int getSize(){
       return this.size;
    }

}
