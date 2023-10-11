package com.samplepage.Relevel.AnjaliJava;

public class passwordvalidation {
    public static boolean checkIfNumberthere(String password) {
        String Number = ("1,2,3,4,5,6,7,8,9,0,");

        //Convert it in the String Array
        String[] numsArray = Number.split("");

        //boolean Variable
        boolean isNumThere = false;

        for (int i = 0; i < numsArray.length; i++) {
            if (password.contains(numsArray[i])) {
                isNumThere |= true;
            } else {
                isNumThere |= false;
            }
        }
        return isNumThere;
    }

    public static boolean checkIfUpperCase(String password) {
        String upperCase = ("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z");

        // Convret it in the String Array
        String[] upperCaseArray = upperCase.split("");

        //Boolean Variable
        boolean isUpperCase = false;

        for (int i = 0; i < upperCaseArray.length; i++) {
            if (password.contains(upperCaseArray[i])) {
                isUpperCase |= true;
            } else {
                isUpperCase |= false;
            }
        }
        return isUpperCase;
    }

    public static boolean checkIfLowerCase(String password) {
        String lowerCase = ("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z");

        //Convert it in the String Array
        String[] LowercaseArray = lowerCase.split("");

        //Boolean variable
        boolean isLowerCase = false;

        for (int i = 0; i < LowercaseArray.length; i++) {
            if (password.contains(LowercaseArray[i])) {
                isLowerCase |= true;
            } else {
                isLowerCase |= false;
            }
        }
        return isLowerCase;
    }

    public static boolean checkIfSymbleThere(String password) {
        String Symble = ("!~@#$%^&*()<>?|{}");

        //convert it in the String Array
        String[] SymbleArray = Symble.split("");

        //Boolean Variable
        boolean isSymble = false;

        for (int i = 0; i < SymbleArray.length; i++) {
            if (password.contains(SymbleArray[i])) {
                isSymble |= true;
            } else {
                isSymble |= false;
            }
        }
        return isSymble;
    }

    public static void checkIfPasswordValid(String password) {
        {
            if (checkIfNumberthere(password) &&
                    checkIfUpperCase(password) &&
                    checkIfLowerCase(password) &&
                    checkIfSymbleThere(password)) {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        }

    }

    public static void main(String[] args) {
        checkIfPasswordValid("Rahul@123");
    }
}
