public class Square {
    private boolean isMarked;

    public void setIsMarked(boolean isMarked){
        this.isMarked = isMarked;
    }

    public boolean getIsMarked(){
        return this.isMarked;
    }

     
    public String toString() {
        if (isMarked) {
            return "X";
        } else {
            return " ";
        }
    }
}