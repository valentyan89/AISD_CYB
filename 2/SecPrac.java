public class SecPrac {
    public static void task1(){
        Author tempVar = new Author("name", "@tag", 'F');
        System.out.println(tempVar.getName());
        System.out.println(tempVar.getEmail());
        tempVar.setEmail("@prepod");
        System.out.println(tempVar.getEmail());
        System.out.println(tempVar.toString());
    }

    public static void task2(){
        Ball val = new Ball();
        System.out.println(val.toString());
        val.move(52.52, -13);
        System.out.println(val.getX());
        System.out.println(val.getY());
        System.out.println(val.toString());
    }
    public static void swapReversed(String[] arr){
        int half = arr.length/2;
        for (int i = 0; i < half; i++){
            var tempVar = arr[i];
            arr[i] = arr[arr.length-i - 1];
            arr[arr.length-i - 1] = tempVar;
        }
        for (String name: arr){
            System.out.println(name);
        }
    }
    public static void task8(){
        String[] array = {"valinka", "migal", "+hfhdhf", "=", "dzerjinskiy"};
        swapReversed(array);
    }
    public static void main(String[] args){
        task8();
    } 

}
