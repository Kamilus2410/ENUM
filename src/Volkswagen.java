public enum Volkswagen implements Vwinterface{
    UP ("yellow", 1998) {public Volkswagen getIfMissing() {return TOURAN;}},
    GOLF ("blue", 1999) {public Volkswagen getIfMissing() {return TOURAN;}},
    PASSAT ("black", 2000) {public Volkswagen getIfMissing() {return TOURAN;}},
    ARTEON ("white", 2020){public Volkswagen getIfMissing() {return TOURAN;}},
    TIGUAN ("silver", 2021){public Volkswagen getIfMissing() {return TOURAN;}},
    TOURAN ("grey", 2022){public Volkswagen getIfMissing() {return TOURAN;}};

    private String colors;
    private int prodYear;

    Volkswagen(String colors, int prodYear) {
        this.colors = colors;
        this.prodYear = prodYear;
    }

    public static Volkswagen ofColor(String color) {
        for (Volkswagen value : values()) {
            if (color.equals(value.getColors())) {
                return value;
            }

        } throw new IllegalArgumentException("Color: " + color + " not here");
    }

    public abstract Volkswagen getIfMissing();

    public void doSomething(){
        System.out.println(prodYear + " kupa");
    }

    public String getColors() {
        return colors;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }
}
