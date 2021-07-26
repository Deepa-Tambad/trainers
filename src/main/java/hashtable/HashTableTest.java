//package hashtable;
//
//import java.util.Hashtable;
//
//public class HashTableTest {
//    String[] hsArray;
//    int used=0;
//    int arrsize;
//    public HashTableTest(int capacity)
//    {
//        if(!isPrimeNum(capacity))
//        {
//            capacity=getNextPrimr(capacity);
//        }
//        arrsize=capacity;
//        hsArray=new String[capacity];
//    }
//    int hashFunction1(String s)
//    {
//        int value=s.hashCode();
//        value=value%arrsize;
//
//        if(value<0){
//            value=value+arrsize;
//        }
//    }
//    int hashFunction2(int i)
//    {
//       return 3 -i%3;
//    }
//    public boolean insertion(String s)
//    {
//        int hsval=hashFunction1(s);
//        int stepsize=hashFunction2(hsval);
//        while(hashArray[hsval]!=null) {
//            hsval = hsval + stepsize;
//            hsval = hsval % arrsize;
//        }
//        hashArray[hsval]=s;
//        used++;
//        System.out.println("Inserter ",s,hsval,used);
//        return true;
//    }
//    public int searching(String s) {
//        int hsval = hashFunction1(s);
//        int stepsize = hashFunction2(hsval);
//        while (hsArray[hsval] != null) {
//            if (hsArray[hsval].equals(s)) {
//                return hsval;
//            }
//            hsval += stepsize;
//            hsval %= stepsize;
//        }
//        return -1;
//    }
//    private  boolean isPrimeNum(int capicity)
//    {
//        for(int i=2;i*i<capicity;i++)
//        {
//            if(capicity%i==0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//    private int getNextPrim(int n)
//    {
//        for(int i=n;;i++)
//        {
//            if(isPrimeNum(i))
//            {return i;}
//    }
//}
//}
//
