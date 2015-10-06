package epic;

import java.util.HashMap;

class ConvertMobileNumberIntoNum {
    public String solution(String str) {
        HashMap<String, String> numToStrMap = new HashMap<String, String>();
        numToStrMap.put("2", "ABC");
        numToStrMap.put("3", "DEF");
        numToStrMap.put("4", "GHI");
        numToStrMap.put("5", "JKL");
        numToStrMap.put("6", "MNO");
        numToStrMap.put("7", "PQRS");
        numToStrMap.put("8", "TUV");
        numToStrMap.put("9", "WXYZ");

        String[] arr = str.split("#");
        String out = "";
        for (int i = 0; i < arr.length - 1; i++) {
            out = out + numToStrMap.get("" + arr[i].charAt(0)).charAt(arr[i].length() - 1) + " ";
        }
        out = out + numToStrMap.get("" + arr[arr.length - 1].charAt(0)).charAt(
                arr[arr.length - 1].length() - 1);
        return out;
    }
}

public class ConvertMobileNumberIntoNumber {
    public static void main(String[] args) {
        ConvertMobileNumberIntoNum mSol = new ConvertMobileNumberIntoNum();
        System.out.println(mSol.solution("23#22"));
    }
}