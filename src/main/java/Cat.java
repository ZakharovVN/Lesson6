/**
 * java1.HomeWorkSix
 *
 * @author Zakharov Vladimir
 * @version 01.03.2022
 */
class Cat extends Animal {

    Cat(int runLimit) {
        super(runLimit, -1);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " can't swim";
    }
}