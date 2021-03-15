public class java_loop {
    public static void main(String[] args) {
        String [] names={"Ayoub","Oussama","Khallile"};
//        for(int i=0;i<names.length;i++){
//
//            System.out.println(names[i]);
//
//        }
//        for (String name:names) {
//            System.out.println(name);
//
//        }
//        int counter=0;
//        while (counter<names.length){
//            System.out.println(names[counter]);
//            counter++;
//        }
        int i=0;
        do {
            System.out.println(names[i]);
            i++;
        }while (i<names.length);


    }
}
