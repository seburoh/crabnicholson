/*
class for Room objects
 */

public class Room {
    private String[] exits;
    private String[] items;
    private String roomDesc;

    public Room(String exitIN, String itemIN){

        //port in exits and items
        this.exits = exitIN.split("\\s");
        this.items = itemIN.split("\\s");
    }

    //set room descriptions in from strings
    public void setDesc(String str){
        this.roomDesc = str;
    }

    //give back descriptions
    public String getDesc() {
        return this.roomDesc + " " + this.itemsToString()  + "\nExits: " + this.exitsToString();
    }

    //print items as nice looking string
    public String itemsToString(){
        StringBuilder str = new StringBuilder();
        for (String item : this.items) {
            if (!item.equals("")){
                str.append(item);
                str.append(", ");
            }
        }
        str.delete(str.length()-2,str.length());

        return str.toString();
    }

    //print exits as nice looking string
    public String exitsToString(){
        StringBuilder str = new StringBuilder();
        for (String exit : this.exits) {
            str.append(exit);
            str.append(", ");
        }
        str.delete(str.length()-2,str.length());

        return str.toString();
    }

    //is given value a valid exit?
    public boolean isExit(String str){

        //well, is it?
        for (String element : this.exits){
            if (element.equals(str)){
                return true;
            }
        }

        //guess not
        return false;
    }

    //is given value a valid item?
    public boolean isItem(String str){

        //well, is it?
        for (String element : this.items){
            if (element.equals(str)){
                return true;
            }
        }

        //guess not
        return false;
    }

    //delete item from room
    public void delItem(String str){

        //find item to delete
        for (int i = 0; i < this.items.length; i++) {
            if (str.equals(items[i])){
                items[i] = "";
            }
        }

    }
}
