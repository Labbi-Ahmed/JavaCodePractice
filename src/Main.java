import datatype.ArrayType;
import datatype.ClassType;
import datatype.FloatAndDouble;
import datatype.StringDataType;
import accessModifier.*;

import javax.sound.sampled.Port;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int a = 1;
    void hello() {
        System.out.println("Hello World! " + this.a);
    }
    public static void main(String[] args) throws InterruptedException {
       // runFloatingAndDouble();
//        runStringDataType();
//        runClassType();
//        runArrayType();
//        Main main = new Main();
//        main.hello();
        ProtectedAccessModifier accessModifier = new ProtectedAccessModifier();
    }

    private static void runFloatingAndDouble(){
        FloatAndDouble floatAndDouble = new FloatAndDouble();
        floatAndDouble.get_float_value();
        floatAndDouble.get_float();
        floatAndDouble.get_double_value();
        floatAndDouble.get_double();
    }

    public static void runStringDataType() throws InterruptedException {
        StringDataType stringDataType = new StringDataType();
//        stringDataType.inputStringDataType();
//        stringDataType.printStringDataType();
//        stringDataType.charArrayAsStringDataType();
//        stringDataType.demonstrateThreadSafety();
        stringDataType.stringMemoryReferenceDataType();
    }

    public static void runClassType() {
        ClassType classType = new ClassType();
        System.out.println(classType.hashCode());
        classType =  new ClassType();
        System.out.println(classType.hashCode());
    }

    public static void runArrayType(){
        ArrayType stringType = new ArrayType();
        stringType.createArray();
        stringType.createArrayByNew();
    }
}