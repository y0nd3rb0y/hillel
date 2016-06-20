public enum ColorExt {
        BLACK("black Cat"),
    WHITE("white Cat"),
    RED("Red Cat");

    private String color;
    ColorExt(String color){
        this.color = color;
    }

    public String getColorValue(){
        return this.color;
    }
}
