package voterId;

public class Voter1 extends Verification{

    @Override
    public boolean polling(String partyName) {
        System.out.println("Voted for :"+ partyName);
        return true;
    }
}
