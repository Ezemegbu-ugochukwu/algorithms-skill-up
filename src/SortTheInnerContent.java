import java.util.ArrayList;
import java.util.List;

public class SortTheInnerContent {
    public static void main(String[] args) {
        System.out.println(autocorrect("We have sent the deliverables to you."));
    }

    //    public static String autocorrect(String input) {
//        String result = "";
//        if (input.contains("you") && input.length() > 3) {
//            result = input.replace("you", "you");
//        } else if (input.contains("you")) {
//            result = input.replace("you", "your client");
//        } else
//            return result;
//        return result;
//    }
//}
    public static String autocorrect(String input) {
        String result = "";
        if (input.equals("you.")) {
            result = input.replace("you", "your client.");
//        } else if (input.contains("you")) {
//            result = input;
//        }

        }
        return result;
    }
}

