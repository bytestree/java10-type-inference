package com.bytestree.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class to test local variable
 * Type Inference feature in Java 10
 *
 * @author BytesTree
 */
public class TypeInference {

    public void checkTypeInference() {
        var bigDecimal = new BigDecimal("123");
        var myString = "My String";
        var myInt = 1234;

        // var stringBuffer;         // will NOT compile as no initializer
        // stringBuffer = new StringBuffer();

        var var = 123;    // var as variable name
    }

    // var as method name
    public void var() {
        // do something
    }

    public void typeInferenceInForLoop() {
        var integerList = Arrays.asList(1, 2, 3, 4);

        for (var number : integerList) {
            System.out.println(number);
        }

        for (var i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
    }

    private void validUseOfTypeInference() {
        // with diamond operator
        var list = new ArrayList<>();

        var listOfString = new ArrayList<String>();

        // with stream
        var stream = list.stream();

        // anonymous class
        var inner = new Thread() {
            @Override
            public void run() {
                System.out.println("Running Thread");
            }
        };
        inner.start();

        // pass value to method
        var value = "Check Pass var to method";
        testPassedVar(value);
    }

    private void testPassedVar(String value) {
        System.out.println(value);
    }


    // Following are incorrect use of var / local type reference
    // Note: Code is commented to avoid compile time errors

    private void inValidUserOfTpyeInference() {
    /*
        var withoutInitializer;
        var initializeToNull = null;
        // mutliple variable instantiationn
        var a = "a", b = "b";

        // lambda expression initializer
        var x = () -> { };
        // method reference initializer
       var integerFunction = Integer::intValue;

       // array initializer
        var numbers = {1, 2, 3, 4};
        var numbersRight = new int[]{1, 2, 3, 4};
     */
    }

    // var in method signature is not allowed
   /* private var varInSignature(var value) {
        return null;
    }*/

}

