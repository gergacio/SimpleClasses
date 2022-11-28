public class Printer {
    //state: fileds
    private int paperLeft;
    private int toner;
    //constructor
    public Printer(){}
    //getter
    public int getPaperLeft(){
        return this.paperLeft;
    }
    //setter
    public void setPaperLeft(int listOfPaper){
        this.paperLeft = listOfPaper;
    }
    //toner getter and setter
    public int getToner(){
        return this.toner;
    }
    public void setToner(int volume){
        this.toner = volume;
    }
    public int getPrint(int numPages, int numCopies) {
        int allPages = numPages * numCopies;
        if(this.paperLeft >= allPages){
            this.paperLeft -= allPages;
            setToner(getPaperLeft() - allPages);
        }
        return allPages;

    }
}
