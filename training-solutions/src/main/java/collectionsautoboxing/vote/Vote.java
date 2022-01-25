package collectionsautoboxing.vote;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> results) {
        Map<VoteResult, Integer> excpected = new HashMap<>();
        int countYes = 0;
        int countNo = 0;
        int countAbstain = 0;
        for (VoteResult actual : results.values()) {
            if (actual.equals(VoteResult.YES)) {
                countYes++;
                excpected.put(VoteResult.YES, countYes);
            }
            if (actual.equals(VoteResult.NO)) {
                countNo++;
                excpected.put(VoteResult.NO, countNo);
            }
            if (actual.equals(VoteResult.ABSTAIN)) {
                countAbstain++;
                excpected.put(VoteResult.ABSTAIN, countAbstain);
            }
        }
        return excpected;
    }

//    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> results) {
//        Map<VoteResult, Integer> excpected = new HashMap<>();
//        for (VoteResult v : results.values()) {
//            if (!excpected.containsKey(v)) {
//                excpected.put(v, 0);
//            }
//            excpected.put(v, excpected.get(v) + 1);
//        }
//        return excpected;
//    }
}
