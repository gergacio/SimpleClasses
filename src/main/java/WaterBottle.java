public class WaterBottle {
    //state - fields
    private int volume;
    //constructor method
    public WaterBottle(){
        this.volume = 100;
    }

    //getter for volume
    public int getVolume(){
        return this.volume;
    }
    //setter for volume
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getDrink() {

        setVolume(this.getVolume() - 10);
        return getVolume();
    }
    public int getEmpty() {
        this.volume = 0;
        return this.getVolume();
    }

    public int getFull() {
        this.volume = 100;
        return this.getVolume();
    }
}
