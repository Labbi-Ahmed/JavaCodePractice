package datatype;

public class ArrayType {
    public void createArray(){
        String[] strArray = {"Hello", "World"};
        for( String str : strArray){
            System.out.println( str );
        }
    }

    public void createArrayByNew(){
        String[] strArray = new String[]{"Hello", "World"};
        for( String str : strArray){
            System.out.println( str );
        }
        String[] strArray2 = new String[10];
        for( int i = 0; i < strArray2.length; i++){
            strArray2[i] = i + 5 +  strArray[i%2] ;
        }
        for( String str : strArray2){
            System.out.println( str );
        }
    }
}
