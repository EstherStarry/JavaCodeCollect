package JavaBasics;
/**
 * Integer和int有什么不同
 * 
 * @author Hongyue Wang
 *
 */
public class IntegerAndInt {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int i = 128;
        Integer i2 = 128;
        Integer i3 = new Integer(128);
        System.out.println(i == i2); // true,Integer会自动拆箱为int
        System.out.println(i == i3); // true,Integer会自动拆箱为int
        System.out.println("**************");
        Integer i5 = 127;//java在编译的时候,被翻译成-> Integer i5 = Integer.valueOf(127);
        Integer i6 = 127;
        System.out.println(i5 == i6);//true
        /*
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);//false,从valueOf源码看出，只有对于-128到127之间的数，才会进行缓存
		*/
        Integer ii5 = new Integer(127);
        System.out.println(i5 == ii5); //false,ii5是new出来的，不是同一个对象
        Integer i7 = new Integer(128);
        Integer i8 = new Integer(123);
        System.out.println(i7 == i8);  //false
    }

    public static Integer valueOf(int i) {
    	assert IntegerCache.high >= 127;
    	if (i >= IntegerCache.low && i <= IntegerCache.high)
    		return IntegerCache.cache[i + (-IntegerCache.low)];
    	return new Integer(i);
	}
}