public class Car {
    private int id;
    private String brand;
    public String model;
    private int prod_year;
    public int age;
    private String colour;
    public int price;
    public int reg_number;

    public Car(){}
    public Car(int _id, String _brand, String _model, int _prod_year, String _colour, int _price, int _reg_number){
        this.id = _id;
        this.brand = _brand;
        this.model = _model;
        this.prod_year = _prod_year;
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        this.age = (calendar.get(java.util.Calendar.YEAR) - _prod_year);
        this.colour = _colour;
        this.price = _price;
        this.reg_number = _reg_number;
    }

    public int getID(){ return this.id; }
    public String getBrand(){ return this.brand; }
    public String getModel(){ return this.model; }
    public int getProd_year(){ return this.prod_year; }
    public int getAge(){ return this.age; }
    public String getColour(){ return this.colour; }
    public int getPrice(){ return this.price; }
    public int getRegNumber(){ return this.reg_number; }
    @Override public String toString(){
        return ("Id: " + getID() + " Brand: " + getBrand() + " Model: " + getModel() + " Production year: "
                + getProd_year() + " Age: " + getAge() + " Colour: " + getColour() + " Price: " + getPrice()
                + " Registration number: " + getRegNumber());
    }
}