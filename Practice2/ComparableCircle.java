package Practice2;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(){
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled){
        super(color, radius, filled);
    }
    @Override
    public int compareTo(ComparableCircle O){
        if(getRadius() > O.getRadius()){
            return 1;
        } else if ( getRadius() < O.getRadius()){
            return -1;
        }
        return 0;
    }

}
