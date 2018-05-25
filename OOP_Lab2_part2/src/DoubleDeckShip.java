public class DoubleDeckShip extends Ship {
    private int size = 2;
    private int first_coordinate_x = 2;
    private int first_coordinate_y = 0;
    private int end_coordinate_x = 2;
    private  int end_coordinate_y = 1;


    @Override
    public void show_info(char[][] batle_area, int k) {
        for (int i = first_coordinate_y + k; i <= end_coordinate_y + k ; i++) {
            batle_area[first_coordinate_x][i] = '*';
        }
    }

    @Override
    public void show_info(char[][] batle_area, int x1, int y1, int x2, int y2) {
        boolean is_full = false;
        if(x1 == x2 && y2 - y1 == 1){
            for(int i = y1; i <= y2; i++){
                if(batle_area[x1][i] == '*' || batle_area[x1][i] == '#'){
                    is_full = true;
                }
            }
        } else if(y1 == y2 && x2 - x1 == 1){
            for(int i = x1; i <= x2; i++){
                if(batle_area[i][y1] == '*' || batle_area[i][y1] == '#'){
                    is_full = true;
                }
            }
        }
        if(is_full == false) {
            if(x1 == x2) {
                for(int i = y1; i <= y2; i++){
                    batle_area[x1][i] = '*';
                }
                for (int i = x1 - 1; i < 2 + x1; i++) {
                    for (int j = y1 - 1; j < 3 + y1; j++) {
                        if (i >= 0 && j >= 0 && i <= 9 && j <= 9 && batle_area[i][j] != '*' && batle_area[i][j] != '#') {
                            batle_area[i][j] = '#';
                        }
                    }
                }
            } else if(y1 == y2){
                for(int i = x1; i <= x2; i++){
                    batle_area[i][y1] = '*';
                }
                for (int i = x1 - 1; i < 3 + x1; i++) {
                    for (int j = y1 - 1; j < 2 + y1; j++) {
                        if (i >= 0 && j >= 0 && i <= 9 && j <= 9 && batle_area[i][j] != '*' && batle_area[i][j] != '#') {
                            batle_area[i][j] = '#';
                        }
                    }
                }
            }
        }
        else{
            System.out.println("The squard is full or coordinats are incorects");
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }

}
