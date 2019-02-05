// You write this.
//
// If you make Structure a class, Mobile must extend it.
// If you make Structure an interface, Mobile must implement it.

public class Mobile extends Structure{
    // This constructor is mandatory by problem specification
    // You have to figure out how to handle it

    public Mobile(Branch left, Branch right) {
        this.left = left;
        this.right = right;
        super.weight = left.getWeight() + right.getWeight();
        super.balanced = left.getTorque() == right.getTorque();
    }

    Branch left, right;
}

