package mod9.pt1.ex3;

//interfaces challenge
//players and monsters

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
