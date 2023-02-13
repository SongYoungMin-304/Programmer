import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
       
        String answer = "";
        HashMap<String, Integer> participantMap = new HashMap();
        for(String part : participant){
            if(!participantMap.containsKey(part))
            {
                participantMap.put(part, 1);
            }else{
                participantMap.put(part, participantMap.get(part)+1);
            }
        }

        for(String com : completion){
            participantMap.put(com, participantMap.get(com)-1);
        }

        for(String key : participantMap.keySet()){
            if(participantMap.get(key) == 1){
                return key;
            }
        }
        return answer;
    }
}