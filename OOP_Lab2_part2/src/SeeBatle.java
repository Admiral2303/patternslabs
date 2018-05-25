import java.util.ArrayList;

public class SeeBatle {
    private ArrayList<Ship> see_batle;
    char[][] batle_area = new char[10][10];
    private int one_deck_count;
    private int two_deck_count;
    private int three_deck_count;
    private int four_deck_count;


    public int get_ship_count(int size){
        if(size == 1){
            return one_deck_count;
        } else if(size == 2){
            return two_deck_count;
        } else if(size == 3){
            return three_deck_count;
        } else if(size == 4){
            return four_deck_count;
        }
        return -1;
    }

    public SeeBatle(int one_deck_count, int two_deck_count, int three_deck_count, int four_deck_count) {
        this.see_batle = new ArrayList<Ship>();
        this.one_deck_count = one_deck_count;
        this.two_deck_count = two_deck_count;
        this.three_deck_count = three_deck_count;
        this.four_deck_count = four_deck_count;
    }





    public Ship get_ship(int size){
        Ship ship = null;
        if(this.get_by_size(size) != null){
            ship = get_by_size(size);
        } else{
            switch (size){
                case 1:
                    ship = new SingleDeckShip();
                    break;
                case 2:
                    ship = new DoubleDeckShip();
                    break;
                case 3:
                    ship = new TripleDeckShip();
                    break;
                case 4:
                    ship = new ForthDeckShip();
                    break;
            }
            see_batle.add(ship);
        }

        return ship;
    }


    public Ship get_by_size(int size){
        for(Ship get_ship: see_batle){
            if(get_ship.getSize() == size){
                return get_ship;
            }
        }
        return null;
    }


    public int get_size(){
        return see_batle.size();
    }

    public char[][] set_batle_area(char[][] area){
        for(int i = 0; i < 10; i++){
            for(int j =0; j < 10; j++){
                if(area[i][j] != '*' || area[i][j] != '#'){
                    area[i][j] = '#';
                }
            }
        }
        this.batle_area = area;

        return this.batle_area;
    }


}
