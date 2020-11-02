public class Puppy extends Dog {
    String sex;

    public Puppy(String name, String breed, int age, String color, String sex) {
        super(name, breed, age, color);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public String getInfo() {
        return (super.toString() + " and sex is " + this.getSex());
    }

    public static void main(String[] args) {
        Puppy yavru = new Puppy("Erol", "Husky", 18, "Blue", "Male");
        System.out.println(yavru.getInfo());
    }

}
