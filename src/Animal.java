/**
 * @author Lucelia
 * @date 2022/6/23 21:00
 */
public class Animal {

    private Integer age;

    private Float weight;

    public Animal(){}

    public Animal(Integer age, Float weight) {
        this.age = age;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void running(){
        System.out.println("Running");
    }

    public void eating(){
        System.out.println("Eating");
    }
}
