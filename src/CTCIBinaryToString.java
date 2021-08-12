public class CTCIBinaryToString {
    public static void main(String[] args) {
        try{
            CTCIBinaryToString obj = new CTCIBinaryToString();
            obj.run(args);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(String[] args){
        //Prints the result of converting a double to binary(32 bit)
        System.out.println(convertDoubleToBinary(0.640625));
    }
    public String convertDoubleToBinary(Double num){
        String finalResult = "";
        if(num >= 1){
            return "1";
        }
        finalResult += "0.";
        int indexAfterDecimal = 1;
        while(indexAfterDecimal <= 31 && num > 0){
            if(num >= (Math.pow(0.5,indexAfterDecimal))){
                finalResult+="1";
                num = num - (Math.pow(0.5,indexAfterDecimal));
            }else if(num != 0){
                finalResult+= "0";
            }
            indexAfterDecimal++;
        }
        if(num == 0){
            return finalResult;
        }else{
            return "ERROR";
        }
    }
}