public class ForthDeckShip extends Ship{
    private int size = 4;
    private int first_coordinate_x = 6;
    private int first_coordinate_y = 1;
    private int end_coordinate_x = 6;
    private int end_coordinate_y= 4;



    @Override
    public void show_info(char[][] battle_area, int k) {
        for (int i = first_coordinate_y +k; i <= end_coordinate_y+k; i++) {
            battle_area[first_coordinate_x][i] = '*';
        }
        //System.out.println("this.ship has " + this.size + " decks");
    }

    @Override
    public void show_info(char[][] battle_area, int x1, int y1, int x2, int y2) {
        boolean is_full = false;
        if(x1 == x2 && y2 - y1 == 3){
            for(int i = y1; i <= y2; i++){
                if(battle_area[x1][i] == '*' || battle_area[x1][i] == '#'){
                    is_full = true;
                }
            }
        } else if(y1 == y2 && x2 - x1 == 3){
            for(int i = x1; i <= x2; i++){
                if(battle_area[i][y1] == '*' || battle_area[i][y1] == '#'){
                    is_full = true;
                }
            }
        }
        if(is_full == false) {
            if(x1 == x2) {
                for(int i = y1; i <= y2; i++){
                    battle_area[x1][i] = '*';
                }
                for (int i = x1 - 1; i < 2 + x1; i++) {
                    for (int j = y1 - 1; j < 5 + y1; j++) {
                        if (i >= 0 && j >= 0 && i <= 9 && j <= 9 && battle_area[i][j] != '*' && battle_area[i][j] != '#') {
                            battle_area[i][j] = '#';
                        }
                    }
                }
            } else if(y1 == y2){
                for(int i = x1; i <= x2; i++){
                    battle_area[i][y1] = '*';
                }
                for (int i = x1 - 1; i < 6 + x1; i++) {
                    for (int j = y1 - 1; j < 2 + y1; j++) {
                        if (i >= 0 && j >= 0 && i <= 9 && j <= 9 && battle_area[i][j] != '*' && battle_area[i][j] != '#') {
                            battle_area[i][j] = '#';
                        }
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
