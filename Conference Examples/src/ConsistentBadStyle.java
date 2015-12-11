/**
 * Created by Kyle Flynn on 12/9/2015.
 */
public class ConsistentBadStyle {

    /*
    This class demonstrates bad code style vs. good code style
    You could even argue that this comment isn't even needed because of the self-documenting class name! Hah!
     */

    public class Person {
        String name;
        int age;
        boolean sleepy = false;
        public Person(String name, int age){
            this.name = name;
            this.age = age;}
        public boolean isSleepy() {
            if(age > 50) {
                return true;} else {return false;
            }
        }
    }

    public boolean isAwake(Person person){return !person.isSleepy();
    }

}
