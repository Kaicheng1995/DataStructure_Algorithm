public class IntArrayListStepper {

    private IntArrayList lst;
    private int step;

    public IntArrayListStepper(IntArrayList lst, int step) {
        this.lst = lst;
        this.step = step;
    }

    /** Returns the ith element in the IntArrayListStepper. This should 
     *  use the lst.get() method and should step through this underlying
     *  IntArrayList by the instance variable step. The value of i passed 
     *  in can also be negative where the lst will be stepped through in
     *  reverse starting from the last element. Assume that the value i
     *  will be in bounds for lst. Refer to the JUnit tests
     *  provided to specify the behavior further.
     */
    public int get(int i) {
        int index = (step * i % lst.size());
        while (index < 0) {
            index += lst.size();
        }
        return lst.get(index);
    }

}