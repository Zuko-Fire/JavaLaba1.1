public class Match {
    public boolean tidyNumber(int num) {

        String number = String.valueOf(num);
        if(number.length() == 1){
            return false;
        }
        try {


            int buf = Integer.parseInt(String.valueOf(number.charAt(0)));
            for (int i = 1; i < number.length(); i++) {

                if (Integer.parseInt(String.valueOf(number.charAt(i))) < buf)
                    return false;
                buf = Integer.parseInt(String.valueOf(number.charAt(i)));
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
